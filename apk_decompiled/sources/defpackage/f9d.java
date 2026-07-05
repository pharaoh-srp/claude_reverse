package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f9d implements tze {
    public final tze E;
    public final long F;
    public final /* synthetic */ l9d G;

    public f9d(l9d l9dVar, tze tzeVar) {
        tzeVar.getClass();
        this.G = l9dVar;
        this.E = tzeVar;
        this.F = nai.w();
    }

    @Override // defpackage.tze
    public final boolean H0() {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            return this.E.H0();
        }
        u00.N(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.tze
    public final void N(int i, String str) {
        str.getClass();
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            this.E.N(i, str);
        } else {
            u00.N(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            this.E.close();
        } else {
            u00.N(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.tze
    public final String g0(int i) {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            return this.E.g0(i);
        }
        u00.N(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.tze
    public final byte[] getBlob(int i) {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            return this.E.getBlob(i);
        }
        u00.N(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.tze
    public final int getColumnCount() {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            return this.E.getColumnCount();
        }
        u00.N(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.tze
    public final String getColumnName(int i) {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            return this.E.getColumnName(i);
        }
        u00.N(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.tze
    public final long getLong(int i) {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            return this.E.getLong(i);
        }
        u00.N(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.tze
    public final boolean isNull(int i) {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            return this.E.isNull(i);
        }
        u00.N(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.tze
    public final void o(int i, long j) {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            this.E.o(i, j);
        } else {
            u00.N(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.tze
    public final void p(byte[] bArr, int i) {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            this.E.p(bArr, i);
        } else {
            u00.N(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.tze
    public final void q(int i) {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            this.E.q(i);
        } else {
            u00.N(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.tze
    public final void r() {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            this.E.r();
        } else {
            u00.N(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.tze
    public final void reset() {
        if (this.G.e) {
            u00.N(21, "Statement is recycled");
            throw null;
        }
        if (this.F == nai.w()) {
            this.E.reset();
        } else {
            u00.N(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
