package def.node.vm;
@jsweet.lang.Interface
public abstract class RunningScriptOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String filename;
    @jsweet.lang.Optional
    public double lineOffset;
    @jsweet.lang.Optional
    public double columnOffset;
    @jsweet.lang.Optional
    public Boolean displayErrors;
    @jsweet.lang.Optional
    public double timeout;
}

