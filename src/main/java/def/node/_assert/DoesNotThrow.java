package def.node._assert;
import def.js.RegExp;
import def.js.Function;
/** This is an automatically generated object type (see the source definition). */
@jsweet.lang.ObjectType
public class DoesNotThrow extends def.js.Object {
    native public void apply(Function block, String message);
    native public void apply(Function block, Function error, String message);
    native public void apply(Function block, RegExp error, String message);
    native public void apply(Function block, java.util.function.Function<Object,Boolean> error, String message);
    native public void apply(Function block);
    native public void apply(Function block, Function error);
    native public void apply(Function block, RegExp error);
    native public void apply(Function block, java.util.function.Function<Object,Boolean> error);
}

