package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ResearchStatus;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vke implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ jme F;
    public final /* synthetic */ boolean G;

    public /* synthetic */ vke(jme jmeVar, boolean z) {
        this.F = jmeVar;
        this.G = z;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.G;
        jme jmeVar = this.F;
        switch (i) {
            case 0:
                int i2 = jmeVar.c;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else if (!z) {
                    e18Var.a0(1394684731);
                    if (i2 > 0) {
                        e18Var.a0(1394742019);
                        fhk.b(d4c.k0(R.string.research_gathering_resources_count, new Object[]{Integer.valueOf(i2)}, e18Var), null, ((jm3) gm3.c(e18Var).e.E).i, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, false, e18Var, 0, 0, 2042);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(1395221000);
                        fhk.b(d4c.j0(R.string.research_gathering_resources, e18Var), null, ((jm3) gm3.c(e18Var).e.E).i, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, false, e18Var, 0, 0, 2042);
                        e18Var.p(false);
                    }
                    e18Var.p(false);
                } else {
                    e18Var.a0(1394225931);
                    tjh.b(d4c.k0(R.string.research_gathered_resources_count, new Object[]{Integer.valueOf(i2)}, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131070);
                    e18Var.p(false);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    ResearchStatus researchStatus = jmeVar != null ? jmeVar.f : null;
                    int i3 = researchStatus == null ? -1 : hme.a[researchStatus.ordinal()];
                    if (i3 == 1 || i3 == 2 || i3 == 3) {
                        e18Var2.a0(1964497215);
                        ime.a(jmeVar, e18Var2, 0);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(1964593966);
                        ime.d(jmeVar, z, e18Var2, 0);
                        e18Var2.p(false);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ime.d(jmeVar, z, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ vke(jme jmeVar, boolean z, int i) {
        this.F = jmeVar;
        this.G = z;
    }

    public /* synthetic */ vke(boolean z, jme jmeVar) {
        this.G = z;
        this.F = jmeVar;
    }
}
