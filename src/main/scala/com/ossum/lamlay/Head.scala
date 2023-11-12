package com.ossum.lamlay

import scala.scalajs.js
import org.scalajs.dom
import com.raquo.laminar.api.L.*

import scala.scalajs.js.annotation.*
import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.codecs.StringAsIsCodec
import com.raquo.laminar.keys.HtmlAttr


object Head {

  @inline private def stringHtmlAttr(name: String): HtmlAttr[String] = htmlAttr(name, StringAsIsCodec)

  private val id: HtmlAttr[String] = stringHtmlAttr("id")
  private val name: HtmlAttr[String] = stringHtmlAttr("name")
  private val content: HtmlAttr[String] = stringHtmlAttr("content")

  def svgIcon(path: String): HtmlElement = {
    // <link rel="icon" type="image/svg+xml" href="/vite.svg" />
    linkTag(rel:="icon", typ:="image/svg+xml", href := path)
  }

  def title(name: String): HtmlElement = {
    titleTag( name )
  }

  def update(pageTitle: String): Unit = {
//    <head id="headContent">
//      <meta charset="UTF-8"/>
//      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
//      <title>Vite App</title>
//    </head>
    val elem = headTag(
      metaTag( charset := "UTF-8"),
      metaTag( name := "viewport", content := "width=device-width, initial-scale=1.0"),
      svgIcon("/vite.svg"),
      title(pageTitle)
    )
    render(dom.document.head, elem)
  }
}
