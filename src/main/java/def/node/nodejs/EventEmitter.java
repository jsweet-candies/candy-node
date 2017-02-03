package def.node.nodejs;
import def.js.Function;
public class EventEmitter extends def.js.Object {
    native public EventEmitter addListener(String event, Function listener);
    native public EventEmitter on(String event, Function listener);
    native public EventEmitter once(String event, Function listener);
    native public EventEmitter removeListener(String event, Function listener);
    native public EventEmitter removeAllListeners(String event);
    native public EventEmitter setMaxListeners(double n);
    native public double getMaxListeners();
    native public Function[] listeners(String event);
    native public Boolean emit(String event, Object... args);
    native public double listenerCount(String type);
    native public EventEmitter prependListener(String event, Function listener);
    native public EventEmitter prependOnceListener(String event, Function listener);
    native public jsweet.util.union.Union<String,String>[] eventNames();
    native public EventEmitter removeAllListeners();
}

