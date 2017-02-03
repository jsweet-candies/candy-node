package def.node.vm;
public class Script extends def.js.Object {
    public Script(String code, ScriptOptions options){}
    native public Object runInContext(Context contextifiedSandbox, RunningScriptOptions options);
    native public Object runInNewContext(Context sandbox, RunningScriptOptions options);
    native public Object runInThisContext(RunningScriptOptions options);
    public Script(String code){}
    native public Object runInContext(Context contextifiedSandbox);
    native public Object runInNewContext(Context sandbox);
    native public Object runInNewContext();
    native public Object runInThisContext();
    protected Script(){}
}

