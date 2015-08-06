package kz.e16traning.coffeevan.exceptions;

/**
 * Предок для всех исключений проекта.
 * Нужен чтобы перехватывать все ошибки
 * проекта в одном месте без их перечисления.
 *
 */
public class ProjectMainException
        extends Exception {
    public ProjectMainException(String message) {
        super("Houston, we have a problem: " + message);
    }
}
