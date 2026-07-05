package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e32 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;

    public /* synthetic */ e32(long j, int i) {
        this.E = 2;
        this.F = j;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        long j = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iv1.b(ud0.L, null, null, null, this.F, e18Var, 48, 12);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    dw1.a(yfd.p(xn5.V(b.o(fqb.E, 20.0f), xve.a), j, zni.b), e18Var2, 0);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                zni.f(j, (ld4) obj, x44.p0(1));
                break;
            case 3:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    cv8.b(a.a(ud0.L, e18Var3), null, b.o(gb9.N(fqb.E, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), 20.0f), this.F, e18Var3, 440, 0);
                }
                break;
            default:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    iv1.b(ud0.M1, d4c.j0(R.string.voice_error_dismiss, e18Var4), null, ef2.H, this.F, e18Var4, 3072, 4);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ e32(long j, int i, byte b) {
        this.E = i;
        this.F = j;
    }
}
