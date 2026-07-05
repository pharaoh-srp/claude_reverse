package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public final class lng {
    public final Instant a;
    public final double b;

    public lng(double d, Instant instant) {
        this.a = instant;
        this.b = d;
        quj.k(d, "rate");
        quj.m(Double.valueOf(d), Double.valueOf(10000.0d), "rate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lng)) {
            return false;
        }
        lng lngVar = (lng) obj;
        return this.a.equals(lngVar.a) && this.b == lngVar.b;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Sample(time=" + this.a + ", rate=" + this.b + ')';
    }
}
