package defpackage;

import androidx.sqlite.driver.bundled.BundledSQLiteStatementKt;

/* JADX INFO: loaded from: classes.dex */
public final class l02 implements tze {
    public final long E;
    public volatile boolean F;

    public l02(long j) {
        this.E = j;
    }

    @Override // defpackage.tze
    public final boolean H0() {
        c();
        return BundledSQLiteStatementKt.nativeStep(this.E);
    }

    @Override // defpackage.tze
    public final void N(int i, String str) {
        str.getClass();
        c();
        BundledSQLiteStatementKt.nativeBindText(this.E, i, str);
    }

    public final void c() {
        if (this.F) {
            u00.N(21, "statement is closed");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.F) {
            BundledSQLiteStatementKt.nativeClose(this.E);
        }
        this.F = true;
    }

    @Override // defpackage.tze
    public final String g0(int i) {
        c();
        return BundledSQLiteStatementKt.nativeGetText(this.E, i);
    }

    @Override // defpackage.tze
    public final byte[] getBlob(int i) {
        c();
        return BundledSQLiteStatementKt.nativeGetBlob(this.E, i);
    }

    @Override // defpackage.tze
    public final int getColumnCount() {
        c();
        return BundledSQLiteStatementKt.nativeGetColumnCount(this.E);
    }

    @Override // defpackage.tze
    public final String getColumnName(int i) {
        c();
        return BundledSQLiteStatementKt.nativeGetColumnName(this.E, i);
    }

    @Override // defpackage.tze
    public final long getLong(int i) {
        c();
        return BundledSQLiteStatementKt.nativeGetLong(this.E, i);
    }

    @Override // defpackage.tze
    public final boolean isNull(int i) {
        c();
        return BundledSQLiteStatementKt.nativeGetColumnType(this.E, i) == 5;
    }

    @Override // defpackage.tze
    public final void o(int i, long j) {
        c();
        BundledSQLiteStatementKt.nativeBindLong(this.E, i, j);
    }

    @Override // defpackage.tze
    public final void p(byte[] bArr, int i) {
        c();
        BundledSQLiteStatementKt.nativeBindBlob(this.E, i, bArr);
    }

    @Override // defpackage.tze
    public final void q(int i) {
        c();
        BundledSQLiteStatementKt.nativeBindNull(this.E, i);
    }

    @Override // defpackage.tze
    public final void r() {
        c();
        BundledSQLiteStatementKt.nativeClearBindings(this.E);
    }

    @Override // defpackage.tze
    public final void reset() {
        c();
        BundledSQLiteStatementKt.nativeReset(this.E);
    }
}
