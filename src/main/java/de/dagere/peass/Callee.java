package de.dagere.peass;

public class Callee {

   protected void method1() {
      innerMethod();
   }

   private void innerMethod() {
      try {
         Thread.sleep(20);
      } catch (final InterruptedException e) {
         e.printStackTrace();
      }
   }

   protected void method2() {
      // This change should not be detected by PeASS since it is not covered by a test
      System.out.println("This is a test");
   }
   public String method3(){
      return null;   }

}