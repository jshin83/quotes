# Quotes
### Java Application that reads in JSON
This program read in a JSON file and uses gson to collect information
in an array. User gets a random quote from a Star Wars Quote API.

Quotes from online are cached in a txt file.

If there a problem with connecting to the API but a file of cached Star War Quotes exists,
a quote is pulled from the text file.

If there is a problem connecting to the API *and* no cached Star War Quotes txt file, 
a quote is pulled from an internal json file of quotes.

#### To run :

After you clone the repository
+ in 'build.gradle'gi file, check that dependency is added: 
`implementation 'com.google.code.gson:gson:2.8.5'`
+ to run application, command is : `./gradlew run`

[code](./src/main/java/quotes)

To run Tests, command is : `./gradlew test`