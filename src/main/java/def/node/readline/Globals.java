package def.node.readline;
/** This class holds all the global functions and variables of the readline package. */
public final class Globals {
    private Globals(){}
    native public static ReadLine createInterface(def.node.nodejs.ReadableStream input, def.node.nodejs.WritableStream output, Completer completer, Boolean terminal);
    native public static ReadLine createInterface(ReadLineOptions options);
    native public static void cursorTo(def.node.nodejs.WritableStream stream, double x, double y);
    native public static void moveCursor(def.node.nodejs.WritableStream stream, double dx, double dy);
    native public static void clearLine(def.node.nodejs.WritableStream stream, double dir);
    native public static void clearScreenDown(def.node.nodejs.WritableStream stream);
    native public static ReadLine createInterface(def.node.nodejs.ReadableStream input, def.node.nodejs.WritableStream output, Completer completer);
    native public static ReadLine createInterface(def.node.nodejs.ReadableStream input, def.node.nodejs.WritableStream output);
    native public static ReadLine createInterface(def.node.nodejs.ReadableStream input);
    native public static void moveCursor(def.node.nodejs.WritableStream stream, String dx, String dy);
    native public static void moveCursor(def.node.nodejs.WritableStream stream, double dx, String dy);
    native public static void moveCursor(def.node.nodejs.WritableStream stream, String dx, double dy);
}

