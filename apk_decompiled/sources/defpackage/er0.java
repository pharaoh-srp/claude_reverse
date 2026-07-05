package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class er0 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ qz7 L;
    public final /* synthetic */ Object M;

    public /* synthetic */ er0(pmd pmdVar, t4g t4gVar, boolean z, boolean z2, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, int i) {
        this.J = pmdVar;
        this.K = t4gVar;
        this.F = z;
        this.G = z2;
        this.H = zy7Var;
        this.L = zy7Var2;
        this.I = zy7Var3;
        this.M = zy7Var4;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.M;
        Object obj4 = this.I;
        qz7 qz7Var = this.L;
        Object obj5 = this.K;
        Object obj6 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(391);
                gtk.a((ArrayList) obj6, (bz7) obj5, (bz7) qz7Var, this.F, this.G, (iqb) obj4, (yzb) obj3, this.H, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(24577);
                mqk.b((String) obj6, (jz0) obj5, this.F, this.G, this.H, (zy7) qz7Var, (zy7) obj3, (iqb) obj4, (ld4) obj, iP02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(1);
                yhk.e((pmd) obj6, (t4g) obj5, this.F, this.G, this.H, (zy7) qz7Var, (zy7) obj4, (zy7) obj3, (ld4) obj, iP03);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ er0(String str, jz0 jz0Var, boolean z, boolean z2, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, int i) {
        this.J = str;
        this.K = jz0Var;
        this.F = z;
        this.G = z2;
        this.H = zy7Var;
        this.L = zy7Var2;
        this.M = zy7Var3;
        this.I = iqbVar;
    }

    public /* synthetic */ er0(ArrayList arrayList, bz7 bz7Var, bz7 bz7Var2, boolean z, boolean z2, iqb iqbVar, yzb yzbVar, zy7 zy7Var, int i) {
        this.J = arrayList;
        this.K = bz7Var;
        this.L = bz7Var2;
        this.F = z;
        this.G = z2;
        this.I = iqbVar;
        this.M = yzbVar;
        this.H = zy7Var;
    }
}
