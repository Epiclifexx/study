using Microsoft.AspNetCore.Mvc;

namespace MvcMovie.Controllers
{
    // It appears that every controller class in ASP.NET Core is inheriting from a "Controller" class.
    public class HelloWorldController : Controller
    {
        /* Default Method that is created with the controller.
         * It appears to return a method called "View" which makes reference to
         * a folder and a .cshtml file that should be created inside the "Views" folder
        */

        /*
        public IActionResult Index()
        {
            return View();
        }
        */

        /*
        Because, obviously, such folder and file doesn't exist yet, then we just comment this
        and follow the .NET documentation.
        */

        /*
         * Here, we replace the method's return type to a string.
         * Also, there's an annotation that says "/HelloWorld/.
         * This annotation is telling me that in the browser, if we want to see this
         * string value, then we should navigate to this URI.
         */

        // GET: /HelloWorld/
        public string Index()
        {
            return "This is my default action...";
        }

        /*
         * Here we have a custom method called "Welcome", it appears that, every single
         * method other than the "Index" one, you navigate to them including other "/" to the URI.
         * This of course, is also antoher simple method that just returns a string value.
         */
 
        // GET: /HelloWorld/Welcome/ 
        public string Welcome()
        {
            return "This is the Welcome action method...";
        }

        /*
         * .NET Documentation talks about these methods as "HTTP Endpoints".
         * "Every public method in a controller is callable as an HTTP endpoint.
         * In the sample above, both methods return a string. Note the comments
         * preceding each method."
         */
    }
}
