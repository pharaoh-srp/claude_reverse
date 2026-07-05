package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class j4e implements Closeable {
    public final r66 E;

    public j4e(r66 r66Var) {
        this.E = r66Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E.close();
    }
}
