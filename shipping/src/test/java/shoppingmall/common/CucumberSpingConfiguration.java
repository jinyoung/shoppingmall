package shoppingmall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shoppingmall.ShippingApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ShippingApplication.class })
public class CucumberSpingConfiguration {}
