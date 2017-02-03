package def.node.querystring;
import def.js.Function;
@jsweet.lang.Interface
public abstract class ParseOptions extends def.js.Object {
    @jsweet.lang.Optional
    public double maxKeys;
    @jsweet.lang.Optional
    public Function decodeURIComponent;
    native public java.lang.Object decodeURIComponent(java.lang.Object... args);
}

