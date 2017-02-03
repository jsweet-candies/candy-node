package def.node.repl;
/** This class holds all the global functions and variables of the repl package. */
public final class Globals {
    private Globals(){}
    native public static REPLServer start(ReplOptions options);
}

