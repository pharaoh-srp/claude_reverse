package defpackage;

import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes.dex */
public final class bk3 implements bz7 {
    public final /* synthetic */ zqc E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ l45 G;
    public final /* synthetic */ of6 H;

    public bk3(qi3 qi3Var, l45 l45Var, of6 of6Var, zqc zqcVar) {
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
        ClaudeAppDestination.List.ProjectDetails projectDetails = new ClaudeAppDestination.List.ProjectDetails(new ProjectDetailsScreenParams(strM1085unboximpl, true, null));
        pj3 pj3Var = pj3.I;
        zqc zqcVar = this.E;
        xj3 xj3Var = new xj3(projectDetails, zqcVar, 1);
        tk5 tk5Var = zqcVar.E;
        tk5Var.m(xj3Var, pj3Var);
        if (((te3) zqcVar.F.getValue()).d == ye3.E) {
            tk5Var.m(new kac(18), new oua(19));
        }
        return iei.a;
    }
}
