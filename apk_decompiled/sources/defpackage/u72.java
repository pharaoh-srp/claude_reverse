package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u72 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public u72(long j, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u72)) {
            return false;
        }
        u72 u72Var = (u72) obj;
        return this.a == u72Var.a && this.b == u72Var.b && this.c == u72Var.c && this.d == u72Var.d && this.e == u72Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + vb7.c(this.d, vb7.c(this.c, vb7.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarMonth(year=");
        sb.append(this.a);
        sb.append(", month=");
        sb.append(this.b);
        sb.append(", numberOfDays=");
        sb.append(this.c);
        sb.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb.append(this.d);
        sb.append(", startUtcTimeMillis=");
        return ebh.p(sb, this.e, ')');
    }
}
