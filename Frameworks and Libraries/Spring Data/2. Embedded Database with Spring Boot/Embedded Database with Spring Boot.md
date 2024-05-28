# Embedded databases with Spring Boot
We're now going to configure an embedded database that we can use throughout this course. 
## Open the Project
I'm following this tutorial from the LinkedIn Learning course which is called "**Learning Spring with Spring Boot**" by "**Frank P Moley III**", and for this specific chapter, we need a project I putted inside here in the same folder. Is called "**learning-spring**".
## Moving the SQL files to Resources
So, assuming we already unzipped the project and opened it with an IDE like IntelliJ, then, the next step should be to move the two SQL files inside the bin folder (**data.sql** & **schema.sql**) to the src>main>**resources** folder.

I don't really understand why at the moment, but I assume these SQL files should be there in order for Spring to notice them as "resources". I mean, is about getting to work with an embedded database.

The SQL files contains the creation of some tables and the insertion of data in them (We'll use this later on the course).
## Adding Spring Boot Starter Data JPA & H2 Database dependencies in the pom.xml
Now, in order to get to work with this Embedded Database, we need to do some insertions to our pom file.

We go to the section of **dependencies** and there, we will add these two:
```xml
<dependency>  
   <groupId>org.springframework.boot</groupId>  
   <artifactId>spring-boot-starter-data-jpa</artifactId>  
</dependency>
<dependency>  
   <groupId>com.h2database</groupId>  
   <artifactId>h2</artifactId>  
</dependency>
```

And then, we should import these resources by re-loading Maven so we can have the changes applied.

Now, we're almost done to the point we can actually use this database. But there's some values we should put in the **application.properties**.
## Changing some values in the Application Properties
Now, we go to the **application.properties** file inside resources and define this values:

```
# Properties changes to embed a Database into our application:

# We change this property just so we can see Info Messages.
logging.level.org.springframework.jdbc.datasource.init.ScriptUtils = debug

# We're telling Hibernate not to create a schema, and just use our database instead.
spring.jpa.hibernate.ddl-auto=none
```
And that's it, you can now just execute the project, and you should see the logs of the SQL files creating the database.
