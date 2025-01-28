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
        return ok(views.html.home.render());
    }



    public Result about() {
        return ok(views.html.about.render());
    }

    public Result contact() {
        return ok(views.html.contact.render());
    }

    public Result breadcrumb() {
        return ok(views.html.home.render());
    }

}
