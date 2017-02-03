package def.node;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.js.Error.class)
@java.lang.SuppressWarnings("serial")
public abstract class Error extends def.js.Error {
    @jsweet.lang.Optional
    public String stack;
}

