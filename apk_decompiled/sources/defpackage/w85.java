package defpackage;

import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.project.create.ProjectTemplateId;

/* JADX INFO: loaded from: classes2.dex */
public final class w85 {
    public final Project a;
    public final ProjectTemplateId b;

    public w85(Project project, ProjectTemplateId projectTemplateId) {
        project.getClass();
        projectTemplateId.getClass();
        this.a = project;
        this.b = projectTemplateId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w85)) {
            return false;
        }
        w85 w85Var = (w85) obj;
        return x44.r(this.a, w85Var.a) && x44.r(this.b, w85Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProjectCreated(project=" + this.a + ", templateId=" + this.b + ")";
    }
}
