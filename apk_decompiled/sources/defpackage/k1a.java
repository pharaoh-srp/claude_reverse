package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k1a implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ i4g F;

    public /* synthetic */ k1a(i4g i4gVar, int i) {
        this.E = i;
        this.F = i4gVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        i4g i4gVar = this.F;
        px9 px9Var = (px9) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                px9Var.getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    kxk.g(e18Var, b.e(fqbVar, i4gVar.b));
                }
                break;
            default:
                px9Var.getClass();
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var2.T();
                } else {
                    kxk.g(e18Var2, b.e(fqbVar, i4gVar.b));
                }
                break;
        }
        return ieiVar;
    }
}
