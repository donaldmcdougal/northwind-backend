# northwind-backend
A Java and MySQL backend for the northwind database that provides a REST interface

This project is intended for use in prototyping frontend work and does a pretty decent job at it.  I created it in order to prototype and test HTML/JavaScript clients but it can be used with anything that can make REST requests.

## Prequisites
1. [MySQL Server](https://dev.mysql.com/downloads/mysql/) if it is not already installed.
1. [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) if it is not already installed.
1. [Maven](https://maven.apache.org/download.cgi) if it is not already installed. Make sure that Maven runs from the command line.
1. The Northwind MySQL database.  Navigate to the project's `src/main/resources` directory.
   1. Execute the contents of either `northwind.sql` or `northwind-default-current-timestamp.sql` within MySQL server.
   1. Execute the contents of `northwind-data.sql` within MySQL server.

## Building
In your terminal, navigate to the project's root directory.  Then, type `mvn clean package` to build an executable WAR file of the code.

## Running
1. In your terminal, navigate to the project's `target` directory.  Execute `java -jar northwind-1.0.0.war` from the command line.
1. Navigate to [localhost:8080](http://localhost:8080/).  This will contain some JSON output that attempts to show you how to use the service.  On all the URLs shown there I think, you can omit the parameters at the end of the URL to retrieve the first page of data for any data type.

This project is definitely not for production use.  It allows requests from any origin and doesn't authenticate requests of any kind.  As long as it understands a request, it will simply carry it out.
