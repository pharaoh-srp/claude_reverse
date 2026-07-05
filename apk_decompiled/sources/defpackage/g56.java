package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g56 {
    public final n56 a;
    public final String b;
    public final f56 c;

    public g56(n56 n56Var, String str, f56 f56Var) {
        n56Var.getClass();
        str.getClass();
        this.a = n56Var;
        this.b = str;
        this.c = f56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g56)) {
            return false;
        }
        g56 g56Var = (g56) obj;
        return this.a == g56Var.a && x44.r(this.b, g56Var.b) && this.c == g56Var.c;
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        f56 f56Var = this.c;
        return iL + (f56Var == null ? 0 : f56Var.hashCode());
    }

    public final String toString() {
        return "DirectoryQuery(sort=" + this.a + ", q=" + this.b + ", category=" + this.c + ")";
    }

    public /* synthetic */ g56(String str, int i) {
        this(n56.F, (i & 2) != 0 ? "" : str, null);
    }
}
