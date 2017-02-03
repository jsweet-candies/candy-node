package def.node;
/** This class holds all the global functions and variables of the def.node package. */
public final class Globals {
    private Globals(){}
    @jsweet.lang.Module("process")
    public static def.node.nodejs.Process process;
    public static def.node.nodejs.Global global;
    @jsweet.lang.Module("console")
    public static Console console;
    public static String __filename;
    public static String __dirname;
    native public static def.node.nodejs.Timer setTimeout(java.util.function.Consumer<Object> callback, double ms, Object... args);
    native public static void clearTimeout(def.node.nodejs.Timer timeoutId);
    native public static def.node.nodejs.Timer setInterval(java.util.function.Consumer<Object> callback, double ms, Object... args);
    native public static void clearInterval(def.node.nodejs.Timer intervalId);
    native public static Object setImmediate(java.util.function.Consumer<Object> callback, Object... args);
    native public static void clearImmediate(Object immediateId);
    public static NodeRequire require;
    public static NodeModule module;
    public static Object exports;
    public static SlowBufferData SlowBuffer;
    @jsweet.lang.Module("assert")
    native public static void Assert(Object value, String message);
    @jsweet.lang.Module("assert")
    native public static void Assert(Object value);
}

