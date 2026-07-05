package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rte {
    public static final rte e = new rte();
    public final pz7 a;
    public final sz7 b;
    public final pz7 c;
    public final sz7 d;

    public rte(pz7 pz7Var, sz7 sz7Var, pz7 pz7Var2, sz7 sz7Var2) {
        pz7Var.getClass();
        sz7Var.getClass();
        pz7Var2.getClass();
        sz7Var2.getClass();
        this.a = pz7Var;
        this.b = sz7Var;
        this.c = pz7Var2;
        this.d = sz7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rte)) {
            return false;
        }
        rte rteVar = (rte) obj;
        return x44.r(this.a, rteVar.a) && x44.r(this.b, rteVar.b) && x44.r(this.c, rteVar.c) && x44.r(this.d, rteVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RichTextThemeConfiguration(textStyleProvider=" + this.a + ", textStyleBackProvider=" + this.b + ", contentColorProvider=" + this.c + ", contentColorBackProvider=" + this.d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rte() {
        byte b = 0;
        this(new qte(b, b), ac4.a, bw9.g0, ac4.b);
    }
}
