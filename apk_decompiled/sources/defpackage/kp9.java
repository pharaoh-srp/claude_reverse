package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kp9 {
    public static final kp9 g;
    public final bz7 a;
    public final bz7 b;
    public final bz7 c;
    public final bz7 d;
    public final bz7 e;
    public final bz7 f;

    static {
        bz7 bz7Var = null;
        g = new kp9(bz7Var, bz7Var, 63);
    }

    public /* synthetic */ kp9(bz7 bz7Var, bz7 bz7Var2, int i) {
        this((i & 1) != 0 ? null : bz7Var, null, null, null, null, (i & 32) != 0 ? null : bz7Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp9)) {
            return false;
        }
        kp9 kp9Var = (kp9) obj;
        return this.a == kp9Var.a && this.b == kp9Var.b && this.c == kp9Var.c && this.d == kp9Var.d && this.e == kp9Var.e && this.f == kp9Var.f;
    }

    public final int hashCode() {
        bz7 bz7Var = this.a;
        int iHashCode = (bz7Var != null ? bz7Var.hashCode() : 0) * 31;
        bz7 bz7Var2 = this.b;
        int iHashCode2 = (iHashCode + (bz7Var2 != null ? bz7Var2.hashCode() : 0)) * 31;
        bz7 bz7Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (bz7Var3 != null ? bz7Var3.hashCode() : 0)) * 31;
        bz7 bz7Var4 = this.d;
        int iHashCode4 = (iHashCode3 + (bz7Var4 != null ? bz7Var4.hashCode() : 0)) * 31;
        bz7 bz7Var5 = this.e;
        int iHashCode5 = (iHashCode4 + (bz7Var5 != null ? bz7Var5.hashCode() : 0)) * 31;
        bz7 bz7Var6 = this.f;
        return iHashCode5 + (bz7Var6 != null ? bz7Var6.hashCode() : 0);
    }

    public kp9(bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, bz7 bz7Var5, bz7 bz7Var6) {
        this.a = bz7Var;
        this.b = bz7Var2;
        this.c = bz7Var3;
        this.d = bz7Var4;
        this.e = bz7Var5;
        this.f = bz7Var6;
    }
}
