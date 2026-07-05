package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hb1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;

    public /* synthetic */ hb1(eb1 eb1Var, boolean z, int i) {
        this.E = i;
        this.G = eb1Var;
        this.F = z;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        boolean z = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                nc4 nc4Var = (nc4) obj2;
                ((db1) nc4Var.a).f(z);
                ((cb1) nc4Var.b).f(z);
                return new jb1((v4a) obj, nc4Var, 0);
            case 1:
                nwb nwbVar = (nwb) obj2;
                ((r4a) obj).getClass();
                if (z) {
                    ((zy7) nwbVar.getValue()).a();
                }
                return new h83(2);
            case 2:
                List list = (List) obj2;
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                if (z) {
                    ckf.t(ekfVar, true);
                }
                ckf.n(ekfVar, list);
                return iei.a;
            default:
                vc4 vc4Var = (vc4) obj2;
                vc4Var.l(z);
                return new jb1((v4a) obj, vc4Var, 1);
        }
    }

    public /* synthetic */ hb1(boolean z, Object obj, int i) {
        this.E = i;
        this.F = z;
        this.G = obj;
    }
}
