package de.dagere.peass;


import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ExampleTest {

//   Callee call = Mockito.mock(Callee.class);
//
//   @Before
//   public void init(){
//      Mockito.when(call.method3()).thenReturn("gemocked");
//   }
   
   int i = 0;
   
   @Test
   public void test() {
      final ExampleClazz exampleClazz = new ExampleClazz();
      exampleClazz.calleeMethod();
      Assertions.assertNotNull(exampleClazz);
      i++;
      assertThat(i).isEqualTo(1);
   }

   @Test
   public void test2() {
      final ExampleClazz exampleClazz = new ExampleClazz();
      exampleClazz.calleeMethod();
      Assertions.assertNotNull(exampleClazz);
   }

}