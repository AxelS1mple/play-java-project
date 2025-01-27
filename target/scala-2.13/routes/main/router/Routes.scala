// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:14
  WidgetController_1: controllers.WidgetController,
  // @LINE:19
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:14
    WidgetController_1: controllers.WidgetController,
    // @LINE:19
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_0, WidgetController_1, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, WidgetController_1, Assets_2, prefix)
  }

  private val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.home()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.HomeController.contact()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """breadcrumb""", """controllers.HomeController.breadcrumb()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets""", """controllers.WidgetController.listWidgets(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets""", """controllers.WidgetController.createWidget(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """errorpage""", """controllers.HomeController.errorpage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:7
  private lazy val controllers_HomeController_home0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private lazy val controllers_HomeController_home0_invoker = createInvoker(
    HomeController_0.home(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "home",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private lazy val controllers_HomeController_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private lazy val controllers_HomeController_about1_invoker = createInvoker(
    HomeController_0.about(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private lazy val controllers_HomeController_contact2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private lazy val controllers_HomeController_contact2_invoker = createInvoker(
    HomeController_0.contact(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contact",
      Nil,
      "GET",
      this.prefix + """contact""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private lazy val controllers_HomeController_breadcrumb3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("breadcrumb")))
  )
  private lazy val controllers_HomeController_breadcrumb3_invoker = createInvoker(
    HomeController_0.breadcrumb(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "breadcrumb",
      Nil,
      "GET",
      this.prefix + """breadcrumb""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private lazy val controllers_WidgetController_listWidgets4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets")))
  )
  private lazy val controllers_WidgetController_listWidgets4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      WidgetController_1.listWidgets(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "listWidgets",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """widgets""",
      """ Widgets""",
      Seq()
    )
  )

  // @LINE:15
  private lazy val controllers_WidgetController_createWidget5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets")))
  )
  private lazy val controllers_WidgetController_createWidget5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      WidgetController_1.createWidget(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "createWidget",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """widgets""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private lazy val controllers_HomeController_errorpage6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("errorpage")))
  )
  private lazy val controllers_HomeController_errorpage6_invoker = createInvoker(
    HomeController_0.errorpage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "errorpage",
      Nil,
      "GET",
      this.prefix + """errorpage""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""", encodeable=false)))
  )
  private lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_home0_route(params@_) =>
      call { 
        controllers_HomeController_home0_invoker.call(HomeController_0.home())
      }
  
    // @LINE:8
    case controllers_HomeController_about1_route(params@_) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_0.about())
      }
  
    // @LINE:9
    case controllers_HomeController_contact2_route(params@_) =>
      call { 
        controllers_HomeController_contact2_invoker.call(HomeController_0.contact())
      }
  
    // @LINE:10
    case controllers_HomeController_breadcrumb3_route(params@_) =>
      call { 
        controllers_HomeController_breadcrumb3_invoker.call(HomeController_0.breadcrumb())
      }
  
    // @LINE:14
    case controllers_WidgetController_listWidgets4_route(params@_) =>
      call { 
        controllers_WidgetController_listWidgets4_invoker.call(
          req => WidgetController_1.listWidgets(req))
      }
  
    // @LINE:15
    case controllers_WidgetController_createWidget5_route(params@_) =>
      call { 
        controllers_WidgetController_createWidget5_invoker.call(
          req => WidgetController_1.createWidget(req))
      }
  
    // @LINE:16
    case controllers_HomeController_errorpage6_route(params@_) =>
      call { 
        controllers_HomeController_errorpage6_invoker.call(HomeController_0.errorpage())
      }
  
    // @LINE:19
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
