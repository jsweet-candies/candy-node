package def.node.fs;
import def.node.Buffer;
import def.js.Function;
@jsweet.lang.Interface
public abstract class FSWatcher extends def.node.events.EventEmitter {
    native public void close();
    /**
         * events.EventEmitter
         *   1. change
         *   2. error
         */
    native public FSWatcher addListener(String event, Function listener);
    @jsweet.lang.Name("addListener")
    native public FSWatcher addListenerListenerStringBiConsumer(def.node.StringTypes.change event, java.util.function.BiConsumer<String,String> listener);
    native public FSWatcher addListener(def.node.StringTypes.error event, java.util.function.BiConsumer<Double,String> listener);
    native public FSWatcher on(String event, Function listener);
    @jsweet.lang.Name("on")
    native public FSWatcher onListenerStringBiConsumer(def.node.StringTypes.change event, java.util.function.BiConsumer<String,String> listener);
    native public FSWatcher on(def.node.StringTypes.error event, java.util.function.BiConsumer<Double,String> listener);
    native public FSWatcher once(String event, Function listener);
    @jsweet.lang.Name("once")
    native public FSWatcher onceListenerStringBiConsumer(def.node.StringTypes.change event, java.util.function.BiConsumer<String,String> listener);
    native public FSWatcher once(def.node.StringTypes.error event, java.util.function.BiConsumer<Double,String> listener);
    native public FSWatcher prependListener(String event, Function listener);
    @jsweet.lang.Name("prependListener")
    native public FSWatcher prependListenerListenerStringBiConsumer(def.node.StringTypes.change event, java.util.function.BiConsumer<String,String> listener);
    native public FSWatcher prependListener(def.node.StringTypes.error event, java.util.function.BiConsumer<Double,String> listener);
    native public FSWatcher prependOnceListener(String event, Function listener);
    @jsweet.lang.Name("prependOnceListener")
    native public FSWatcher prependOnceListenerListenerStringBiConsumer(def.node.StringTypes.change event, java.util.function.BiConsumer<String,String> listener);
    native public FSWatcher prependOnceListener(def.node.StringTypes.error event, java.util.function.BiConsumer<Double,String> listener);
    @jsweet.lang.Name("addListener")
    native public FSWatcher addListenerListenerBiConsumer(def.node.StringTypes.change event, java.util.function.BiConsumer<String,Buffer> listener);
    @jsweet.lang.Name("on")
    native public FSWatcher onListenerBiConsumer(def.node.StringTypes.change event, java.util.function.BiConsumer<String,Buffer> listener);
    @jsweet.lang.Name("once")
    native public FSWatcher onceListenerBiConsumer(def.node.StringTypes.change event, java.util.function.BiConsumer<String,Buffer> listener);
    @jsweet.lang.Name("prependListener")
    native public FSWatcher prependListenerListenerBiConsumer(def.node.StringTypes.change event, java.util.function.BiConsumer<String,Buffer> listener);
    @jsweet.lang.Name("prependOnceListener")
    native public FSWatcher prependOnceListenerListenerBiConsumer(def.node.StringTypes.change event, java.util.function.BiConsumer<String,Buffer> listener);
}

