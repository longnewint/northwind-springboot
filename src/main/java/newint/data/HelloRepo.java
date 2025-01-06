package newint.data;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepo {
  public String getHelloMessage() {
    return "Hello from Duke on Spring Boot 3!";
  }
}
