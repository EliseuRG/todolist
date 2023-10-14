package br.com.eliseurodrigues.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificadores (Acessos)
 * 
 * public
 * private
 * protect
 */

 /**
  * Body
  */
@RestController
@RequestMapping("/users")
public class UserController {
    
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){

        System.out.println(userModel.name);
    }
}
