package net.msj0319.api.quiz.service;

import net.msj0319.api.quiz.domain.Quiz;
import reactor.core.publisher.Mono;

public interface QuizService {
    Mono<Quiz> createQuiz();
}