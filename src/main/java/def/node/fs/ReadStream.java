package def.node.fs;
import def.node.Buffer;
import def.js.Function;
@jsweet.lang.Interface
public abstract class ReadStream extends def.node.stream.Readable {
    native public void close();
    native public void destroy();
    public double bytesRead;
    public jsweet.util.union.Union<String,Buffer> path;
    /**
         * events.EventEmitter
         *   1. open
         *   2. close
         */
    native public ReadStream addListener(String event, Function listener);
    native public ReadStream addListener(def.node.StringTypes.open event, java.util.function.Consumer<Double> listener);
    native public ReadStream addListener(String event, java.lang.Runnable listener);
    native public ReadStream on(String event, Function listener);
    native public ReadStream on(def.node.StringTypes.open event, java.util.function.Consumer<Double> listener);
    native public ReadStream on(String event, java.lang.Runnable listener);
    native public ReadStream once(String event, Function listener);
    native public ReadStream once(def.node.StringTypes.open event, java.util.function.Consumer<Double> listener);
    native public ReadStream once(String event, java.lang.Runnable listener);
    native public ReadStream prependListener(String event, Function listener);
    native public ReadStream prependListener(def.node.StringTypes.open event, java.util.function.Consumer<Double> listener);
    native public ReadStream prependListener(String event, java.lang.Runnable listener);
    native public ReadStream prependOnceListener(String event, Function listener);
    native public ReadStream prependOnceListener(def.node.StringTypes.open event, java.util.function.Consumer<Double> listener);
    native public ReadStream prependOnceListener(String event, java.lang.Runnable listener);
}

