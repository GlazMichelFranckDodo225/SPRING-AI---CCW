package com.dgmf;

// This is the main application class that demonstrates the
// usage of the AssistantService.
public class Application {
    // The main method serves as the entry point of the application.
    static void main(String[] args) {
        // Create an instance of the AssistantService.
        AssistantService assistantService = new AssistantService();

        // Use the AssistantService to get a response for a
        // specific request
        System.out.println(
                assistantService.response("What is Spring?")
        );
    }
}
