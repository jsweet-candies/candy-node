package def.node.readline;
@jsweet.lang.Interface
public abstract class ReadLineOptions extends def.js.Object {
    public def.node.nodejs.ReadableStream input;
    @jsweet.lang.Optional
    public def.node.nodejs.WritableStream output;
    @jsweet.lang.Optional
    public Completer completer;
    @jsweet.lang.Optional
    public Boolean terminal;
    @jsweet.lang.Optional
    public double historySize;
    native public jsweet.util.tuple.Tuple2<String[],String> completer(java.lang.String line);
    native public Object completer(java.lang.String line, java.util.function.BiConsumer<Object,jsweet.util.tuple.Tuple2<String[],String>> callback);
}

