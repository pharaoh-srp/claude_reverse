package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wc9 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ float F;
    public final /* synthetic */ long G;

    public /* synthetic */ wc9(float f, long j) {
        this.F = f;
        this.G = j;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        long j = this.G;
        float f = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                rwk.c(j, f, ld4Var, x44.p0(1));
                break;
            default:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    kxk.g(e18Var, yfd.p(b.e(b.c(fqb.E, 1.0f), f), j, zni.b));
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ wc9(long j, float f, int i) {
        this.G = j;
        this.F = f;
    }
}
