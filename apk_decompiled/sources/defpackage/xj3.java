package defpackage;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.router.panes.Panes;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xj3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ClaudeAppDestination.List.ProjectDetails F;
    public final /* synthetic */ zqc G;

    public /* synthetic */ xj3(ClaudeAppDestination.List.ProjectDetails projectDetails, zqc zqcVar, int i) {
        this.E = i;
        this.F = projectDetails;
        this.G = zqcVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ye3 ye3Var = ye3.E;
        ClaudeAppDestination.List.ProjectDetails projectDetails = this.F;
        zqc zqcVar = this.G;
        List details = lm6.E;
        switch (i) {
            case 0:
                Panes panes = (Panes) obj;
                panes.getClass();
                List listW = x44.W(projectDetails);
                if (((te3) zqcVar.F.getValue()).d != ye3Var) {
                    details = panes.getDetails();
                }
                return Panes.copy$default(panes, listW, details, null, null, 12, null);
            case 1:
                Panes panes2 = (Panes) obj;
                panes2.getClass();
                List listW2 = x44.W(projectDetails);
                if (((te3) zqcVar.F.getValue()).d != ye3Var) {
                    details = panes2.getDetails();
                }
                return Panes.copy$default(panes2, listW2, details, null, null, 12, null);
            default:
                Panes panes3 = (Panes) obj;
                panes3.getClass();
                List listW3 = x44.W(projectDetails);
                if (((te3) zqcVar.F.getValue()).d != ye3Var) {
                    details = panes3.getDetails();
                }
                return Panes.copy$default(panes3, listW3, details, null, null, 12, null);
        }
    }
}
