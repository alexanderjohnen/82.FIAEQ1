package template;

@FunctionalInterface
public interface ProjectValidator {
    boolean isValid(String projectName);
}
