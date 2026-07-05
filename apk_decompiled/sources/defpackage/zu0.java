package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zu0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ List G;
    public final /* synthetic */ bz7 H;

    public /* synthetic */ zu0(List list, List list2, bz7 bz7Var, int i, int i2) {
        this.E = i2;
        this.F = list;
        this.G = list2;
        this.H = bz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.H;
        List list = this.G;
        List list2 = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                euk.k(list2, list, bz7Var, ld4Var, x44.p0(1));
                break;
            default:
                euk.f(list2, list, bz7Var, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }
}
