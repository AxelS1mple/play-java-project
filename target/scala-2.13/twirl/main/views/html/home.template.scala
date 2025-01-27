
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(breadcrumbs: Map[String, String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

"""),_display_(/*3.2*/main("Breadcrumb Example")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
    """),format.raw/*4.5*/("""<nav aria-label="breadcrumb">
        <ol class="breadcrumb">
        """),_display_(/*6.10*/for((url, label) <- breadcrumbs) yield /*6.42*/ {_display_(Seq[Any](format.raw/*6.44*/("""
            """),_display_(if(url != breadcrumbs.last._1)/*7.44*/ {_display_(Seq[Any](format.raw/*7.46*/("""
                """),format.raw/*8.17*/("""<li class="breadcrumb-item"><a href=""""),_display_(/*8.55*/url),format.raw/*8.58*/("""">"""),_display_(/*8.61*/label),format.raw/*8.66*/("""</a></li>
            """)))}else/*9.20*/{_display_(Seq[Any](format.raw/*9.21*/("""
                """),format.raw/*10.17*/("""<li class="breadcrumb-item active" aria-current="page">"""),_display_(/*10.73*/label),format.raw/*10.78*/("""</li>
            """)))}),format.raw/*11.14*/("""
        """)))}),format.raw/*12.10*/("""
        """),format.raw/*13.9*/("""</ol>
    </nav>

    <div>
        <ul>
            <li>Please go to <a href=""""),_display_(/*18.40*/routes/*18.46*/.WidgetController.listWidgets()),format.raw/*18.77*/("""">List Widgets</a></li>
        </ul>
    </div>
""")))}))
      }
    }
  }

  def render(breadcrumbs:Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(breadcrumbs)

  def f:((Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (breadcrumbs) => apply(breadcrumbs)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/home.scala.html
                  HASH: 5cdc15ee37b139df5bebb554e1160ea2d5b6362a
                  MATRIX: 919->1|1048->35|1078->40|1112->66|1151->68|1183->74|1282->147|1329->179|1368->181|1439->226|1478->228|1523->246|1587->284|1610->287|1639->290|1664->295|1710->325|1748->326|1794->344|1877->400|1903->405|1954->425|1996->436|2033->446|2145->531|2160->537|2212->568
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|41->10|41->10|41->10|42->11|43->12|44->13|49->18|49->18|49->18
                  -- GENERATED --
              */
          