package main;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("main");
        
      //First class with main method
       class FirstMain {
         public static void main(String[] args) {
             System.out.println("first main");
             
           //Second class with main method
             class SecondMain {
              public static void main(String[] args) {
            	  
            	  //third class with main method
                  System.out.println("second main");
                  class three{
               public static void main(String[]args) {
				System.out.println("third main");
			} 	  
                	  
                	  
                	  
                  }
          }
            }
          }
             }
       }
          }