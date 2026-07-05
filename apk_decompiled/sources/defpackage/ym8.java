package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ym8 {
    public final l9e a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ym8(l9e l9eVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = l9eVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final l9e a() {
        return this.a;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym8)) {
            return false;
        }
        ym8 ym8Var = (ym8) obj;
        return this.a.equals(ym8Var.a) && this.b == ym8Var.b && this.c == ym8Var.c && this.d == ym8Var.d && this.e == ym8Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + fsh.p(fsh.p(fsh.p(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HingeInfo(bounds=");
        sb.append(this.a);
        sb.append(", isFlat=");
        sb.append(this.b);
        sb.append(", isVertical=");
        sb.append(this.c);
        sb.append(", isSeparating=");
        sb.append(this.d);
        sb.append(", isOccluding=");
        return y6a.p(sb, this.e, ')');
    }
}
