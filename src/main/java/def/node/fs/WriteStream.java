package def.node.fs;
import def.node.Buffer;
import def.js.Function;
@jsweet.lang.Interface
public abstract class WriteStream extends def.node.stream.Writable {
    native public void close();
    public double bytesWritten;
    public jsweet.util.union.Union<String,Buffer> path;
    /**
         * events.EventEmitter
         *   1. open
         *   2. close
         */
    native public WriteStream addListener(String event, Function listener);
    native public WriteStream addListener(def.node.StringTypes.open event, java.util.function.Consumer<Double> listener);
    native public WriteStream addListener(String event, java.lang.Runnable listener);
    native public WriteStream on(String event, Function listener);
    native public WriteStream on(def.node.StringTypes.open event, java.util.function.Consumer<Double> listener);
    native public WriteStream on(String event, java.lang.Runnable listener);
    native public WriteStream once(String event, Function listener);
    native public WriteStream once(def.node.StringTypes.open event, java.util.function.Consumer<Double> listener);
    native public WriteStream once(String event, java.lang.Runnable listener);
    native public WriteStream prependListener(String event, Function listener);
    native public WriteStream prependListener(def.node.StringTypes.open event, java.util.function.Consumer<Double> listener);
    native public WriteStream prependListener(String event, java.lang.Runnable listener);
    native public WriteStream prependOnceListener(String event, Function listener);
    native public WriteStream prependOnceListener(def.node.StringTypes.open event, java.util.function.Consumer<Double> listener);
    native public WriteStream prependOnceListener(String event, java.lang.Runnable listener);
}

