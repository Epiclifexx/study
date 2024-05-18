using Microsoft.AspNetCore.Mvc;
using System.Text.Encodings.Web;

namespace MvcMovie.Controllers
{
    public class HelloWorldController : Controller
    {

        /*
         * So now here we have the third step, in which we're going to modify
         * this controller in order to use a View (which we're going to create)
         * and then, we could just navigate to the HelloWorld page and actually see something
         * instead of a plain text in a white or black background.
         * (Although, to be fair, the view is also just text on a white background...)
         * 
         * .NET Doc: View templates are created using Razor. Razor-based view templates:
         *  - Have a .cshtml file extension.
         *  - Provide an elegant way to create HTML output with C#.
         * 
         * In other words, now we go back to the default state of our method when we
         * created this controller class. Now returning a View.
         */

        // GET: /HelloWorld/
        public IActionResult Index()
        {
            return View();
        }

        /*
         * The preceding code:
         *  - Calls the controller's View method.
         *  - Uses a view template to generate an HTML response.
         *  
         *  Controller methods:
         *  - Are referred to as action methods. For example, the Index action method
         *    in the preceding code.
         *  - Generally return an IActionResult or a class derived from ActionResult, not
         *    a type like string.
         */

        // GET: /HelloWorld/Welcome/
        public string Welcome(string name, int numTimes = 1)
        {
            return HtmlEncoder.Default.Encode($"Hello {name}, NumTimes is: {numTimes}");
        }

        /*
         * After modifying this, we shall create a "HelloWorld" folder inside "Views"
         * and inside this folder, we should create a view called "Index.cshtml"
         * (Otherwise, this code won't work).
         */
    }
}
