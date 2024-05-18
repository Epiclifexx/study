# 2. Add a Controller to an ASP.NET Core MVC app
Now, from what I'm seeing at the .NET documentation, it is time to add a custom controller to my project. Of course, there's already controllers created in this project, but the one I created here is called "HelloWorldController".

You see, when you first create a controller in ASP.NET Core. The Controller has a default method already created, called "Index()" which is returning a View method. Now... of course, if you run the project and go to /HelloWorld/ in the browser, you're going to see an error, because the "index" view doesn't exist yet.

Now, in the .NET documentation, they don't tell you this right now, but they tell you to replace the content of this "index" method with some String values. Also, the returning value of the method itself has to change to string.

## Changes:
The only thing you have to know, is that have I created this "HelloWorldController" inside of "Controllers" folder.

So, I also think that I shouldn't submit all the project just for this, so I thought that maybe submitting this single cs file it works just fine.
