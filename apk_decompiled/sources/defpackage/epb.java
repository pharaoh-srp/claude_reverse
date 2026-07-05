package defpackage;

import com.anthropic.claude.api.model.ThinkingOption;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class epb implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ ThinkingOption G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ String I;
    public final /* synthetic */ bz7 J;
    public final /* synthetic */ qnc K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ bz7 M;
    public final /* synthetic */ pl3 N;

    public /* synthetic */ epb(List list, ThinkingOption thinkingOption, boolean z, String str, bz7 bz7Var, qnc qncVar, boolean z2, bz7 bz7Var2, pl3 pl3Var, int i) {
        this.E = i;
        this.F = list;
        this.G = thinkingOption;
        this.H = z;
        this.I = str;
        this.J = bz7Var;
        this.K = qncVar;
        this.L = z2;
        this.M = bz7Var2;
        this.N = pl3Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = false;
        boolean z2 = this.H;
        switch (i) {
            case 0:
                haa haaVar = (haa) obj;
                haaVar.getClass();
                List list = this.F;
                boolean z3 = !list.isEmpty();
                String str = this.I;
                bz7 bz7Var = this.J;
                qnc qncVar = this.K;
                haa.a(haaVar, z3, new ta4(528908587, true, new hpb(list, str, bz7Var, qncVar, 1)), 2);
                ThinkingOption thinkingOption = this.G;
                if (thinkingOption != null && z2) {
                    z = true;
                }
                haa.a(haaVar, z, new ta4(88245908, true, new ipb(thinkingOption, this.L, this.M, qncVar, this.N, 0)), 2);
                break;
            default:
                haa haaVar2 = (haa) obj;
                haaVar2.getClass();
                List list2 = this.F;
                boolean z4 = !list2.isEmpty();
                String str2 = this.I;
                bz7 bz7Var2 = this.J;
                qnc qncVar2 = this.K;
                haa.a(haaVar2, z4, new ta4(1573731945, true, new hpb(list2, str2, bz7Var2, qncVar2, 3)), 2);
                ThinkingOption thinkingOption2 = this.G;
                if (thinkingOption2 != null && z2) {
                    z = true;
                }
                haa.a(haaVar2, z, new ta4(-1596876768, true, new ipb(thinkingOption2, this.L, this.M, qncVar2, this.N, 1)), 2);
                break;
        }
        return ieiVar;
    }
}
