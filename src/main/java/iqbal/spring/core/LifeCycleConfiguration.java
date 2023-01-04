package iqbal.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import iqbal.spring.core.data.Connection;
import iqbal.spring.core.data.Server;

@Configuration
public class LifeCycleConfiguration {

  @Bean
  public Connection connection(){
    return new Connection();
  }

  // @Bean(initMethod = "start", destroyMethod = "stop")
  @Bean
  public Server server(){
    return new Server();
  }

}
