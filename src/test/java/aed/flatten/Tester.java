/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the "entrega system".
 *
 */

package flatten;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;

import aed.positionlist.*;


public class Tester {

  public static void main(String[] args) {

    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    boolean ok_sofar = true;

    if (ok_sofar) ok_sofar = test_1();
    if (ok_sofar) ok_sofar = test_2();
    if (ok_sofar) ok_sofar = test_3();
    if (ok_sofar) ok_sofar = test_4();
    if (ok_sofar) ok_sofar = test_5();
    if (ok_sofar) ok_sofar = test_6();
    if (ok_sofar) ok_sofar = test_7();
    if (ok_sofar) ok_sofar = test_8();
    if (ok_sofar) ok_sofar = test_9();
    if (ok_sofar) ok_sofar = test_10();
    if (ok_sofar) ok_sofar = test_11();
    if (ok_sofar) ok_sofar = test_12();
    if (ok_sofar) ok_sofar = test_13();
    if (ok_sofar) ok_sofar = test_14();
    if (ok_sofar) ok_sofar = test_15();
    if (ok_sofar) ok_sofar = test_16();
    if (ok_sofar) ok_sofar = test_17();
    if (ok_sofar) ok_sofar = test_18();
    if (ok_sofar) ok_sofar = test_19();
    if (ok_sofar) ok_sofar = test_20();
    if (ok_sofar) ok_sofar = test_21();
    if (ok_sofar) ok_sofar = test_22();
    if (ok_sofar) ok_sofar = test_23();
    if (ok_sofar) ok_sofar = test_24();
    if (ok_sofar) ok_sofar = test_25();
    if (ok_sofar) ok_sofar = test_26();
    if (ok_sofar) ok_sofar = test_27();
    if (ok_sofar) ok_sofar = test_28();
    if (ok_sofar) ok_sofar = test_29();
    if (ok_sofar) ok_sofar = test_30();
    if (ok_sofar) ok_sofar = test_31();
    if (ok_sofar) ok_sofar = test_32();
    if (ok_sofar) ok_sofar = test_33();
    if (ok_sofar) ok_sofar = test_34();
    if (ok_sofar) ok_sofar = test_35();
    if (ok_sofar) ok_sofar = test_36();
    if (ok_sofar) ok_sofar = test_37();
    if (ok_sofar) ok_sofar = test_38();
    if (ok_sofar) ok_sofar = test_39();
    if (ok_sofar) ok_sofar = test_40();
    if (ok_sofar) ok_sofar = test_41();
    if (ok_sofar) ok_sofar = test_42();
    if (ok_sofar) ok_sofar = test_43();
    if (ok_sofar) ok_sofar = test_44();
    if (ok_sofar) ok_sofar = test_45();
    if (ok_sofar) ok_sofar = test_46();
    if (ok_sofar) ok_sofar = test_47();
    if (ok_sofar) ok_sofar = test_48();
    if (ok_sofar) ok_sofar = test_49();
    if (ok_sofar) ok_sofar = test_50();
    if (ok_sofar) ok_sofar = test_51();
    if (ok_sofar) ok_sofar = test_52();
    if (ok_sofar) ok_sofar = test_53();
    if (ok_sofar) ok_sofar = test_54();
    if (ok_sofar) ok_sofar = test_55();
    if (ok_sofar) ok_sofar = test_56();
    if (ok_sofar) ok_sofar = test_57();
    if (ok_sofar) ok_sofar = test_58();
    if (ok_sofar) ok_sofar = test_59();
    if (ok_sofar) ok_sofar = test_60();
    if (ok_sofar) ok_sofar = test_61();
    if (ok_sofar) ok_sofar = test_62();
    if (ok_sofar) ok_sofar = test_63();
    if (ok_sofar) ok_sofar = test_64();
    if (ok_sofar) ok_sofar = test_65();
    if (ok_sofar) ok_sofar = test_66();
    if (ok_sofar) ok_sofar = test_67();
    if (ok_sofar) ok_sofar = test_68();
    if (ok_sofar) ok_sofar = test_69();
    if (ok_sofar) ok_sofar = test_70();

    if (ok_sofar)
      System.out.println("\n Tester: Test finalizado correctamente.");
  }



