package defpackage;

import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final class c34 implements lp7 {
    public final /* synthetic */ i E;
    public final /* synthetic */ t4g F;
    public final /* synthetic */ zy7 G;

    public c34(i iVar, t4g t4gVar, zy7 zy7Var) {
        this.E = iVar;
        this.F = t4gVar;
        this.G = zy7Var;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        i14 i14Var = (i14) obj;
        boolean zR = x44.r(i14Var, g14.a);
        t4g t4gVar = this.F;
        if (zR) {
            this.E.v1(null);
            t4gVar.d(CodeRemoteBottomSheetDestination.RepositorySelection.a);
        } else if (x44.r(i14Var, f14.a)) {
            t4gVar.d(CodeRemoteBottomSheetDestination.EnvironmentSelection.a);
        } else if (x44.r(i14Var, e14.a)) {
            t4gVar.d(CodeRemoteBottomSheetDestination.ConnectGitHub.a);
        } else {
            if (!x44.r(i14Var, h14.a)) {
                wg6.i();
                return null;
            }
            this.G.a();
        }
        return iei.a;
    }
}
