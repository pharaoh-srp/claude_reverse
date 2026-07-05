package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c21 {
    public final bpc a;
    public final String b;
    public final boolean c;
    public final zy7 d;

    public c21(bpc bpcVar, String str, boolean z, zy7 zy7Var) {
        bpcVar.getClass();
        str.getClass();
        zy7Var.getClass();
        this.a = bpcVar;
        this.b = str;
        this.c = z;
        this.d = zy7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c21)) {
            return false;
        }
        c21 c21Var = (c21) obj;
        return x44.r(this.a, c21Var.a) && x44.r(this.b, c21Var.b) && this.c == c21Var.c && x44.r(this.d, c21Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fsh.p(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "AttachmentActionState(icon=" + this.a + ", label=" + this.b + ", enabled=" + this.c + ", onClick=" + this.d + ")";
    }
}
