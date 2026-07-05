package defpackage;

import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes.dex */
public final class phc {
    public final String a;

    public phc(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof phc) && ProjectId.m1082equalsimpl0(this.a, ((phc) obj).a);
    }

    public final int hashCode() {
        return ProjectId.m1083hashCodeimpl(this.a);
    }

    public final String toString() {
        return ij0.j("OpenProjectParams(projectId=", ProjectId.m1084toStringimpl(this.a), ")");
    }
}
