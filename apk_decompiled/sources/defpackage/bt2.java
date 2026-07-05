package defpackage;

import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes2.dex */
public final class bt2 implements ft2 {
    public final String a;

    public bt2(String str) {
        str.getClass();
        this.a = str;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt2) && ProjectId.m1082equalsimpl0(this.a, ((bt2) obj).a);
    }

    public final int hashCode() {
        return ProjectId.m1083hashCodeimpl(this.a);
    }

    public final String toString() {
        return ij0.j("Project(projectId=", ProjectId.m1084toStringimpl(this.a), ")");
    }
}
