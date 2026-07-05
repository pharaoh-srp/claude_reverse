package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.project.create.UploadMaterialsScreenParams;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lod extends iwe {
    public final UploadMaterialsScreenParams b;
    public final dmd c;
    public final wqd d;
    public final zy1 e;
    public final zy1 f;
    public final wz5 g;
    public final wz5 h;
    public final lsc i;
    public final lsc j;
    public final wz5 k;
    public final wz5 l;
    public final wz5 m;
    public final lsc n;
    public final lsc o;
    public final lsc p;
    public final amd q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lod(UploadMaterialsScreenParams uploadMaterialsScreenParams, oda odaVar, bi7 bi7Var, k21 k21Var, dmd dmdVar, wqd wqdVar, fod fodVar, h86 h86Var) {
        super(h86Var);
        uploadMaterialsScreenParams.getClass();
        this.b = uploadMaterialsScreenParams;
        this.c = dmdVar;
        this.d = wqdVar;
        zy1 zy1VarA = x44.a();
        this.e = zy1VarA;
        this.f = x44.a();
        int i = 0;
        wz5 wz5VarW = mpk.w(new iod(this, i));
        int i2 = 1;
        wz5 wz5VarW2 = mpk.w(new iod(this, i2));
        this.g = wz5VarW2;
        this.h = mpk.w(new iod(this, 2));
        tp4 tp4Var = null;
        lsc lscVarP = mpk.P(null);
        this.i = lscVarP;
        lsc lscVarP2 = mpk.P(null);
        this.j = lscVarP2;
        this.k = mpk.w(new iod(this, 3));
        this.l = mpk.w(new iod(this, 4));
        this.m = mpk.w(new iod(this, 5));
        Boolean bool = Boolean.FALSE;
        this.n = mpk.P(bool);
        this.o = mpk.P(tji.E);
        lsc lscVarP3 = mpk.P(bool);
        this.p = lscVarP3;
        gb9.D(this.a, null, null, new kod(this, tp4Var, i), 3);
        znd zndVar = (znd) fodVar.c.get(uploadMaterialsScreenParams.getTemplateId());
        if (zndVar == null) {
            SilentException.a(new SilentException("Template not found: " + uploadMaterialsScreenParams.getTemplateId()), null, false, 3);
            gb9.D(this.a, null, null, new kod(this, tp4Var, i2), 3);
        } else {
            lscVarP.setValue(zndVar);
            String strM785getProjectId5pmjbU = uploadMaterialsScreenParams.m785getProjectId5pmjbU();
            lscVarP2.setValue(wqdVar.c(strM785getProjectId5pmjbU));
            if (((Project) lscVarP2.getValue()) == null) {
                lscVarP3.setValue(Boolean.TRUE);
                gb9.D(this.a, null, null, new eq(this, strM785getProjectId5pmjbU, tp4Var, 12), 3);
            }
        }
        this.q = new amd(wqdVar, odaVar, bi7Var, k21Var, ((Boolean) wz5VarW.getValue()).booleanValue(), ((Boolean) wz5VarW2.getValue()).booleanValue(), uploadMaterialsScreenParams.m785getProjectId5pmjbU(), zy1VarA, ProjectsEvents$ProjectUploadSource.PROJECT_TEMPLATE_UPLOAD, ((Number) dmdVar.e.getValue()).longValue());
    }

    public final tji O() {
        return (tji) this.o.getValue();
    }

    public final void P(List list, ProjectsEvents$ProjectFileSource projectsEvents$ProjectFileSource) {
        list.getClass();
        projectsEvents$ProjectFileSource.getClass();
        this.n.setValue(Boolean.TRUE);
        gb9.D(this.a, null, null, new b9(list, this, projectsEvents$ProjectFileSource, null, 23), 3).D0(new jod(this, 0));
    }
}
