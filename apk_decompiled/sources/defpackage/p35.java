package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p35 {
    public final va6 a;
    public final va6 b;
    public final va6 c;
    public final va6 d;

    public p35(va6 va6Var, va6 va6Var2, va6 va6Var3, va6 va6Var4) {
        this.a = va6Var;
        this.b = va6Var2;
        this.c = va6Var3;
        this.d = va6Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p35)) {
            return false;
        }
        p35 p35Var = (p35) obj;
        return x44.r(this.a, p35Var.a) && x44.r(this.b, p35Var.b) && x44.r(this.c, p35Var.c) && x44.r(this.d, p35Var.d);
    }

    public final int hashCode() {
        va6 va6Var = this.a;
        int iHashCode = (va6Var == null ? 0 : Float.hashCode(va6Var.E)) * 31;
        va6 va6Var2 = this.b;
        int iHashCode2 = (iHashCode + (va6Var2 == null ? 0 : Float.hashCode(va6Var2.E))) * 31;
        va6 va6Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (va6Var3 == null ? 0 : Float.hashCode(va6Var3.E))) * 31;
        va6 va6Var4 = this.d;
        return iHashCode3 + (va6Var4 != null ? Float.hashCode(va6Var4.E) : 0);
    }

    public final String toString() {
        return "CornerRadii(topLeft=" + this.a + ", topRight=" + this.b + ", bottomRight=" + this.c + ", bottomLeft=" + this.d + ')';
    }
}
