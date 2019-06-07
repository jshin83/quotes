# Quotes
### Java Application that reads in JSON
This program read in a JSON file and uses gson to collect information
in an array. User gets a random quote.
#### To run :

After you clone the repository
+ in 'build.gradle'gi file, check that dependency is added: 
`implementation 'com.google.code.gson:gson:2.8.5'`
+ to run application, command is : `./gradlew run`

[code](./src/main/java/quotes)

To run Tests, command is : `./gradlew test`