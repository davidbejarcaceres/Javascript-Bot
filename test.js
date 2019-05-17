"use strict";
exports.__esModule = true;

var builder = require("botbuilder");
var restify = require("restify");
var server = restify.createServer();

server.listen(process.env.port || process.env.PORT || 3978, function () {
    console.log('%s listening to %s', server.name, server.url);
});
var connector = new builder.ChatConnector({
    appId: process.env.MicrosoftAppId,
    appPassword: process.env.MicrosoftAppPassword
});
server.post('/api/messages', connector.listen());
var inMemoryStorage = new builder.MemoryBotStorage();
// This is a dinner reservation bot that uses a waterfall technique to prompt users for input.
var bot = new builder.UniversalBot(connector, [
    function (session) {
        session.send('Hello. You said %s', session.message.text);
        builder.Prompts.text(session, "What is your name?");
    },
    function (session, results) {
        session.dialogData.userName = results.response;
        session.send('Hello %s', session.dialogData.userName);
        session.endDialog();
    }
]).set('storage', inMemoryStorage); // Register in-memory storage 
