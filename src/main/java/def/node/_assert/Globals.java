package def.node._assert;
/** This class holds all the global functions and variables of the Assert package. */
public final class Globals {
    private Globals(){}
    native public static void fail(Object actual, Object expected, String message, String operator);
    native public static void ok(Object value, String message);
    native public static void equal(Object actual, Object expected, String message);
    native public static void notEqual(Object actual, Object expected, String message);
    native public static void deepEqual(Object actual, Object expected, String message);
    native public static void notDeepEqual(Object acutal, Object expected, String message);
    native public static void strictEqual(Object actual, Object expected, String message);
    native public static void notStrictEqual(Object actual, Object expected, String message);
    native public static void deepStrictEqual(Object actual, Object expected, String message);
    native public static void notDeepStrictEqual(Object actual, Object expected, String message);
    public static DoesNotThrow doesNotThrow;
    native public static void ifError(Object value);
    native public static void ok(Object value);
    native public static void equal(Object actual, Object expected);
    native public static void notEqual(Object actual, Object expected);
    native public static void deepEqual(Object actual, Object expected);
    native public static void notDeepEqual(Object acutal, Object expected);
    native public static void strictEqual(Object actual, Object expected);
    native public static void notStrictEqual(Object actual, Object expected);
    native public static void deepStrictEqual(Object actual, Object expected);
    native public static void notDeepStrictEqual(Object actual, Object expected);
    native public static void doesNotThrow(def.js.Function block, java.lang.String message);
    native public static void doesNotThrow(def.js.Function block, def.js.Function error, java.lang.String message);
    native public static void doesNotThrow(def.js.Function block, def.js.RegExp error, java.lang.String message);
    native public static void doesNotThrow(def.js.Function block, java.util.function.Function<Object,Boolean> error, java.lang.String message);
    native public static void doesNotThrow(def.js.Function block);
    native public static void doesNotThrow(def.js.Function block, def.js.Function error);
    native public static void doesNotThrow(def.js.Function block, def.js.RegExp error);
    native public static void doesNotThrow(def.js.Function block, java.util.function.Function<Object,Boolean> error);
}

