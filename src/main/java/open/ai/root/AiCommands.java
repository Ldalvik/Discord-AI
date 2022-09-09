package open.ai.root;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import openai.*;

import java.awt.*;

public class AiCommands extends ListenerAdapter {

    OpenAI ai = new OpenAI(System.getenv("OPENAI_TOKEN"));

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equalsIgnoreCase("viewprompt")) {
            event.replyEmbeds(new EmbedBuilder()
                    .setColor(Color.green)
                    .addField("Current prompt", FileUtils.read("prompt.ai"), false)
                    .build()).queue();
        }

        if (event.getName().equalsIgnoreCase("viewdata")) {
            event.replyEmbeds(new EmbedBuilder()
                    .setColor(Color.green)
                    .addField("Current data", FileUtils.read("data.ai"), false)
                    .build()).queue();
        }

        if (event.getName().equalsIgnoreCase("viewconvo")) {
            event.replyEmbeds(new EmbedBuilder()
                    .setColor(Color.green)
                    .addField("Current convo", FileUtils.read("convo.ai"), false)
                    .build()).queue();
        }


        if (event.getName().equalsIgnoreCase("viewoptions")) {
            event.replyEmbeds(new EmbedBuilder()
                    .setColor(Color.green)
                    .setTitle("Current options")
                    .setDescription("Use /help [options] to learn more about how these work.")
                    .addField("Temperature", FileUtils.read("options-temp.ai"), false)
                    .addField("TopP", FileUtils.read("options-top-p.ai"), false)
                    .addField("Frequency Penalty", FileUtils.read("options-freq.ai"), false)
                    .addField("Presence Penalty", FileUtils.read("options-presence.ai"), false)
                    .build()).queue();
        }

        if (event.getName().equalsIgnoreCase("mode")) {
            event.replyEmbeds(new EmbedBuilder()
                    .setColor(Color.green)
                    .setTitle("Mode set")
                    .addField("New mode", event.getOption("preset").getAsString(), false)
                    .build()).queue();

            switch (event.getOption("preset").getAsString()) {
                case "sarcastic_chatbot": setSarcasticChatbot();
                case "normal_chatbot": setNormalChatbot();
                case "code_questions": setCodingQuestions();
            }
        }

        if (event.getName().equalsIgnoreCase("prompt")) {
            setPrompt(event);
        }

        if (event.getName().equalsIgnoreCase("data")) {
            setData(event);
        }

        if (event.getName().equalsIgnoreCase("temperature")) {
            setTemp(event);
        }

        if (event.getName().equalsIgnoreCase("top-p")) {
            setTopP(event);
        }

        if (event.getName().equalsIgnoreCase("frequency")) {
            setFrequency(event);
        }

        if (event.getName().equalsIgnoreCase("presence")) {
            setPresence(event);
        }
    }

    private void setSarcasticChatbot() {
        System.out.println("Sarcastic");
        FileUtils.write("prompt.ai", "This is a chatbot that reluctantly answers questions with sarcastic responses:");
        FileUtils.write("data.ai", TrainingData.Sarcastic_Chat_Bot);
        FileUtils.write("convo.ai", "");
        Options.Sarcastic_Chat_Bot.save();
    }

    private void setNormalChatbot() {
        FileUtils.write("prompt.ai", "The following is a conversation with an AI chat-bot. The AI is helpful, creative, clever, and very friendly.:");
        FileUtils.write("data.ai", "");
        FileUtils.write("convo.ai", "");
        Options.Default.save();
    }

    private void setCodingQuestions() {
        FileUtils.write("prompt.ai", "This bot will answer any coding question:");
        FileUtils.write("data.ai", TrainingData.Coding_Questions_Bot);
        FileUtils.write("convo.ai", "");
        Options.Coding_Questions_Bot.save();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().contains("@984655089019023370")) {
            setMessage(event);
        }
    }

    public void setPrompt(SlashCommandInteractionEvent event) {
        String content = event.getOption("prompt").getAsString();
        FileUtils.write("convo.ai", "");
        FileUtils.write("prompt.ai", content);
        event.replyEmbeds(new EmbedBuilder()
                .setColor(Color.cyan)
                .setTitle("Prompt set")
                .addField("New prompt", content, false).build()
        ).queue();
    }

    public void setData(SlashCommandInteractionEvent event) {
        String content = event.getOption("data").getAsString();
        FileUtils.write("data.ai", content);
        event.replyEmbeds(new EmbedBuilder()
                .setColor(Color.cyan)
                .setTitle("Data set")
                .addField("AI trained with new data", content, false).build()
        ).queue();
    }

    public void setMessage(MessageReceivedEvent event) {
        String content = event.getMessage().getContentRaw().split("> ")[1];
        String convo = FileUtils.read("convo.ai") + "\n" + content;
        String response = ai.sendCompletion(
                new Message()
                        .setOptions(new Options()
                                .setTemperature(Double.parseDouble(FileUtils.read("options-temp.ai")))
                                .setTopP(Double.parseDouble(FileUtils.read("options-top-p.ai")))
                                .setFrequencyPenalty(Double.parseDouble(FileUtils.read("options-freq.ai")))
                                .setPresencePenalty(Double.parseDouble(FileUtils.read("options-presence.ai"))))
                        .setPrompt(FileUtils.read("prompt.ai"))
                        .setData(FileUtils.read("data.ai"))
                        .setText(convo)
        );
        String newConvo = convo + "\n" + response;
        if (newConvo.length() > 1300) {
            FileUtils.write("convo.ai", content + "\n" + response);
            event.getMessage().replyEmbeds(new EmbedBuilder()
                    .setTitle("Conversation token limit reached.")
                    .setDescription("Resetting conversation history to the last message and response."
                    ).build()).queue();
        } else FileUtils.write("convo.ai", newConvo);
        event.getMessage().reply(response.substring(2).replace("\\n", "\n")).queue();
    }

    public void setTemp(SlashCommandInteractionEvent event) {
        FileUtils.write("options-temp.ai", event.getOption("temperature").getAsString());
        event.replyEmbeds(new EmbedBuilder()
                .setColor(Color.green)
                .addField("New temp", event.getOption("temperature").getAsString(), false)
                .build()).queue();
    }

    public void setTopP(SlashCommandInteractionEvent event) {
        FileUtils.write("options-top-p.ai", event.getOption("top-p").getAsString());
        event.replyEmbeds(new EmbedBuilder()
                .setColor(Color.green)
                .addField("New TopP", event.getOption("top-p").getAsString(), false)
                .build()).queue();
    }

    public void setFrequency(SlashCommandInteractionEvent event) {
        FileUtils.write("options-freq.ai", event.getOption("frequency").getAsString());
        event.replyEmbeds(new EmbedBuilder()
                .setColor(Color.green)
                .addField("New Frequency Penalty", event.getOption("frequency").getAsString(), false)
                .build()).queue();
    }

    public void setPresence(SlashCommandInteractionEvent event) {
        FileUtils.write("options-presence.ai", event.getOption("presence").getAsString());
        event.replyEmbeds(new EmbedBuilder()
                .setColor(Color.green)
                .addField("New Presence Penalty", event.getOption("presence").getAsString(), false)
                .build()).queue();
    }
}
