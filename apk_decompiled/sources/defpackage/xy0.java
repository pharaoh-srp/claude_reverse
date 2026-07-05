package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xy0 extends ty0 {
    public final char a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public xy0(char c, int i, int i2, String str, String str2) {
        str2.getClass();
        this.a = c;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy0)) {
            return false;
        }
        xy0 xy0Var = (xy0) obj;
        return this.a == xy0Var.a && this.b == xy0Var.b && this.c == xy0Var.c && this.d.equals(xy0Var.d) && x44.r(this.e, xy0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kgh.l(vb7.c(this.c, vb7.c(this.b, Character.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AstFencedCodeBlock(fenceChar=");
        sb.append(this.a);
        sb.append(", fenceLength=");
        sb.append(this.b);
        sb.append(", fenceIndent=");
        sb.append(this.c);
        sb.append(", info=");
        sb.append(this.d);
        sb.append(", literal=");
        return ij0.m(sb, this.e, ")");
    }
}
