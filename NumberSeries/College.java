/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication100;

public class College {
    String  name,type;
  int nos;
  
  College()
  {
      name="BTIRT";
      type=" Engineering ";
      nos=700;
  }
  College(String name)
  {
      this.name=name;
      type=" Management ";
      nos=400;
  }
  College(String name,String type,int nos)
  {
      this.name=name;
      this.type=type;
      this.nos=nos;
  }
  void showCollege()
    
  {
     System.out.println("Name "+name);
     System.out.println("College Type "+type);
     System.out.println("No.  of  students "+nos);
  }
  
}
