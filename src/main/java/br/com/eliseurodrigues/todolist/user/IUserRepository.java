package br.com.eliseurodrigues.todolist.user;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import lombok.extern.jbosslog.JBossLog;

public interface IUserRepository extends JpaRepository<UserModel, UUID>{
    
    UserModel findByUsername(String username);

}