  // member(0,[]) --> false
  private static boolean test_1 ()
  {
      Integer[] arr = new Integer[] {  } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(0,l) ;
          if (!result == false)
          {
              printError("test_1") ;
              System.out.println("calling member("+0+","+copy_l+") returns "+result+" but should have returned "+false) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_1") ;
              System.out.println("after calling member("+0+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_1") ;
          System.out.println("calling member("+0+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(0,[0]) --> true
  private static boolean test_2 ()
  {
      Integer[] arr = new Integer[] { new Integer(0) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(0,l) ;
          if (!result == true)
          {
              printError("test_2") ;
              System.out.println("calling member("+0+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_2") ;
              System.out.println("after calling member("+0+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_2") ;
          System.out.println("calling member("+0+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(0,[1]) --> false
  private static boolean test_3 ()
  {
      Integer[] arr = new Integer[] { new Integer(1) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(0,l) ;
          if (!result == false)
          {
              printError("test_3") ;
              System.out.println("calling member("+0+","+copy_l+") returns "+result+" but should have returned "+false) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_3") ;
              System.out.println("after calling member("+0+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_3") ;
          System.out.println("calling member("+0+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(0,[1,1]) --> false
  private static boolean test_4 ()
  {
      Integer[] arr = new Integer[] { new Integer(1),new Integer(1) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(0,l) ;
          if (!result == false)
          {
              printError("test_4") ;
              System.out.println("calling member("+0+","+copy_l+") returns "+result+" but should have returned "+false) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_4") ;
              System.out.println("after calling member("+0+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_4") ;
          System.out.println("calling member("+0+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(0,[0,0]) --> true
  private static boolean test_5 ()
  {
      Integer[] arr = new Integer[] { new Integer(0),new Integer(0) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(0,l) ;
          if (!result == true)
          {
              printError("test_5") ;
              System.out.println("calling member("+0+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_5") ;
              System.out.println("after calling member("+0+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_5") ;
          System.out.println("calling member("+0+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(0,[1,0,2]) --> true
  private static boolean test_6 ()
  {
      Integer[] arr = new Integer[] { new Integer(1),new Integer(0),new Integer(2) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(0,l) ;
          if (!result == true)
          {
              printError("test_6") ;
              System.out.println("calling member("+0+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_6") ;
              System.out.println("after calling member("+0+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_6") ;
          System.out.println("calling member("+0+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(0,[1,0]) --> true
  private static boolean test_7 ()
  {
      Integer[] arr = new Integer[] { new Integer(1),new Integer(0) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(0,l) ;
          if (!result == true)
          {
              printError("test_7") ;
              System.out.println("calling member("+0+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_7") ;
              System.out.println("after calling member("+0+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_7") ;
          System.out.println("calling member("+0+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(0,[1,2,0]) --> true
  private static boolean test_8 ()
  {
      Integer[] arr = new Integer[] { new Integer(1),new Integer(2),new Integer(0) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(0,l) ;
          if (!result == true)
          {
              printError("test_8") ;
              System.out.println("calling member("+0+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_8") ;
              System.out.println("after calling member("+0+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_8") ;
          System.out.println("calling member("+0+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(0,[1,1,0]) --> true
  private static boolean test_9 ()
  {
      Integer[] arr = new Integer[] { new Integer(1),new Integer(1),new Integer(0) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(0,l) ;
          if (!result == true)
          {
              printError("test_9") ;
              System.out.println("calling member("+0+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_9") ;
              System.out.println("after calling member("+0+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_9") ;
          System.out.println("calling member("+0+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(0,[1,2,4,5,6,7,0]) --> true
  private static boolean test_10 ()
  {
      Integer[] arr = new Integer[] { new Integer(1),new Integer(2),new Integer(4),new Integer(5),new Integer(6),new Integer(7),new Integer(0) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(0,l) ;
          if (!result == true)
          {
              printError("test_10") ;
              System.out.println("calling member("+0+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_10") ;
              System.out.println("after calling member("+0+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_10") ;
          System.out.println("calling member("+0+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(0,[0,4,1,9]) --> true
  private static boolean test_11 ()
  {
      Integer[] arr = new Integer[] { new Integer(0),new Integer(4),new Integer(1),new Integer(9) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(0,l) ;
          if (!result == true)
          {
              printError("test_11") ;
              System.out.println("calling member("+0+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_11") ;
              System.out.println("after calling member("+0+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_11") ;
          System.out.println("calling member("+0+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(8,[9,9,0,4]) --> false
  private static boolean test_12 ()
  {
      Integer[] arr = new Integer[] { new Integer(9),new Integer(9),new Integer(0),new Integer(4) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(8,l) ;
          if (!result == false)
          {
              printError("test_12") ;
              System.out.println("calling member("+8+","+copy_l+") returns "+result+" but should have returned "+false) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_12") ;
              System.out.println("after calling member("+8+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_12") ;
          System.out.println("calling member("+8+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(3,[0,9]) --> false
  private static boolean test_13 ()
  {
      Integer[] arr = new Integer[] { new Integer(0),new Integer(9) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(3,l) ;
          if (!result == false)
          {
              printError("test_13") ;
              System.out.println("calling member("+3+","+copy_l+") returns "+result+" but should have returned "+false) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_13") ;
              System.out.println("after calling member("+3+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_13") ;
          System.out.println("calling member("+3+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(9,[8,8,7,9,9]) --> true
  private static boolean test_14 ()
  {
      Integer[] arr = new Integer[] { new Integer(8),new Integer(8),new Integer(7),new Integer(9),new Integer(9) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(9,l) ;
          if (!result == true)
          {
              printError("test_14") ;
              System.out.println("calling member("+9+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_14") ;
              System.out.println("after calling member("+9+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_14") ;
          System.out.println("calling member("+9+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(9,[8,1,8,7]) --> false
  private static boolean test_15 ()
  {
      Integer[] arr = new Integer[] { new Integer(8),new Integer(1),new Integer(8),new Integer(7) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(9,l) ;
          if (!result == false)
          {
              printError("test_15") ;
              System.out.println("calling member("+9+","+copy_l+") returns "+result+" but should have returned "+false) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_15") ;
              System.out.println("after calling member("+9+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_15") ;
          System.out.println("calling member("+9+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(0,[0,7,4,7,8]) --> true
  private static boolean test_16 ()
  {
      Integer[] arr = new Integer[] { new Integer(0),new Integer(7),new Integer(4),new Integer(7),new Integer(8) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(0,l) ;
          if (!result == true)
          {
              printError("test_16") ;
              System.out.println("calling member("+0+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_16") ;
              System.out.println("after calling member("+0+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_16") ;
          System.out.println("calling member("+0+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(1,[8,2,4,7,1]) --> true
  private static boolean test_17 ()
  {
      Integer[] arr = new Integer[] { new Integer(8),new Integer(2),new Integer(4),new Integer(7),new Integer(1) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(1,l) ;
          if (!result == true)
          {
              printError("test_17") ;
              System.out.println("calling member("+1+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_17") ;
              System.out.println("after calling member("+1+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_17") ;
          System.out.println("calling member("+1+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(6,[6,7,6]) --> true
  private static boolean test_18 ()
  {
      Integer[] arr = new Integer[] { new Integer(6),new Integer(7),new Integer(6) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(6,l) ;
          if (!result == true)
          {
              printError("test_18") ;
              System.out.println("calling member("+6+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_18") ;
              System.out.println("after calling member("+6+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_18") ;
          System.out.println("calling member("+6+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(6,[6]) --> true
  private static boolean test_19 ()
  {
      Integer[] arr = new Integer[] { new Integer(6) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(6,l) ;
          if (!result == true)
          {
              printError("test_19") ;
              System.out.println("calling member("+6+","+copy_l+") returns "+result+" but should have returned "+true) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_19") ;
              System.out.println("after calling member("+6+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_19") ;
          System.out.println("calling member("+6+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // member(8,[5,3,5,6]) --> false
  private static boolean test_20 ()
  {
      Integer[] arr = new Integer[] { new Integer(5),new Integer(3),new Integer(5),new Integer(6) } ;
      PositionList<Integer> l = new NodePositionList<Integer>(arr) ;
      PositionList<Integer> copy_l = new NodePositionList<Integer>(arr) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          boolean result = flatten.member(8,l) ;
          if (!result == false)
          {
              printError("test_20") ;
              System.out.println("calling member("+8+","+copy_l+") returns "+result+" but should have returned "+false) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_20") ;
              System.out.println("after calling member("+8+","+copy_l+") the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_20") ;
          System.out.println("calling member("+8+","+copy_l+") raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([]) --> []
  private static boolean test_21 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] {  }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_21") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_21") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_21") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[]]) --> []
  private static boolean test_22 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] {  }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_22") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_22") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_22") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[2]]) --> [2]
  private static boolean test_23 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(2) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_23") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_23") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_23") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[],[]]) --> []
  private static boolean test_24 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] {  }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_24") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_24") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_24") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[],[],[]]) --> []
  private static boolean test_25 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] {  }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_25") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_25") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_25") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[2],[],[2]]) --> [2]
  private static boolean test_26 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(2) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_26") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_26") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_26") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[1],[1],[1]]) --> [1]
  private static boolean test_27 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(1) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_27") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_27") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_27") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[1],[2],[3]]) --> [1,2,3]
  private static boolean test_28 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(2),new Integer(3) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_28") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_28") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_28") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[1,1]]) --> [1]
  private static boolean test_29 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(1),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(1) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_29") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_29") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_29") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[1],[1]]) --> [1]
  private static boolean test_30 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(1) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_30") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_30") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_30") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[1,1,1,1,1]]) --> [1]
  private static boolean test_31 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(1) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_31") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_31") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_31") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[1,2],[1,2],[1,2]]) --> [1,2]
  private static boolean test_32 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(1),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(2) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_32") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_32") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_32") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[],[1]]) --> [1]
  private static boolean test_33 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(1) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_33") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_33") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_33") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[],[],[1]]) --> [1]
  private static boolean test_34 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(1) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_34") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_34") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_34") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[],[1],[]]) --> [1]
  private static boolean test_35 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(1) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_35") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_35") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_35") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[1],[],[]]) --> [1]
  private static boolean test_36 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(1) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_36") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_36") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_36") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[9,0],[8,1],[7]]) --> [9,0,8,1,7]
  private static boolean test_37 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(9),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(9),new Integer(0),new Integer(8),new Integer(1),new Integer(7) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_37") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_37") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_37") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[7,2,9,5]]) --> [7,2,9,5]
  private static boolean test_38 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(7),new Integer(2),new Integer(9),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(7),new Integer(2),new Integer(9),new Integer(5) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_38") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_38") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_38") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[8,5,8,3,8,0],[0,9,0,8,9,9],[2,9,2],[],[],[8,5]]) --> [8,5,3,0,9,2]
  private static boolean test_39 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(8),new Integer(5),new Integer(8),new Integer(3),new Integer(8),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(9),new Integer(0),new Integer(8),new Integer(9),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(9),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(8),new Integer(5),new Integer(3),new Integer(0),new Integer(9),new Integer(2) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_39") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_39") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_39") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[7,8,3,5,8],[],[7,0,2,7,3],[2,3],[8,7,8,8,6]]) --> [7,8,3,5,0,2,6]
  private static boolean test_40 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(7),new Integer(8),new Integer(3),new Integer(5),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(0),new Integer(2),new Integer(7),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(7),new Integer(8),new Integer(8),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(7),new Integer(8),new Integer(3),new Integer(5),new Integer(0),new Integer(2),new Integer(6) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_40") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_40") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_40") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[1,6,0],[2,3,1,4],[9,0,0]]) --> [1,6,0,2,3,4,9]
  private static boolean test_41 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(1),new Integer(6),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(3),new Integer(1),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(0),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(6),new Integer(0),new Integer(2),new Integer(3),new Integer(4),new Integer(9) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_41") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_41") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_41") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[0,5,6,3],[7,8,6,3],[1,1,0,8]]) --> [0,5,6,3,7,8,1]
  private static boolean test_42 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(0),new Integer(5),new Integer(6),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(8),new Integer(6),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(1),new Integer(0),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(0),new Integer(5),new Integer(6),new Integer(3),new Integer(7),new Integer(8),new Integer(1) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_42") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_42") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_42") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[0],[2,0,5,7],[],[8]]) --> [0,2,5,7,8]
  private static boolean test_43 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(0),new Integer(5),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(0),new Integer(2),new Integer(5),new Integer(7),new Integer(8) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_43") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_43") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_43") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[8,6,8],[9,0],[8,9,8,3],[8,8,8,0,4,9],[],[9,5,9,1,7,1,8],[9,8,1,7,6]]) --> [8,6,9,0,3,4,5,1,7]
  private static boolean test_44 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(8),new Integer(6),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(9),new Integer(8),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(8),new Integer(8),new Integer(0),new Integer(4),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(5),new Integer(9),new Integer(1),new Integer(7),new Integer(1),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(8),new Integer(1),new Integer(7),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(8),new Integer(6),new Integer(9),new Integer(0),new Integer(3),new Integer(4),new Integer(5),new Integer(1),new Integer(7) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_44") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_44") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_44") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[2,1,7,6,7,0,7,7],[]]) --> [2,1,7,6,0]
  private static boolean test_45 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(2),new Integer(1),new Integer(7),new Integer(6),new Integer(7),new Integer(0),new Integer(7),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(1),new Integer(7),new Integer(6),new Integer(0) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_45") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_45") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_45") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[7,5,1,0,4,6,5],[4,1,9,5,5,8,2],[3,1,5,3,1,8,5,2],[4],[6,5,5,3,4,6,8,7,2],[4,4,7],[5,6,2],[],[8,2]]) --> [7,5,1,0,4,6,9,8,2,3]
  private static boolean test_46 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(7),new Integer(5),new Integer(1),new Integer(0),new Integer(4),new Integer(6),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(1),new Integer(9),new Integer(5),new Integer(5),new Integer(8),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(3),new Integer(1),new Integer(5),new Integer(3),new Integer(1),new Integer(8),new Integer(5),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(6),new Integer(5),new Integer(5),new Integer(3),new Integer(4),new Integer(6),new Integer(8),new Integer(7),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(4),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(6),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(7),new Integer(5),new Integer(1),new Integer(0),new Integer(4),new Integer(6),new Integer(9),new Integer(8),new Integer(2),new Integer(3) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_46") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_46") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_46") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[4,1,5,2],[2,6,0,6],[9]]) --> [4,1,5,2,6,0,9]
  private static boolean test_47 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(4),new Integer(1),new Integer(5),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(6),new Integer(0),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(1),new Integer(5),new Integer(2),new Integer(6),new Integer(0),new Integer(9) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_47") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_47") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_47") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[8,7,9],[7],[9,3,0,8,6],[1,3],[2,5,8,2,1,8,9,8],[8,2,2,3],[7,0,3,8]]) --> [8,7,9,3,0,6,1,2,5]
  private static boolean test_48 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(8),new Integer(7),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(3),new Integer(0),new Integer(8),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(5),new Integer(8),new Integer(2),new Integer(1),new Integer(8),new Integer(9),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(2),new Integer(2),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(0),new Integer(3),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(8),new Integer(7),new Integer(9),new Integer(3),new Integer(0),new Integer(6),new Integer(1),new Integer(2),new Integer(5) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_48") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_48") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_48") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[5,9,3,9,8],[6,2,0,1,1,3,3,8,0,1],[8,6,4,4,5,2,9,8,6,6],[1,1,6,1,6,6],[4],[7,9,3,1],[7,6,7,1,5,8,4],[],[5,7,0,1,2,8]]) --> [5,9,3,8,6,2,0,1,4,7]
  private static boolean test_49 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(5),new Integer(9),new Integer(3),new Integer(9),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(6),new Integer(2),new Integer(0),new Integer(1),new Integer(1),new Integer(3),new Integer(3),new Integer(8),new Integer(0),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(6),new Integer(4),new Integer(4),new Integer(5),new Integer(2),new Integer(9),new Integer(8),new Integer(6),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(1),new Integer(6),new Integer(1),new Integer(6),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(9),new Integer(3),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(6),new Integer(7),new Integer(1),new Integer(5),new Integer(8),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(7),new Integer(0),new Integer(1),new Integer(2),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(9),new Integer(3),new Integer(8),new Integer(6),new Integer(2),new Integer(0),new Integer(1),new Integer(4),new Integer(7) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_49") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_49") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_49") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[],[],[4,3,4,1,4,7,7,7],[1,1,3,3,6,9,1,8],[4,4,8,8],[9],[6,9,7,8,6],[1,2,8,0,1]]) --> [4,3,1,7,6,9,8,2,0]
  private static boolean test_50 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(3),new Integer(4),new Integer(1),new Integer(4),new Integer(7),new Integer(7),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(1),new Integer(3),new Integer(3),new Integer(6),new Integer(9),new Integer(1),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(4),new Integer(8),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(6),new Integer(9),new Integer(7),new Integer(8),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(2),new Integer(8),new Integer(0),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(3),new Integer(1),new Integer(7),new Integer(6),new Integer(9),new Integer(8),new Integer(2),new Integer(0) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_50") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_50") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_50") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[0,1],[9,4,1,9,5],[9,1,3,3,4,4,8,9],[7],[5,3,0,7,1,1],[8,9,5,9,4,1,0,0,0,1],[1,6,0,6,1,5,4]]) --> [0,1,9,4,5,3,8,7,6]
  private static boolean test_51 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(0),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(4),new Integer(1),new Integer(9),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(1),new Integer(3),new Integer(3),new Integer(4),new Integer(4),new Integer(8),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(3),new Integer(0),new Integer(7),new Integer(1),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(9),new Integer(5),new Integer(9),new Integer(4),new Integer(1),new Integer(0),new Integer(0),new Integer(0),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(6),new Integer(0),new Integer(6),new Integer(1),new Integer(5),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(0),new Integer(1),new Integer(9),new Integer(4),new Integer(5),new Integer(3),new Integer(8),new Integer(7),new Integer(6) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_51") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_51") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_51") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[3,9,1,8,5,6,5,3,6,8],[5,2,1,6,2,5,0,4],[4,5,3],[0,6,9,7,7,8,8],[5,5,7,1,9]]) --> [3,9,1,8,5,6,2,0,4,7]
  private static boolean test_52 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(3),new Integer(9),new Integer(1),new Integer(8),new Integer(5),new Integer(6),new Integer(5),new Integer(3),new Integer(6),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(2),new Integer(1),new Integer(6),new Integer(2),new Integer(5),new Integer(0),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(5),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(6),new Integer(9),new Integer(7),new Integer(7),new Integer(8),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(5),new Integer(7),new Integer(1),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(9),new Integer(1),new Integer(8),new Integer(5),new Integer(6),new Integer(2),new Integer(0),new Integer(4),new Integer(7) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_52") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_52") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_52") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[4,0,2],[6,2,6,9,6,2],[1,7,1,6,6,2,6,9,8],[9,6,3,9,9],[0,3,2,3],[5,3,6],[4,6,7,6],[1,1,2],[3,6,3,4,1,2,3,1,3,2,6],[2,7,0,3],[6,3,0,9,3,8,1,0,1,4,4]]) --> [4,0,2,6,9,1,7,8,3,5]
  private static boolean test_53 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(4),new Integer(0),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(6),new Integer(2),new Integer(6),new Integer(9),new Integer(6),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(7),new Integer(1),new Integer(6),new Integer(6),new Integer(2),new Integer(6),new Integer(9),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(6),new Integer(3),new Integer(9),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(3),new Integer(2),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(3),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(6),new Integer(7),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(1),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(3),new Integer(6),new Integer(3),new Integer(4),new Integer(1),new Integer(2),new Integer(3),new Integer(1),new Integer(3),new Integer(2),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(7),new Integer(0),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(6),new Integer(3),new Integer(0),new Integer(9),new Integer(3),new Integer(8),new Integer(1),new Integer(0),new Integer(1),new Integer(4),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(0),new Integer(2),new Integer(6),new Integer(9),new Integer(1),new Integer(7),new Integer(8),new Integer(3),new Integer(5) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_53") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_53") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_53") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[4],[5,5,2,1,0,8,8,9],[1,0,5,2,0,2],[8,5,8,5],[7,2,7,1,7,0,7,9,7],[4,4,3,6,2,5],[0,2,9,6,0,7,8,3,7,6],[2,1,8,1,7,3,4,4,6,7],[5,2]]) --> [4,5,2,1,0,8,9,7,3,6]
  private static boolean test_54 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(5),new Integer(2),new Integer(1),new Integer(0),new Integer(8),new Integer(8),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(0),new Integer(5),new Integer(2),new Integer(0),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(5),new Integer(8),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(2),new Integer(7),new Integer(1),new Integer(7),new Integer(0),new Integer(7),new Integer(9),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(4),new Integer(3),new Integer(6),new Integer(2),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(2),new Integer(9),new Integer(6),new Integer(0),new Integer(7),new Integer(8),new Integer(3),new Integer(7),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(1),new Integer(8),new Integer(1),new Integer(7),new Integer(3),new Integer(4),new Integer(4),new Integer(6),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(5),new Integer(2),new Integer(1),new Integer(0),new Integer(8),new Integer(9),new Integer(7),new Integer(3),new Integer(6) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_54") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_54") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_54") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[7,9,2,9,8,5,4,1,1],[2,2,7,6,4,3,8],[7,8,0,9,4],[9]]) --> [7,9,2,8,5,4,1,6,3,0]
  private static boolean test_55 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(7),new Integer(9),new Integer(2),new Integer(9),new Integer(8),new Integer(5),new Integer(4),new Integer(1),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(2),new Integer(7),new Integer(6),new Integer(4),new Integer(3),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(8),new Integer(0),new Integer(9),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(7),new Integer(9),new Integer(2),new Integer(8),new Integer(5),new Integer(4),new Integer(1),new Integer(6),new Integer(3),new Integer(0) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_55") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_55") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_55") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[7,0,7,2],[7,9,2,1,7,8,5,1,6,7],[6,7,1,5,8,7,6,0,1,0,7],[9,3,7,5,1,2,2,3,1],[2,6,2,1,8,7,3,6,5,1,8],[0,0,8,9,1,5,3,7,1,4,4,9],[6,9],[8,3,2,2]]) --> [7,0,2,9,1,8,5,6,3,4]
  private static boolean test_56 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(7),new Integer(0),new Integer(7),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(9),new Integer(2),new Integer(1),new Integer(7),new Integer(8),new Integer(5),new Integer(1),new Integer(6),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(6),new Integer(7),new Integer(1),new Integer(5),new Integer(8),new Integer(7),new Integer(6),new Integer(0),new Integer(1),new Integer(0),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(3),new Integer(7),new Integer(5),new Integer(1),new Integer(2),new Integer(2),new Integer(3),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(6),new Integer(2),new Integer(1),new Integer(8),new Integer(7),new Integer(3),new Integer(6),new Integer(5),new Integer(1),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(0),new Integer(8),new Integer(9),new Integer(1),new Integer(5),new Integer(3),new Integer(7),new Integer(1),new Integer(4),new Integer(4),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(6),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(3),new Integer(2),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(7),new Integer(0),new Integer(2),new Integer(9),new Integer(1),new Integer(8),new Integer(5),new Integer(6),new Integer(3),new Integer(4) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_56") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_56") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_56") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[6,9],[7,2],[3,0,4,5,5,5,3,1,7,0],[9,1,8,6,0,0,2,1,2,8],[9,8]]) --> [6,9,7,2,3,0,4,5,1,8]
  private static boolean test_57 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(6),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(3),new Integer(0),new Integer(4),new Integer(5),new Integer(5),new Integer(5),new Integer(3),new Integer(1),new Integer(7),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(1),new Integer(8),new Integer(6),new Integer(0),new Integer(0),new Integer(2),new Integer(1),new Integer(2),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(6),new Integer(9),new Integer(7),new Integer(2),new Integer(3),new Integer(0),new Integer(4),new Integer(5),new Integer(1),new Integer(8) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_57") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_57") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_57") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[4,9],[4,4,6,0],[4,0,3,2,7,9,2,4,2,8,9,8]]) --> [4,9,6,0,3,2,7,8]
  private static boolean test_58 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(4),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(4),new Integer(6),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(0),new Integer(3),new Integer(2),new Integer(7),new Integer(9),new Integer(2),new Integer(4),new Integer(2),new Integer(8),new Integer(9),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(9),new Integer(6),new Integer(0),new Integer(3),new Integer(2),new Integer(7),new Integer(8) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_58") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_58") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_58") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[4,3,9],[0,8,8,3,2,8,0,8],[0,3,7,9,8,8,1,6,5,8,5,5,0],[],[1,0,5,8,7],[0,3,5,7,0,1,8,7,4,7,1,5],[4,8,9,4,1,4,1,2,2],[4,5,4,6],[1,0,4,9,1,0,4,6,2,5],[7,7,3,3,0,1,7,0],[5,6,6,5,4],[4,3,2,3,0,2,8]]) --> [4,3,9,0,8,2,7,1,6,5]
  private static boolean test_59 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(4),new Integer(3),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(8),new Integer(8),new Integer(3),new Integer(2),new Integer(8),new Integer(0),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(3),new Integer(7),new Integer(9),new Integer(8),new Integer(8),new Integer(1),new Integer(6),new Integer(5),new Integer(8),new Integer(5),new Integer(5),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(0),new Integer(5),new Integer(8),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(3),new Integer(5),new Integer(7),new Integer(0),new Integer(1),new Integer(8),new Integer(7),new Integer(4),new Integer(7),new Integer(1),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(8),new Integer(9),new Integer(4),new Integer(1),new Integer(4),new Integer(1),new Integer(2),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(5),new Integer(4),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(0),new Integer(4),new Integer(9),new Integer(1),new Integer(0),new Integer(4),new Integer(6),new Integer(2),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(7),new Integer(3),new Integer(3),new Integer(0),new Integer(1),new Integer(7),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(6),new Integer(6),new Integer(5),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(3),new Integer(2),new Integer(3),new Integer(0),new Integer(2),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(3),new Integer(9),new Integer(0),new Integer(8),new Integer(2),new Integer(7),new Integer(1),new Integer(6),new Integer(5) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_59") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_59") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_59") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[0,7],[1,3,4,1,8,3],[0,7,8,8,7,7,6],[5],[0,7,8,4,8],[7,9],[0,1,2,6,5,9,5,5,7],[1,1,8,2,7,8,1,2],[9,0,8,0,5]]) --> [0,7,1,3,4,8,6,5,9,2]
  private static boolean test_60 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(0),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(3),new Integer(4),new Integer(1),new Integer(8),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(7),new Integer(8),new Integer(8),new Integer(7),new Integer(7),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(7),new Integer(8),new Integer(4),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(1),new Integer(2),new Integer(6),new Integer(5),new Integer(9),new Integer(5),new Integer(5),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(1),new Integer(8),new Integer(2),new Integer(7),new Integer(8),new Integer(1),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(0),new Integer(8),new Integer(0),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(0),new Integer(7),new Integer(1),new Integer(3),new Integer(4),new Integer(8),new Integer(6),new Integer(5),new Integer(9),new Integer(2) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_60") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_60") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_60") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[1,5],[1,1,1,5,2,9,5,5,1,5,1,2,3],[1,2,2,8,8,7,2,3,8,7,2,2],[2,5,2,4,2,7,4,7,4],[6,3],[],[2,5,5,7,4,5,3,5,6,2,9]]) --> [1,5,2,9,3,8,7,4,6]
  private static boolean test_61 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(1),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(5),new Integer(2),new Integer(9),new Integer(5),new Integer(5),new Integer(1),new Integer(5),new Integer(1),new Integer(2),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(2),new Integer(2),new Integer(8),new Integer(8),new Integer(7),new Integer(2),new Integer(3),new Integer(8),new Integer(7),new Integer(2),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(5),new Integer(2),new Integer(4),new Integer(2),new Integer(7),new Integer(4),new Integer(7),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(6),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(5),new Integer(5),new Integer(7),new Integer(4),new Integer(5),new Integer(3),new Integer(5),new Integer(6),new Integer(2),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(5),new Integer(2),new Integer(9),new Integer(3),new Integer(8),new Integer(7),new Integer(4),new Integer(6) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_61") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_61") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_61") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[2,9,3,7,2,6],[4,9,4,8,1,6,5,0,6],[8,8,2,3,6,3,2,3,3,7,5,4],[9,1,1,2,7,8,8,8,4],[8,5,7,4,5,2,2,9],[9,3,3,8],[1],[5],[6,8,3],[1,2,7,7]]) --> [2,9,3,7,6,4,8,1,5,0]
  private static boolean test_62 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(2),new Integer(9),new Integer(3),new Integer(7),new Integer(2),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(9),new Integer(4),new Integer(8),new Integer(1),new Integer(6),new Integer(5),new Integer(0),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(8),new Integer(2),new Integer(3),new Integer(6),new Integer(3),new Integer(2),new Integer(3),new Integer(3),new Integer(7),new Integer(5),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(1),new Integer(1),new Integer(2),new Integer(7),new Integer(8),new Integer(8),new Integer(8),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(5),new Integer(7),new Integer(4),new Integer(5),new Integer(2),new Integer(2),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(3),new Integer(3),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(6),new Integer(8),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(2),new Integer(7),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(9),new Integer(3),new Integer(7),new Integer(6),new Integer(4),new Integer(8),new Integer(1),new Integer(5),new Integer(0) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_62") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_62") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_62") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[7,1,9,8,1,3,0,4,0,4,3],[2,2,3,5],[8,5,8,4,1,3],[1,5,5,5,0,7,9,3,8,7,8,5],[0,6,7,1],[],[],[],[4,2,0,4,3,1,5,1],[5,5,6,8,0,8],[2,6,9,2,0,6,0,4,7,5,9,6,2,4]]) --> [7,1,9,8,3,0,4,2,5,6]
  private static boolean test_63 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(7),new Integer(1),new Integer(9),new Integer(8),new Integer(1),new Integer(3),new Integer(0),new Integer(4),new Integer(0),new Integer(4),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(2),new Integer(3),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(5),new Integer(8),new Integer(4),new Integer(1),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(5),new Integer(5),new Integer(5),new Integer(0),new Integer(7),new Integer(9),new Integer(3),new Integer(8),new Integer(7),new Integer(8),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(6),new Integer(7),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(2),new Integer(0),new Integer(4),new Integer(3),new Integer(1),new Integer(5),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(5),new Integer(6),new Integer(8),new Integer(0),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(6),new Integer(9),new Integer(2),new Integer(0),new Integer(6),new Integer(0),new Integer(4),new Integer(7),new Integer(5),new Integer(9),new Integer(6),new Integer(2),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(7),new Integer(1),new Integer(9),new Integer(8),new Integer(3),new Integer(0),new Integer(4),new Integer(2),new Integer(5),new Integer(6) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_63") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_63") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_63") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[3,1,5,1],[2,9],[8,2,2,5,2,0,7],[3,4,7,0,2,2,4,9,3,0],[9,2,6,3,9,8,2,0,7,0,7,3,5,8,6]]) --> [3,1,5,2,9,8,0,7,4,6]
  private static boolean test_64 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(3),new Integer(1),new Integer(5),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(2),new Integer(2),new Integer(5),new Integer(2),new Integer(0),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(3),new Integer(4),new Integer(7),new Integer(0),new Integer(2),new Integer(2),new Integer(4),new Integer(9),new Integer(3),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(2),new Integer(6),new Integer(3),new Integer(9),new Integer(8),new Integer(2),new Integer(0),new Integer(7),new Integer(0),new Integer(7),new Integer(3),new Integer(5),new Integer(8),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(1),new Integer(5),new Integer(2),new Integer(9),new Integer(8),new Integer(0),new Integer(7),new Integer(4),new Integer(6) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_64") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_64") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_64") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[4,8,8,7,3,8,7,8,5],[6,4,3,4,8,5,2,2,0,8,9,2,2,8],[1,2,6,3,3,9,9,2,7,9,8,0,2,4],[3,9,2,5,1,3,8,2,3,8,7,4,9,3,9],[8,3,5,6,7,8,6,6,1,8,2,8,9,0,1],[3,6,3],[2,8,4,3,1,3,0]]) --> [4,8,7,3,5,6,2,0,9,1]
  private static boolean test_65 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(4),new Integer(8),new Integer(8),new Integer(7),new Integer(3),new Integer(8),new Integer(7),new Integer(8),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(6),new Integer(4),new Integer(3),new Integer(4),new Integer(8),new Integer(5),new Integer(2),new Integer(2),new Integer(0),new Integer(8),new Integer(9),new Integer(2),new Integer(2),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(2),new Integer(6),new Integer(3),new Integer(3),new Integer(9),new Integer(9),new Integer(2),new Integer(7),new Integer(9),new Integer(8),new Integer(0),new Integer(2),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(3),new Integer(9),new Integer(2),new Integer(5),new Integer(1),new Integer(3),new Integer(8),new Integer(2),new Integer(3),new Integer(8),new Integer(7),new Integer(4),new Integer(9),new Integer(3),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(3),new Integer(5),new Integer(6),new Integer(7),new Integer(8),new Integer(6),new Integer(6),new Integer(1),new Integer(8),new Integer(2),new Integer(8),new Integer(9),new Integer(0),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(3),new Integer(6),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(8),new Integer(4),new Integer(3),new Integer(1),new Integer(3),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(8),new Integer(7),new Integer(3),new Integer(5),new Integer(6),new Integer(2),new Integer(0),new Integer(9),new Integer(1) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_65") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_65") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_65") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[3,5,5,6,0,1,4,6,1,0,6,8,5],[1,8,5,1],[5,3,5,4,5,6,9],[3,0,9,9,9,8,9,4,0,3,1,5,9,7],[4,0,8,8,0],[7,2,2,7,8,1,2,5],[7,6,4,7,3],[8,1],[0,5,5,9,2,6,3,8,8,2,2,6]]) --> [3,5,6,0,1,4,8,9,7,2]
  private static boolean test_66 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(3),new Integer(5),new Integer(5),new Integer(6),new Integer(0),new Integer(1),new Integer(4),new Integer(6),new Integer(1),new Integer(0),new Integer(6),new Integer(8),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(8),new Integer(5),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(3),new Integer(5),new Integer(4),new Integer(5),new Integer(6),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(3),new Integer(0),new Integer(9),new Integer(9),new Integer(9),new Integer(8),new Integer(9),new Integer(4),new Integer(0),new Integer(3),new Integer(1),new Integer(5),new Integer(9),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(0),new Integer(8),new Integer(8),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(2),new Integer(2),new Integer(7),new Integer(8),new Integer(1),new Integer(2),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(6),new Integer(4),new Integer(7),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(5),new Integer(5),new Integer(9),new Integer(2),new Integer(6),new Integer(3),new Integer(8),new Integer(8),new Integer(2),new Integer(2),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(5),new Integer(6),new Integer(0),new Integer(1),new Integer(4),new Integer(8),new Integer(9),new Integer(7),new Integer(2) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_66") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_66") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_66") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[8,2,2,3,9,3,1,9,1],[0,6,8],[7,9,4,0,0,0,3,9,8,8,2,6],[],[8,3],[0,8,0,7,5,4,9],[3,6,8,1,8,8,6,7,7,7,9],[9,9,4,8,7,7,9,1],[5,7,8,9,4,6,1,5,6,3],[8,6,1,7,8,6,2,5,4,6,2,8,6,1]]) --> [8,2,3,9,1,0,6,7,4,5]
  private static boolean test_67 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(8),new Integer(2),new Integer(2),new Integer(3),new Integer(9),new Integer(3),new Integer(1),new Integer(9),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(6),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(9),new Integer(4),new Integer(0),new Integer(0),new Integer(0),new Integer(3),new Integer(9),new Integer(8),new Integer(8),new Integer(2),new Integer(6) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(8),new Integer(0),new Integer(7),new Integer(5),new Integer(4),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(3),new Integer(6),new Integer(8),new Integer(1),new Integer(8),new Integer(8),new Integer(6),new Integer(7),new Integer(7),new Integer(7),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(9),new Integer(4),new Integer(8),new Integer(7),new Integer(7),new Integer(9),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(7),new Integer(8),new Integer(9),new Integer(4),new Integer(6),new Integer(1),new Integer(5),new Integer(6),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(6),new Integer(1),new Integer(7),new Integer(8),new Integer(6),new Integer(2),new Integer(5),new Integer(4),new Integer(6),new Integer(2),new Integer(8),new Integer(6),new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(8),new Integer(2),new Integer(3),new Integer(9),new Integer(1),new Integer(0),new Integer(6),new Integer(7),new Integer(4),new Integer(5) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_67") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_67") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_67") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[4,3,3,1,7,9,9,6,7,5,3,0],[0,3,7,9,0,2,6,5,9,8,0],[5,5,1,7,0,6,3,1,3,8,5],[0,5,1,9,6,9,1,0,6,9,4,0,4,6,1,8],[0,8,0,1,3,7,4,3,7,2,4,3],[8,6,2,9,6,6,1,4,3,7,2,2,3,8,7,8],[1,0,4,3,0,3,6,3],[3,1,3,1,1,4,8,1,8,0,7],[0,0,4,5,4,1,6,9,0,0],[4,2,2,4,4,2,9],[9,4,0,9,5,1,6,1,3,4,2,3,3,9,7],[9,0,9,9,7,6,2],[0,9,8,2,8,5,2,8],[8,7,5,3,5,4,5],[5,8,3,8,7,5,8],[2,8,9,2,6,3,2,3,3,5]]) --> [4,3,1,7,9,6,5,0,2,8]
  private static boolean test_68 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(4),new Integer(3),new Integer(3),new Integer(1),new Integer(7),new Integer(9),new Integer(9),new Integer(6),new Integer(7),new Integer(5),new Integer(3),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(3),new Integer(7),new Integer(9),new Integer(0),new Integer(2),new Integer(6),new Integer(5),new Integer(9),new Integer(8),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(5),new Integer(1),new Integer(7),new Integer(0),new Integer(6),new Integer(3),new Integer(1),new Integer(3),new Integer(8),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(5),new Integer(1),new Integer(9),new Integer(6),new Integer(9),new Integer(1),new Integer(0),new Integer(6),new Integer(9),new Integer(4),new Integer(0),new Integer(4),new Integer(6),new Integer(1),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(8),new Integer(0),new Integer(1),new Integer(3),new Integer(7),new Integer(4),new Integer(3),new Integer(7),new Integer(2),new Integer(4),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(6),new Integer(2),new Integer(9),new Integer(6),new Integer(6),new Integer(1),new Integer(4),new Integer(3),new Integer(7),new Integer(2),new Integer(2),new Integer(3),new Integer(8),new Integer(7),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1),new Integer(0),new Integer(4),new Integer(3),new Integer(0),new Integer(3),new Integer(6),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(3),new Integer(1),new Integer(3),new Integer(1),new Integer(1),new Integer(4),new Integer(8),new Integer(1),new Integer(8),new Integer(0),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(0),new Integer(4),new Integer(5),new Integer(4),new Integer(1),new Integer(6),new Integer(9),new Integer(0),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(2),new Integer(2),new Integer(4),new Integer(4),new Integer(2),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(4),new Integer(0),new Integer(9),new Integer(5),new Integer(1),new Integer(6),new Integer(1),new Integer(3),new Integer(4),new Integer(2),new Integer(3),new Integer(3),new Integer(9),new Integer(7) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(0),new Integer(9),new Integer(9),new Integer(7),new Integer(6),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(9),new Integer(8),new Integer(2),new Integer(8),new Integer(5),new Integer(2),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(7),new Integer(5),new Integer(3),new Integer(5),new Integer(4),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(8),new Integer(3),new Integer(8),new Integer(7),new Integer(5),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(8),new Integer(9),new Integer(2),new Integer(6),new Integer(3),new Integer(2),new Integer(3),new Integer(3),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(3),new Integer(1),new Integer(7),new Integer(9),new Integer(6),new Integer(5),new Integer(0),new Integer(2),new Integer(8) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_68") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_68") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_68") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[8,9],[5,7,1,6,9,3],[8,6,0,3,8,3,5],[],[2,6,3,1,7,9],[7,8,2,4,8],[4,5,9,9,3,7,7,7,2,2,6,0],[3,2,7,2,5,0,2,4,8,0,9,9,8,3,0]]) --> [8,9,5,7,1,6,3,0,2,4]
  private static boolean test_69 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(8),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(5),new Integer(7),new Integer(1),new Integer(6),new Integer(9),new Integer(3) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(8),new Integer(6),new Integer(0),new Integer(3),new Integer(8),new Integer(3),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(6),new Integer(3),new Integer(1),new Integer(7),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(8),new Integer(2),new Integer(4),new Integer(8) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(5),new Integer(9),new Integer(9),new Integer(3),new Integer(7),new Integer(7),new Integer(7),new Integer(2),new Integer(2),new Integer(6),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(3),new Integer(2),new Integer(7),new Integer(2),new Integer(5),new Integer(0),new Integer(2),new Integer(4),new Integer(8),new Integer(0),new Integer(9),new Integer(9),new Integer(8),new Integer(3),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(8),new Integer(9),new Integer(5),new Integer(7),new Integer(1),new Integer(6),new Integer(3),new Integer(0),new Integer(2),new Integer(4) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_69") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_69") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_69") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  // flatNub([[4,4],[2,7,1,7,2,4,4,7,2,9,2,9,5],[2,8,6,4,5],[1],[],[0,0,6,7,2],[3,8,0,7,6,2,3,0],[9,6,1,8,7,8,7,3,5],[4,6,5,8,4,6,4,1,7,0,5,3,5],[7,9]]) --> [4,2,7,1,9,5,8,6,0,3]
  private static boolean test_70 ()
  {
      PositionList<PositionList<Integer>> l = new NodePositionList<PositionList<Integer>>() ;
      PositionList<PositionList<Integer>> copy_l = new NodePositionList<PositionList<Integer>>() ;
      Integer[] arr ;
      
      arr = new Integer[] { new Integer(4),new Integer(4) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(7),new Integer(1),new Integer(7),new Integer(2),new Integer(4),new Integer(4),new Integer(7),new Integer(2),new Integer(9),new Integer(2),new Integer(9),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(2),new Integer(8),new Integer(6),new Integer(4),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(1) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] {  } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(0),new Integer(0),new Integer(6),new Integer(7),new Integer(2) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(3),new Integer(8),new Integer(0),new Integer(7),new Integer(6),new Integer(2),new Integer(3),new Integer(0) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(9),new Integer(6),new Integer(1),new Integer(8),new Integer(7),new Integer(8),new Integer(7),new Integer(3),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(4),new Integer(6),new Integer(5),new Integer(8),new Integer(4),new Integer(6),new Integer(4),new Integer(1),new Integer(7),new Integer(0),new Integer(5),new Integer(3),new Integer(5) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      arr = new Integer[] { new Integer(7),new Integer(9) } ;
      l.addLast(new NodePositionList<Integer>(arr)) ;
      copy_l.addLast(new NodePositionList<Integer>(arr)) ;
      
      PositionList<Integer> correctResult = new NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(2),new Integer(7),new Integer(1),new Integer(9),new Integer(5),new Integer(8),new Integer(6),new Integer(0),new Integer(3) }) ;
      
      try
      {
          Flatten<Integer> flatten = new Flatten<Integer>() ;
          PositionList<Integer> result = flatten.flatNub(l) ;
          if (!result.equals(correctResult))
          {
              printError("test_70") ;
              System.out.println("calling flatNub with the list "+copy_l+" returns the list "+result+" but should have returned the list "+correctResult) ;
              return false ;
          }
          if (!l.equals(copy_l))
          {
              printError("test_70") ;
              System.out.println("after calling flatNub with the list "+copy_l+" the list argument is "+l+" but should still be "+copy_l) ;
              return false ;
          }
          return true ;
      }
      catch ( Throwable exc )
      {
          printError("test_70") ;
          System.out.println("calling flatNub with the list "+copy_l+" raised an exception "+exc+" although it should not have") ;
          exc.printStackTrace() ;
          return false ;
      }
  }


  static void printWarning(String TestName) {
      System.out.println("\n*** Warning in "+TestName+":");
  }

  static void printError(String TestName) {
      System.out.println("\n*** Error in "+TestName+":");
  }

}



