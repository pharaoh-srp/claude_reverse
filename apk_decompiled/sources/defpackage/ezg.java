package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ezg extends hzg {
    public final gzg H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezg(oy7 oy7Var, String str, gzg gzgVar) {
        super(oy7Var, str);
        oy7Var.getClass();
        str.getClass();
        this.H = gzgVar;
    }

    @Override // defpackage.tze
    public final boolean H0() {
        gzg gzgVar = this.H;
        boolean zH0 = gzgVar.H0();
        boolean zEqualsIgnoreCase = gzgVar.g0(0).equalsIgnoreCase("wal");
        oy7 oy7Var = this.E;
        if (zEqualsIgnoreCase) {
            oy7Var.E.enableWriteAheadLogging();
            return zH0;
        }
        oy7Var.E.disableWriteAheadLogging();
        return zH0;
    }

    @Override // defpackage.tze
    public final void N(int i, String str) {
        str.getClass();
        this.H.N(i, str);
    }

    @Override // defpackage.tze
    public final boolean Q() {
        return this.H.Q();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.H.close();
    }

    @Override // defpackage.tze
    public final String g0(int i) {
        return this.H.g0(i);
    }

    @Override // defpackage.tze
    public final byte[] getBlob(int i) {
        return this.H.getBlob(i);
    }

    @Override // defpackage.tze
    public final int getColumnCount() {
        return this.H.getColumnCount();
    }

    @Override // defpackage.tze
    public final String getColumnName(int i) {
        return this.H.getColumnName(i);
    }

    @Override // defpackage.tze
    public final long getLong(int i) {
        return this.H.getLong(i);
    }

    @Override // defpackage.tze
    public final boolean isNull(int i) {
        return this.H.isNull(i);
    }

    @Override // defpackage.tze
    public final void o(int i, long j) {
        this.H.o(i, j);
    }

    @Override // defpackage.tze
    public final void p(byte[] bArr, int i) {
        this.H.p(bArr, i);
    }

    @Override // defpackage.tze
    public final void q(int i) {
        this.H.q(i);
    }

    @Override // defpackage.hzg, defpackage.tze
    public final void r() {
        this.H.r();
    }

    @Override // defpackage.hzg, defpackage.tze
    public final void reset() {
        this.H.reset();
    }
}
