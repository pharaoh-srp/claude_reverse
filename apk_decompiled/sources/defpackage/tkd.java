package defpackage;

import com.anthropic.claude.api.project.ProjectSubtype;
import com.anthropic.claude.api.project.ProjectType;
import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes3.dex */
public final class tkd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final int k;
    public final int l;
    public final ProjectType m;
    public final ProjectSubtype n;

    public tkd(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str5, int i, int i2, ProjectType projectType, ProjectSubtype projectSubtype) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = str5;
        this.k = i;
        this.l = i2;
        this.m = projectType;
        this.n = projectSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkd)) {
            return false;
        }
        tkd tkdVar = (tkd) obj;
        return ProjectId.m1082equalsimpl0(this.a, tkdVar.a) && x44.r(this.b, tkdVar.b) && x44.r(this.c, tkdVar.c) && x44.r(this.d, tkdVar.d) && this.e == tkdVar.e && this.f == tkdVar.f && this.g == tkdVar.g && this.h == tkdVar.h && this.i == tkdVar.i && this.j.equals(tkdVar.j) && this.k == tkdVar.k && this.l == tkdVar.l && this.m == tkdVar.m && this.n == tkdVar.n;
    }

    public final int hashCode() {
        int iL = kgh.l(ProjectId.m1083hashCodeimpl(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iC = vb7.c(this.l, vb7.c(this.k, kgh.l(fsh.p(fsh.p(fsh.p(fsh.p(fsh.p((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31);
        ProjectType projectType = this.m;
        int iHashCode2 = (iC + (projectType == null ? 0 : projectType.hashCode())) * 31;
        ProjectSubtype projectSubtype = this.n;
        return iHashCode2 + (projectSubtype != null ? projectSubtype.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ProjectDetails(id=", ProjectId.m1084toStringimpl(this.a), ", name=", this.b, ", description=");
        kgh.u(sbR, this.c, ", creatorName=", this.d, ", isPrivate=");
        ij0.A(sbR, this.e, ", isArchived=", this.f, ", isStarred=");
        ij0.A(sbR, this.g, ", canDelete=", this.h, ", canEditSettings=");
        sbR.append(this.i);
        sbR.append(", promptTemplate=");
        sbR.append(this.j);
        sbR.append(", docsCount=");
        qy1.k(this.k, this.l, ", filesCount=", ", projectType=", sbR);
        sbR.append(this.m);
        sbR.append(", projectSubtype=");
        sbR.append(this.n);
        sbR.append(")");
        return sbR.toString();
    }
}
