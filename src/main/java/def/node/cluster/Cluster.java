package def.node.cluster;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Cluster extends def.node.events.EventEmitter {
    public Worker Worker;
    native public void disconnect(Function callback);
    native public Worker fork(Object env);
    public Boolean isMaster;
    public Boolean isWorker;
    public ClusterSettings settings;
    native public void setupMaster(ClusterSetupMasterSettings settings);
    public Worker worker;
    public Workers workers;
    /**
         * events.EventEmitter
         *   1. disconnect
         *   2. exit
         *   3. fork
         *   4. listening
         *   5. message
         *   6. online
         *   7. setup
         */
    native public Cluster addListener(String event, Function listener);
    native public Cluster addListener(def.node.StringTypes.disconnect event, java.util.function.Consumer<Worker> listener);
    native public Cluster addListener(def.node.StringTypes.exit event, jsweet.util.function.TriConsumer<Worker,Double,String> listener);
    native public Cluster addListener(def.node.StringTypes.fork event, java.util.function.Consumer<Worker> listener);
    native public Cluster addListener(def.node.StringTypes.listening event, java.util.function.BiConsumer<Worker,Address> listener);
    @jsweet.lang.Name("addListener")
    native public Cluster addListenerListenerSocketTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Socket> listener);
    native public Cluster addListener(def.node.StringTypes.online event, java.util.function.Consumer<Worker> listener);
    native public Cluster addListener(def.node.StringTypes.setup event, java.util.function.Consumer<Object> listener);
    native public Boolean emit(String event, Function listener);
    native public Boolean emit(def.node.StringTypes.disconnect event, java.util.function.Consumer<Worker> listener);
    native public Boolean emit(def.node.StringTypes.exit event, jsweet.util.function.TriConsumer<Worker,Double,String> listener);
    native public Boolean emit(def.node.StringTypes.fork event, java.util.function.Consumer<Worker> listener);
    native public Boolean emit(def.node.StringTypes.listening event, java.util.function.BiConsumer<Worker,Address> listener);
    @jsweet.lang.Name("emit")
    native public Boolean emitListenerSocketTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Socket> listener);
    native public Boolean emit(def.node.StringTypes.online event, java.util.function.Consumer<Worker> listener);
    native public Boolean emit(def.node.StringTypes.setup event, java.util.function.Consumer<Object> listener);
    native public Cluster on(String event, Function listener);
    native public Cluster on(def.node.StringTypes.disconnect event, java.util.function.Consumer<Worker> listener);
    native public Cluster on(def.node.StringTypes.exit event, jsweet.util.function.TriConsumer<Worker,Double,String> listener);
    native public Cluster on(def.node.StringTypes.fork event, java.util.function.Consumer<Worker> listener);
    native public Cluster on(def.node.StringTypes.listening event, java.util.function.BiConsumer<Worker,Address> listener);
    @jsweet.lang.Name("on")
    native public Cluster onListenerSocketTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Socket> listener);
    native public Cluster on(def.node.StringTypes.online event, java.util.function.Consumer<Worker> listener);
    native public Cluster on(def.node.StringTypes.setup event, java.util.function.Consumer<Object> listener);
    native public Cluster once(String event, Function listener);
    native public Cluster once(def.node.StringTypes.disconnect event, java.util.function.Consumer<Worker> listener);
    native public Cluster once(def.node.StringTypes.exit event, jsweet.util.function.TriConsumer<Worker,Double,String> listener);
    native public Cluster once(def.node.StringTypes.fork event, java.util.function.Consumer<Worker> listener);
    native public Cluster once(def.node.StringTypes.listening event, java.util.function.BiConsumer<Worker,Address> listener);
    @jsweet.lang.Name("once")
    native public Cluster onceListenerSocketTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Socket> listener);
    native public Cluster once(def.node.StringTypes.online event, java.util.function.Consumer<Worker> listener);
    native public Cluster once(def.node.StringTypes.setup event, java.util.function.Consumer<Object> listener);
    native public Cluster prependListener(String event, Function listener);
    native public Cluster prependListener(def.node.StringTypes.disconnect event, java.util.function.Consumer<Worker> listener);
    native public Cluster prependListener(def.node.StringTypes.exit event, jsweet.util.function.TriConsumer<Worker,Double,String> listener);
    native public Cluster prependListener(def.node.StringTypes.fork event, java.util.function.Consumer<Worker> listener);
    native public Cluster prependListener(def.node.StringTypes.listening event, java.util.function.BiConsumer<Worker,Address> listener);
    @jsweet.lang.Name("prependListener")
    native public Cluster prependListenerListenerSocketTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Socket> listener);
    native public Cluster prependListener(def.node.StringTypes.online event, java.util.function.Consumer<Worker> listener);
    native public Cluster prependListener(def.node.StringTypes.setup event, java.util.function.Consumer<Object> listener);
    native public Cluster prependOnceListener(String event, Function listener);
    native public Cluster prependOnceListener(def.node.StringTypes.disconnect event, java.util.function.Consumer<Worker> listener);
    native public Cluster prependOnceListener(def.node.StringTypes.exit event, jsweet.util.function.TriConsumer<Worker,Double,String> listener);
    native public Cluster prependOnceListener(def.node.StringTypes.fork event, java.util.function.Consumer<Worker> listener);
    native public Cluster prependOnceListener(def.node.StringTypes.listening event, java.util.function.BiConsumer<Worker,Address> listener);
    @jsweet.lang.Name("prependOnceListener")
    native public Cluster prependOnceListenerListenerSocketTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Socket> listener);
    native public Cluster prependOnceListener(def.node.StringTypes.online event, java.util.function.Consumer<Worker> listener);
    native public Cluster prependOnceListener(def.node.StringTypes.setup event, java.util.function.Consumer<Object> listener);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Workers extends def.js.Object {
        native public Worker $get(String index);
    }
    native public void disconnect();
    native public Worker fork();
    native public void setupMaster();
    @jsweet.lang.Name("addListener")
    native public Cluster addListenerListenerTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Server> listener);
    @jsweet.lang.Name("emit")
    native public Boolean emitListenerTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Server> listener);
    @jsweet.lang.Name("on")
    native public Cluster onListenerTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Server> listener);
    @jsweet.lang.Name("once")
    native public Cluster onceListenerTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Server> listener);
    @jsweet.lang.Name("prependListener")
    native public Cluster prependListenerListenerTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Server> listener);
    @jsweet.lang.Name("prependOnceListener")
    native public Cluster prependOnceListenerListenerTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Server> listener);
}

