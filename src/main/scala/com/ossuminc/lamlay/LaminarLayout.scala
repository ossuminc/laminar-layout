package com.ossuminc.lamlay

import scala.scalajs.js
import org.scalajs.dom

import scala.scalajs.js.annotation.*
import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveElement

@main
def main(): Unit = {
  lazy val builder = Layout.Builder()
  builder.withColumnsColumns(h1("Hello Scala.js and Vite with Head.update"))
  Body.update(builder)
}
