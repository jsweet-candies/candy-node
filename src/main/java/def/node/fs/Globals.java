package def.node.fs;
import def.node.Buffer;
import def.js.Date;
import def.js.Function;
/** This class holds all the global functions and variables of the fs package. */
public final class Globals {
    private Globals(){}
    /**
     * Asynchronous rename.
     * @param oldPath
     * @param newPath
     * @param callback No arguments other than a possible exception are given to the completion callback.
     */
    native public static void rename(String oldPath, String newPath, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    /**
     * Synchronous rename
     * @param oldPath
     * @param newPath
     */
    native public static void renameSync(String oldPath, String newPath);
    native public static void truncate(String path, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void truncate(String path, double len, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void truncateSync(String path, double len);
    native public static void ftruncate(double fd, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void ftruncate(double fd, double len, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void ftruncateSync(double fd, double len);
    native public static void chown(String path, double uid, double gid, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void chownSync(String path, double uid, double gid);
    native public static void fchown(double fd, double uid, double gid, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void fchownSync(double fd, double uid, double gid);
    native public static void lchown(String path, double uid, double gid, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void lchownSync(String path, double uid, double gid);
    native public static void chmod(String path, double mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void chmod(String path, String mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void chmodSync(String path, double mode);
    native public static void chmodSync(String path, String mode);
    native public static void fchmod(double fd, double mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void fchmod(double fd, String mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void fchmodSync(double fd, double mode);
    native public static void fchmodSync(double fd, String mode);
    native public static void lchmod(String path, double mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void lchmod(String path, String mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void lchmodSync(String path, double mode);
    native public static void lchmodSync(String path, String mode);
    native public static void stat(String path, java.util.function.BiFunction<def.node.nodejs.ErrnoException,Stats,Object> callback);
    native public static void lstat(String path, java.util.function.BiFunction<def.node.nodejs.ErrnoException,Stats,Object> callback);
    native public static void fstat(double fd, java.util.function.BiFunction<def.node.nodejs.ErrnoException,Stats,Object> callback);
    native public static Stats statSync(String path);
    native public static Stats lstatSync(String path);
    native public static Stats fstatSync(double fd);
    native public static void link(String srcpath, String dstpath, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void linkSync(String srcpath, String dstpath);
    native public static void symlink(String srcpath, String dstpath, String type, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void symlinkSync(String srcpath, String dstpath, String type);
    native public static void readlink(String path, java.util.function.BiFunction<def.node.nodejs.ErrnoException,String,Object> callback);
    native public static String readlinkSync(String path);
    native public static void realpath(String path, java.util.function.BiFunction<def.node.nodejs.ErrnoException,String,Object> callback);
    native public static void realpath(String path, Cache cache, java.util.function.BiFunction<def.node.nodejs.ErrnoException,String,Object> callback);
    native public static String realpathSync(String path, Cache cache);
    native public static void unlink(String path, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void unlinkSync(String path);
    native public static void rmdir(String path, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void rmdirSync(String path);
    native public static void mkdir(String path, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void mkdir(String path, double mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void mkdir(String path, String mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void mkdirSync(String path, double mode);
    native public static void mkdirSync(String path, String mode);
    native public static void mkdtemp(String prefix, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,String> callback);
    native public static String mkdtempSync(String prefix);
    native public static void readdir(String path, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,String[]> callback);
    native public static String[] readdirSync(String path);
    native public static void close(double fd, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void closeSync(double fd);
    native public static void open(String path, String flags, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,Double> callback);
    native public static void open(String path, String flags, double mode, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,Double> callback);
    native public static double openSync(String path, String flags, double mode);
    native public static void utimes(String path, double atime, double mtime, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void utimes(String path, Date atime, Date mtime, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void utimesSync(String path, double atime, double mtime);
    native public static void utimesSync(String path, Date atime, Date mtime);
    native public static void futimes(double fd, double atime, double mtime, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void futimes(double fd, Date atime, Date mtime, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void futimesSync(double fd, double atime, double mtime);
    native public static void futimesSync(double fd, Date atime, Date mtime);
    native public static void fsync(double fd, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void fsyncSync(double fd);
    native public static void write(double fd, Buffer buffer, double offset, double length, double position, jsweet.util.function.TriConsumer<def.node.nodejs.ErrnoException,Double,Buffer> callback);
    native public static void write(double fd, Buffer buffer, double offset, double length, jsweet.util.function.TriConsumer<def.node.nodejs.ErrnoException,Double,Buffer> callback);
    native public static void write(double fd, Object data, jsweet.util.function.TriConsumer<def.node.nodejs.ErrnoException,Double,String> callback);
    native public static void write(double fd, Object data, double offset, jsweet.util.function.TriConsumer<def.node.nodejs.ErrnoException,Double,String> callback);
    native public static void write(double fd, Object data, double offset, String encoding, jsweet.util.function.TriConsumer<def.node.nodejs.ErrnoException,Double,String> callback);
    native public static double writeSync(double fd, Buffer buffer, double offset, double length, double position);
    native public static double writeSync(double fd, Object data, double position, String enconding);
    native public static void read(double fd, Buffer buffer, double offset, double length, double position, jsweet.util.function.TriConsumer<def.node.nodejs.ErrnoException,Double,Buffer> callback);
    native public static double readSync(double fd, Buffer buffer, double offset, double length, double position);
    native public static void readFile(String filename, String encoding, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,String> callback);
    @jsweet.lang.Name("readFile")
    native public static void readFileCallbackStringBiConsumer(String filename, Options options, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,String> callback);
    @jsweet.lang.Name("readFile")
    native public static void readFileCallbackBiConsumer(String filename, Options options, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,Buffer> callback);
    native public static void readFile(String filename, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,Buffer> callback);
    native public static String readFileSync(String filename, String encoding);
    native public static Buffer readFileSync(String filename, Options options);
    native public static void writeFile(String filename, Object data, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void writeFile(String filename, Object data, OptionsData options, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void writeFileSync(String filename, Object data, OptionsData options);
    native public static void appendFile(String filename, Object data, OptionsData options, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void appendFile(String filename, Object data, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void appendFileSync(String filename, Object data, OptionsData options);
    native public static void watchFile(String filename, java.util.function.BiConsumer<Stats,Stats> listener);
    native public static void watchFile(String filename, OptionsDto options, java.util.function.BiConsumer<Stats,Stats> listener);
    native public static void unwatchFile(String filename, java.util.function.BiConsumer<Stats,Stats> listener);
    native public static FSWatcher watch(String filename, java.util.function.BiFunction<String,String,Object> listener);
    @jsweet.lang.Name("watch")
    native public static FSWatcher watchListenerStringBiFunction(String filename, String encoding, java.util.function.BiFunction<String,String,Object> listener);
    @jsweet.lang.Name("watch")
    native public static FSWatcher watchListenerStringBiFunction(String filename, OptionsStructure options, java.util.function.BiFunction<String,String,Object> listener);
    native public static void exists(String path, java.util.function.Consumer<Boolean> callback);
    native public static Boolean existsSync(String path);
    /** Tests a user's permissions for the file specified by path. */
    native public static void access(String path, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void access(String path, double mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    /** Synchronous version of fs.access. This throws if any accessibility checks fail, and does nothing otherwise. */
    native public static void accessSync(String path, double mode);
    native public static ReadStream createReadStream(String path, OptionsInfo options);
    native public static WriteStream createWriteStream(String path, OptionsInfo options);
    native public static void fdatasync(double fd, Function callback);
    native public static void fdatasyncSync(double fd);
    /**
     * Asynchronous rename.
     * @param oldPath
     * @param newPath
     * @param callback No arguments other than a possible exception are given to the completion callback.
     */
    native public static void rename(String oldPath, String newPath);
    native public static void truncate(String path);
    native public static void truncate(String path, double len);
    native public static void truncateSync(String path);
    native public static void ftruncate(double fd);
    native public static void ftruncate(double fd, double len);
    native public static void ftruncateSync(double fd);
    native public static void chown(String path, double uid, double gid);
    native public static void fchown(double fd, double uid, double gid);
    native public static void lchown(String path, double uid, double gid);
    native public static void chmod(String path, double mode);
    native public static void chmod(String path, String mode);
    native public static void fchmod(double fd, double mode);
    native public static void fchmod(double fd, String mode);
    native public static void lchmod(String path, double mode);
    native public static void lchmod(String path, String mode);
    native public static void stat(String path);
    native public static void lstat(String path);
    native public static void fstat(double fd);
    native public static void link(String srcpath, String dstpath);
    native public static void symlink(String srcpath, String dstpath, String type);
    native public static void symlink(String srcpath, String dstpath);
    native public static void symlinkSync(String srcpath, String dstpath);
    native public static void readlink(String path);
    native public static void realpath(String path);
    native public static String realpathSync(String path);
    native public static void unlink(String path);
    native public static void rmdir(String path);
    native public static void mkdir(String path);
    native public static void mkdir(String path, double mode);
    native public static void mkdir(String path, String mode);
    native public static void mkdirSync(String path);
    native public static void mkdtemp(String prefix);
    native public static void readdir(String path);
    native public static void close(double fd);
    native public static double openSync(String path, String flags);
    native public static void utimes(String path, double atime, double mtime);
    native public static void utimes(String path, Date atime, Date mtime);
    native public static void futimes(double fd, double atime, double mtime);
    native public static void futimes(double fd, Date atime, Date mtime);
    native public static void fsync(double fd);
    native public static void write(double fd, Buffer buffer, double offset, double length, double position);
    native public static void write(double fd, Buffer buffer, double offset, double length);
    native public static void write(double fd, Object data);
    native public static void write(double fd, Object data, double offset);
    native public static void write(double fd, Object data, double offset, String encoding);
    native public static double writeSync(double fd, Buffer buffer, double offset, double length);
    native public static double writeSync(double fd, Object data, double position);
    native public static double writeSync(double fd, Object data);
    native public static void read(double fd, Buffer buffer, double offset, double length, double position);
    native public static Buffer readFileSync(String filename);
    native public static void writeFile(String filename, Object data);
    native public static void writeFile(String filename, Object data, OptionsData options);
    native public static void writeFileSync(String filename, Object data);
    native public static void appendFile(String filename, Object data, OptionsData options);
    native public static void appendFile(String filename, Object data);
    native public static void appendFileSync(String filename, Object data);
    native public static void unwatchFile(String filename);
    native public static FSWatcher watch(String filename);
    native public static FSWatcher watch(String filename, String encoding);
    native public static FSWatcher watch(String filename, OptionsStructure options);
    native public static void exists(String path);
    /** Synchronous version of fs.access. This throws if any accessibility checks fail, and does nothing otherwise. */
    native public static void accessSync(String path);
    native public static ReadStream createReadStream(String path);
    native public static WriteStream createWriteStream(String path);
    /**
     * Asynchronous rename.
     * @param oldPath
     * @param newPath
     * @param callback No arguments other than a possible exception are given to the completion callback.
     */
    native public static void rename(String oldPath, String newPath, java.lang.Runnable callback);
    native public static void truncate(String path, java.lang.Runnable callback);
    native public static void truncate(String path, double len, java.lang.Runnable callback);
    native public static void ftruncate(double fd, java.lang.Runnable callback);
    native public static void ftruncate(double fd, double len, java.lang.Runnable callback);
    native public static void chown(String path, double uid, double gid, java.lang.Runnable callback);
    native public static void fchown(double fd, double uid, double gid, java.lang.Runnable callback);
    native public static void lchown(String path, double uid, double gid, java.lang.Runnable callback);
    native public static void chmod(String path, double mode, java.lang.Runnable callback);
    native public static void chmod(String path, String mode, java.lang.Runnable callback);
    native public static void fchmod(double fd, double mode, java.lang.Runnable callback);
    native public static void fchmod(double fd, String mode, java.lang.Runnable callback);
    native public static void lchmod(String path, double mode, java.lang.Runnable callback);
    native public static void lchmod(String path, String mode, java.lang.Runnable callback);
    native public static void link(String srcpath, String dstpath, java.lang.Runnable callback);
    native public static void symlink(String srcpath, String dstpath, String type, java.lang.Runnable callback);
    native public static void unlink(String path, java.lang.Runnable callback);
    native public static void rmdir(String path, java.lang.Runnable callback);
    native public static void mkdir(String path, java.lang.Runnable callback);
    native public static void mkdir(String path, double mode, java.lang.Runnable callback);
    native public static void mkdir(String path, String mode, java.lang.Runnable callback);
    native public static void close(double fd, java.lang.Runnable callback);
    native public static void utimes(String path, double atime, double mtime, java.lang.Runnable callback);
    native public static void utimes(String path, Date atime, Date mtime, java.lang.Runnable callback);
    native public static void futimes(double fd, double atime, double mtime, java.lang.Runnable callback);
    native public static void futimes(double fd, Date atime, Date mtime, java.lang.Runnable callback);
    native public static void fsync(double fd, java.lang.Runnable callback);
    native public static void truncate(Buffer path, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void truncate(Buffer path, double len, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void truncateSync(Buffer path, double len);
    native public static void chown(Buffer path, double uid, double gid, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void chownSync(Buffer path, double uid, double gid);
    native public static void lchown(Buffer path, double uid, double gid, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void lchownSync(Buffer path, double uid, double gid);
    native public static void chmod(Buffer path, double mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void chmod(Buffer path, String mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void chmodSync(Buffer path, double mode);
    native public static void chmodSync(Buffer path, String mode);
    native public static void lchmod(Buffer path, double mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void lchmod(Buffer path, String mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void lchmodSync(Buffer path, double mode);
    native public static void lchmodSync(Buffer path, String mode);
    native public static void stat(Buffer path, java.util.function.BiFunction<def.node.nodejs.ErrnoException,Stats,Object> callback);
    native public static void lstat(Buffer path, java.util.function.BiFunction<def.node.nodejs.ErrnoException,Stats,Object> callback);
    native public static Stats statSync(Buffer path);
    native public static Stats lstatSync(Buffer path);
    native public static void link(Buffer srcpath, Buffer dstpath, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void link(String srcpath, Buffer dstpath, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void link(Buffer srcpath, String dstpath, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void linkSync(String srcpath, Buffer dstpath);
    native public static void linkSync(Buffer srcpath, String dstpath);
    native public static void linkSync(Buffer srcpath, Buffer dstpath);
    native public static void symlink(String srcpath, Buffer dstpath, String type, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void symlink(Buffer srcpath, Buffer dstpath, String type, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void symlink(Buffer srcpath, String dstpath, String type, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void symlinkSync(String srcpath, Buffer dstpath, String type);
    native public static void symlinkSync(Buffer srcpath, Buffer dstpath, String type);
    native public static void symlinkSync(Buffer srcpath, String dstpath, String type);
    native public static void readlink(Buffer path, java.util.function.BiFunction<def.node.nodejs.ErrnoException,String,Object> callback);
    native public static String readlinkSync(Buffer path);
    native public static void realpath(Buffer path, java.util.function.BiFunction<def.node.nodejs.ErrnoException,String,Object> callback);
    native public static void realpath(Buffer path, Cache cache, java.util.function.BiFunction<def.node.nodejs.ErrnoException,String,Object> callback);
    native public static String realpathSync(Buffer path, Cache cache);
    native public static void unlink(Buffer path, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void unlinkSync(Buffer path);
    native public static void rmdir(Buffer path, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void rmdirSync(Buffer path);
    native public static void mkdir(Buffer path, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void mkdir(Buffer path, double mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void mkdir(Buffer path, String mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void mkdirSync(Buffer path, double mode);
    native public static void mkdirSync(Buffer path, String mode);
    native public static void readdir(Buffer path, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,String[]> callback);
    native public static String[] readdirSync(Buffer path);
    native public static void open(Buffer path, double flags, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,Double> callback);
    native public static void open(Buffer path, String flags, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,Double> callback);
    native public static void open(String path, double flags, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,Double> callback);
    native public static void open(Buffer path, double flags, double mode, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,Double> callback);
    native public static void open(String path, double flags, double mode, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,Double> callback);
    native public static void open(Buffer path, String flags, double mode, java.util.function.BiConsumer<def.node.nodejs.ErrnoException,Double> callback);
    native public static double openSync(Buffer path, String flags, double mode);
    native public static double openSync(String path, double flags, double mode);
    native public static double openSync(Buffer path, double flags, double mode);
    native public static void utimes(Buffer path, double atime, double mtime, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void utimes(Buffer path, Date atime, Date mtime, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void utimesSync(Buffer path, double atime, double mtime);
    native public static void utimesSync(Buffer path, Date atime, Date mtime);
    @jsweet.lang.Name("watch")
    native public static FSWatcher watchListenerBiFunction(String filename, String encoding, java.util.function.BiFunction<String,Buffer,Object> listener);
    @jsweet.lang.Name("watch")
    native public static FSWatcher watchListenerBiFunction(String filename, OptionsStructure options, java.util.function.BiFunction<String,Buffer,Object> listener);
    native public static void exists(Buffer path, java.util.function.Consumer<Boolean> callback);
    native public static Boolean existsSync(Buffer path);
    /** Tests a user's permissions for the file specified by path. */
    native public static void access(Buffer path, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    native public static void access(Buffer path, double mode, java.util.function.Consumer<def.node.nodejs.ErrnoException> callback);
    /** Synchronous version of fs.access. This throws if any accessibility checks fail, and does nothing otherwise. */
    native public static void accessSync(Buffer path, double mode);
    native public static ReadStream createReadStream(Buffer path, OptionsInfo options);
    native public static WriteStream createWriteStream(Buffer path, OptionsInfo options);
    native public static void truncate(Buffer path);
    native public static void truncate(Buffer path, double len);
    native public static void truncateSync(Buffer path);
    native public static void chown(Buffer path, double uid, double gid);
    native public static void lchown(Buffer path, double uid, double gid);
    native public static void chmod(Buffer path, double mode);
    native public static void chmod(Buffer path, String mode);
    native public static void lchmod(Buffer path, double mode);
    native public static void lchmod(Buffer path, String mode);
    native public static void stat(Buffer path);
    native public static void lstat(Buffer path);
    native public static void link(Buffer srcpath, String dstpath);
    native public static void link(String srcpath, Buffer dstpath);
    native public static void link(Buffer srcpath, Buffer dstpath);
    native public static void symlink(String srcpath, Buffer dstpath, String type);
    native public static void symlink(Buffer srcpath, String dstpath, String type);
    native public static void symlink(Buffer srcpath, Buffer dstpath, String type);
    native public static void symlink(Buffer srcpath, String dstpath);
    native public static void symlink(Buffer srcpath, Buffer dstpath);
    native public static void symlink(String srcpath, Buffer dstpath);
    native public static void symlinkSync(Buffer srcpath, String dstpath);
    native public static void symlinkSync(String srcpath, Buffer dstpath);
    native public static void symlinkSync(Buffer srcpath, Buffer dstpath);
    native public static void readlink(Buffer path);
    native public static void realpath(Buffer path);
    native public static String realpathSync(Buffer path);
    native public static void unlink(Buffer path);
    native public static void rmdir(Buffer path);
    native public static void mkdir(Buffer path);
    native public static void mkdir(Buffer path, double mode);
    native public static void mkdir(Buffer path, String mode);
    native public static void mkdirSync(Buffer path);
    native public static void readdir(Buffer path);
    native public static double openSync(Buffer path, double flags);
    native public static double openSync(String path, double flags);
    native public static double openSync(Buffer path, String flags);
    native public static void utimes(Buffer path, double atime, double mtime);
    native public static void utimes(Buffer path, Date atime, Date mtime);
    native public static void exists(Buffer path);
    /** Synchronous version of fs.access. This throws if any accessibility checks fail, and does nothing otherwise. */
    native public static void accessSync(Buffer path);
    native public static ReadStream createReadStream(Buffer path);
    native public static WriteStream createWriteStream(Buffer path);
    native public static void truncate(Buffer path, java.lang.Runnable callback);
    native public static void truncate(Buffer path, double len, java.lang.Runnable callback);
    native public static void chown(Buffer path, double uid, double gid, java.lang.Runnable callback);
    native public static void lchown(Buffer path, double uid, double gid, java.lang.Runnable callback);
    native public static void chmod(Buffer path, double mode, java.lang.Runnable callback);
    native public static void chmod(Buffer path, String mode, java.lang.Runnable callback);
    native public static void lchmod(Buffer path, double mode, java.lang.Runnable callback);
    native public static void lchmod(Buffer path, String mode, java.lang.Runnable callback);
    native public static void link(Buffer srcpath, String dstpath, java.lang.Runnable callback);
    native public static void link(String srcpath, Buffer dstpath, java.lang.Runnable callback);
    native public static void link(Buffer srcpath, Buffer dstpath, java.lang.Runnable callback);
    native public static void symlink(String srcpath, Buffer dstpath, String type, java.lang.Runnable callback);
    native public static void symlink(Buffer srcpath, String dstpath, String type, java.lang.Runnable callback);
    native public static void symlink(Buffer srcpath, Buffer dstpath, String type, java.lang.Runnable callback);
    native public static void unlink(Buffer path, java.lang.Runnable callback);
    native public static void rmdir(Buffer path, java.lang.Runnable callback);
    native public static void mkdir(Buffer path, java.lang.Runnable callback);
    native public static void mkdir(Buffer path, double mode, java.lang.Runnable callback);
    native public static void mkdir(Buffer path, String mode, java.lang.Runnable callback);
    native public static void utimes(Buffer path, double atime, double mtime, java.lang.Runnable callback);
    native public static void utimes(Buffer path, Date atime, Date mtime, java.lang.Runnable callback);
}

