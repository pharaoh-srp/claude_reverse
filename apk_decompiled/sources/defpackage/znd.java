package defpackage;

import com.anthropic.claude.api.project.ProjectSubtype;
import com.anthropic.claude.api.project.ProjectType;
import com.anthropic.claude.project.create.ProjectTemplateId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class znd {
    public final String a;
    public final String b;
    public final p75 c;
    public final pji d;
    public final ProjectType e;
    public final ProjectSubtype f;
    public final String g;
    public final String h;
    public final List i;
    public final ProjectTemplateId j;

    public znd(String str, String str2, p75 p75Var, pji pjiVar, ProjectType projectType, ProjectSubtype projectSubtype, String str3, String str4, List list) {
        str.getClass();
        str2.getClass();
        projectType.getClass();
        projectSubtype.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = p75Var;
        this.d = pjiVar;
        this.e = projectType;
        this.f = projectSubtype;
        this.g = str3;
        this.h = str4;
        this.i = list;
        this.j = new ProjectTemplateId(projectType, projectSubtype);
    }

    public final ProjectTemplateId a() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znd)) {
            return false;
        }
        znd zndVar = (znd) obj;
        return x44.r(this.a, zndVar.a) && x44.r(this.b, zndVar.b) && this.c.equals(zndVar.c) && this.d.equals(zndVar.d) && this.e == zndVar.e && this.f == zndVar.f && x44.r(this.g, zndVar.g) && x44.r(this.h, zndVar.h) && this.i.equals(zndVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + kgh.l(kgh.l((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ProjectTemplate(title=", this.a, ", projectDescription=", this.b, ", createProjectText=");
        sbR.append(this.c);
        sbR.append(", uploadMaterialText=");
        sbR.append(this.d);
        sbR.append(", type=");
        sbR.append(this.e);
        sbR.append(", subtype=");
        sbR.append(this.f);
        sbR.append(", customInstructions=");
        kgh.u(sbR, this.g, ", iconType=", this.h, ", starterPrompts=");
        return gid.q(sbR, this.i, ")");
    }
}
