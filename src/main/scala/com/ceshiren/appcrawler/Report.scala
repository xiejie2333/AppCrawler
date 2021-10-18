package com.ceshiren.appcrawler

import com.ceshiren.appcrawler.data.AbstractElementStore

import scala.io.Source

/**
  * Created by seveniruby on 16/8/15.
  */
abstract class Report extends CommonLog {


  def genTestCase(resultDir: String): Unit = {
  }


  //todo: 用junit+allure代替
  def runTestCase(namespace: String=""): Unit = {

  }

  def changeTitle(title:String): Unit ={
  }

  def loadResult(elementsFile: String): AbstractElementStore ={
    val content=Source.fromFile(elementsFile).mkString
    log.info(s"${elementsFile} size = ${content.size}")
    //todo: cannot deserialize from Object value (no delegate- or property-based Creator)
    log.warn("一定概率失败，底层依赖库的bug")
    TData.fromYaml[AbstractElementStore](content)
  }

}