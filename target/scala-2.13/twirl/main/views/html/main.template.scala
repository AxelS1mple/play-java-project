
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/css.css")),format.raw/*8.100*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/Hedercss.css")),format.raw/*9.105*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">
    </head>
    <body>
        <header>
            <div class="header-container">
                <h1>My Application</h1>
                <nav>
                    <ul>
                        <li><a href=""""),_display_(/*18.39*/routes/*18.45*/.HomeController.home()),format.raw/*18.67*/("""">Home</a></li>
                        <li><a href=""""),_display_(/*19.39*/routes/*19.45*/.WidgetController.listWidgets()),format.raw/*19.76*/("""">Widgets</a></li>
                        <li><a href=""""),_display_(/*20.39*/routes/*20.45*/.HomeController.about()),format.raw/*20.68*/("""">About</a></li>
                        <li><a href=""""),_display_(/*21.39*/routes/*21.45*/.HomeController.contact()),format.raw/*21.70*/("""">Contact</a></li>
                    </ul>
                </nav>
            </div>
        </header>

        <main>
        """),_display_(/*28.10*/content),format.raw/*28.17*/("""
        """),format.raw/*29.9*/("""</main>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 342591006de18d2daf7208770b9fc269236fb9d5
                  MATRIX: 911->1|1035->32|1062->33|1148->93|1173->98|1261->160|1275->166|1337->207|1419->263|1433->269|1494->309|1576->365|1590->371|1656->416|1744->477|1759->483|1820->522|2058->733|2073->739|2116->761|2197->815|2212->821|2264->852|2348->909|2363->915|2407->938|2489->993|2504->999|2550->1024|2707->1154|2735->1161|2771->1170
                  LINES: 27->1|32->2|33->3|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|58->28|58->28|59->29
                  -- GENERATED --
              */
          