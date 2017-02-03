package def.node.events;
import def.js.Function;
public class EventEmitter extends internal {
    native public static double listenerCount(EventEmitter emitter, String event);
    public static double defaultMaxListeners;
    native public EventEmitter addListener(String event, Function listener);
    native public EventEmitter on(String event, Function listener);
    native public EventEmitter once(String event, Function listener);
    native public EventEmitter prependListener(String event, Function listener);
    native public EventEmitter prependOnceListener(String event, Function listener);
    native public EventEmitter removeListener(String event, Function listener);
    native public EventEmitter removeAllListeners(String event);
    native public EventEmitter setMaxListeners(double n);
    native public double getMaxListeners();
    native public Function[] listeners(String event);
    native public Boolean emit(String event, Object... args);
    native public jsweet.util.union.Union<String,String>[] eventNames();
    native public double listenerCount(String type);
    native public EventEmitter removeAllListeners();
}

