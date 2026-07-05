package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements Runnable {
    public final i4 E;
    public final saa F;

    public m1(i4 i4Var, exf exfVar) {
        this.E = i4Var;
        this.F = exfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.E.E != this) {
            return;
        }
        if (w1.J.c(this.E, this, w1.i(this.F))) {
            w1.f(this.E, false);
        }
    }
}
