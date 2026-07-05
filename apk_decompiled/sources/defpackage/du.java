package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class du implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ List F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ float I;

    public /* synthetic */ du(List list, bz7 bz7Var, zy7 zy7Var, float f) {
        this.F = list;
        this.G = bz7Var;
        this.H = zy7Var;
        this.I = f;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                zok.a(this.F, this.G, this.H, fqb.E, this.I, (ld4) obj, iP0);
                break;
            default:
                j0a j0aVar = (j0a) obj;
                mnc mncVar = (mnc) obj2;
                j0aVar.getClass();
                mncVar.getClass();
                q6 q6Var = new q6(24);
                q6 q6Var2 = new q6(25);
                List list = this.F;
                j0aVar.W(list.size(), new kp(q6Var, 3, list), new kp(q6Var2, 4, list), new ta4(802480018, true, new fu(list, this.G, this.H, mncVar, this.I)));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ du(List list, bz7 bz7Var, zy7 zy7Var, float f, int i) {
        this.F = list;
        this.G = bz7Var;
        this.H = zy7Var;
        this.I = f;
    }
}
