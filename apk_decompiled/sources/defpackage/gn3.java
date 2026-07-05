package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gn3 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    public /* synthetic */ gn3(int i, iqb iqbVar, boolean z) {
        this.F = z;
        this.H = iqbVar;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        Object obj3 = this.H;
        boolean z = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                jlk.h(iP0, (ld4) obj, (iqb) obj3, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                idi.c((List) obj3, z, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                gwk.a(z, (ta4) obj3, (ld4) obj, x44.p0(49), i2);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ gn3(List list, boolean z, int i) {
        this.H = list;
        this.F = z;
        this.G = i;
    }

    public /* synthetic */ gn3(boolean z, ta4 ta4Var, int i, int i2) {
        this.F = z;
        this.H = ta4Var;
        this.G = i2;
    }
}
