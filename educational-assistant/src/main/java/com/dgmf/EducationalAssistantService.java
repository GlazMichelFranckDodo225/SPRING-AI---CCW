package com.dgmf;

/* The v1 code (as a beginner would write it) */

// This class represents an Educational Assistant Service that
// interacts with the AI model.
public class EducationalAssistantService {
    // The AIModel instance used to generate responses.
    // The EducationalAssistantService is tightly coupled with the AIModel,
    // making it difficult to replace or mock the model for testing purposes.
    private final AIModel model = new OllamaModel("http://localhost:11434");

    // This method takes a request string, constructs a prompt for
    // the AI model, and returns the generated response.
    public String response(String request) {
        // Construct the prompt for the AI model.
        String prompt = "You are an Educational assistant. " + request;

        // Generate and return the response from the AI model.
        return model.generate(prompt);
    }
}
