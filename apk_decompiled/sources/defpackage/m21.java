package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m21 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ nxf G;
    public final /* synthetic */ boolean H;

    public /* synthetic */ m21(nxf nxfVar, boolean z, String str) {
        this.E = 2;
        this.G = nxfVar;
        this.H = z;
        this.F = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.H;
        nxf nxfVar = this.G;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(this.F, null, nxfVar.b(z), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 110586);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    prk.k(this.F, null, tkh.b(((jm3) gm3.c(e18Var2).e.E).g, nxfVar.b(z), 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), a.a(ud0.C, e18Var2), dv8.F, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, 0, e18Var2, 28672, 2018);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    tjh.b(this.F, null, nxfVar.b(z), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).g, e18Var3, 0, 0, 131066);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    tjh.b(this.F, null, nxfVar.b(z), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((jm3) gm3.c(e18Var4).e.E).g, e18Var4, 0, 24960, 110586);
                }
                break;
            default:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    tjh.b(this.F, null, nxfVar.b(z), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var5).e.E).g, e18Var5, 0, 24960, 110586);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ m21(String str, nxf nxfVar, boolean z, int i) {
        this.E = i;
        this.F = str;
        this.G = nxfVar;
        this.H = z;
    }
}
