
#  Sporify Music Advisor

## About the project
The modern world spoils us with a wide variety of music: pop-lovers, rockers, rappers <br/> 
and club enthusiasts alike face a nearly infinite choice. Fortunately, there are <br/>
programs that can help us find something we like and not get lost in this variety. <br/> 
This Music Advisor makes preference-based suggestions and even shares links to new <br/> 
releases and featured playlists. <br/> 
Together with Spotify, this Music Advisor is a powerful guide to the world of music. <br/>

## Table of contents
* [Learning outcomes](#learning-outcomes)
* [How to run](#how-to-run)
* [Technologies](#technologies)
* [How to use](#how-to-use)
* [Presentation video](#Presentation-video)

## Learning outcomes
In this project, we develop an application that connects with Spotify's API using Oauth2. <br/>
The application is projected with the use MVC design pattern. <br/>
Last but not least, all data is handled in JSON format with the use of the GSON library. <br/>

## Technologies
- Java 17
- Gradle 8.1
- OAuth 2.0
- HttpClient API
- GSON
- JSON

## How to run
You can simply download an archive, unzip it inside the directory you want to, and open it in your IDE.

If you want to clone the repo:

run command line in the directory you want to store the app and type the following command:
```https://github.com/Hubertoom/Music-Advisor.git```

- or start with Project from Version Control in your IDE by providing the URL of this repository.

## How to use
The program reads user input and provides information at the user's request. <br/>

- *auth* - a user is redirected to the Spotify login page to confirm authorization. If it is not rejected - the access token is sent;
- *featured* - a list of Spotify-featured playlists with their links fetched from API;
- *new* - a list of new albums with artists and links on Spotify;
- *categories* - a list of all available categories on Spotify (just their names);
- *playlists* *C_NAME* (where *C_NAME* is the name of a category) - the list contains playlists of this category and their links on Spotify;
- *exit* - shuts down the application.

## Presentation video

https://github.com/Hubertoom/Music-Advisor/assets/137101859/bd6ad7fb-a815-4c04-a302-630fbfef31ab
