package io.nlytx

import com.thoughtworks.binding.{Binding, dom}
import org.scalajs.dom.html._

object Tab0 {

  val name = "About"

  @dom
  val content: Binding[Div] = {
    <div>
      <div class="container-fluid">
        <div class = "row">
          <div class="col">
            <p>This web application is based on research work documented in the following paper:</p>
            <blockquote>
              <p class="small"><a href="http://andrewresearch.net">Gibson, A.</a>, Kirsty, K., and Bruza, P. (2016) <a href="http://epress.lib.uts.edu.au/journals/index.php/JLA/article/view/4545">Towards the Discovery of Learner Metacognition From Reflective Writing.</a> <em><a href="http://epress.lib.uts.edu.au/journals/index.php/JLA/index">Journal of Learning Analytics</a></em>, 3(2), 22-36. doi:<a href="http://dx.doi.org/10.18608/jla.2016.32.3">http://dx.doi.org/10.18608/jla.2016.32.3</a></p>
              <p class="small"><b>ABSTRACT:</b> Modern society demands renewed attention on the competencies required to best equip students for a dynamic and uncertain future. We present exploratory work based on the premise that metacognitive and reflective competencies are essential for this task. Bringing the concepts of metacognition and reflection together into a conceptual model within which we conceived of them as both a set of similar features, and as a spectrum ranging from the unconscious inner-self through to the conscious external social self. This model was used to guide exploratory computational analysis of 6090 instances of reflective writing authored by undergraduate students. We found the conceptual model to be useful in informing the computational analysis, which in turn showed potential for automating the discovery of metacognitive activity in reflective writing, an approach that holds promise for the generation of formative feedback for students as they work towards developing core 21st century competencies.
              </p>
            </blockquote>
          </div>
        </div>
        <div class ="row description-text">
          <div class="col">
            <p>Reflective writing for the paper was drawn from the writing of nearly 1000 students using <a href="http://goingok.org">GoingOK.org</a>. This student data has not been cleared for ethical use outside of a number of research projects at QUT, so is not available via this demo site. However, the same analysis can be performed on other reflective writing samples. A few publicly available samples are provided for demonstration purposes, or you can paste your own reflective writing into the text box and perform an analysis on that.</p>
            <p>We propose a conception of metacognition and reflection as a continuum (see figure 1) from the metacognition by the inner subconscious self to reflection by the external social self, and that when reflection is recorded in reflective writing, that writing may provide evidence of metacognitive activity. We also suggest that the activities of metacognition and reflection share some common features (see figure 2), and that these features may be detectable through the use of certain types of phrases in  reflective writing.</p>
          </div>
        </div>
        <div class="row">
          <div class="col">
            <img src="assets/images/ReflectionMetacognitionSpectrum.jpg" class="img-fluid" alt="Reflection and metacognition as a spectrum" />
              <p class="text-center"><b>Figure 1: Metacognition and reflection as a spectrum</b></p>
              <p>&nbsp;</p>

            </div>
            <div class="col">
              <img src="assets/images/ReflectionMetacognitionComponents.jpg" class="img-fluid" alt="Reflection and metacognition common components" />
                <p class="text-center"><b>Figure 2: Common features of metacognition and reflection</b></p>
                <p>&nbsp;</p>
                <p></p>
              </div>
            </div>
            <div class="row">
              <div class="col">
                <p>The following tables provide show the relationship between the theoretical understanding of metacognition that we adopted, and the computational analysis of the writing. Table 1 shows how we interpret the various features of the model shown in figure 2. The computational model works with phrases and these are tagged with phraseTags. Table 2 shows how these phrase tags relate to the model features, and Table 3 provides an overview as to which grammatical patterns are used in identifying these types of phrases.</p>
              </div>
              <div class="row">
                <div class="col">
                  <img src="assets/images/ComponentDefinitions.jpg" class="img-fluid" alt="Definitions of model components" />
                    <p class="text-center"><b>Table  1: Definitions of the reflection/metacognition features</b></p>
                    <p>&nbsp;</p>

                  </div>
                  <div class="col">
                    <img src="assets/images/PhraseTagMetaTagRelationships.jpg" class="img-fluid" alt="Relationships of computational phraseTags to model metaTags" />
                      <p class="text-center"><b>Table 2: Common features of metacognition and reflection</b></p>
                      <p>&nbsp;</p>
                      <p></p>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col">
                      <img src="assets/images/PhraseTagPatterns.jpg" class="img-fluid" alt="Grammatical patterns of phraseTags" />
                        <p class="text-center"><b>Table  3: Grammatical patterns of phraseTags</b></p>
                        <p>&nbsp;</p>

                      </div>
                      <div class="col">
                        <p>&nbsp;</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>

              }

}
