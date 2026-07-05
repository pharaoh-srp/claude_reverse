package okio;

import defpackage.a54;
import defpackage.jce;
import defpackage.mdj;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ForwardingFileSystem;", "Lokio/FileSystem;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public abstract class ForwardingFileSystem extends FileSystem {
    public final FileSystem G;

    public ForwardingFileSystem(FileSystem fileSystem) {
        fileSystem.getClass();
        this.G = fileSystem;
    }

    @Override // okio.FileSystem
    public final List H(Path path) {
        path.getClass();
        List<Path> listH = this.G.H(path);
        if (listH == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Path path2 : listH) {
            path2.getClass();
            arrayList.add(path2);
        }
        a54.r0(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public final FileMetadata P(Path path) {
        path.getClass();
        FileMetadata fileMetadataP = this.G.P(path);
        if (fileMetadataP == null) {
            return null;
        }
        Path path2 = fileMetadataP.c;
        if (path2 == null) {
            return fileMetadataP;
        }
        boolean z = fileMetadataP.a;
        boolean z2 = fileMetadataP.b;
        Long l = fileMetadataP.d;
        Long l2 = fileMetadataP.e;
        Long l3 = fileMetadataP.f;
        Long l4 = fileMetadataP.g;
        Map map = fileMetadataP.h;
        map.getClass();
        return new FileMetadata(z, z2, path2, l, l2, l3, l4, map);
    }

    @Override // okio.FileSystem
    public final FileHandle R(Path path) {
        path.getClass();
        return this.G.R(path);
    }

    @Override // okio.FileSystem
    public Sink S(Path path, boolean z) {
        path.getClass();
        return this.G.S(path, z);
    }

    @Override // okio.FileSystem
    public final Source T(Path path) {
        path.getClass();
        return this.G.T(path);
    }

    @Override // okio.FileSystem
    public final Sink c(Path path) {
        path.getClass();
        return this.G.c(path);
    }

    @Override // okio.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.G.close();
    }

    @Override // okio.FileSystem
    public final void d(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        this.G.d(path, path2);
    }

    @Override // okio.FileSystem
    public final void f(Path path) {
        path.getClass();
        this.G.f(path);
    }

    @Override // okio.FileSystem
    public final void j(Path path, boolean z) {
        path.getClass();
        this.G.j(path, z);
    }

    public final String toString() {
        return jce.a.b(getClass()).f() + '(' + this.G + ')';
    }

    @Override // okio.FileSystem
    public final List x(Path path) {
        List<Path> listX = this.G.x(path);
        ArrayList arrayList = new ArrayList();
        for (Path path2 : listX) {
            path2.getClass();
            arrayList.add(path2);
        }
        a54.r0(arrayList);
        return arrayList;
    }
}
