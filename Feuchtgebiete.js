var builder = require('botbuilder');
module.exports = [
    //Feuchtgebiete
	 function (session) {
	//Feuchtgebiete card
	session.send(new builder.Message(session).addAttachment({
     contentType: "application/vnd.microsoft.card.adaptive",
     content: 
{
	"$schema": "http://adaptivecards.io/schemas/adaptive-card.json",
	"type": "AdaptiveCard",
	"version": "1.0",
	"body": [
		{
			"type": "ColumnSet",
			"columns": [
				{
					"type": "Column",
					"width": 2,
					"items": [
						{
							"type": "TextBlock",
							"text": "MOVIE"
						},
						{
							"type": "TextBlock",
							"text": "Feuchtgebiete",
							"weight": "bolder",
							"size": "extraLarge",
							"spacing": "none"
						},
						{
							"type": "TextBlock",
							"text": "Meret Becker, Axel Milberg, Marlen Kruse, Christoph Letkowski), and many more...",
							"weight": "bolder",
							"spacing": "none",
							"wrap": true
						},
						{
							"type": "TextBlock",
							"text": "Score 5.6 (10) on FilmAffinity",
							"isSubtle": true,
							"spacing": "none"
						},
						{
							"type": "TextBlock",
							"text": "**Michael Klaus comment** \"This is a must! Truly hilarious movie.\"",
							"size": "small",
							"wrap": true
						}
					]
				},
				{
					"type": "Column",
					"width": 1,
					"items": [
						{
							"type": "Image",
							"url": "https://images-na.ssl-images-amazon.com/images/I/91DsS3TOvHL._SY445_.jpg",
							"size": "auto"
						}
					]
				}
			]
		}
	],
	"actions": [
		{
			"type": "Action.ShowCard",
			"title": "Click here",
			"card": {
				"type": "AdaptiveCard",
				"body": [
					{
						"type": "TextBlock",
						"text": "The cost of this movie is $37. \n Please type 'Yes' if you want to purchase it and 'No' if you don't.",
						"wrap": true
					},
					{					
						"type": "Input.Text",
						"id": "reply",
						"placeholder": "Yes/No"
					}
					],
					"actions": [
						{
							"type": "Action.Submit",
							"title": "OK"
						}
				]
			}
		}
	]
}
}));
	session.endDialog();
    }
]