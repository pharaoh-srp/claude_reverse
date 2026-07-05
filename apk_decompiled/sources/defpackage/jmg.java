package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jmg implements img {
    public final t11 E = new t11(0);

    public final boolean d(int i) {
        return (this.E.get() & i) != 0;
    }

    public final void f(int i) {
        t11 t11Var;
        int i2;
        do {
            t11Var = this.E;
            i2 = t11Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!t11Var.compareAndSet(i2, i2 | i));
    }
}
