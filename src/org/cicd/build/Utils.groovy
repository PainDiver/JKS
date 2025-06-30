package org.cicd.build

class Utils implements Serializable 
{
  String path
  String path2

  void say()
  {
    println "${path}"
    println "${path2}"
  }
}
