package com.dgmf;

// This class represents the OpenAI model, which implements
// the AIModel interface.
public class OpenAIModel implements AIModel {
    // The API key used for authenticating with the OpenAI model.
    private final String apiKey;

    // Constructor that initializes the OpenAIModel with the given API key.
    public OpenAIModel(String apiKey) {
        // Initialize the API key.
        this.apiKey = apiKey;
    }

    // This method generates a response based on the provided prompt.
    @Override
    public String generate(String prompt) {
        // Return a simulated response from the OpenAI model.
        return "[OpenAI] Response to : " + prompt;
    }
}
