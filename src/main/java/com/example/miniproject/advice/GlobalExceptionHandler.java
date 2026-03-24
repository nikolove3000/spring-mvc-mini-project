package com.example.miniproject.advice;

import com.example.miniproject.exception.StudentNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Global exception handler for the application.
 *
 * <p>This class uses {@link ControllerAdvice} to handle exceptions
 * thrown by any controller in the application and provide a centralized
 * error handling mechanism.</p>
 *
 * <p>When a {@link StudentNotFoundException} occurs, the handler captures
 * the exception, adds an error message to the model, and redirects the
 * user to a dedicated error view.</p>
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handles {@link StudentNotFoundException} thrown during request processing.
     *
     * <p>The exception information is added to the model so it can be
     * displayed on the error page.</p>
     *
     * @param ex    the thrown StudentNotFoundException
     * @param model the Spring MVC model used to pass data to the view
     * @return the logical view name of the error page
     */
    @ExceptionHandler(StudentNotFoundException.class)
    public String handlerNotFound(StudentNotFoundException ex, Model model) {

        model.addAttribute("message", ex.getMessage());
        return "error";
    }
}
