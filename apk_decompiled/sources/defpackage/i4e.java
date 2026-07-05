package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i4e implements AutoCloseable {
    public final q66 E;

    public i4e(q66 q66Var) {
        this.E = q66Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.E.close();
    }
}
