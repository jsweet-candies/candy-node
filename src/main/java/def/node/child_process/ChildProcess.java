package def.node.child_process;
import def.js.Error;
import def.js.Function;
@jsweet.lang.Interface
public abstract class ChildProcess extends def.node.events.EventEmitter {
    public def.node.stream.Writable stdin;
    public def.node.stream.Readable stdout;
    public def.node.stream.Readable stderr;
    public jsweet.util.tuple.Tuple3<def.node.stream.Writable,def.node.stream.Readable,def.node.stream.Readable> stdio;
    public double pid;
    native public void kill(String signal);
    native public Boolean send(Object message, Object sendHandle);
    public Boolean connected;
    native public void disconnect();
    native public void unref();
    native public void ref();
    native public ChildProcess addListener(String event, Function listener);
    native public ChildProcess addListener(def.node.StringTypes.close event, java.util.function.BiConsumer<Double,String> listener);
    native public ChildProcess addListener(def.node.StringTypes.disconnet event, java.lang.Runnable listener);
    native public ChildProcess addListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public ChildProcess addListener(def.node.StringTypes.exit event, java.util.function.BiConsumer<Double,String> listener);
    @jsweet.lang.Name("addListener")
    native public ChildProcess addListenerListenerSocketBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Socket> listener);
    native public Boolean emit(String event, Object... args);
    native public Boolean emit(def.node.StringTypes.close event, double code, String signal);
    native public Boolean emit(def.node.StringTypes.disconnet event);
    native public Boolean emit(def.node.StringTypes.error event, Error err);
    native public Boolean emit(def.node.StringTypes.exit event, double code, String signal);
    native public Boolean emit(def.node.StringTypes.message event, Object message, def.node.net.Socket sendHandle);
    native public ChildProcess on(String event, Function listener);
    native public ChildProcess on(def.node.StringTypes.close event, java.util.function.BiConsumer<Double,String> listener);
    native public ChildProcess on(def.node.StringTypes.disconnet event, java.lang.Runnable listener);
    native public ChildProcess on(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public ChildProcess on(def.node.StringTypes.exit event, java.util.function.BiConsumer<Double,String> listener);
    @jsweet.lang.Name("on")
    native public ChildProcess onListenerSocketBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Socket> listener);
    native public ChildProcess once(String event, Function listener);
    native public ChildProcess once(def.node.StringTypes.close event, java.util.function.BiConsumer<Double,String> listener);
    native public ChildProcess once(def.node.StringTypes.disconnet event, java.lang.Runnable listener);
    native public ChildProcess once(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public ChildProcess once(def.node.StringTypes.exit event, java.util.function.BiConsumer<Double,String> listener);
    @jsweet.lang.Name("once")
    native public ChildProcess onceListenerSocketBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Socket> listener);
    native public ChildProcess prependListener(String event, Function listener);
    native public ChildProcess prependListener(def.node.StringTypes.close event, java.util.function.BiConsumer<Double,String> listener);
    native public ChildProcess prependListener(def.node.StringTypes.disconnet event, java.lang.Runnable listener);
    native public ChildProcess prependListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public ChildProcess prependListener(def.node.StringTypes.exit event, java.util.function.BiConsumer<Double,String> listener);
    @jsweet.lang.Name("prependListener")
    native public ChildProcess prependListenerListenerSocketBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Socket> listener);
    native public ChildProcess prependOnceListener(String event, Function listener);
    native public ChildProcess prependOnceListener(def.node.StringTypes.close event, java.util.function.BiConsumer<Double,String> listener);
    native public ChildProcess prependOnceListener(def.node.StringTypes.disconnet event, java.lang.Runnable listener);
    native public ChildProcess prependOnceListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public ChildProcess prependOnceListener(def.node.StringTypes.exit event, java.util.function.BiConsumer<Double,String> listener);
    @jsweet.lang.Name("prependOnceListener")
    native public ChildProcess prependOnceListenerListenerSocketBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Socket> listener);
    native public void kill();
    native public Boolean send(Object message);
    @jsweet.lang.Name("addListener")
    native public ChildProcess addListenerListenerBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Server> listener);
    native public Boolean emit(def.node.StringTypes.message event, Object message, def.node.net.Server sendHandle);
    @jsweet.lang.Name("on")
    native public ChildProcess onListenerBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Server> listener);
    @jsweet.lang.Name("once")
    native public ChildProcess onceListenerBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Server> listener);
    @jsweet.lang.Name("prependListener")
    native public ChildProcess prependListenerListenerBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Server> listener);
    @jsweet.lang.Name("prependOnceListener")
    native public ChildProcess prependOnceListenerListenerBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Server> listener);
}

