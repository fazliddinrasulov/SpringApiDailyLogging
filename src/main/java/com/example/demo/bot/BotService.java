package com.example.demo.bot;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotService {
    private final TelegramBot telegramBot;

    @Async
    public void handleUpdate(Update update) {
        if (update.message() != null) {
            Message message = update.message();
            if (message.text().equals("/start")) {
                SendMessage sendMessage = new SendMessage(
                        message.chat().id(),
                        "Hello, welcome to bot"
                );
                telegramBot.execute(sendMessage);
            }
        } else if (update.callbackQuery() != null) {
//            some logic
        }
    }
}
