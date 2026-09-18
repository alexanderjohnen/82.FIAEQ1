package template;

@FunctionalInterface
public interface ProjectLabelBuilder {
    String build(String projectName, String status);
}
