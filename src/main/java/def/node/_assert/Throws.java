package def.node._assert;
import def.js.RegExp;
import def.js.Function;
/** This is an automatically generated object type (see the source definition). */
public class Throws extends def.js.Object {
    native public static void applyStatic(Function block, String message);
    native public static void applyStatic(Function block, Function error, String message);
    native public static void applyStatic(Function block, RegExp error, String message);
    native public static void applyStatic(Function block, java.util.function.Function<Object,Boolean> error, String message);
    native public static void applyStatic(Function block);
    native public static void applyStatic(Function block, Function error);
    native public static void applyStatic(Function block, RegExp error);
    native public static void applyStatic(Function block, java.util.function.Function<Object,Boolean> error);
}

