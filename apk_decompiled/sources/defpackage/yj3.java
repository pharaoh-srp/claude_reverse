package defpackage;

import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes.dex */
public final class yj3 implements bz7 {
    public final /* synthetic */ zqc E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ l45 G;
    public final /* synthetic */ of6 H;

    public yj3(qi3 qi3Var, l45 l45Var, of6 of6Var, zqc zqcVar) {
        this.E = zqcVar;
        this.F = qi3Var;
        this.G = l45Var;
        this.H = of6Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM1085unboximpl = ((ProjectId) obj).m1085unboximpl();
        strM1085unboximpl.getClass();
        dk3.b(this.F, this.G, this.H, DrawerEvents$DrawerItem.PROJECT);
        ClaudeAppDestination.List.ProjectDetails projectDetails = new ClaudeAppDestination.List.ProjectDetails(new ProjectDetailsScreenParams(strM1085unboximpl, false, 2, (mq5) null));
        pj3 pj3Var = pj3.G;
        zqc zqcVar = this.E;
        zqcVar.E.m(new xj3(projectDetails, zqcVar, 0), pj3Var);
        return iei.a;
    }
}
