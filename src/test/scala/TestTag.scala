package com.github.dcsobral.tagscala

import org.specs2._

class TestTag extends Specification with matcher.DataTables {
  def is =
    "TagScala Test Cases".title ^
                                p^ 
    "Invalid input should be rectified" ^ {
      "Input" || "Output" |
      ""      !! "<html><body></body></html>" |> {
        (in: String, out: String) => checker rectify in must beEqualTo(out)
      } 
    } ^
    end

  def checker = new TagScala
}
