package defpackage;

import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.project.details.g;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rg4 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ pz7 G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ qz7 M;
    public final /* synthetic */ qz7 N;
    public final /* synthetic */ qz7 O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ rg4(ProjectDetailsScreenParams projectDetailsScreenParams, ml3 ml3Var, boolean z, pz7 pz7Var, zy7 zy7Var, pz7 pz7Var2, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, ild ildVar, qi3 qi3Var, int i) {
        this.J = projectDetailsScreenParams;
        this.K = ml3Var;
        this.F = z;
        this.G = pz7Var;
        this.L = zy7Var;
        this.M = pz7Var2;
        this.N = zy7Var2;
        this.O = zy7Var3;
        this.H = iqbVar;
        this.P = ildVar;
        this.Q = qi3Var;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        Object obj3 = this.Q;
        Object obj4 = this.P;
        qz7 qz7Var = this.O;
        qz7 qz7Var2 = this.N;
        qz7 qz7Var3 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                ug4.a((String) obj7, (String) obj6, (List) obj5, this.F, (bz7) qz7Var3, this.G, (bz7) qz7Var2, (bz7) qz7Var, (bz7) obj4, this.H, (pl3) obj3, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                g.b((ProjectDetailsScreenParams) obj7, (ml3) obj6, this.F, this.G, (zy7) obj5, (pz7) qz7Var3, (zy7) qz7Var2, (zy7) qz7Var, this.H, (ild) obj4, (qi3) obj3, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ rg4(String str, String str2, List list, boolean z, bz7 bz7Var, pz7 pz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, iqb iqbVar, pl3 pl3Var, int i) {
        this.J = str;
        this.K = str2;
        this.L = list;
        this.F = z;
        this.M = bz7Var;
        this.G = pz7Var;
        this.N = bz7Var2;
        this.O = bz7Var3;
        this.P = bz7Var4;
        this.H = iqbVar;
        this.Q = pl3Var;
        this.I = i;
    }
}
