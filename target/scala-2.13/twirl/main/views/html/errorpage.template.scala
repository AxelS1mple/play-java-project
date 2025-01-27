
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

object errorpage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Error Play")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<div>
        <h1>Ocurrio un erro por favor intenta de nuevo</h1>
        <ul>
            <li>Please go to <a href=""""),_display_(/*7.40*/routes/*7.46*/.WidgetController.listWidgets()),format.raw/*7.77*/("""">"""),_display_(/*7.80*/routes/*7.86*/.WidgetController.listWidgets()),format.raw/*7.117*/("""</a></li>
        </ul>

    </div>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/errorpage.scala.html
                  HASH: b5e44c4cdf6352f94849fa31282b150c4c3aa4cf
                  MATRIX: 904->1|1000->3|1030->8|1056->26|1095->28|1127->34|1274->155|1288->161|1339->192|1368->195|1382->201|1434->232
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7|38->7|38->7|38->7|38->7|38->7
                  -- GENERATED --
              */
          