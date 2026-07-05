package defpackage;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfpa;", "Lnqb;", "Lhpa;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class fpa extends nqb {
    public final bz7 E;
    public final bz7 F;
    public final d5d G;

    public fpa(bz7 bz7Var, bz7 bz7Var2, d5d d5dVar) {
        this.E = bz7Var;
        this.F = bz7Var2;
        this.G = d5dVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new hpa(this.E, this.F, this.G);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.G.hashCode() + qy1.e(this.F, fsh.p(vb7.b(Float.NaN, vb7.b(Float.NaN, vb7.e(fsh.p(vb7.b(Float.NaN, this.E.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true), 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        hpa hpaVar = (hpa) hqbVar;
        float f = hpaVar.U;
        long j = hpaVar.W;
        float f2 = hpaVar.X;
        boolean z = hpaVar.V;
        float f3 = hpaVar.Y;
        boolean z2 = hpaVar.Z;
        d5d d5dVar = hpaVar.a0;
        View view = hpaVar.b0;
        cz5 cz5Var = hpaVar.c0;
        hpaVar.S = this.E;
        hpaVar.U = Float.NaN;
        hpaVar.V = true;
        hpaVar.W = 9205357640488583168L;
        hpaVar.X = Float.NaN;
        hpaVar.Y = Float.NaN;
        hpaVar.Z = true;
        hpaVar.T = this.F;
        d5d d5dVar2 = this.G;
        hpaVar.a0 = d5dVar2;
        View viewQ = eve.Q(hpaVar);
        cz5 cz5Var2 = yfd.W(hpaVar).d0;
        if (hpaVar.d0 != null) {
            dkf dkfVar = ipa.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !d5dVar2.a()) || !za6.b(9205357640488583168L, j) || !va6.b(Float.NaN, f2) || !va6.b(Float.NaN, f3) || true != z || true != z2 || !d5dVar2.equals(d5dVar) || !viewQ.equals(view) || !x44.r(cz5Var2, cz5Var)) {
                hpaVar.q1();
            }
        }
        hpaVar.r1();
    }
}
