package defpackage;

import okio.ForwardingFileSystem;
import okio.Path;
import okio.Sink;

/* JADX INFO: loaded from: classes2.dex */
public final class s66 extends ForwardingFileSystem {
    @Override // okio.ForwardingFileSystem, okio.FileSystem
    public final Sink S(Path path, boolean z) {
        Path pathC = path.c();
        if (pathC != null) {
            e(pathC);
        }
        return this.G.S(path, z);
    }
}
