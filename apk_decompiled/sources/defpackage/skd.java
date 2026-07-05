package defpackage;

import com.anthropic.claude.project.create.ProjectTemplateId;
import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes.dex */
public final class skd {
    public final String a;
    public final String b;
    public final ProjectTemplateId c;

    public skd(String str, String str2, ProjectTemplateId projectTemplateId) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = projectTemplateId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skd)) {
            return false;
        }
        skd skdVar = (skd) obj;
        return ProjectId.m1082equalsimpl0(this.a, skdVar.a) && x44.r(this.b, skdVar.b) && x44.r(this.c, skdVar.c);
    }

    public final int hashCode() {
        int iL = kgh.l(ProjectId.m1083hashCodeimpl(this.a) * 31, 31, this.b);
        ProjectTemplateId projectTemplateId = this.c;
        return iL + (projectTemplateId == null ? 0 : projectTemplateId.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ProjectData(id=", ProjectId.m1084toStringimpl(this.a), ", name=", this.b, ", projectTemplateId=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
