package defpackage;

import com.anthropic.claude.app.n0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ik3 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ iqb G;

    public /* synthetic */ ik3(zy7 zy7Var, iqb iqbVar) {
        this.F = zy7Var;
        this.G = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.G;
        zy7 zy7Var = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                n0.a(zy7Var, iqbVar, ld4Var, x44.p0(1));
                break;
            default:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    n0.a(zy7Var, iqbVar, e18Var, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ik3(zy7 zy7Var, iqb iqbVar, int i) {
        this.F = zy7Var;
        this.G = iqbVar;
    }
}
