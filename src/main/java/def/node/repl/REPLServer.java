package def.node.repl;
import def.js.Function;
@jsweet.lang.Interface
public abstract class REPLServer extends def.node.readline.ReadLine {
    native public void defineCommand(String keyword, Function cmd);
    native public void displayPrompt(Boolean preserveCursor);
    native public REPLServer addListener(String event, Function listener);
    native public REPLServer addListener(def.node.StringTypes.exit event, java.lang.Runnable listener);
    native public REPLServer addListener(def.node.StringTypes.reset event, Function listener);
    native public Boolean emit(String event, Object... args);
    native public Boolean emit(def.node.StringTypes.exit event);
    native public Boolean emit(def.node.StringTypes.reset event, Object context);
    native public REPLServer on(String event, Function listener);
    native public REPLServer on(def.node.StringTypes.exit event, java.lang.Runnable listener);
    native public REPLServer on(def.node.StringTypes.reset event, Function listener);
    native public REPLServer once(String event, Function listener);
    native public REPLServer once(def.node.StringTypes.exit event, java.lang.Runnable listener);
    native public REPLServer once(def.node.StringTypes.reset event, Function listener);
    native public REPLServer prependListener(String event, Function listener);
    native public REPLServer prependListener(def.node.StringTypes.exit event, java.lang.Runnable listener);
    native public REPLServer prependListener(def.node.StringTypes.reset event, Function listener);
    native public REPLServer prependOnceListener(String event, Function listener);
    native public REPLServer prependOnceListener(def.node.StringTypes.exit event, java.lang.Runnable listener);
    native public REPLServer prependOnceListener(def.node.StringTypes.reset event, Function listener);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Cmd extends def.js.Object {
        public String help;
        public Function action;
        native public java.lang.Object action(java.lang.Object... args);
    }
    native public void displayPrompt();
    native public void defineCommand(String keyword, Cmd cmd);
}

