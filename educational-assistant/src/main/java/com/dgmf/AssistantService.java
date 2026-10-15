package com.dgmf;

// This class represents an Educational Assistant Service that
// interacts with the Ollama model.
public class AssistantService {
    // The OllamaModel instance used to generate responses.
    // The AssistantService is tightly coupled with the OllamaModel,
    // making it difficult to replace or mock the model for testing purposes.
    private final OllamaModel ollamaModel = new OllamaModel();

    // This method takes a request string, constructs a prompt for
    // the Ollama model, and returns the generated response.
    public String response(String request) {
        // Construct the prompt for the Ollama model.
        String prompt = "You are an Educational assistant. " + request;

        // Generate and return the response from the Ollama model.
        return ollamaModel.generate(prompt);
    }
}
