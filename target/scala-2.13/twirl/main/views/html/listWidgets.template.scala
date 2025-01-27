
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
/*1.2*/import play.mvc.Http.Request

object listWidgets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Widget],Form[WidgetData],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(widgets: Seq[Widget], form: Form[WidgetData])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Widgets")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""

    """),format.raw/*6.5*/("""<hr/>

    """),format.raw/*8.66*/("""
    """),_display_(if(form.hasGlobalErrors)/*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""
        """),_display_(/*10.10*/form/*10.14*/.globalErrors.asScala.map/*10.39*/ { (error: play.data.validation.ValidationError) =>_display_(Seq[Any](format.raw/*10.90*/("""
            """),format.raw/*11.13*/("""<div>
                """),_display_(/*12.18*/error/*12.23*/.key),format.raw/*12.27*/(""": """),_display_(/*12.30*/error/*12.35*/.message),format.raw/*12.43*/("""
            """),format.raw/*13.13*/("""</div>
        """)))}),format.raw/*14.10*/("""
    """)))} else {null} ),format.raw/*15.6*/("""

    """),_display_(/*17.6*/helper/*17.12*/.form(routes.WidgetController.createWidget(), Symbol("id") -> "widgetForm")/*17.87*/ {_display_(Seq[Any](format.raw/*17.89*/("""
        """),_display_(/*18.10*/helper/*18.16*/.CSRF.formField),format.raw/*18.31*/("""

        """),_display_(/*20.10*/helper/*20.16*/.inputText(form("name"), Symbol("_label") -> "Name", Symbol("placeholder") -> "name")),format.raw/*20.101*/("""

        """),_display_(/*22.10*/helper/*22.16*/.inputText(form("price"), Symbol("_label") -> "Price", Symbol("placeholder") -> "price")),format.raw/*22.104*/("""

        """),format.raw/*24.9*/("""<button type="submit">Create widget</button>
    """)))}),format.raw/*25.6*/("""


    """),format.raw/*28.5*/("""<script>
            document.getElementById('widgetForm').addEventListener('submit', function(event) """),format.raw/*29.94*/("""{"""),format.raw/*29.95*/("""
                """),format.raw/*30.17*/("""const name = document.querySelector('input[name="name"]').value.trim();
                const price = document.querySelector('input[name="price"]').value.trim();

                if (!name || !price) """),format.raw/*33.38*/("""{"""),format.raw/*33.39*/("""
                    """),format.raw/*34.21*/("""event.preventDefault(); // Evita el envío del formulario
                    alert('Porfavor Ingresa los datos correctos');
                """),format.raw/*36.17*/("""}"""),format.raw/*36.18*/("""
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/(""");
    </script>

    <hr/>

    <h1>Datos</h1>

    """),format.raw/*44.40*/("""
    """),_display_(/*45.6*/request/*45.13*/.flash.asScala().data.map/*45.38*/ { case (name, value) =>_display_(Seq[Any](format.raw/*45.62*/("""
    """),format.raw/*46.5*/("""<div class=""""),_display_(/*46.18*/name),format.raw/*46.22*/("""">"""),_display_(/*46.25*/value),format.raw/*46.30*/("""</div>
    """)))}),format.raw/*47.6*/("""

    """),format.raw/*49.5*/("""<table>
        <thead>
            <tr><th>Name</th><th>Price</th>
        </thead>
        <tbody>
        """),_display_(/*54.10*/for(w <- widgets) yield /*54.27*/ {_display_(Seq[Any](format.raw/*54.29*/("""
            """),format.raw/*55.13*/("""<tr><td>"""),_display_(/*55.22*/w/*55.23*/.name),format.raw/*55.28*/("""</td><td>"""),_display_(/*55.38*/w/*55.39*/.price),format.raw/*55.45*/("""</td></tr>
        """)))}),format.raw/*56.10*/("""
        """),format.raw/*57.9*/("""</tbody>
    </table>
""")))}),format.raw/*59.2*/("""
"""))
      }
    }
  }

  def render(widgets:Seq[Widget],form:Form[WidgetData],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(widgets,form)(request,messages)

  def f:((Seq[Widget],Form[WidgetData]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (widgets,form) => (request,messages) => apply(widgets,form)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/listWidgets.scala.html
                  HASH: 3226f1cfabb4b2eedc391be377cb30e529ff13d7
                  MATRIX: 610->1|998->31|1195->135|1222->137|1245->152|1284->154|1316->160|1354->232|1410->262|1449->264|1486->274|1499->278|1533->303|1622->354|1663->367|1713->390|1727->395|1752->399|1782->402|1796->407|1825->415|1866->428|1913->444|1962->450|1995->457|2010->463|2094->538|2134->540|2171->550|2186->556|2222->571|2260->582|2275->588|2382->673|2420->684|2435->690|2545->778|2582->788|2662->838|2696->845|2826->947|2855->948|2900->965|3128->1165|3157->1166|3206->1187|3374->1327|3403->1328|3444->1341|3473->1342|3554->1430|3586->1436|3602->1443|3636->1468|3698->1492|3730->1497|3770->1510|3795->1514|3825->1517|3851->1522|3893->1534|3926->1540|4063->1650|4096->1667|4136->1669|4177->1682|4213->1691|4223->1692|4249->1697|4286->1707|4296->1708|4323->1714|4374->1734|4410->1743|4463->1766
                  LINES: 23->1|28->2|33->3|34->4|34->4|34->4|36->6|38->8|39->9|39->9|40->10|40->10|40->10|40->10|41->11|42->12|42->12|42->12|42->12|42->12|42->12|43->13|44->14|45->15|47->17|47->17|47->17|47->17|48->18|48->18|48->18|50->20|50->20|50->20|52->22|52->22|52->22|54->24|55->25|58->28|59->29|59->29|60->30|63->33|63->33|64->34|66->36|66->36|67->37|67->37|74->44|75->45|75->45|75->45|75->45|76->46|76->46|76->46|76->46|76->46|77->47|79->49|84->54|84->54|84->54|85->55|85->55|85->55|85->55|85->55|85->55|85->55|86->56|87->57|89->59
                  -- GENERATED --
              */
          