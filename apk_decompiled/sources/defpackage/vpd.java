package defpackage;

import com.anthropic.claude.models.organization.configtypes.ProjectsLimitsConfig;

/* JADX INFO: loaded from: classes.dex */
public final class vpd {
    public final koi a;
    public final dmd b;
    public final wlg c;
    public final wz5 d = mpk.x(new dg8(23, this), a5.N);

    public vpd(koi koiVar, dmd dmdVar, rc8 rc8Var) {
        this.a = koiVar;
        this.b = dmdVar;
        this.c = rc8Var.g("claude_ai_projects_limits", iv1.J(jce.b(ProjectsLimitsConfig.class)));
    }
}
