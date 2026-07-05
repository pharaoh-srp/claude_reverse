package defpackage;

import com.anthropic.claude.api.project.ProjectDoc;
import com.anthropic.claude.types.strings.ProjectId;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class dnd implements fnd {
    public final String a;
    public final String b;
    public final Date c;
    public final String d;
    public final ProjectDoc e;

    public dnd(String str, String str2, Date date, String str3, ProjectDoc projectDoc) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        projectDoc.getClass();
        this.a = str;
        this.b = str2;
        this.c = date;
        this.d = str3;
        this.e = projectDoc;
    }

    @Override // defpackage.fnd
    public final Date a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnd)) {
            return false;
        }
        dnd dndVar = (dnd) obj;
        return ProjectId.m1082equalsimpl0(this.a, dndVar.a) && x44.r(this.b, dndVar.b) && x44.r(this.c, dndVar.c) && x44.r(this.d, dndVar.d) && x44.r(this.e, dndVar.e);
    }

    @Override // defpackage.fnd
    public final String getFileName() {
        return this.b;
    }

    @Override // defpackage.fnd
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        int iL = kgh.l(ProjectId.m1083hashCodeimpl(this.a) * 31, 31, this.b);
        Date date = this.c;
        return this.e.hashCode() + kgh.l((iL + (date == null ? 0 : date.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("DocKnowledgeUpload(projectId=", ProjectId.m1084toStringimpl(this.a), ", fileName=", this.b, ", createdAt=");
        sbR.append(this.c);
        sbR.append(", id=");
        sbR.append(this.d);
        sbR.append(", doc=");
        sbR.append(this.e);
        sbR.append(")");
        return sbR.toString();
    }
}
