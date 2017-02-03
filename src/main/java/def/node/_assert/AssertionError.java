package def.node._assert;
import def.js.Error;
import def.js.Function;
@java.lang.SuppressWarnings("serial")
public class AssertionError extends Error {
    public String name;
    public String message;
    public Object actual;
    public Object expected;
    public String operator;
    public Boolean generatedMessage;
    public AssertionError(Options options){}
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        @jsweet.lang.Optional
        public String message;
        @jsweet.lang.Optional
        public Object actual;
        @jsweet.lang.Optional
        public Object expected;
        @jsweet.lang.Optional
        public String operator;
        @jsweet.lang.Optional
        public Function stackStartFunction;
        native public java.lang.Object stackStartFunction(java.lang.Object... args);
    }
    public AssertionError(){}
}

