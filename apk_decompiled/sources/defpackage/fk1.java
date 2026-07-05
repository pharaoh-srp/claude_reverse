package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.sessions.types.GitHubBranch;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fk1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ fk1(bx1 bx1Var, boolean z, List list, GitHubBranch gitHubBranch, bz7 bz7Var) {
        this.E = 1;
        this.G = bx1Var;
        this.F = z;
        this.H = list;
        this.I = gitHubBranch;
        this.J = bz7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.F;
        Object obj2 = this.J;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.l(ekfVar, (String) obj5);
                ckf.v(ekfVar, (String) obj4);
                ckf.g(ekfVar, null, new gk1(z, (nwb) obj3, (nwb) obj2, 0));
                return ieiVar;
            case 1:
                bx1 bx1Var = (bx1) obj5;
                List list = (List) obj4;
                GitHubBranch gitHubBranch = (GitHubBranch) obj3;
                bz7 bz7Var = (bz7) obj2;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                boolean zB = bx1Var.b();
                lsc lscVar = bx1Var.i;
                if (zB && ((Boolean) lscVar.getValue()).booleanValue() && z) {
                    j0a.V(j0aVar, "search_loading", null, uhk.k, 2);
                }
                j0aVar.W(list.size(), new kp(new it2(25), 23, list), new tq(list, 4), new ta4(802480018, true, new lp(list, gitHubBranch, bz7Var, 1)));
                if (bx1Var.b() && ((Boolean) lscVar.getValue()).booleanValue() && !z) {
                    j0a.V(j0aVar, "loading_more", null, uhk.l, 2);
                }
                return ieiVar;
            case 2:
                lsc lscVar2 = ((swb) obj5).G;
                nwb nwbVar = (nwb) obj3;
                wlg wlgVar = (wlg) obj4;
                wlg wlgVar2 = (wlg) obj2;
                xre xreVar = (xre) obj;
                float fFloatValue = 0.8f;
                float fFloatValue2 = 1.0f;
                xreVar.l(!z ? ((Number) wlgVar.getValue()).floatValue() : ((Boolean) lscVar2.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z) {
                    fFloatValue = ((Number) wlgVar.getValue()).floatValue();
                } else if (((Boolean) lscVar2.getValue()).booleanValue()) {
                    fFloatValue = 1.0f;
                }
                xreVar.m(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((Number) wlgVar2.getValue()).floatValue();
                } else if (!((Boolean) lscVar2.getValue()).booleanValue()) {
                    fFloatValue2 = MTTypesetterKt.kLineSkipLimitMultiplier;
                }
                xreVar.b(fFloatValue2);
                xreVar.u(((d5i) nwbVar.getValue()).a);
                return ieiVar;
            case 3:
                sih sihVar = (sih) obj4;
                long jA = hif.a(sihVar.t(z));
                ((cae) obj5).E = jA;
                sihVar.H((te8) obj3, jA);
                ((cae) obj2).E = 0L;
                sihVar.w = -1;
                return ieiVar;
            default:
                cpc cpcVar = (cpc) obj;
                cpcVar.getClass();
                return new dui(this.F, (r8f) obj5, (t8f) obj4, (wg6) obj3, (mb0) obj2, ((Number) cpcVar.E).floatValue(), ((Boolean) cpcVar.F).booleanValue());
        }
    }

    public /* synthetic */ fk1(Serializable serializable, Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.E = i;
        this.G = serializable;
        this.H = obj;
        this.F = z;
        this.I = obj2;
        this.J = obj3;
    }

    public /* synthetic */ fk1(boolean z, swb swbVar, nwb nwbVar, v5i v5iVar, v5i v5iVar2) {
        this.E = 2;
        this.F = z;
        this.G = swbVar;
        this.I = nwbVar;
        this.H = v5iVar;
        this.J = v5iVar2;
    }

    public /* synthetic */ fk1(boolean z, r8f r8fVar, t8f t8fVar, wg6 wg6Var, mb0 mb0Var) {
        this.E = 4;
        this.F = z;
        this.G = r8fVar;
        this.H = t8fVar;
        this.I = wg6Var;
        this.J = mb0Var;
    }
}
