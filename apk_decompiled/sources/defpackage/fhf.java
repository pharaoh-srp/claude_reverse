package defpackage;

import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes3.dex */
public final class fhf implements hhf {
    public final String a;

    public fhf(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhf) && ProjectId.m1082equalsimpl0(this.a, ((fhf) obj).a);
    }

    public final int hashCode() {
        return ProjectId.m1083hashCodeimpl(this.a);
    }

    public final String toString() {
        return ij0.j("Project(projectId=", ProjectId.m1084toStringimpl(this.a), ")");
    }
}
