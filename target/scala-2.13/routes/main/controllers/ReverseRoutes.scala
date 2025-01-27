// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def breadcrumb(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "breadcrumb")
    }
  
    // @LINE:16
    def errorpage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "errorpage")
    }
  
    // @LINE:8
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:7
    def home(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def contact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
  }

  // @LINE:14
  class ReverseWidgetController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def listWidgets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "widgets")
    }
  
    // @LINE:15
    def createWidget(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "widgets")
    }
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
