package def.node._debugger;
/** This class holds all the global functions and variables of the _debugger package. */
public final class Globals {
    private Globals(){}
    public static double NO_FRAME;
    public static double port;
    native public static String SourceInfo(BreakResponse body);
    public static Client Client;
}

