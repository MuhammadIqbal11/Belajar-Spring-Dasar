package iqbal.spring.core.application;

import iqbal.spring.core.application.FooApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import iqbal.spring.core.data.Foo;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FooApplication.class)
class FooApplicationTest {

  @Autowired
  Foo foo;

  @Test
  void testSpringBoot() {
    Assertions.assertNotNull(foo);
  }
}