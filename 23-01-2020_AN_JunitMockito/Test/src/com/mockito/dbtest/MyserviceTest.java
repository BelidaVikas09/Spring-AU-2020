package com.mockito.dbtest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
 
public class MyserviceTest {
 
  @Mock private MyDao myDao;
 
  @Rule public MockitoRule rule = MockitoJUnit.rule();
 
  @Test
  public void testFindById() {
    MockitoAnnotations.initMocks(this);
    Myservice myService = new Myservice(myDao);
    myService.findById(1L);
    Mockito.verify(myDao).findById(1L);
}
 
  @Test
  public void test() {
    Myservice myService = new Myservice(myDao);
    Mockito.when(myDao.findById(1L)).thenReturn(createTestEntity());
    MyEntity actual = myService.findById(1L);
    Assert.assertEquals("My first name", actual.getFirstName());
    Assert.assertEquals("My surname", actual.getLastName());
    Mockito.verify(myDao).findById(1L);
}
 
  private MyEntity createTestEntity() {
    MyEntity myEntity = new MyEntity();
    myEntity.setFirstName("My first name");
    myEntity.setLastName("My surname");
    return myEntity;
  }
}
