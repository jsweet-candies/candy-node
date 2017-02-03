package def.node._debugger;
@jsweet.lang.Interface
public abstract class BreakResponse extends def.js.Object {
    @jsweet.lang.Optional
    public ScriptDesc script;
    @jsweet.lang.Optional
    public ExceptionInfo exception;
    public double sourceLine;
    public String sourceLineText;
    public double sourceColumn;
}

