package def.node.domain;
import def.js.Error;
import def.js.Function;
import def.node.nodejs.Events;
@jsweet.lang.Extends({def.node.nodejs.Domain.class})
public class Domain extends def.node.events.EventEmitter {
    native public void add(def.node.events.EventEmitter emitter);
    native public void remove(def.node.events.EventEmitter emitter);
    public Object[] members;
    native public void enter();
    native public void exit();
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

