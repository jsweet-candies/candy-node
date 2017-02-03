package def.node.punycode;
@jsweet.lang.Interface
public abstract class ucs2 extends def.js.Object {
    native public static double[] decode(String string);
    native public static String encode(double[] codePoints);
}

