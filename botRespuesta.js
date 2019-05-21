var restify = require('restify');
var builder = require('botbuilder');

//Create global variables
var ShowType = "";
var Genre = "";
var Language = "";

//Define characteristics that match with shows
var characteristics=[];
characteristics[0]="series"+"thriller"+"english"
characteristics[1]="movie"+"comedy"+"german"
characteristics[2]="movie"+"drama"+"spanish"

//Define the shows that match with the characteristics
var shows=[];
shows[0] = "True Detective"
shows[1] = "Feuchtgebiete"
shows[2] = "El laberinto del fauno"

// Setup Restify Server
var server = restify.createServer();
server.listen(process.env.port || process.env.PORT || 3978, function () {
    console.log('%s listening to %s', server.name, server.url);
});

// Create chat connector for communicating with the Bot Framework Service
var connector = new builder.ChatConnector({
    appId: process.env.MICROSOFT_APP_ID,
    appPassword: process.env.MICROSOFT_APP_PASSWORD
});

// Listen for messages from users
server.post('/api/messages', connector.listen());

// Service dialog
var bot = new builder.UniversalBot(connector, [
    //Initial welcome
    function (session) {
        // A Card's Submit Action obj for reservation was received
        if (session.message && session.message.value) {
            //Call the processSubmitAction Function to process reservation
            processSubmitAction(session, session.message.value);
            return;
        }
        //ITERATE STATES-ACTION
        session.send("Welcome! This is the new Movies and Series recommendation service. Let me ask you a few questions.");
        builder.Prompts.text(session, "Which show type would you like to watch? Please select either 'Movie' or 'Series'");
        
    },
    function (session, results) {
        ShowType = results.response.toLowerCase();
        session.send("Perfect. Let's move on with the next question.");
        builder.Prompts.text(session, "Which genre are you interested in?");
    },
    function (session, results) {
        Genre = results.response.toLowerCase();
        session.send("Good. Let me ask you a final question.");
        builder.Prompts.text(session, "In which language do you want to hear the show?");
    },
    function (session, results) {
        Language = results.response.toLowerCase();
        var userCharacteristics = ShowType + Genre + Language; 
        var showFound = false;
        for (i=0; i<characteristics.length; i++){
            if (userCharacteristics == characteristics[i]){
                showFound = true;
                session.send("Good. I have found a show that meets your criteria.");
                session.send("You can purchase it if you like: " + "***" + shows[i] + "***");
                bot.dialog(shows[i], require('./'+shows[i]));
                session.beginDialog(shows[i]);
            }
        }

        if (showFound == false){
            var random = parseInt(Math.random() * (characteristics.length - 1));
            session.send("I have not found any show that meets your criteria.");
            session.send("Alternatively, I may have found a show that could interest you. You can purchase it if you like: " + "***" + shows[random] + "***");
            bot.dialog(shows[random], require('./'+shows[random])); 
            session.beginDialog(shows[random]);
        }
    }
//END OF THE MAIN BODY
])

//Capture and process reservation
function processSubmitAction(session, value) {
    var reply=value.reply;
    if (reply.toLowerCase()=="no"){
        session.send("We are sorry you didn't want to buy it. You can search for a different one!");
    } else if (reply.toLowerCase()=="yes"){
        session.send("Congratulations, you just bought it :)!");
    } else {
        session.send("Congratulations, you just bought season(s) " + reply + " :)!");
    }
        session.endDialog();
}



