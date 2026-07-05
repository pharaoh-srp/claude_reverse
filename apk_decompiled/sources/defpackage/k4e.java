package defpackage;

import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class k4e implements m66 {
    public final FileSystem a;
    public final u66 b;

    public k4e(long j, FileSystem fileSystem, Path path) {
        this.a = fileSystem;
        this.b = new u66(j, fileSystem, path);
    }
}
