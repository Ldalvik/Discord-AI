package openai;

import java.io.IOException;

public class OpenAI {

    /**
     * @param apiToken  OpenAI Auth Token
     */
    private final String apiToken;

    private final HTTPOpenAI httpOpenAI;


    public OpenAI(String apiToken) {
        this.apiToken = apiToken;
        httpOpenAI = new HTTPOpenAI(apiToken);
    }

    public void sendEdit(Message message){
    }

    public String sendCompletion(Message message){
        try {
            return httpOpenAI.sendCompletion(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
