package def.node.cluster;
import def.js.Function;
/** This class holds all the global functions and variables of the cluster package. */
public final class Globals {
    private Globals(){}
    native public static void disconnect(Function callback);
    native public static Worker fork(Object env);
    public static Boolean isMaster;
    public static Boolean isWorker;
    public static ClusterSettings settings;
    native public static void setupMaster(ClusterSetupMasterSettings settings);
    public static Worker worker;
    public static WorkersData workers;
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
    native public static Cluster addListener(String event, Function listener);
    native public static Cluster addListener(def.node.StringTypes.disconnect event, java.util.function.Consumer<Worker> listener);
    native public static Cluster addListener(def.node.StringTypes.exit event, jsweet.util.function.TriConsumer<Worker,Double,String> listener);
    native public static Cluster addListener(def.node.StringTypes.fork event, java.util.function.Consumer<Worker> listener);
    native public static Cluster addListener(def.node.StringTypes.listening event, java.util.function.BiConsumer<Worker,Address> listener);
    @jsweet.lang.Name("addListener")
    native public static Cluster addListenerListenerSocketTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Socket> listener);
    native public static Cluster addListener(def.node.StringTypes.online event, java.util.function.Consumer<Worker> listener);
    native public static Cluster addListener(def.node.StringTypes.setup event, java.util.function.Consumer<Object> listener);
    native public static Boolean emit(String event, Function listener);
    native public static Boolean emit(def.node.StringTypes.disconnect event, java.util.function.Consumer<Worker> listener);
    native public static Boolean emit(def.node.StringTypes.exit event, jsweet.util.function.TriConsumer<Worker,Double,String> listener);
    native public static Boolean emit(def.node.StringTypes.fork event, java.util.function.Consumer<Worker> listener);
    native public static Boolean emit(def.node.StringTypes.listening event, java.util.function.BiConsumer<Worker,Address> listener);
    @jsweet.lang.Name("emit")
    native public static Boolean emitListenerSocketTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Socket> listener);
    native public static Boolean emit(def.node.StringTypes.online event, java.util.function.Consumer<Worker> listener);
    native public static Boolean emit(def.node.StringTypes.setup event, java.util.function.Consumer<Object> listener);
    native public static Cluster on(String event, Function listener);
    native public static Cluster on(def.node.StringTypes.disconnect event, java.util.function.Consumer<Worker> listener);
    native public static Cluster on(def.node.StringTypes.exit event, jsweet.util.function.TriConsumer<Worker,Double,String> listener);
    native public static Cluster on(def.node.StringTypes.fork event, java.util.function.Consumer<Worker> listener);
    native public static Cluster on(def.node.StringTypes.listening event, java.util.function.BiConsumer<Worker,Address> listener);
    @jsweet.lang.Name("on")
    native public static Cluster onListenerSocketTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Socket> listener);
    native public static Cluster on(def.node.StringTypes.online event, java.util.function.Consumer<Worker> listener);
    native public static Cluster on(def.node.StringTypes.setup event, java.util.function.Consumer<Object> listener);
    native public static Cluster once(String event, Function listener);
    native public static Cluster once(def.node.StringTypes.disconnect event, java.util.function.Consumer<Worker> listener);
    native public static Cluster once(def.node.StringTypes.exit event, jsweet.util.function.TriConsumer<Worker,Double,String> listener);
    native public static Cluster once(def.node.StringTypes.fork event, java.util.function.Consumer<Worker> listener);
    native public static Cluster once(def.node.StringTypes.listening event, java.util.function.BiConsumer<Worker,Address> listener);
    @jsweet.lang.Name("once")
    native public static Cluster onceListenerSocketTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Socket> listener);
    native public static Cluster once(def.node.StringTypes.online event, java.util.function.Consumer<Worker> listener);
    native public static Cluster once(def.node.StringTypes.setup event, java.util.function.Consumer<Object> listener);
    native public static Cluster removeListener(String event, Function listener);
    native public static Cluster removeAllListeners(String event);
    native public static Cluster setMaxListeners(double n);
    native public static double getMaxListeners();
    native public static Function[] listeners(String event);
    native public static double listenerCount(String type);
    native public static Cluster prependListener(String event, Function listener);
    native public static Cluster prependListener(def.node.StringTypes.disconnect event, java.util.function.Consumer<Worker> listener);
    native public static Cluster prependListener(def.node.StringTypes.exit event, jsweet.util.function.TriConsumer<Worker,Double,String> listener);
    native public static Cluster prependListener(def.node.StringTypes.fork event, java.util.function.Consumer<Worker> listener);
    native public static Cluster prependListener(def.node.StringTypes.listening event, java.util.function.BiConsumer<Worker,Address> listener);
    @jsweet.lang.Name("prependListener")
    native public static Cluster prependListenerListenerSocketTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Socket> listener);
    native public static Cluster prependListener(def.node.StringTypes.online event, java.util.function.Consumer<Worker> listener);
    native public static Cluster prependListener(def.node.StringTypes.setup event, java.util.function.Consumer<Object> listener);
    native public static Cluster prependOnceListener(String event, Function listener);
    native public static Cluster prependOnceListener(def.node.StringTypes.disconnect event, java.util.function.Consumer<Worker> listener);
    native public static Cluster prependOnceListener(def.node.StringTypes.exit event, jsweet.util.function.TriConsumer<Worker,Double,String> listener);
    native public static Cluster prependOnceListener(def.node.StringTypes.fork event, java.util.function.Consumer<Worker> listener);
    native public static Cluster prependOnceListener(def.node.StringTypes.listening event, java.util.function.BiConsumer<Worker,Address> listener);
    @jsweet.lang.Name("prependOnceListener")
    native public static Cluster prependOnceListenerListenerSocketTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Socket> listener);
    native public static Cluster prependOnceListener(def.node.StringTypes.online event, java.util.function.Consumer<Worker> listener);
    native public static Cluster prependOnceListener(def.node.StringTypes.setup event, java.util.function.Consumer<Object> listener);
    native public static String[] eventNames();
    native public static void disconnect();
    native public static Worker fork();
    native public static void setupMaster();
    native public static Cluster removeAllListeners();
    @jsweet.lang.Name("addListener")
    native public static Cluster addListenerListenerTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Server> listener);
    @jsweet.lang.Name("emit")
    native public static Boolean emitListenerTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Server> listener);
    @jsweet.lang.Name("on")
    native public static Cluster onListenerTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Server> listener);
    @jsweet.lang.Name("once")
    native public static Cluster onceListenerTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Server> listener);
    @jsweet.lang.Name("prependListener")
    native public static Cluster prependListenerListenerTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Server> listener);
    @jsweet.lang.Name("prependOnceListener")
    native public static Cluster prependOnceListenerListenerTriConsumer(def.node.StringTypes.message event, jsweet.util.function.TriConsumer<Worker,Object,def.node.net.Server> listener);
}

