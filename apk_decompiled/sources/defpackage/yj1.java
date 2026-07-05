package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yj1 implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;

    public /* synthetic */ yj1(y49 y49Var, boolean z, boolean z2) {
        this.H = y49Var;
        this.F = z;
        this.G = z2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj4 = this.H;
        int i2 = 1;
        switch (i) {
            case 0:
                wlg wlgVar = (wlg) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    knk.e(Boolean.valueOf(this.F), null, null, "centerControlGlyph", fd9.q0(1000278932, new s50(this.G, wlgVar, i2), e18Var), e18Var, 27648, 6);
                }
                break;
            default:
                y49 y49Var = (y49) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    long j = gm3.a(e18Var2).n;
                    fqb fqbVar = fqb.E;
                    kwj.g(y49Var, this.F, this.G, b.e(fqbVar, 16.0f), j, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 3080, 480);
                    kxk.g(e18Var2, b.t(fqbVar, 6.0f));
                    tjh.b(d4c.j0(R.string.button_stop, e18Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131070);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ yj1(boolean z, boolean z2, wlg wlgVar) {
        this.F = z;
        this.G = z2;
        this.H = wlgVar;
    }
}
