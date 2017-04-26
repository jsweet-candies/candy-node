package def.node.readline;
@jsweet.lang.Interface
public abstract class Completer extends def.js.Object {
    native public jsweet.util.tuple.Tuple2<String[],String> $apply(String line);
    native public Object $apply(String line, java.util.function.BiConsumer<Object,jsweet.util.tuple.Tuple2<String[],String>> callback);
}

