package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource;
import com.anthropic.claude.project.knowledge.ProjectKnowledgeScreenParams;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wmd extends iwe {
    public static final long q;
    public static final /* synthetic */ int r = 0;
    public final ProjectKnowledgeScreenParams b;
    public final wqd c;
    public final vn5 d;
    public final dmd e;
    public final wz5 f;
    public final wz5 g;
    public final wz5 h;
    public final zy1 i;
    public final amd j;
    public final lsc k;
    public final lsc l;
    public final lsc m;
    public final lsc n;
    public final wz5 o;
    public final wz5 p;

    static {
        lz1 lz1Var = uh6.F;
        q = uh6.f(v40.Q(5, zh6.MINUTES));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmd(ProjectKnowledgeScreenParams projectKnowledgeScreenParams, wqd wqdVar, vn5 vn5Var, oda odaVar, bi7 bi7Var, k21 k21Var, dmd dmdVar, h86 h86Var) {
        super(h86Var);
        projectKnowledgeScreenParams.getClass();
        this.b = projectKnowledgeScreenParams;
        this.c = wqdVar;
        this.d = vn5Var;
        this.e = dmdVar;
        wz5 wz5VarW = mpk.w(new tmd(this, 0));
        wz5 wz5VarW2 = mpk.w(new tmd(this, 1));
        this.f = wz5VarW2;
        this.g = mpk.w(new tmd(this, 2));
        this.h = mpk.w(new tmd(this, 3));
        zy1 zy1VarA = x44.a();
        gb9.D(this.a, null, null, new kza(this, zy1VarA, null, 21), 3);
        this.i = zy1VarA;
        this.j = new amd(wqdVar, odaVar, bi7Var, k21Var, ((Boolean) wz5VarW.getValue()).booleanValue(), ((Boolean) wz5VarW2.getValue()).booleanValue(), projectKnowledgeScreenParams.m809getProjectId5pmjbU(), zy1VarA, ProjectsEvents$ProjectUploadSource.PROJECT_KNOWLEDGE_UPLOAD, ((Number) dmdVar.e.getValue()).longValue());
        Boolean bool = Boolean.FALSE;
        this.k = mpk.P(bool);
        this.l = mpk.P(bool);
        this.m = mpk.P(bool);
        this.n = mpk.P(bool);
        this.o = mpk.w(new tmd(this, 4));
        this.p = mpk.w(new tmd(this, 5));
    }

    public final void O(List list, ProjectsEvents$ProjectFileSource projectsEvents$ProjectFileSource) {
        list.getClass();
        projectsEvents$ProjectFileSource.getClass();
        this.n.setValue(Boolean.TRUE);
        gb9.D(this.a, null, null, new b9(list, this, projectsEvents$ProjectFileSource, null, 22), 3).D0(new umd(this, 0));
    }
}
