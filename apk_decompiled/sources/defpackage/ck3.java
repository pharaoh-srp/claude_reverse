package defpackage;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.router.panes.Panes;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ck3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ClaudeAppDestination.List.Settings F;
    public final /* synthetic */ zqc G;

    public /* synthetic */ ck3(ClaudeAppDestination.List.Settings settings, zqc zqcVar, int i) {
        this.E = i;
        this.F = settings;
        this.G = zqcVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ye3 ye3Var = ye3.E;
        ClaudeAppDestination.List.Settings settings = this.F;
        zqc zqcVar = this.G;
        List details = lm6.E;
        switch (i) {
            case 0:
                Panes panes = (Panes) obj;
                panes.getClass();
                List listW = x44.W(settings);
                if (((te3) zqcVar.F.getValue()).d != ye3Var) {
                    details = panes.getDetails();
                }
                return Panes.copy$default(panes, listW, details, null, null, 12, null);
            default:
                Panes panes2 = (Panes) obj;
                panes2.getClass();
                List listW2 = x44.W(settings);
                if (((te3) zqcVar.F.getValue()).d != ye3Var) {
                    details = panes2.getDetails();
                }
                return Panes.copy$default(panes2, listW2, details, null, null, 12, null);
        }
    }
}
