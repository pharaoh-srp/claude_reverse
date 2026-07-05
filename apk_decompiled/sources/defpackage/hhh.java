package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class hhh extends fhh implements oe4 {
    public i5i U;
    public sih V;
    public akh W;
    public boolean X;
    public final lsc Y;
    public final a80 Z;
    public final hpa a0;
    public fkg b0;

    public hhh(i5i i5iVar, sih sihVar, akh akhVar, boolean z) {
        this.U = i5iVar;
        this.V = sihVar;
        this.W = akhVar;
        this.X = z;
        lsc lscVarP = mpk.P(new g79(0L));
        this.Y = lscVarP;
        this.Z = new a80(new fcc(wd6.V(this.U, this.V, this.W, ((g79) lscVarP.getValue()).a)), kif.b, new fcc(kif.c), 8);
        final int i = 0;
        bz7 bz7Var = new bz7(this) { // from class: ghh
            public final /* synthetic */ hhh F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i2 = i;
                hhh hhhVar = this.F;
                switch (i2) {
                    case 0:
                        return (fcc) hhhVar.Z.e();
                    default:
                        za6 za6Var = (za6) obj;
                        cz5 cz5Var = (cz5) yb5.o(hhhVar, ve4.h);
                        hhhVar.Y.setValue(new g79((((long) cz5Var.M0(za6.d(za6Var.a))) << 32) | (((long) cz5Var.M0(za6.c(za6Var.a))) & 4294967295L)));
                        return iei.a;
                }
            }
        };
        final int i2 = 1;
        bz7 bz7Var2 = new bz7(this) { // from class: ghh
            public final /* synthetic */ hhh F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i22 = i2;
                hhh hhhVar = this.F;
                switch (i22) {
                    case 0:
                        return (fcc) hhhVar.Z.e();
                    default:
                        za6 za6Var = (za6) obj;
                        cz5 cz5Var = (cz5) yb5.o(hhhVar, ve4.h);
                        hhhVar.Y.setValue(new g79((((long) cz5Var.M0(za6.d(za6Var.a))) << 32) | (((long) cz5Var.M0(za6.c(za6Var.a))) & 4294967295L)));
                        return iei.a;
                }
            }
        };
        if (!ipa.a()) {
            pmf.n("Magnifier is only supported on API level 28 and higher.");
            throw null;
        }
        hpa hpaVar = new hpa(bz7Var, bz7Var2, Build.VERSION.SDK_INT == 28 ? f5d.a : h5d.a);
        p1(hpaVar);
        this.a0 = hpaVar;
    }

    @Override // defpackage.fhh, defpackage.vd6
    public final void I0(cv9 cv9Var) {
        cv9Var.a();
        this.a0.I0(cv9Var);
    }

    @Override // defpackage.fhh, defpackage.ujf
    public final void X0(ekf ekfVar) {
        this.a0.X0(ekfVar);
    }

    @Override // defpackage.hqb
    public final void h1() {
        t1();
    }

    @Override // defpackage.fhh
    public final void o0(m5c m5cVar) {
        this.a0.o0(m5cVar);
    }

    @Override // defpackage.fhh
    public final void s1(i5i i5iVar, sih sihVar, akh akhVar, boolean z) {
        i5i i5iVar2 = this.U;
        sih sihVar2 = this.V;
        akh akhVar2 = this.W;
        boolean z2 = this.X;
        this.U = i5iVar;
        this.V = sihVar;
        this.W = akhVar;
        this.X = z;
        if (x44.r(i5iVar, i5iVar2) && x44.r(sihVar, sihVar2) && x44.r(akhVar, akhVar2) && z == z2) {
            return;
        }
        t1();
    }

    public final void t1() {
        fkg fkgVar = this.b0;
        tp4 tp4Var = null;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.b0 = null;
        if (ipa.a()) {
            this.b0 = gb9.D(d1(), null, null, new rrb(this, tp4Var, 15), 3);
        }
    }
}
