package def.node.vm;
/** This class holds all the global functions and variables of the vm package. */
public final class Globals {
    private Globals(){}
    native public static Context createContext(Context sandbox);
    native public static Boolean isContext(Context sandbox);
    native public static Object runInContext(String code, Context contextifiedSandbox, RunningScriptOptions options);
    native public static Object runInDebugContext(String code);
    native public static Object runInNewContext(String code, Context sandbox, RunningScriptOptions options);
    native public static Object runInThisContext(String code, RunningScriptOptions options);
    native public static Context createContext();
    native public static Object runInContext(String code, Context contextifiedSandbox);
    native public static Object runInNewContext(String code, Context sandbox);
    native public static Object runInNewContext(String code);
    native public static Object runInThisContext(String code);
}

