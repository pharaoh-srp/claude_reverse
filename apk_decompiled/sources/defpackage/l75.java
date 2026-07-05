package defpackage;

import com.anthropic.claude.api.project.Project;

/* JADX INFO: loaded from: classes2.dex */
public final class l75 {
    public final Project a;

    public l75(Project project) {
        project.getClass();
        this.a = project;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l75) && x44.r(this.a, ((l75) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProjectCreated(project=" + this.a + ")";
    }
}
