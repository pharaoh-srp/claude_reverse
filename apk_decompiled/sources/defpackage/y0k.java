package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y0k implements Runnable {
    public final l4k E;
    public final x3k F;

    public y0k(l4k l4kVar, x3k x3kVar) {
        this.E = l4kVar;
        this.F = x3kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.E.E != this) {
            return;
        }
        x3k x3kVar = this.F;
        if (j1k.K.l(this.E, this, l4k.h(x3kVar))) {
            l4k.j(this.E);
        }
    }
}
