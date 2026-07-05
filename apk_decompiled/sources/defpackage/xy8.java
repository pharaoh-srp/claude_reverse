package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xy8 {
    public static final xy8 g = new xy8(false, 0, true, 1, 1, gea.G);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final gea f;

    public xy8(boolean z, int i, boolean z2, int i2, int i3, gea geaVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = geaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy8)) {
            return false;
        }
        xy8 xy8Var = (xy8) obj;
        return this.a == xy8Var.a && this.b == xy8Var.b && this.c == xy8Var.c && this.d == xy8Var.d && this.e == xy8Var.e && x44.r(this.f, xy8Var.f);
    }

    public final int hashCode() {
        return this.f.E.hashCode() + vb7.c(this.e, vb7.c(this.d, fsh.p(vb7.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) lp9.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) np9.a(this.d)) + ", imeAction=" + ((Object) ty8.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}
