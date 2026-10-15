package com.dgmf;

/* The v1 code (as a beginner would write it) */

// This is a simple class that simulates interaction with
// the Ollama model.
public class OllamaModel {
    // The URL of the Ollama model server. // Hard-coded configuration
    private final String url = "https://localhost:11434";

    // This method simulates generating a response from the
    // Ollama model based on the given prompt.
    public String generate(String prompt) {
        return "[Ollama @ " + url + "] Response to : " + prompt;
    }
}
