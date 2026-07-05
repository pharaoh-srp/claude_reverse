package defpackage;

import com.anthropic.claude.project.details.ProjectDetailsDialogDestination;
import com.anthropic.claude.project.menu.ProjectItemMenuDialogDestination;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lld implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ lld(rwe rweVar, zy7 zy7Var, int i) {
        this.E = i;
        this.F = rweVar;
        this.G = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.G;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                jx2 jx2Var = new jx2(20, ProjectDetailsDialogDestination.Rename.INSTANCE);
                ppa ppaVar = new ppa(19);
                rweVar.getClass();
                rweVar.E.m(jx2Var, ppaVar);
                zy7Var.a();
                break;
            case 1:
                jx2 jx2Var2 = new jx2(21, ProjectDetailsDialogDestination.Delete.INSTANCE);
                ppa ppaVar2 = new ppa(20);
                rweVar.getClass();
                rweVar.E.m(jx2Var2, ppaVar2);
                zy7Var.a();
                break;
            case 2:
                jx2 jx2Var3 = new jx2(24, ProjectItemMenuDialogDestination.Delete.INSTANCE);
                ppa ppaVar3 = new ppa(28);
                rweVar.getClass();
                rweVar.E.m(jx2Var3, ppaVar3);
                zy7Var.a();
                break;
            case 3:
                jx2 jx2Var4 = new jx2(23, ProjectItemMenuDialogDestination.Rename.INSTANCE);
                ppa ppaVar4 = new ppa(27);
                rweVar.getClass();
                rweVar.E.m(jx2Var4, ppaVar4);
                zy7Var.a();
                break;
            default:
                if (((bf3) rweVar.F.getValue()).c.size() != 1) {
                    rweVar.E.m(dah.H, new eah(1));
                } else {
                    zy7Var.a();
                }
                break;
        }
        return ieiVar;
    }
}
