# microservicedatabasetraining

This Microservice should show an trivial database implementation and a basic integrationtesting for it.
Basic persistence functionality is implemented by the jpa resository.

#### System requirements:


* Operation Systems: 		Windows (7, 8, 10), Linux Ubuntu, Mint
* Java:					Java 8 (version upgrade to nine still not complete)
* Maven: 					at least Maven 3 or higher

#### Install Java:

http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

With windows you have simply to download and install the java jdk from the link and it is done.
After the installation you have to set the JAVA_HOME environment variable.
Here is a nice tutorial for this on windows
https://www.mkyong.com/java/how-to-set-java_home-on-windows-10/
Here is the same for Linux
https://askubuntu.com/questions/175514/how-to-set-java-home-for-java
When this is done we need Maven next.

#### Install Maven:

https://maven.apache.org/install.html you will find Maven here.
You have to unpack your package (like for Java you have to set the MAVEN_HOME also.
Heres a Tutorial to set the maven home: https://www.mkyong.com/maven/how-to-install-maven-in-windows/
here is one with also the linux way to do it: http://www.baeldung.com/install-maven-on-windows-linux-mac

# What we will do in this training:

In this training, we will learn about quick set up a database and how to test it bu we will also learn about the limitations of it.

* 1. Activate the tests in PersonRepositoryIT again and run them. What do you think why are
* 2. Implement a Query method in PersonRepository which finds a person by its lastname please use the easy "jpa" way for this if you dont know ask the instructor
* 3. Add the new Query to the DataExampleServiceImpl and its interface to make it useable
* 4. Go to PersonRepositoryIT again and implement two test methods, one for each dataset to proof that our query is really working do not forget @DirtiesContext



