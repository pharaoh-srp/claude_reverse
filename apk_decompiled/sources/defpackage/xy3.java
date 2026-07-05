package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.code.remote.bottomsheet.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xy3 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ yih F;
    public final /* synthetic */ bt7 G;

    public /* synthetic */ xy3(yih yihVar, bt7 bt7Var, int i) {
        this.E = i;
        this.F = yihVar;
        this.G = bt7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        bt7 bt7Var = this.G;
        yih yihVar = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    a.x(yihVar, gb9.N(iv1.s(b.c(fqbVar, 1.0f), bt7Var), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), e18Var, 6);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    a.c(yihVar, gb9.N(iv1.s(b.c(fqbVar, 1.0f), bt7Var), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), e18Var2, 6);
                }
                break;
        }
        return ieiVar;
    }
}
