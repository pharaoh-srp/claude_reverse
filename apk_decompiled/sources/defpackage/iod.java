package defpackage;

import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.project.ProjectKnowledgeStats;
import com.anthropic.claude.types.strings.ProjectId;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iod implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lod F;

    public /* synthetic */ iod(lod lodVar, int i) {
        this.E = i;
        this.F = lodVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = null;
        lod lodVar = this.F;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) lodVar.c.c.getValue();
                bool.getClass();
                return bool;
            case 1:
                Boolean bool2 = (Boolean) lodVar.c.d.getValue();
                bool2.getClass();
                return bool2;
            case 2:
                Boolean bool3 = (Boolean) lodVar.c.f.getValue();
                bool3.getClass();
                return bool3;
            case 3:
                wqd wqdVar = lodVar.d;
                String strM785getProjectId5pmjbU = lodVar.b.m785getProjectId5pmjbU();
                wqdVar.getClass();
                strM785getProjectId5pmjbU.getClass();
                return (List) ((Map) wqdVar.o.getValue()).get(ProjectId.m1079boximpl(strM785getProjectId5pmjbU));
            case 4:
                wqd wqdVar2 = lodVar.d;
                String strM785getProjectId5pmjbU2 = lodVar.b.m785getProjectId5pmjbU();
                wqdVar2.getClass();
                strM785getProjectId5pmjbU2.getClass();
                return (List) ((Map) wqdVar2.m.getValue()).get(ProjectId.m1079boximpl(strM785getProjectId5pmjbU2));
            case 5:
                wqd wqdVar3 = lodVar.d;
                String strM785getProjectId5pmjbU3 = lodVar.b.m785getProjectId5pmjbU();
                wqdVar3.getClass();
                strM785getProjectId5pmjbU3.getClass();
                return (ProjectKnowledgeStats) wqdVar3.s.get(ProjectId.m1079boximpl(strM785getProjectId5pmjbU3));
            case 6:
                int iOrdinal = lodVar.O().ordinal();
                if (iOrdinal == 0) {
                    return ieiVar;
                }
                if (iOrdinal != 1) {
                    wg6.i();
                    return null;
                }
                lodVar.o.setValue(tji.E);
                return ieiVar;
            default:
                int iOrdinal2 = lodVar.O().ordinal();
                if (iOrdinal2 == 0) {
                    lodVar.o.setValue(tji.F);
                    return ieiVar;
                }
                if (iOrdinal2 != 1) {
                    wg6.i();
                    return null;
                }
                Project project = (Project) lodVar.j.getValue();
                if (project == null) {
                    ebh.A("Project should not be null.", null, false, 3);
                    return ieiVar;
                }
                gb9.D(lodVar.a, null, null, new kza(lodVar, project.m404getUuid5pmjbU(), tp4Var, 23), 3);
                return ieiVar;
        }
    }
}
