package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class sy7 implements czg {
    public final SQLiteProgram E;

    public sy7(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.E = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E.close();
    }

    @Override // defpackage.czg
    public final void k0(double d, int i) {
        this.E.bindDouble(i, d);
    }

    @Override // defpackage.czg
    public final void o(int i, long j) {
        this.E.bindLong(i, j);
    }

    @Override // defpackage.czg
    public final void p(byte[] bArr, int i) {
        this.E.bindBlob(i, bArr);
    }

    @Override // defpackage.czg
    public final void q(int i) {
        this.E.bindNull(i);
    }

    @Override // defpackage.czg
    public final void r() {
        this.E.clearBindings();
    }

    @Override // defpackage.czg
    public final void u(int i, String str) {
        str.getClass();
        this.E.bindString(i, str);
    }
}
