package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class a84 implements Iterator {
    public int E;
    public int F;
    public int G;
    public final /* synthetic */ d84 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ d84 J;

    public a84(d84 d84Var, int i) {
        this.I = i;
        this.J = d84Var;
        this.H = d84Var;
        this.E = d84Var.I;
        this.F = d84Var.isEmpty() ? -1 : 0;
        this.G = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.F >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c84Var;
        d84 d84Var = this.H;
        if (d84Var.I != this.E) {
            sz6.c();
            return null;
        }
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        int i = this.F;
        this.G = i;
        int i2 = this.I;
        d84 d84Var2 = this.J;
        switch (i2) {
            case 0:
                c84Var = d84Var2.j()[i];
                break;
            case 1:
                c84Var = new c84(d84Var2, i);
                break;
            default:
                c84Var = d84Var2.k()[i];
                break;
        }
        int i3 = this.F + 1;
        if (i3 >= d84Var.J) {
            i3 = -1;
        }
        this.F = i3;
        return c84Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        d84 d84Var = this.H;
        if (d84Var.I != this.E) {
            sz6.c();
            return;
        }
        fd9.L("no calls to next() since the last call to remove()", this.G >= 0);
        this.E += 32;
        d84Var.remove(d84Var.j()[this.G]);
        this.F--;
        this.G = -1;
    }
}
