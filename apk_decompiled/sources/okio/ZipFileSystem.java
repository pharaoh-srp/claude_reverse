package okio;

import defpackage.grc;
import defpackage.j;
import defpackage.mdj;
import defpackage.mwa;
import defpackage.pm7;
import defpackage.sjj;
import defpackage.ujj;
import defpackage.w44;
import defpackage.xh6;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.Metadata;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/ZipFileSystem;", "Lokio/FileSystem;", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class ZipFileSystem extends FileSystem {
    public static final Path J;
    public final Path G;
    public final FileSystem H;
    public final LinkedHashMap I;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ZipFileSystem$Companion;", "", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
    }

    static {
        String str = Path.F;
        J = Path.Companion.a("/");
    }

    public ZipFileSystem(Path path, FileSystem fileSystem, LinkedHashMap linkedHashMap) {
        fileSystem.getClass();
        this.G = path;
        this.H = fileSystem;
        this.I = linkedHashMap;
    }

    @Override // okio.FileSystem
    public final List H(Path path) {
        path.getClass();
        return b0(path, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    @Override // okio.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okio.FileMetadata P(okio.Path r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ZipFileSystem.P(okio.Path):okio.FileMetadata");
    }

    @Override // okio.FileSystem
    public final FileHandle R(Path path) {
        path.getClass();
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.FileSystem
    public final Sink S(Path path, boolean z) throws IOException {
        path.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final Source T(Path path) throws Throwable {
        RealBufferedSource realBufferedSource;
        Throwable th;
        path.getClass();
        Path path2 = J;
        path2.getClass();
        sjj sjjVar = (sjj) this.I.get(j.b(path2, path, true));
        if (sjjVar == null) {
            throw new FileNotFoundException(grc.v("no such file: ", path));
        }
        long j = sjjVar.f;
        FileHandle fileHandleR = this.H.R(this.G);
        try {
            realBufferedSource = new RealBufferedSource(fileHandleR.f(sjjVar.h));
            try {
                fileHandleR.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (fileHandleR != null) {
                try {
                    fileHandleR.close();
                } catch (Throwable th4) {
                    mwa.p(th3, th4);
                }
            }
            realBufferedSource = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        realBufferedSource.getClass();
        ujj.f(realBufferedSource, null);
        if (sjjVar.g == 0) {
            return new pm7(realBufferedSource, j, true);
        }
        return new pm7(new InflaterSource(new RealBufferedSource(new pm7(realBufferedSource, sjjVar.e, true)), new Inflater(true)), j, false);
    }

    public final List b0(Path path, boolean z) throws IOException {
        Path path2 = J;
        path2.getClass();
        path.getClass();
        sjj sjjVar = (sjj) this.I.get(j.b(path2, path, true));
        if (sjjVar != null) {
            return w44.p1(sjjVar.q);
        }
        if (!z) {
            return null;
        }
        xh6.c(grc.v("not a directory: ", path));
        return null;
    }

    @Override // okio.FileSystem
    public final Sink c(Path path) throws IOException {
        path.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void d(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void f(Path path) throws IOException {
        path.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void j(Path path, boolean z) throws IOException {
        path.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final List x(Path path) throws IOException {
        List listB0 = b0(path, true);
        listB0.getClass();
        return listB0;
    }
}
