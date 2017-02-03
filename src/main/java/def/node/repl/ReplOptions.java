package def.node.repl;
import def.js.Function;
@jsweet.lang.Interface
public abstract class ReplOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String prompt;
    @jsweet.lang.Optional
    public def.node.nodejs.ReadableStream input;
    @jsweet.lang.Optional
    public def.node.nodejs.WritableStream output;
    @jsweet.lang.Optional
    public Boolean terminal;
    @jsweet.lang.Optional
    public Function eval;
    @jsweet.lang.Optional
    public Boolean useColors;
    @jsweet.lang.Optional
    public Boolean useGlobal;
    @jsweet.lang.Optional
    public Boolean ignoreUndefined;
    @jsweet.lang.Optional
    public Function writer;
    @jsweet.lang.Optional
    public Function completer;
    @jsweet.lang.Optional
    public Object replMode;
    @jsweet.lang.Optional
    public Object breakEvalOnSigint;
    native public java.lang.Object eval(java.lang.Object... args);
    native public java.lang.Object writer(java.lang.Object... args);
    native public java.lang.Object completer(java.lang.Object... args);
}

