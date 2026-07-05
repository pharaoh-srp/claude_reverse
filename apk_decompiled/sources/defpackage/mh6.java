package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mh6 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bpc F;

    public /* synthetic */ mh6(bpc bpcVar, int i) {
        this.E = i;
        this.F = bpcVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    cv8.b(this.F, null, b.o(gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 11), 20.0f), 0L, e18Var, 440, 8);
                }
                break;
            case 1:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    cv8.b(this.F, null, b.o(gb9.N(fqb.E, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), 20.0f), 0L, e18Var2, 440, 8);
                }
                break;
            case 2:
                e18 e18Var3 = (e18) ld4Var;
                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var3.T();
                } else {
                    cv8.b(this.F, null, b.o(fqb.E, 92.0f), 0L, e18Var3, 440, 8);
                }
                break;
            default:
                e18 e18Var4 = (e18) ld4Var;
                if (!e18Var4.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var4.T();
                } else {
                    cv8.b(this.F, null, null, 0L, e18Var4, 56, 12);
                }
                break;
        }
        return ieiVar;
    }
}
