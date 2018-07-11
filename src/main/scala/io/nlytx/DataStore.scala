package io.nlytx

import com.thoughtworks.binding.Binding.{Var, Vars}

object DataStore {

  val reflectionData = Var[Reflection](Reflection("","",""))
  val countsData = Var[Reflect](Reflect(0,0.0,0,0.0))
  val summaryData = Var[Summary](Summary(Map(),Map()))
  val tagsData = Vars.empty[Coded]

  val analysed = Var[Boolean](false)
  val showDetails = Var[Boolean](true)
  val showData = Var[Boolean](false)

  import upickle.default.{ReadWriter => RW, macroRW}

  case class Reflection(text:String,source:String,url:String)
  case class Reflect(wordCount:Int,avgWordLength:Double,sentenceCount:Int,avgSentenceLength:Double)
  case class Summary(metaTagSummary:Map[String,Int],phraseTagSummary:Map[String,Int])
  case class Coded(sentence:String,phrases:Vector[String],subTags:Vector[String],metaTags:Vector[String])


  implicit def rwrefn: RW[Reflection] = macroRW
  implicit def rwreft: RW[Reflect] = macroRW
  implicit def rwsumm: RW[Summary] = macroRW
  implicit def rwcode: RW[Coded] = macroRW



}