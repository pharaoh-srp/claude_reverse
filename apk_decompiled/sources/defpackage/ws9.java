package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface ws9 extends Closeable, l4a, njc {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @fec(y3a.ON_DESTROY)
    void close();
}
