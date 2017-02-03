package def.node.util;
import def.js.Function;
/** This class holds all the global functions and variables of the util package. */
public final class Globals {
    private Globals(){}
    native public static String format(Object format, Object... param);
    native public static void debug(String string);
    native public static void error(Object... param);
    native public static void puts(Object... param);
    native public static void print(Object... param);
    native public static void log(String string);
    native public static String inspect(Object object, Boolean showHidden, double depth, Boolean color);
    native public static String inspect(Object object, InspectOptions options);
    native public static Boolean isArray(Object object);
    native public static Boolean isRegExp(Object object);
    native public static Boolean isDate(Object object);
    native public static Boolean isError(Object object);
    native public static void inherits(Object constructor, Object superConstructor);
    native public static java.util.function.BiConsumer<String,Object> debuglog(String key);
    native public static Boolean isBoolean(Object object);
    native public static Boolean isBuffer(Object object);
    native public static Boolean isFunction(Object object);
    native public static Boolean isNull(Object object);
    native public static Boolean isNullOrUndefined(Object object);
    native public static Boolean isNumber(Object object);
    native public static Boolean isObject(Object object);
    native public static Boolean isPrimitive(Object object);
    native public static Boolean isString(Object object);
    native public static Boolean isSymbol(Object object);
    native public static Boolean isUndefined(Object object);
    native public static Function deprecate(Function fn, String message);
    native public static String inspect(Object object, Boolean showHidden, double depth);
    native public static String inspect(Object object, Boolean showHidden);
    native public static String inspect(Object object);
}

