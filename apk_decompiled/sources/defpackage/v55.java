package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v55 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ ud0 F;
    public final /* synthetic */ String G;

    public /* synthetic */ v55(int i, ud0 ud0Var, String str) {
        this.F = ud0Var;
        this.G = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                huk.g(this.F, this.G, ld4Var, x44.p0(1));
                break;
            default:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iqb iqbVarO = b.o(fqb.E, 20.0f);
                    ud0 ud0Var = ud0.d;
                    iv1.b(this.F, this.G, iqbVarO, null, 0L, e18Var, 384, 24);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ v55(ud0 ud0Var, String str) {
        this.F = ud0Var;
        this.G = str;
    }
}
