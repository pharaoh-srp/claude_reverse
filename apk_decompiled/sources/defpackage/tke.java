package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ResearchStatus;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tke implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ jme F;

    public /* synthetic */ tke(jme jmeVar, int i) {
        this.E = i;
        this.F = jmeVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        jme jmeVar = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xke.f(jmeVar, (ld4) obj, x44.p0(1));
                break;
            case 1:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    xke.d(jmeVar, e18Var, 0);
                }
                break;
            case 2:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else if (jmeVar.f != ResearchStatus.CREATING_ARTIFACT) {
                    e18Var2.a0(302815325);
                    tjh.b(d4c.j0(R.string.research_wrote_report, e18Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, 0, 0, 131070);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(302519864);
                    fhk.b(d4c.j0(R.string.research_writing_report, e18Var2), null, ((jm3) gm3.c(e18Var2).e.E).i, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, false, e18Var2, 0, 0, 2042);
                    e18Var2.p(false);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                xke.d(jmeVar, (ld4) obj, x44.p0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ime.a(jmeVar, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ tke(jme jmeVar, int i, int i2) {
        this.E = i2;
        this.F = jmeVar;
    }
}
