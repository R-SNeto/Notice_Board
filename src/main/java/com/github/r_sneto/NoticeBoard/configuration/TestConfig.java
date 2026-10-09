package com.github.r_sneto.NoticeBoard.configuration;

import com.github.r_sneto.NoticeBoard.entity.Student;
import com.github.r_sneto.NoticeBoard.entity.Teacher;
import com.github.r_sneto.NoticeBoard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        var t1 = new Teacher("Roberto Carlos", "robertocarlos@gmail.com", "betinho123456", "1544147");
        var s1 = new Student("Samaritano Peba", "samaritano@gmail.com", "123456", "14414457");

        userRepository.saveAll(Arrays.asList(t1, s1));
    }
}
