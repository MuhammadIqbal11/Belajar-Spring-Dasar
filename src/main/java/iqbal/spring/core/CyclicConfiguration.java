package iqbal.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import iqbal.spring.core.data.cyclic.CyclicA;
import iqbal.spring.core.data.cyclic.CyclicB;
import iqbal.spring.core.data.cyclic.CyclicC;

@Configuration
public class CyclicConfiguration {

  @Bean
  public CyclicA cyclicA(CyclicB cyclicB) {
    return new CyclicA(cyclicB);
  }

  @Bean
  public CyclicB cyclicB(CyclicC cyclicC) {
    return new CyclicB(cyclicC);
  }

  @Bean
  public CyclicC cyclicC(CyclicA cyclicA) {
    return new CyclicC(cyclicA);
  }

}
