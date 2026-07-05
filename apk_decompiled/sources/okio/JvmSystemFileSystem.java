package okio;

import defpackage.a54;
import defpackage.grc;
import defpackage.mdj;
import defpackage.xh6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/JvmSystemFileSystem;", "Lokio/FileSystem;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public class JvmSystemFileSystem extends FileSystem {
    public static ArrayList b0(Path path, boolean z) throws IOException {
        File file = path.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z) {
                return null;
            }
            if (!file.exists()) {
                throw new FileNotFoundException(grc.v("no such file: ", path));
            }
            xh6.c(grc.v("failed to list ", path));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(path.e(str));
        }
        a54.r0(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public List H(Path path) {
        path.getClass();
        return b0(path, false);
    }

    @Override // okio.FileSystem
    public FileMetadata P(Path path) {
        path.getClass();
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new FileMetadata(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // okio.FileSystem
    public FileHandle R(Path path) {
        path.getClass();
        return new JvmFileHandle(new RandomAccessFile(path.toFile(), "r"));
    }

    @Override // okio.FileSystem
    public Sink S(Path path, boolean z) throws IOException {
        path.getClass();
        if (!z || !n(path)) {
            return Okio.e(new FileOutputStream(path.toFile(), false));
        }
        throw new IOException(path + " already exists.");
    }

    @Override // okio.FileSystem
    public Source T(Path path) {
        path.getClass();
        return Okio.f(path.toFile());
    }

    @Override // okio.FileSystem
    public Sink c(Path path) {
        path.getClass();
        return Okio.e(new FileOutputStream(path.toFile(), true));
    }

    @Override // okio.FileSystem
    public void d(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        if (path.toFile().renameTo(path2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + path + " to " + path2);
    }

    @Override // okio.FileSystem
    public void f(Path path) throws IOException {
        path.getClass();
        if (path.toFile().mkdir()) {
            return;
        }
        FileMetadata fileMetadataP = P(path);
        if (fileMetadataP == null || !fileMetadataP.b) {
            xh6.c(grc.v("failed to create directory: ", path));
        }
    }

    @Override // okio.FileSystem
    public void j(Path path, boolean z) throws IOException {
        path.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            xh6.c(grc.v("failed to delete ", path));
        } else if (z) {
            throw new FileNotFoundException(grc.v("no such file: ", path));
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // okio.FileSystem
    public List x(Path path) throws IOException {
        ArrayList arrayListB0 = b0(path, true);
        arrayListB0.getClass();
        return arrayListB0;
    }
}
