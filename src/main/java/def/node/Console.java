package def.node;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.dom.Console.class)
public abstract class Console extends def.dom.Console {
    public Console Console;
    @jsweet.lang.Name("assert")
    native public void Assert(Object value, String message, Object... optionalParams);
    native public void dir(Object obj, Options options);
    native public void error(Object message, Object... optionalParams);
    native public void info(Object message, Object... optionalParams);
    native public void log(Object message, Object... optionalParams);
    native public void time(String label);
    native public void timeEnd(String label);
    native public void trace(Object message, Object... optionalParams);
    native public void warn(Object message, Object... optionalParams);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        @jsweet.lang.Optional
        public Boolean showHidden;
        @jsweet.lang.Optional
        public double depth;
        @jsweet.lang.Optional
        public Boolean colors;
    }
    @jsweet.lang.Name("assert")
    native public void Assert(Object value);
    native public void dir(Object obj);
    native public void error();
    native public void info();
    native public void log();
    native public void trace();
    native public void warn();
}

