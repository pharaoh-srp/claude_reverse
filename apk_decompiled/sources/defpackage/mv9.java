package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class mv9 implements dvg {
    public final yub a;
    public final /* synthetic */ nv9 b;
    public final /* synthetic */ Object c;

    public mv9(nv9 nv9Var, Object obj) {
        this.b = nv9Var;
        this.c = obj;
        int[] iArr = f79.a;
        this.a = new yub();
    }

    @Override // defpackage.dvg
    public final void a() {
        nv9.a(this.b, this.c);
    }

    @Override // defpackage.dvg
    public final long b(int i) {
        av9 av9Var = (av9) this.b.N.g(this.c);
        if (av9Var == null || !av9Var.X()) {
            return 0L;
        }
        int i2 = ((vwb) av9Var.q()).E.G;
        if (i < 0 || i >= i2) {
            b39.e("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!this.a.c(i)) {
            return 0L;
        }
        int iJ = ((av9) ((vwb) av9Var.q()).get(i)).J();
        return (((long) ((av9) ((vwb) av9Var.q()).get(i)).s()) & 4294967295L) | (((long) iJ) << 32);
    }

    @Override // defpackage.dvg
    public final void c(d6d d6dVar) {
        g5c g5cVar;
        av9 av9Var = (av9) this.b.N.g(this.c);
        hqb hqbVar = (av9Var == null || (g5cVar = av9Var.k0) == null) ? null : (hqb) g5cVar.K;
        if (hqbVar == null || !hqbVar.R) {
            return;
        }
        j8.o0(hqbVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", d6dVar);
    }

    @Override // defpackage.dvg
    public final int d() {
        av9 av9Var = (av9) this.b.N.g(this.c);
        if (av9Var != null) {
            return ((vwb) av9Var.q()).E.G;
        }
        return 0;
    }

    @Override // defpackage.dvg
    public final void e(int i, long j) {
        nv9 nv9Var = this.b;
        av9 av9Var = (av9) nv9Var.N.g(this.c);
        if (av9Var == null || !av9Var.X()) {
            return;
        }
        int i2 = ((vwb) av9Var.q()).E.G;
        if (i < 0 || i >= i2) {
            b39.e("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (av9Var.Y()) {
            b39.a("Pre-measure called on node that is not placed");
        }
        av9 av9Var2 = nv9Var.E;
        av9Var2.V = true;
        ((AndroidComposeView) dv9.a(av9Var)).v((av9) ((vwb) av9Var.q()).get(i), j);
        av9Var2.V = false;
        this.a.a(i);
    }
}
