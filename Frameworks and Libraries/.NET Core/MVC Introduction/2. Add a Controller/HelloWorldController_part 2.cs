using Microsoft.AspNetCore.Mvc;
using System.Text.Encodings.Web;

namespace MvcMovie.Controllers
{
    public class HelloWorldController : Controller
    {
        // GET: /HelloWorld/
        public string Index()
        {
            return "This is my default action...";
        }

        /*
         * Now, in the second part of the second step, the documentation tell us to replace
         * the old "Welcome()" method content to this one right here. It appears to use an specific
         * library in order to put some arguments in the method. Now, we can send a string value,
         * and an int value, and the method will execute its code with those values.
         * 
         * Notice that the int argument already has a value in the definition of the method.
         * This might be in order to set like, some kind of "default" behavior or value.
         * 
         * If we want to send specific values to this method, then, in the URL we should
         * write something like this:
         * https://localhost:{PORT}/HelloWorld/Welcome?name=Epiclife&numtimes=27
         */

        // GET: /HelloWorld/Welcome/ 
        // Requires using System.Text.Encodings.Web;
        public string Welcome(string name, int numTimes = 1)
        {
            return HtmlEncoder.Default.Encode($"Hello {name}, NumTimes is: {numTimes}");
        }

        /*
         * .NET Documentation: Uses the C# optional-parameter feature to indicate that the
         * numTimes parameter defaults to 1 if no value is passed for that parameter.
         * Uses HtmlEncoder.Default.Encode to protect the app from malicious input, such as through JavaScript.
         * Uses Interpolated Strings in $"Hello {name}, NumTimes is: {numTimes}".
         */
    }
}
