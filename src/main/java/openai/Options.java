package openai;

public class Options {
    public static final String DAVINCI_002 = "text-davinci-002";

    /**
     * @param prompt           The prompt(s) to generate completions for, encoded as a string, array of strings,
     *                          array of tokens, or array of token arrays.
     *
     * @param model            ID of the model to use.
     *
     * @param temperature      What sampling temperature to use. Higher values means the model will take more risks. Try 0.9
     *                          for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.
     *                          We generally recommend altering this or top_p but not both.
     *
     * @param maxTokens        The maximum number of tokens to generate in the completion. The token count of your prompt plus
     *                          max_tokens cannot exceed the model's context length. Most models have a context length of
     *                          2048 tokens (except for the newest models, which support 4096).
     *
     * @param topP             An alternative to sampling with temperature, called nucleus sampling, where the model considers
     *                          the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising
     *                          the top 10% probability mass are considered.
     *                          We generally recommend altering this or temperature but not both.
     *
     * @param frequencyPenalty Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency
     *                          in the text so far, decreasing the model's likelihood to repeat the same line verbatim.
     *
     * @param presencePenalty  Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in
     *                          the text so far, increasing the model's likelihood to talk about new topics.
     *
     * @param echo             Echo back the prompt in addition to the completion.
     *
     * @param n                How many completions to generate for each prompt.
     *                          Note: Because this parameter generates many completions, it can quickly consume your token quota.
     *                          Use carefully and ensure that you have reasonable settings for max_tokens and stop.
     *
     **/

    private String  model = DAVINCI_002;
    private double  temperature = 1;
    private int     maxTokens = 50;
    private double  topP = 1;
    private double  frequencyPenalty = 0;
    private double  presencePenalty = 0;
    private boolean echo = false;
    private int     n = 1;

    public Options setModel(String model){
        this.model = model;
        return this;
    }

    public Options setTemperature(double temperature) {
        this.temperature = temperature;
        return this;
    }

    public Options setMaxTokens(int maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    public Options setTopP(double topP) {
        this.topP = topP;
        return this;
    }

    public Options setFrequencyPenalty(double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }

    public Options setPresencePenalty(double presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }

    public Options setEcho(boolean echo) {
        this.echo = echo;
        return this;
    }

    public Options setN(int n) {
        this.n = n;
        return this;
    }

    public String getModel(){
        return model;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getMaxTokens() {
        return maxTokens;
    }

    public double getTopP() {
        return topP;
    }

    public double getFrequencyPenalty() {
        return frequencyPenalty;
    }

    public double getPresencePenalty() {
        return presencePenalty;
    }

    public boolean getEcho() {
        return echo;
    }

    public int getN() {
        return n;
    }

    public Options save() {
        FileUtils.write("options-freq.ai", String.valueOf(frequencyPenalty));
        FileUtils.write("options-presence.ai", String.valueOf(presencePenalty));
        FileUtils.write("options-temp.ai", String.valueOf(temperature));
        FileUtils.write("options-top-p.ai", String.valueOf(topP));
        return this;
    }

    public static Options Default = new Options()
            .setModel(Options.DAVINCI_002)
            .setTemperature(0.9)
            .setTopP(1)
            .setFrequencyPenalty(0)
            .setPresencePenalty(0.6);

    public static Options Coding_Questions_Bot = new Options()
            .setModel(Options.DAVINCI_002)
            .setTemperature(0)
            .setTopP(1)
            .setFrequencyPenalty(0.5)
            .setPresencePenalty(0);

    public static Options Sarcastic_Chat_Bot = new Options()
            .setModel(Options.DAVINCI_002)
            .setTemperature(0.9)
            .setTopP(1)
            .setFrequencyPenalty(0.5)
            .setPresencePenalty(0.1);
}
