package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public final class se5 {
    public final Instant a;
    public final double b;

    public se5(double d, Instant instant) {
        this.a = instant;
        this.b = d;
        quj.k(d, "revolutionsPerMinute");
        quj.m(Double.valueOf(d), Double.valueOf(10000.0d), "revolutionsPerMinute");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se5)) {
            return false;
        }
        se5 se5Var = (se5) obj;
        return this.a.equals(se5Var.a) && this.b == se5Var.b;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Sample(time=" + this.a + ", revolutionsPerMinute=" + this.b + ')';
    }
}
