package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dv7 implements Comparable {
    public static final dv7 F;
    public static final dv7 G;
    public static final dv7 H;
    public static final dv7 I;
    public static final dv7 J;
    public static final dv7 K;
    public static final dv7 L;
    public static final dv7 M;
    public static final dv7 N;
    public static final dv7 O;
    public final int E;

    static {
        dv7 dv7Var = new dv7(100);
        dv7 dv7Var2 = new dv7(200);
        dv7 dv7Var3 = new dv7(300);
        dv7 dv7Var4 = new dv7(400);
        F = dv7Var4;
        dv7 dv7Var5 = new dv7(500);
        G = dv7Var5;
        dv7 dv7Var6 = new dv7(600);
        H = dv7Var6;
        dv7 dv7Var7 = new dv7(700);
        dv7 dv7Var8 = new dv7(800);
        dv7 dv7Var9 = new dv7(900);
        I = dv7Var3;
        J = dv7Var4;
        K = dv7Var5;
        L = dv7Var6;
        M = dv7Var7;
        N = dv7Var8;
        O = dv7Var9;
        x44.X(dv7Var, dv7Var2, dv7Var3, dv7Var4, dv7Var5, dv7Var6, dv7Var7, dv7Var8, dv7Var9);
    }

    public dv7(int i) {
        this.E = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        c39.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(dv7 dv7Var) {
        return x44.z(this.E, dv7Var.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dv7) {
            return this.E == ((dv7) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return this.E;
    }

    public final String toString() {
        return vb7.r(new StringBuilder("FontWeight(weight="), this.E, ')');
    }
}
