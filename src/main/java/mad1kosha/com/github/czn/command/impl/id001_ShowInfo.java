package mad1kosha.com.github.czn.command.impl;

import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class id001_ShowInfo id001_ShowInfo extends Command {

    @Override
    public boolean execute() throws TelegramApiException {
        deleteMessage(updateMessageId);
        sendMessageWithAddition();
        return EXIT;
    }
}
