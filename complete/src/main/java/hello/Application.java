package hello;

import hello.Model.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import hello.Model.Curso;
import org.springframework.context.annotation.ComponentScan;

        
@CrossOrigin("*")
@SpringBootApplication
@ComponentScan(basePackageClasses = {MainController.class})
@EnableJpaRepositories(basePackageClasses = {CursoRepository.class, UserRepository.class})
@EntityScan(basePackageClasses = {Curso.class, Aluno.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
