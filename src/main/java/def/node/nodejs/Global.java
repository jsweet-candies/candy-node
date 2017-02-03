package def.node.nodejs;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Global extends def.js.Object {
    public Global GLOBAL;
    public Function Uint8ClampedArray;
    public java.util.function.Consumer<Object> clearImmediate;
    public java.util.function.Consumer<def.node.nodejs.Timer> clearInterval;
    public java.util.function.Consumer<def.node.nodejs.Timer> clearTimeout;
    public java.util.function.Function<String,String> escape;
    public Global global;
    public Process process;
    public Global root;
    public java.util.function.BiFunction<java.util.function.Consumer<Object>,Object,Object> setImmediate;
    public jsweet.util.function.TriFunction<java.util.function.Consumer<Object>,Double,Object,def.node.nodejs.Timer> setInterval;
    public jsweet.util.function.TriFunction<java.util.function.Consumer<Object>,Double,Object,def.node.nodejs.Timer> setTimeout;
    public Object undefined;
    public java.util.function.Function<String,String> unescape;
    public java.lang.Runnable gc;
    @jsweet.lang.Optional
    public Object v8debug;
    /**
  * Gets the unencoded version of an encoded Uniform Resource Identifier (URI).
  * @param encodedURI A value representing an encoded URI.
  */
    native public String decodeURI(String encodedURI);
    /**
  * Gets the unencoded version of an encoded component of a Uniform Resource Identifier (URI).
  * @param encodedURIComponent A value representing an encoded URI component.
  */
    native public String decodeURIComponent(String encodedURIComponent);
    /** 
  * Encodes a text string as a valid Uniform Resource Identifier (URI)
  * @param uri A value representing an encoded URI.
  */
    native public String encodeURI(String uri);
    /**
  * Encodes a text string as a valid component of a Uniform Resource Identifier (URI).
  * @param uriComponent A value representing an encoded URI component.
  */
    native public String encodeURIComponent(String uriComponent);
    /**
  * Evaluates JavaScript code and executes it. 
  * @param x A String value that contains valid JavaScript code.
  */
    native public Object eval(String x);
    /** 
  * Determines whether a supplied number is finite.
  * @param number Any numeric value.
  */
    native public Boolean isFinite(double number);
    /**
  * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a number). 
  * @param number A numeric value.
  */
    native public Boolean isNaN(double number);
    /**
  * Converts a string to a floating-point number. 
  * @param string A string that contains a floating-point number. 
  */
    native public double parseFloat(String string);
    /**
  * Converts A string to an integer.
  * @param s A string to convert into a number.
  * @param radix A value between 2 and 36 that specifies the base of the number in numString. 
  * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
  * All other strings are considered decimal.
  */
    native public double parseInt(String s, double radix);
    /**
  * Converts A string to an integer.
  * @param s A string to convert into a number.
  * @param radix A value between 2 and 36 that specifies the base of the number in numString. 
  * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
  * All other strings are considered decimal.
  */
    native public double parseInt(String s);
    native public java.lang.Object Promise(java.lang.Object... args);
    native public java.lang.Object Symbol(java.lang.Object... args);
    native public java.lang.Object Uint8ClampedArray(java.lang.Object... args);
}

