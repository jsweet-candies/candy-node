package def.node.cluster;
import def.js.Function;
public class Worker extends def.node.events.EventEmitter {
    public String id;
    public def.node.child_process.ChildProcess process;
    public Boolean suicide;
    native public Boolean send(Object message, Object sendHandle);
    native public void kill(String signal);
    native public void destroy(String signal);
    native public void disconnect();
    native public Boolean isConnected();
    native public Boolean isDead();
    public Boolean exitedAfterDisconnect;
    /**
         * events.EventEmitter
         *   1. disconnect
         *   2. error
         *   3. exit
         *   4. listening
         *   5. message
         *   6. online
         */
    native public Worker addListener(String event, Function listener);
    native public Worker addListener(def.node.StringTypes.disconnect event, java.lang.Runnable listener);
    native public Worker addListener(def.node.StringTypes.error event, java.util.function.BiConsumer<Double,String> listener);
    native public Worker addListener(def.node.StringTypes.exit event, java.util.function.BiConsumer<Double,String> listener);
    native public Worker addListener(def.node.StringTypes.listening event, java.util.function.Consumer<Address> listener);
    @jsweet.lang.Name("addListener")
    native public Worker addListenerListenerSocketBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Socket> listener);
    native public Worker addListener(def.node.StringTypes.online event, java.lang.Runnable listener);
    native public Boolean emit(String event, Function listener);
    native public Boolean emit(def.node.StringTypes.disconnect event, java.lang.Runnable listener);
    native public Boolean emit(def.node.StringTypes.error event, java.util.function.BiConsumer<Double,String> listener);
    native public Boolean emit(def.node.StringTypes.exit event, java.util.function.BiConsumer<Double,String> listener);
    native public Boolean emit(def.node.StringTypes.listening event, java.util.function.Consumer<Address> listener);
    @jsweet.lang.Name("emit")
    native public Boolean emitListenerSocketBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Socket> listener);
    native public Boolean emit(def.node.StringTypes.online event, java.lang.Runnable listener);
    native public Worker on(String event, Function listener);
    native public Worker on(def.node.StringTypes.disconnect event, java.lang.Runnable listener);
    native public Worker on(def.node.StringTypes.error event, java.util.function.BiConsumer<Double,String> listener);
    native public Worker on(def.node.StringTypes.exit event, java.util.function.BiConsumer<Double,String> listener);
    native public Worker on(def.node.StringTypes.listening event, java.util.function.Consumer<Address> listener);
    @jsweet.lang.Name("on")
    native public Worker onListenerSocketBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Socket> listener);
    native public Worker on(def.node.StringTypes.online event, java.lang.Runnable listener);
    native public Worker once(String event, Function listener);
    native public Worker once(def.node.StringTypes.disconnect event, java.lang.Runnable listener);
    native public Worker once(def.node.StringTypes.error event, java.util.function.BiConsumer<Double,String> listener);
    native public Worker once(def.node.StringTypes.exit event, java.util.function.BiConsumer<Double,String> listener);
    native public Worker once(def.node.StringTypes.listening event, java.util.function.Consumer<Address> listener);
    @jsweet.lang.Name("once")
    native public Worker onceListenerSocketBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Socket> listener);
    native public Worker once(def.node.StringTypes.online event, java.lang.Runnable listener);
    native public Worker prependListener(String event, Function listener);
    native public Worker prependListener(def.node.StringTypes.disconnect event, java.lang.Runnable listener);
    native public Worker prependListener(def.node.StringTypes.error event, java.util.function.BiConsumer<Double,String> listener);
    native public Worker prependListener(def.node.StringTypes.exit event, java.util.function.BiConsumer<Double,String> listener);
    native public Worker prependListener(def.node.StringTypes.listening event, java.util.function.Consumer<Address> listener);
    @jsweet.lang.Name("prependListener")
    native public Worker prependListenerListenerSocketBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Socket> listener);
    native public Worker prependListener(def.node.StringTypes.online event, java.lang.Runnable listener);
    native public Worker prependOnceListener(String event, Function listener);
    native public Worker prependOnceListener(def.node.StringTypes.disconnect event, java.lang.Runnable listener);
    native public Worker prependOnceListener(def.node.StringTypes.error event, java.util.function.BiConsumer<Double,String> listener);
    native public Worker prependOnceListener(def.node.StringTypes.exit event, java.util.function.BiConsumer<Double,String> listener);
    native public Worker prependOnceListener(def.node.StringTypes.listening event, java.util.function.Consumer<Address> listener);
    @jsweet.lang.Name("prependOnceListener")
    native public Worker prependOnceListenerListenerSocketBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Socket> listener);
    native public Worker prependOnceListener(def.node.StringTypes.online event, java.lang.Runnable listener);
    native public Boolean send(Object message);
    native public void kill();
    native public void destroy();
    @jsweet.lang.Name("addListener")
    native public Worker addListenerListenerBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Server> listener);
    @jsweet.lang.Name("emit")
    native public Boolean emitListenerBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Server> listener);
    @jsweet.lang.Name("on")
    native public Worker onListenerBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Server> listener);
    @jsweet.lang.Name("once")
    native public Worker onceListenerBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Server> listener);
    @jsweet.lang.Name("prependListener")
    native public Worker prependListenerListenerBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Server> listener);
    @jsweet.lang.Name("prependOnceListener")
    native public Worker prependOnceListenerListenerBiConsumer(def.node.StringTypes.message event, java.util.function.BiConsumer<Object,def.node.net.Server> listener);
}

