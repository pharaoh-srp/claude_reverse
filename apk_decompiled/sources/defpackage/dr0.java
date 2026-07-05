package defpackage;

import com.anthropic.claude.types.strings.ArtifactId;

/* JADX INFO: loaded from: classes3.dex */
public final class dr0 {
    public final Object a;
    public final String b;
    public final String c;
    public final cr0 d;
    public final String e;

    public dr0(ArtifactId artifactId, String str, String str2, cr0 cr0Var, String str3) {
        this.a = artifactId;
        this.b = str;
        this.c = str2;
        this.d = cr0Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr0)) {
            return false;
        }
        dr0 dr0Var = (dr0) obj;
        return x44.r(this.a, dr0Var.a) && this.b.equals(dr0Var.b) && x44.r(this.c, dr0Var.c) && this.d.equals(dr0Var.d) && x44.r(this.e, dr0Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iL = kgh.l((obj == null ? 0 : obj.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.d.hashCode() + ((iL + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtifactGalleryGridItemState(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", body=");
        sb.append(this.d);
        sb.append(", badge=");
        return ij0.m(sb, this.e, ")");
    }
}
