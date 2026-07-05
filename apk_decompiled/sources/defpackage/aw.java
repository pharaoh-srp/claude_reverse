package defpackage;

import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes3.dex */
public final class aw implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ Project G;

    public /* synthetic */ aw(bz7 bz7Var, Project project, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = project;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Project project = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(project);
                break;
            case 1:
                bz7Var.invoke(project);
                break;
            case 2:
                bz7Var.invoke(ProjectId.m1079boximpl(project.m404getUuid5pmjbU()));
                break;
            default:
                bz7Var.invoke(project);
                break;
        }
        return ieiVar;
    }
}
