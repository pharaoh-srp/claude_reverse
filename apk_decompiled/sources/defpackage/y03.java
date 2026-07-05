package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y03 extends b13 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public y03(int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = true;
        this.d = true;
        this.e = i > 0;
    }

    public static y03 c(y03 y03Var, int i) {
        return new y03(i, y03Var.b);
    }

    @Override // defpackage.b13
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.b13
    public final boolean b() {
        return this.c;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y03)) {
            return false;
        }
        y03 y03Var = (y03) obj;
        return this.a == y03Var.a && this.b == y03Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Sending(attempt=" + this.a + ", isCompletionRetry=" + this.b + ")";
    }

    public /* synthetic */ y03(boolean z) {
        this(0, z);
    }
}
