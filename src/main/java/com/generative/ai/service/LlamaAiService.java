package com.generative.ai.service;

import com.generative.ai.model.LlamaResponse;

public interface LlamaAiService {

    LlamaResponse generateMessage(String prompt);
    LlamaResponse generateJoke(String topic);
}
