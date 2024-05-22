# Change views and layout pages

## .NET Doc:
Select the menu links MvcMovie, Home, and Privacy. Each page shows the same menu layout. The menu layout is implemented in the Views/Shared/_Layout.cshtml file.

Open the Views/Shared/_Layout.cshtml file.

Layout templates allow:

Specifying the HTML container layout of a site in one place.
Applying the HTML container layout across multiple pages in the site.
Find the @RenderBody() line. RenderBody is a placeholder where all the view-specific pages you create show up, wrapped in the layout page. For example, if you select the Privacy link, the Views/Home/Privacy.cshtml view is rendered inside the RenderBody method.