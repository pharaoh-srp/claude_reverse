package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a67 extends e67 {
    public final int a;

    public a67(int i) {
        this.a = i;
        if (i < 0 || i >= 11) {
            sz6.p("RPE value must be between 0 and 10, inclusive.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a67) {
            return this.a == ((a67) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.r(new StringBuilder("RateOfPerceivedExertionTarget(rpe="), this.a, ')');
    }
}
