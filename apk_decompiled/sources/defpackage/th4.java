package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class th4 implements tze {
    public final tze E;

    public th4(tze tzeVar) {
        this.E = tzeVar;
    }

    @Override // defpackage.tze
    public final boolean H0() {
        return this.E.H0();
    }

    @Override // defpackage.tze
    public final void N(int i, String str) {
        str.getClass();
        this.E.N(i, str);
    }

    @Override // defpackage.tze
    public final boolean Q() {
        return this.E.Q();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        tze tzeVar = this.E;
        tzeVar.reset();
        tzeVar.r();
    }

    @Override // defpackage.tze
    public final String g0(int i) {
        return this.E.g0(i);
    }

    @Override // defpackage.tze
    public final byte[] getBlob(int i) {
        return this.E.getBlob(i);
    }

    @Override // defpackage.tze
    public final int getColumnCount() {
        return this.E.getColumnCount();
    }

    @Override // defpackage.tze
    public final String getColumnName(int i) {
        return this.E.getColumnName(i);
    }

    @Override // defpackage.tze
    public final long getLong(int i) {
        return this.E.getLong(i);
    }

    @Override // defpackage.tze
    public final boolean isNull(int i) {
        return this.E.isNull(i);
    }

    @Override // defpackage.tze
    public final void o(int i, long j) {
        this.E.o(i, j);
    }

    @Override // defpackage.tze
    public final void p(byte[] bArr, int i) {
        this.E.p(bArr, i);
    }

    @Override // defpackage.tze
    public final void q(int i) {
        this.E.q(i);
    }

    @Override // defpackage.tze
    public final void r() {
        this.E.r();
    }

    @Override // defpackage.tze
    public final void reset() {
        this.E.reset();
    }
}
