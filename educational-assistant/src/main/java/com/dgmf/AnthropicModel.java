package com.dgmf;

// This class represents the Anthropic model, which implements
// the AIModel interface.
public class AnthropicModel implements AIModel {
    // The API key used for authenticating with the Anthropic model.
    private final String apiKey;

    // Constructor that initializes the AnthropicModel with the given API key.
    public AnthropicModel(String apiKey) {
        // Initialize the API key.
        this.apiKey = apiKey;
    }

    // This method generates a response based on the provided prompt.
    @Override
    public String generate(String prompt) {
        // Return a simulated response from the Anthropic model.
        return "[Anthropic] Response to : " + prompt;
    }
}
