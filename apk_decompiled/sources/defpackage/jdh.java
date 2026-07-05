package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jdh {
    public final zb0 a;
    public zb0 b;
    public boolean c = false;
    public stb d = null;

    public jdh(zb0 zb0Var, zb0 zb0Var2) {
        this.a = zb0Var;
        this.b = zb0Var2;
    }

    public final stb a() {
        return this.d;
    }

    public final zb0 b() {
        return this.a;
    }

    public final zb0 c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final void e(stb stbVar) {
        this.d = stbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdh)) {
            return false;
        }
        jdh jdhVar = (jdh) obj;
        return x44.r(this.a, jdhVar.a) && x44.r(this.b, jdhVar.b) && this.c == jdhVar.c && x44.r(this.d, jdhVar.d);
    }

    public final void f(boolean z) {
        this.c = z;
    }

    public final void g(zb0 zb0Var) {
        this.b = zb0Var;
    }

    public final int hashCode() {
        int iP = fsh.p((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        stb stbVar = this.d;
        return iP + (stbVar == null ? 0 : stbVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
