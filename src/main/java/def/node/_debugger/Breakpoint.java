package def.node._debugger;
@jsweet.lang.Interface
public abstract class Breakpoint extends def.js.Object {
    public double id;
    public double scriptId;
    public ScriptDesc script;
    public double line;
    @jsweet.lang.Optional
    public String condition;
    @jsweet.lang.Optional
    public String scriptReq;
}

