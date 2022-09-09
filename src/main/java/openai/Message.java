package openai;

public class Message {
    private String prompt = "";
    private String text = "";
    private Options options;
    private String data = "\\n";

    public Message setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public Message setOptions(Options options) {
        this.options = options;
        return this;
    }

    public Message setData(String data) {
        this.data = data;
        return this;
    }

    public String getPrompt() {
       return prompt;
    }

    public String getText() {
        return text;
    }

    public Options getOptions() {
        return options;
    }

    public String getData() {
        return data;
    }
}
