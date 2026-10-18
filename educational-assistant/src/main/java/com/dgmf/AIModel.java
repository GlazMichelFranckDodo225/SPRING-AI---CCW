package com.dgmf;

// This interface defines the contract for AI models that can
// generate responses based on prompts.
public interface AIModel {
    // This method takes a prompt string and returns a generated response.
    String generate(String prompt);
}
