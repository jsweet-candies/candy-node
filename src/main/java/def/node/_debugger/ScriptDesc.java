package def.node._debugger;
@jsweet.lang.Interface
public abstract class ScriptDesc extends def.js.Object {
    public String name;
    public double id;
    @jsweet.lang.Optional
    public Boolean isNative;
    @jsweet.lang.Optional
    public double handle;
    public String type;
    @jsweet.lang.Optional
    public double lineOffset;
    @jsweet.lang.Optional
    public double columnOffset;
    @jsweet.lang.Optional
    public double lineCount;
}

