package defpackage;

import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.tool.model.AskUserInputV0InputQuestionsItem;
import java.time.LocalDate;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uu0 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ uu0(di4 di4Var, bz7 bz7Var, List list, bz7 bz7Var2, pl3 pl3Var, boolean z, nwb nwbVar) {
        this.I = di4Var;
        this.K = bz7Var;
        this.J = list;
        this.L = bz7Var2;
        this.G = pl3Var;
        this.F = z;
        this.H = nwbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = 1;
        iei ieiVar = iei.a;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.H;
        Object obj7 = this.G;
        Object obj8 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                euk.i((AskUserInputV0InputQuestionsItem) obj8, (List) obj5, (bz7) obj4, (bz7) obj3, this.F, (zy7) obj7, (zy7) obj6, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(1572865);
                jj4.a((DirectoryServer) obj8, (ek4) obj5, this.F, (LocalDate) obj4, (zy7) obj7, (zy7) obj6, (iqb) obj3, (ld4) obj, iP02);
                break;
            case 2:
                di4 di4Var = (di4) obj8;
                bz7 bz7Var = (bz7) obj4;
                List list = (List) obj5;
                bz7 bz7Var2 = (bz7) obj3;
                pl3 pl3Var = (pl3) obj7;
                nwb nwbVar = (nwb) obj6;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                ((mnc) obj2).getClass();
                String strA = null;
                if (di4Var != null) {
                    if (!(di4Var instanceof bi4)) {
                        mr9.b();
                    } else {
                        strA = ((bi4) di4Var).a();
                    }
                }
                String str = strA;
                bz7Var.getClass();
                cqk.g(j0aVar, list, bz7Var2, pl3Var, null, null, str, new ww9(bz7Var, i2, (byte) 0), new x40(22, nwbVar), this.F, 24);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(1);
                quj.b((Project) obj8, this.F, (zy7) obj7, (zy7) obj6, (zy7) obj5, (iqb) obj4, (pl3) obj3, (ld4) obj, iP03);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ uu0(DirectoryServer directoryServer, ek4 ek4Var, boolean z, LocalDate localDate, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, int i) {
        this.I = directoryServer;
        this.J = ek4Var;
        this.F = z;
        this.K = localDate;
        this.G = zy7Var;
        this.H = zy7Var2;
        this.L = iqbVar;
    }

    public /* synthetic */ uu0(Project project, boolean z, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, pl3 pl3Var, int i) {
        this.I = project;
        this.F = z;
        this.G = zy7Var;
        this.H = zy7Var2;
        this.J = zy7Var3;
        this.K = iqbVar;
        this.L = pl3Var;
    }

    public /* synthetic */ uu0(AskUserInputV0InputQuestionsItem askUserInputV0InputQuestionsItem, List list, bz7 bz7Var, bz7 bz7Var2, boolean z, zy7 zy7Var, zy7 zy7Var2, int i) {
        this.I = askUserInputV0InputQuestionsItem;
        this.J = list;
        this.K = bz7Var;
        this.L = bz7Var2;
        this.F = z;
        this.G = zy7Var;
        this.H = zy7Var2;
    }
}
