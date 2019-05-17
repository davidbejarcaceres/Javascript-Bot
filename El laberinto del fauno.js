var builder = require('botbuilder');
module.exports = [
    // El laberinto del fauno
	 function (session) {
		//El laberinto del fauno card
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
									"text": "El laberinto del fauno",
									"weight": "bolder",
									"size": "extraLarge",
									"spacing": "none"
								},
								{
									"type": "TextBlock",
									"text": "Ivana Baquero, Sergi López, Maribel Verdú, Doug Jones, and many more...",						
									"weight": "bolder",
									"spacing": "none",
									"wrap": true
								},
								{
									"type": "TextBlock",
									"text": "Score 7.3 (10) on FilmAffinity",
									"isSubtle": true,
									"spacing": "none"
								},
								{
									"type": "TextBlock",
									"text": "**Enrique Álvarez comment** \"A fantastic film that is so complex that only after reading this excellent article, am I able to grasp it's many aspects! Del Toro is truely an artist in every sense of the word and this film proves it..\"",
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
									"url": "https://pics.filmaffinity.com/el_laberinto_del_fauno-222302534-large.jpg",
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
								"text": "The cost of this movie is $42. \n Please type 'Yes' if you want to purchase it and 'No' if you don't.",
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
	session.endConversation();
    }
]