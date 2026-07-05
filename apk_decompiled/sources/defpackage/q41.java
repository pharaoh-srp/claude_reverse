package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q41 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public q41(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q41)) {
            return false;
        }
        q41 q41Var = (q41) obj;
        return this.a == q41Var.a && this.b == q41Var.b && this.c == q41Var.c && this.d == q41Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fsh.p(fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "AudioEffectsState(aecAvailable=" + this.a + ", aecEnabled=" + this.b + ", nsAvailable=" + this.c + ", nsEnabled=" + this.d + ")";
    }
}
