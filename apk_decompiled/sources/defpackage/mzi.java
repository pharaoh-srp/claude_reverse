package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mzi {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final bz7 d;

    public mzi(String str, boolean z, boolean z2, bz7 bz7Var) {
        str.getClass();
        bz7Var.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = bz7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzi)) {
            return false;
        }
        mzi mziVar = (mzi) obj;
        return x44.r(this.a, mziVar.a) && this.b == mziVar.b && this.c == mziVar.c && x44.r(this.d, mziVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fsh.p(fsh.p(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "VisibilitySettingsParam(organizationName=" + this.a + ", isPrivate=" + this.b + ", canCreatePublicProject=" + this.c + ", onIsPrivateChanged=" + this.d + ")";
    }
}
