package daffodil.section12.lengthKind

import junit.framework.Assert._
import org.scalatest.junit.JUnitSuite
import org.junit.Test
import scala.xml._
import daffodil.xml.XMLUtils
import daffodil.xml.XMLUtils._
import daffodil.compiler.Compiler
import daffodil.util._
import daffodil.tdml.DFDLTestSuite
import java.io.File
import daffodil.debugger.Debugger.withDebugger
import daffodil.debugger.Debugger

class TestLengthKindExplicit extends JUnitSuite {
  val testDir = "/daffodil/section12/lengthKind/"
  val aa = testDir + "ExplicitTests.tdml"
  lazy val runner = new DFDLTestSuite(Misc.getRequiredResource(aa))

  @Test def test_Lesson1_lengthKind_explicit() { runner.runOneTest("Lesson1_lengthKind_explicit") }
  @Test def test_ExplicitLengthBytesNotFixed() = { runner.runOneTest("test_ExplicitLengthBytesNotFixed") }
  @Test def test_ExplicitLengthBytesFixed() = { runner.runOneTest("test_ExplicitLengthBytesFixed") }
  @Test def test_ExplicitLengthBytesBroken() = { runner.runOneTest("test_ExplicitLengthBytesBroken") }
  @Test def test_ExplicitLengthBytesChoiceRef() = { runner.runOneTest("test_ExplicitLengthBytesChoiceRef") }

}
