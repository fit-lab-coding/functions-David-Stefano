package fit.core;

import java.util.function.Function;

public class FuncLogger {
    private static final String defaultPrefix = "[prefix]";
    private static Function<String, String> create() {
        return create(defaultPrefix);}

    public static Function<String, String> create (String prefix) {
        return str -> {
            var text = String.format("%s %s", prefix, str);
            System.out.println(text);

            return text;
        };
    }
}
