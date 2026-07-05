package defpackage;

import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.sessions.types.CodeAgent;
import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.sessions.types.RepoWithStatus;
import com.anthropic.claude.types.strings.CodeAgentId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p3c extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ u3c G;
    public final /* synthetic */ c H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3c(u3c u3cVar, c cVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = u3cVar;
        this.H = cVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        c cVar = this.H;
        u3c u3cVar = this.G;
        switch (i) {
            case 0:
                return new p3c(u3cVar, cVar, tp4Var, 0);
            default:
                return new p3c(u3cVar, cVar, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((p3c) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        RepoWithStatus repoWithStatus;
        GitHubRepo repo;
        int i = this.E;
        iei ieiVar = iei.a;
        c cVar = this.H;
        m45 m45Var = m45.E;
        u3c u3cVar = this.G;
        Object obj2 = null;
        switch (i) {
            case 0:
                a aVar = cVar.i;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    List listF = aVar.f();
                    u3cVar.getClass();
                    kdg kdgVar = u3cVar.j;
                    if (kdgVar.isEmpty() && !listF.isEmpty()) {
                        List list = listF;
                        ArrayList arrayList = new ArrayList(x44.y(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new lhf((GitHubRepo) it.next(), null));
                        }
                        kdgVar.addAll(arrayList);
                    }
                    b3f b3fVarD0 = mpk.d0(new pz3(cVar, 9));
                    zl2 zl2Var = new zl2(2, null, 16);
                    this.F = 1;
                    if (j8.H(b3fVarD0, zl2Var, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                List listC = cVar.g.c();
                u3cVar.getClass();
                listC.getClass();
                aVar.getClass();
                kdg kdgVar2 = u3cVar.j;
                kdgVar2.getClass();
                l3 l3Var = oq5.C(kdgVar2).c;
                b54.w0(new hj2(listC, 7), kdgVar2);
                if (kdgVar2.isEmpty() && (repoWithStatus = (RepoWithStatus) w44.N0(listC)) != null && (repo = repoWithStatus.getRepo()) != null) {
                    kdgVar2.add(new lhf(repo, null));
                }
                ArrayList arrayList2 = new ArrayList(x44.y(kdgVar2, 10));
                ListIterator listIterator = kdgVar2.listIterator();
                while (true) {
                    c8a c8aVar = (c8a) listIterator;
                    if (!c8aVar.hasNext()) {
                        ArrayList arrayList3 = new ArrayList(x44.y(l3Var, 10));
                        ListIterator<Object> listIterator2 = l3Var.listIterator(0);
                        while (listIterator2.hasNext()) {
                            arrayList3.add(((lhf) listIterator2.next()).a.getId());
                        }
                        if (!arrayList2.equals(arrayList3)) {
                            u3cVar.d(aVar);
                        }
                    } else {
                        arrayList2.add(((lhf) c8aVar.next()).a.getId());
                    }
                    break;
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    h80 h80Var = u3cVar.g;
                    this.F = 1;
                    if (h80Var.m(this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                a aVar2 = cVar.i;
                CodeAgentId codeAgentId = (CodeAgentId) aVar2.c.getValue();
                String strM998unboximpl = codeAgentId != null ? codeAgentId.m998unboximpl() : null;
                if ((strM998unboximpl != null ? u3cVar.g.c(strM998unboximpl) : null) == null) {
                    List list2 = (List) ((wz5) u3cVar.g.I).getValue();
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (x44.r(((CodeAgent) next).getSlack_alias(), "")) {
                                obj2 = next;
                            }
                        }
                    }
                    CodeAgent codeAgent = (CodeAgent) obj2;
                    if (codeAgent == null) {
                        codeAgent = (CodeAgent) w44.N0(list2);
                    }
                    if (codeAgent != null) {
                        aVar2.g(codeAgent.m833getIdVN9v2L4());
                    }
                }
                break;
        }
        return ieiVar;
    }
}
