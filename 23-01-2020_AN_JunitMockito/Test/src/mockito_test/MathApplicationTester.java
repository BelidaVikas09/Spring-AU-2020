package mockito_test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	
   @InjectMocks 
   MathApplication mathApplication = new MathApplication();

   @Mock
   CalculatorService calcService;

   @Test
   public void testAdd(){
      when(calcService.add(10.0,20.0)).thenReturn(30.00);
      when(calcService.subtract(20.0,10.0)).thenReturn(10.0);
      when(calcService.divide(20.0,10.0)).thenReturn(2.0);
      when(calcService.multiply(2.0, 3.0)).thenReturn(6.0);
      
      Assert.assertEquals(calcService.add(10.0, 20.0),30.0,0);
      Assert.assertEquals(calcService.subtract(20.0, 10.0),10.0,0);
      Assert.assertEquals(calcService.divide(20.0, 10.0),2.0,0);
      Assert.assertEquals(calcService.multiply(2.0, 3.0),6.0,0);
  
      InOrder inOrder = inOrder(calcService);
      
      inOrder.verify(calcService).add(10.0,20.0);
      inOrder.verify(calcService).subtract(20.0,10.0);
   }
}