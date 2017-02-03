package def.node.nodejs;
import def.js.Error;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Domain extends Events {
    native public void run(Function fn);
    native public void add(Events emitter);
    native public void remove(Events emitter);
    native public Object bind(java.util.function.BiFunction<Error,Object,Object> cb);
    native public Object intercept(java.util.function.Function<Object,Object> cb);
    native public void dispose();
    native public Domain addListener(String event, Function listener);
    native public Domain on(String event, Function listener);
    native public Domain once(String event, Function listener);
    native public Domain removeListener(String event, Function listener);
    native public Domain removeAllListeners(String event);
    native public Domain removeAllListeners();
}

