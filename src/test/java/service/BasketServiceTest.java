package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
public class BasketServiceTest {

    @Autowired
    BasketServiceImpl basketService;

    @Test
    public void emptyOptionalShouldBeReturnedIfNoElementExist(){

    }
}
