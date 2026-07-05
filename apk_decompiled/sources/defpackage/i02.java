package defpackage;

import androidx.sqlite.driver.bundled.BundledSQLiteConnectionKt;

/* JADX INFO: loaded from: classes.dex */
public final class i02 implements lze {
    public final long E;
    public volatile boolean F;

    public i02(long j) {
        this.E = j;
    }

    @Override // defpackage.lze
    public final tze L0(String str) {
        str.getClass();
        if (!this.F) {
            return new l02(BundledSQLiteConnectionKt.nativePrepare(this.E, str));
        }
        u00.N(21, "connection is closed");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.F) {
            BundledSQLiteConnectionKt.nativeClose(this.E);
        }
        this.F = true;
    }

    @Override // defpackage.lze
    public final boolean s0() {
        if (!this.F) {
            return BundledSQLiteConnectionKt.nativeInTransaction(this.E);
        }
        u00.N(21, "connection is closed");
        throw null;
    }
}
