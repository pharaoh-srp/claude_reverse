package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dq3 implements AutoCloseable, l45 {
    public final c45 E;

    public dq3(c45 c45Var) {
        c45Var.getClass();
        this.E = c45Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        knk.o(this.E, null);
    }

    @Override // defpackage.l45
    public final c45 getCoroutineContext() {
        return this.E;
    }
}
