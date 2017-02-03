package def.node.fs;
import def.js.Date;
@jsweet.lang.Interface
public abstract class Stats extends def.js.Object {
    native public Boolean isFile();
    native public Boolean isDirectory();
    native public Boolean isBlockDevice();
    native public Boolean isCharacterDevice();
    native public Boolean isSymbolicLink();
    native public Boolean isFIFO();
    native public Boolean isSocket();
    public double dev;
    public double ino;
    public double mode;
    public double nlink;
    public double uid;
    public double gid;
    public double rdev;
    public double size;
    public double blksize;
    public double blocks;
    public Date atime;
    public Date mtime;
    public Date ctime;
    public Date birthtime;
}

