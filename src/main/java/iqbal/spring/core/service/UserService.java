package iqbal.spring.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import iqbal.spring.core.data.User;
import iqbal.spring.core.event.LoginSuccessEvent;
import iqbal.spring.core.listener.LoginSuccessListener;

@Component
public class UserService implements ApplicationEventPublisherAware {

  private ApplicationEventPublisher applicationEventPublisher;

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    this.applicationEventPublisher = applicationEventPublisher;
  }

  public boolean login(String username, String password){
    if(isLoginSuccess(username, password)){
      applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
      return true;
    }else{
      return false;
    }
  }

  private boolean isLoginSuccess(String username, String password) {
    return "afif".equals(username) && "afif".equals(password);
  }
}
