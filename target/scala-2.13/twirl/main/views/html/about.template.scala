
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<div>
        <ul>
            <li>Please go to <a href=""""),_display_(/*6.40*/routes/*6.46*/.WidgetController.listWidgets()),format.raw/*6.77*/("""">"""),_display_(/*6.80*/routes/*6.86*/.WidgetController.listWidgets()),format.raw/*6.117*/("""</a></li>
        </ul>

    </div>

""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/about.scala.html
                  HASH: dc9ebb7936f949070d3a2222ac9c1987640c7f63
                  MATRIX: 900->1|996->3|1026->8|1057->31|1096->33|1128->39|1214->99|1228->105|1279->136|1308->139|1322->145|1374->176|1447->219
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|37->6|37->6|37->6|42->11
                  -- GENERATED --
              */
          