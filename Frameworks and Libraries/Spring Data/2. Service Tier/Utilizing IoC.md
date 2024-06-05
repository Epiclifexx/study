## Utilizing IoC
So, at this moment, Frank is talking to us about the IoC container and mechanism. If we're already using it, and how it works within the framework itself and stuff like that.

We have built some data access code to leverage the power of Spring in accessing data. Now it's time to start leveraging the IoC container to actually use it.

Now our little Util program is already using it, but let's talk about the details of IoC.
### Why we should use IoC?
So other than answering because Spring does, I want to talk about why we should use IoC in general, and then specifically, why we should use it with Spring.

So first and foremost, the IoC container allows you to focus on the contracts of the interfaces you consume instead of dealing with the construction, and management of objects.

It allows you to develop business code only. Leaving all object construction to the container itself.

You build intermediate abstractions in the layers in order to do business, and share code as appropriate, and the IoC handles those intermediate abstractions being dependencies where necessary.
### Spring and IoC
Now first of all, the IoC container is configured by the developer. You may have a Legacy XML configuration. You may see newer Java configuration with or without component scanning, and we also have auto configuration.
#### How it works
As the BeanFactory starts up, Spring skins every bean that will be configured, and creates an initialization, and handled to that initialization in the BeanFactory itself.

Spring then builds a graph of the order beans must be constructed.

It then goes through a multi-step process to construct the objects themselves. Now, during this process, Singleton instances of the objects are created and injected as needed during object construction, or immediately after, depending on how dependencies were defined specifically via setters.

Now Spring maintains the life cycle of the beans from start to finish, unless they are scoped not to be. Now scope isn't something that we will discuss in this course, but we do a lot in Spring framework in-depth, as well as the actual start-up of the IoC container in significantly more detail.

But in this course, just know that everything that we are using is a Singleton, meaning thread safety is very important. And remember that the developer only has access to the application context, not the raw BeanFactory.