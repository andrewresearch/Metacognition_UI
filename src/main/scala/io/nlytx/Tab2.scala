package io.nlytx

import com.thoughtworks.binding.{Binding, dom}
import org.scalajs.dom.html._

object Tab2 {

  val name = "Tech Info"

  @dom
  val content: Binding[Div] =  {
    <div>
      <div class="container">
        <div class = "row">
          <div class="col-md-12">
            <p>
              This app, written by <a href="http://andrewresearch.net">Andrew Gibson</a>, is one of a suite of apps (including <a href="http://goingok.org/">GoingOK</a>), and is part of the realtime component of a <a href="http://lambda-architecture.net">Lambda Architecture</a>, designed for the <a href="http://andrewresearch.net/project/RWA/">analysis of reflective writing.</a>
            </p>
            <p>
              Server-side code is a REST API written in <a href="http://www.scala-lang.org">Scala</a> using <a href="http://finagle.github.io/blog/">Finagle</a>/<a href="https://github.com/finagle/finch/blob/master/docs/index.md">Finch</a>, <a href="https://github.com/travisbrown/circe">Circe</a>, and <a href="http://factorie.cs.umass.edu">Factorie</a> libraries
            </p>
            <p>
              Client-side is written in HTML and TypeScript using <a href="https://angular.io">Angular</a> with <a href="http://getbootstrap.com">Bootstrap</a> CSS, and <a href="http://d3js.org">d3.js</a> for data visualisations.
            </p>
            <p>
              This web application is open source. The API code is available at <a href="https://github.com/andrewresearch/ReflectivePhrases">ReflectivePhrases (GitHub) </a> and the client code is available at <a href="https://github.com/andrewresearch/Metacognition_UI">Metacognition_UI (GitHub) </a>. Other software is available from my <a href="https://github.com/andrewresearch">GitHub (AndrewResearch) page.</a>
            </p>
            <p>
              If you're interested in my work, please <a href="https://twitter.com/AndrewResearch">Follow @AndrewResearch</a>

            </p>
            <p>
              My home page is <a href="http://andrewresearch.net">AndrewResearch.net</a> and my webapps and API's are hosted at <a href="http://nlytx.io">nlytx.io</a>
            </p>
          </div>
         </div>
      </div>
    </div>
  }
}