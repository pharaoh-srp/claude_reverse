package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.stores.SessionTarget;
import com.anthropic.claude.sessions.types.CodeAgent;
import com.anthropic.claude.sessions.types.GitHubRepo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ok4 implements bz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ List I;
    public final /* synthetic */ nwb J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ ok4(boolean z, String str, SessionTarget sessionTarget, boolean z2, boolean z3, List list, u3c u3cVar, nwb nwbVar, nwb nwbVar2, nwb nwbVar3, c cVar, nwb nwbVar4) {
        this.F = z;
        this.K = str;
        this.L = sessionTarget;
        this.G = z2;
        this.H = z3;
        this.I = list;
        this.M = u3cVar;
        this.J = nwbVar;
        this.N = nwbVar2;
        this.O = nwbVar3;
        this.P = cVar;
        this.Q = nwbVar4;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String default_branch;
        GitHubRepo gitHubRepo;
        CodeAgent codeAgentC;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.Q;
        Object obj3 = this.P;
        Object obj4 = this.O;
        Object obj5 = this.N;
        Object obj6 = this.M;
        final boolean z = this.H;
        Object obj7 = this.L;
        Object obj8 = this.K;
        boolean z2 = this.F;
        switch (i) {
            case 0:
                List list = (List) obj8;
                di4 di4Var = (di4) obj3;
                bz7 bz7Var = (bz7) obj6;
                bz7 bz7Var2 = (bz7) obj5;
                pl3 pl3Var = (pl3) obj2;
                bz7 bz7Var3 = (bz7) obj4;
                t0a t0aVar = (t0a) obj;
                t0aVar.getClass();
                t0a.a(t0aVar, z2, null, new xb2(z, (bz7) obj7, 2), 2);
                List list2 = this.I;
                boolean zIsEmpty = list2.isEmpty();
                boolean z3 = this.G;
                t0a.a(t0aVar, !zIsEmpty || z3, null, new uu0(di4Var, bz7Var, list2, bz7Var2, pl3Var, z3, this.J), 2);
                t0a.a(t0aVar, !list.isEmpty(), null, new f44(list, bz7Var3, pl3Var, 7), 2);
                break;
            default:
                String str = (String) obj8;
                SessionTarget sessionTarget = (SessionTarget) obj7;
                u3c u3cVar = (u3c) obj6;
                nwb nwbVar = (nwb) obj5;
                nwb nwbVar2 = (nwb) obj4;
                c cVar = (c) obj3;
                nwb nwbVar3 = (nwb) obj2;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                if (z2) {
                    j0a.V(j0aVar, null, null, new ta4(75304404, true, new fo3(2, new k3c(4, this.J), (str == null || (codeAgentC = u3cVar.g.c(str)) == null) ? null : codeAgentC.getDisplay_name())), 3);
                } else {
                    String displayName = sessionTarget != null ? sessionTarget.getDisplayName() : null;
                    List list3 = this.I;
                    final int size = list3.size();
                    lhf lhfVar = (lhf) w44.N0(list3);
                    final String name = (lhfVar == null || (gitHubRepo = lhfVar.a) == null) ? null : gitHubRepo.getName();
                    List<lhf> list4 = list3;
                    ArrayList arrayList = new ArrayList(x44.y(list4, 10));
                    for (lhf lhfVar2 : list4) {
                        String default_branch2 = lhfVar2.b;
                        if (default_branch2 == null) {
                            default_branch2 = lhfVar2.a.getDefault_branch();
                        }
                        arrayList.add(default_branch2);
                    }
                    int size2 = w44.p1(w44.s1(arrayList)).size();
                    lhf lhfVar3 = (lhf) w44.N0(list3);
                    if (lhfVar3 != null) {
                        default_branch = lhfVar3.b;
                        if (default_branch == null) {
                            default_branch = lhfVar3.a.getDefault_branch();
                        }
                    } else {
                        default_branch = null;
                    }
                    k3c k3cVar = new k3c(5, nwbVar);
                    final k3c k3cVar2 = new k3c(6, nwbVar2);
                    he heVar = new he(list3, cVar, u3cVar, nwbVar3, 18);
                    j0a.V(j0aVar, null, null, new ta4(1961262781, true, new fo3(3, k3cVar, displayName)), 3);
                    if (!this.G) {
                        j0a.V(j0aVar, null, null, new ta4(977977332, true, new rz7() { // from class: n3c
                            @Override // defpackage.rz7
                            public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                String strF0;
                                int i2;
                                int i3;
                                ld4 ld4Var = (ld4) obj10;
                                int iIntValue = ((Integer) obj11).intValue();
                                ((px9) obj9).getClass();
                                e18 e18Var = (e18) ld4Var;
                                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ud0 ud0Var = ud0.t0;
                                    boolean z4 = z;
                                    if (z4) {
                                        int i4 = size;
                                        if (i4 == 0) {
                                            i2 = -761615035;
                                            i3 = R.string.ccr_sheet_add_repository;
                                        } else {
                                            if (i4 == 1) {
                                                e18Var.a0(-761611875);
                                                e18Var.p(false);
                                                strF0 = name;
                                                if (strF0 == null) {
                                                    strF0 = "";
                                                }
                                            } else {
                                                e18Var.a0(-761610725);
                                                strF0 = d4c.f0(R.plurals.ccr_sheet_n_repos, i4, new Object[]{Integer.valueOf(i4)}, e18Var);
                                                e18Var.p(false);
                                            }
                                            t3c.g(ud0Var, strF0, k3cVar2, null, z4, e18Var, 0, 8);
                                        }
                                    } else {
                                        i2 = -761617723;
                                        i3 = R.string.ccr_sheet_connect_github;
                                    }
                                    strF0 = vb7.n(e18Var, i2, i3, e18Var, false);
                                    t3c.g(ud0Var, strF0, k3cVar2, null, z4, e18Var, 0, 8);
                                } else {
                                    e18Var.T();
                                }
                                return iei.a;
                            }
                        }), 3);
                        if (z && size != 0) {
                            j0a.V(j0aVar, null, null, new ta4(1777551861, true, new ui4(size2, heVar, default_branch)), 3);
                        }
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ok4(boolean z, List list, boolean z2, List list2, boolean z3, bz7 bz7Var, di4 di4Var, bz7 bz7Var2, bz7 bz7Var3, pl3 pl3Var, nwb nwbVar, bz7 bz7Var4) {
        this.F = z;
        this.I = list;
        this.G = z2;
        this.K = list2;
        this.H = z3;
        this.L = bz7Var;
        this.P = di4Var;
        this.M = bz7Var2;
        this.N = bz7Var3;
        this.Q = pl3Var;
        this.J = nwbVar;
        this.O = bz7Var4;
    }
}
