package defpackage;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class yag {
    public final long a;
    public final long b;
    public final int c;

    public yag(long j, int i, long j2) {
        fd9.E(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yag.class == obj.getClass()) {
            yag yagVar = (yag) obj;
            if (this.a == yagVar.a && this.b == yagVar.b && this.c == yagVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = tpi.a;
        Locale locale = Locale.US;
        StringBuilder sbW = grc.w(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        sbW.append(this.b);
        sbW.append(", speedDivisor=");
        sbW.append(this.c);
        return sbW.toString();
    }
}
