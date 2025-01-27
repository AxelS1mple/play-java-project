package controllers;

import scala.collection.immutable.Map;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.errorpage;

public class HomeController extends Controller {
    public Result errorpage() {
        return ok(errorpage.render());
    }

    public Result home() {
        // Define los breadcrumbs con scala.collection.immutable.Map
        Map<String, String> breadcrumbs = Map.apply(
                "/", "Home",
                "/home", "Dashboard"
        );

        // Pásalos a la vista
        return ok(views.html.home.render(breadcrumbs));
    }


    public Result about() {
        return ok(views.html.about.render());
    }

    public Result contact() {
        return ok(views.html.contact.render());
    }

    public Result breadcrumb() {
        // Define los breadcrumbs con scala.collection.immutable.Map
        Map<String, String> breadcrumbs = Map.apply(
                "/", "Home"
        );
        return ok(views.html.home.render(breadcrumbs));
    }

}
