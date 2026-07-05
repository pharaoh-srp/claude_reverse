package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.tool.model.SourceImage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class me implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Object G;

    public /* synthetic */ me(Object obj, long j, int i) {
        this.E = i;
        this.G = obj;
        this.F = j;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        long j = this.F;
        iei ieiVar = iei.a;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                oe oeVar = (oe) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    nuj.j(oeVar.a, this.F, null, e18Var, 8);
                }
                break;
            case 1:
                zy7 zy7Var = (zy7) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    lnk.d(zy7Var, null, false, null, null, null, null, fd9.q0(399122952, new ld8(j, z ? 1 : 0), e18Var2), e18Var2, 805306368, 510);
                }
                break;
            case 2:
                gnd gndVar = (gnd) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    ud0 ud0VarA = hnd.a(gndVar);
                    ud0 ud0Var = ud0.d;
                    cv8.b(a.a(ud0VarA, e18Var3), null, b.o(fqbVar, 20.0f), this.F, e18Var3, 440, 0);
                }
                break;
            case 3:
                bpc bpcVar = (bpc) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    cv8.b(bpcVar, null, b.p(j, fqbVar), 0L, e18Var4, 56, 8);
                }
                break;
            default:
                SourceImage sourceImage = (SourceImage) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    tjh.b(((SourceImage.Text) sourceImage).getText(), gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 0.5f, 7), gm3.a(e18Var5).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, tkh.b(((jm3) gm3.c(e18Var5).e.E).h, 0L, this.F, null, null, null, 0L, null, 0, 0L, null, 0, 16777213), e18Var5, 48, 24576, 114680);
                }
                break;
        }
        return ieiVar;
    }
}
