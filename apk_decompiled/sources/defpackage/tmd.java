package defpackage;

import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.project.ProjectKnowledgeStats;
import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tmd implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ wmd F;

    public /* synthetic */ tmd(wmd wmdVar, int i) {
        this.E = i;
        this.F = wmdVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        wmd wmdVar = this.F;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) wmdVar.e.c.getValue();
                bool.getClass();
                return bool;
            case 1:
                Boolean bool2 = (Boolean) wmdVar.e.d.getValue();
                bool2.getClass();
                return bool2;
            case 2:
                Boolean bool3 = (Boolean) wmdVar.e.f.getValue();
                bool3.getClass();
                return bool3;
            case 3:
                Boolean bool4 = (Boolean) wmdVar.e.g.getValue();
                bool4.getClass();
                return bool4;
            case 4:
                Project projectC = wmdVar.c.c(wmdVar.b.m809getProjectId5pmjbU());
                if (projectC != null) {
                    return projectC.getName();
                }
                return null;
            case 5:
                wqd wqdVar = wmdVar.c;
                String strM809getProjectId5pmjbU = wmdVar.b.m809getProjectId5pmjbU();
                wqdVar.getClass();
                strM809getProjectId5pmjbU.getClass();
                return (ProjectKnowledgeStats) wqdVar.s.get(ProjectId.m1079boximpl(strM809getProjectId5pmjbU));
            default:
                gb9.D(wmdVar.a, null, null, new eq(wmdVar, null), 3);
                return iei.a;
        }
    }
}
