package com.dgmf;

// This class represents the Ollama model, which implements
// the AIModel interface.
public class OllamaModel implements AIModel {
    // The URL of the Ollama model's endpoint.
    private final String url;

    // Constructor that initializes the OllamaModel with the given URL.
    public OllamaModel(String url) {
        // Initialize the URL.
        this.url = url;
    }

    // This method generates a response based on the provided prompt.
    @Override
    public String generate(String prompt) {
        // Return a simulated response from the Ollama model.
        return "[Ollama @ " + url + "] Response to : " + prompt;
    }
}
