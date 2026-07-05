package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o21 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ float F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ o21(String str, pz7 pz7Var, mnc mncVar, float f) {
        this.G = str;
        this.H = pz7Var;
        this.I = mncVar;
        this.F = f;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                String str = (String) obj5;
                pz7 pz7Var = (pz7) obj4;
                mnc mncVar = (mnc) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    float f = this.F;
                    pqi.d(str, pz7Var, null, mncVar, mpk.d(f, f), null, 0, e18Var, 0, 100);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ckk.e((List) obj5, this.F, (v5b) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ o21(List list, float f, v5b v5bVar, iqb iqbVar, int i) {
        this.G = list;
        this.F = f;
        this.H = v5bVar;
        this.I = iqbVar;
    }
}
