package com.ossum.lamlay

import scala.scalajs.js
import org.scalajs.dom
import com.raquo.laminar.api.L.*

import scala.scalajs.js.annotation.*
import com.raquo.laminar.api.L.{*, given}

object Body {

  def update(builder: Layout.Builder): Unit = {
    val rootNode = builder.build()
    val selector = dom.document.body.querySelector("#app")
    renderOnDomContentLoaded(selector, rootNode)
  }
}
