# primefaces-spotlight-trouble

Demo for problems I'm having when using Primefaces' p:spotlight.

The project should be easily imported into Eclipse.

System requirements
-------------------
- JDK 8
- Java EE 7 capable application server, Wildfly 8.2.0+ preferred (the project has been created with the Java EE archetypes for  Wildfly 8.2.0)
- Maven 3.1 or better

Build and Deploy on Wildfly
---------------------------

1. Make sure you have started the JBoss Server.
2. Open a command line and navigate to the root directory of this quickstart.
3. Type this command to build and deploy the archive:

        mvn clean package wildfly:deploy

4. This will deploy `target/dsauthorizdemo.war` to the running instance of the server.
 
Access the application 
---------------------

The application will be running at the following URL: [http://localhost:8080/dsauthorizdemo/](http://localhost:8080/dsauthorizdemo/)


Undeploy the Archive
--------------------

1. Make sure you have started the JBoss Server as described above.
2. Open a command line and navigate to the root directory of this quickstart.
3. When you are finished testing, type this command to undeploy the archive:

        mvn wildfly:undeploy

Debug the Application
------------------------------------

If you want to debug the source code or look at the Javadocs of any library in the project, run either of the following commands to pull them into your local repository. The IDE should then detect them.

    mvn dependency:sources
    mvn dependency:resolve -Dclassifier=javadoc
