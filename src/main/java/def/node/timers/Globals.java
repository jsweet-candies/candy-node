package def.node.timers;
/** This class holds all the global functions and variables of the timers package. */
public final class Globals {
    private Globals(){}
    native public static def.node.nodejs.Timer setTimeout(java.util.function.Consumer<Object> callback, double ms, Object... args);
    native public static void clearTimeout(def.node.nodejs.Timer timeoutId);
    native public static def.node.nodejs.Timer setInterval(java.util.function.Consumer<Object> callback, double ms, Object... args);
    native public static void clearInterval(def.node.nodejs.Timer intervalId);
    native public static Object setImmediate(java.util.function.Consumer<Object> callback, Object... args);
    native public static void clearImmediate(Object immediateId);
}

