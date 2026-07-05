package defpackage;

import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.types.strings.ProjectId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zz8 implements nkd {
    public final fj0 a = new fj0(wl0.J, dch.n);
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // defpackage.nkd
    public final Object a(vp4 vp4Var, String str, boolean z) {
        ProjectId projectIdM1079boximpl = ProjectId.m1079boximpl(str);
        fj0 fj0Var = this.a;
        Project project = (Project) ((mdg) fj0Var.G).get(projectIdM1079boximpl);
        iei ieiVar = iei.a;
        if (project != null) {
            fj0Var.S(Project.m401copyqeyL9fA$default(project, null, null, null, false, null, null, null, null, null, z, false, null, null, null, null, null, null, 130559, null));
            kdg kdgVarK = k(kmd.H);
            if (!z) {
                kdgVarK.remove(ProjectId.m1079boximpl(str));
                return ieiVar;
            }
            if (!kdgVarK.contains(ProjectId.m1079boximpl(str))) {
                kdgVarK.add(0, ProjectId.m1079boximpl(str));
            }
        }
        return ieiVar;
    }

    @Override // defpackage.nkd
    public final Project b(String str) {
        str.getClass();
        return (Project) ((mdg) this.a.G).get(ProjectId.m1079boximpl(str));
    }

    @Override // defpackage.nkd
    public final void c(kmd kmdVar, List list, vp4 vp4Var) {
        List list2 = list;
        this.a.T(list2);
        kdg kdgVarK = k(kmdVar);
        Set setT1 = w44.t1(kdgVarK);
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ProjectId.m1079boximpl(((Project) it.next()).m404getUuid5pmjbU()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!setT1.contains(ProjectId.m1079boximpl(((ProjectId) obj).m1085unboximpl()))) {
                arrayList2.add(obj);
            }
        }
        kdgVarK.addAll(arrayList2);
    }

    @Override // defpackage.nkd
    public final Object e(kmd kmdVar, List list, vp4 vp4Var) {
        kwb kwbVarC;
        rcg rcgVarJ = ycg.j();
        kwb kwbVar = rcgVarJ instanceof kwb ? (kwb) rcgVarJ : null;
        if (kwbVar == null || (kwbVarC = kwbVar.C(null, null)) == null) {
            sz6.j("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
        try {
            rcg rcgVarJ2 = kwbVarC.j();
            try {
                List listP1 = w44.p1(this.a.T(list));
                kdg kdgVarK = k(kmdVar);
                kdgVarK.clear();
                List list2 = listP1;
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(ProjectId.m1079boximpl(((Project) it.next()).m404getUuid5pmjbU()));
                }
                kdgVarK.addAll(arrayList);
                rcg.q(rcgVarJ2);
                kwbVarC.w().p();
                return listP1;
            } catch (Throwable th) {
                rcg.q(rcgVarJ2);
                throw th;
            }
        } finally {
        }
    }

    @Override // defpackage.nkd
    public final Object f(Project project, vp4 vp4Var) {
        return this.a.S(project);
    }

    @Override // defpackage.nkd
    public final Object h(kmd kmdVar, String str, vp4 vp4Var) {
        kdg kdgVarK = k(kmdVar);
        if (!kdgVarK.contains(ProjectId.m1079boximpl(str))) {
            kdgVarK.add(0, ProjectId.m1079boximpl(str));
        }
        return iei.a;
    }

    @Override // defpackage.nkd
    public final Object i(String str, vp4 vp4Var) {
        this.a.D(ProjectId.m1079boximpl(str));
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((kdg) it.next()).remove(ProjectId.m1079boximpl(str));
        }
        return iei.a;
    }

    @Override // defpackage.nkd
    public final kdg j(kmd kmdVar) {
        kmdVar.getClass();
        return k(kmdVar);
    }

    public final kdg k(kmd kmdVar) {
        LinkedHashMap linkedHashMap = this.b;
        Object kdgVar = linkedHashMap.get(kmdVar);
        if (kdgVar == null) {
            kdgVar = new kdg();
            linkedHashMap.put(kmdVar, kdgVar);
        }
        return (kdg) kdgVar;
    }
}
