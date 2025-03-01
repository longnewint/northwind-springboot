package newint.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import newint.data.HelloRepo;

@RestController
public class HelloApi {
  @Autowired HelloRepo repo;

  @GetMapping("/hello")
  public String get() {
    return repo.getHelloMessage();
  }

}
