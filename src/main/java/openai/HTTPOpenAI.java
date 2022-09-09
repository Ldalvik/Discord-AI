package openai;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HTTPOpenAI {

    private final String apiToken;

    public HTTPOpenAI(String apiToken){
        this.apiToken = apiToken;
    }

    public String sendCompletion(Message message) throws IOException {
        String params = getParamsString(message);
        System.out.println(params);
        URL url = new URL("https://api.openai.com/v1/completions");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Authorization", "Bearer " + apiToken);
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);
        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);
        byte[] out = params.getBytes(StandardCharsets.UTF_8);
        OutputStream stream = con.getOutputStream();
        stream.write(out);

        int status = con.getResponseCode();
        Reader streamReader;
        if (status > 299) {
            streamReader = new InputStreamReader(con.getErrorStream());
        } else {
            streamReader = new InputStreamReader(con.getInputStream());
        }

        BufferedReader in = new BufferedReader(streamReader);
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        String data = content.toString();
        System.out.println(data);
        int startIndex = data.indexOf("{\"text\":\"");
        int endIndex = data.indexOf("\",\"", startIndex);
        return data.substring(startIndex + 9, endIndex);

    }

    public String getParamsString(Message message) {
        String prompt = message.getPrompt() + "\\n" + message.getData() + "\\nYou: " + message.getText().replace("\n", "\\n") + "\\n";
        String model = message.getOptions().getModel();
        String temperature = String.valueOf(message.getOptions().getTemperature());
        String maxTokens = String.valueOf(message.getOptions().getMaxTokens());
        String topP = String.valueOf(message.getOptions().getTopP());
        String frequencyPenalty = String.valueOf(message.getOptions().getFrequencyPenalty());
        String presencePenalty = String.valueOf(message.getOptions().getPresencePenalty());
        String echo = String.valueOf(message.getOptions().getEcho());
        String n = String.valueOf(message.getOptions().getN());

        return String.format(
                """
                {
                    "model":"%s",
                    "prompt":"%s",
                    "temperature":%s,
                    "max_tokens":%s,
                    "top_p":%s,
                    "frequency_penalty":%s,
                    "presence_penalty":%s,
                    "echo": %s,
                    "n": %s
                }
                """,
                model, prompt, temperature, maxTokens, topP, frequencyPenalty, presencePenalty, echo, n);
    }
}
