package globals.validators;

public interface Validator<T> {
    void check(T form);
}
