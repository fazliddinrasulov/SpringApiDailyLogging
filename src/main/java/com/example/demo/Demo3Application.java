package com.example.demo;

import com.pengrad.telegrambot.TelegramBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableAsync
@SpringBootApplication
public class Demo3Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);

    }
    @Bean
    public TelegramBot telegramBot() {
        Long myId = 348954855L;
        String botToken = "7381491951:AAEmny4_B4cqfGnmffXOupBuwHlKjjMCRhE";
        return new TelegramBot(botToken);
    }
}
