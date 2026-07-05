package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class gs1 extends oe5 {
    public final Date c;

    public gs1(Date date) {
        this.c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs1) && x44.r(this.c, ((gs1) obj).c);
    }

    public final int hashCode() {
        Date date = this.c;
        if (date == null) {
            return 0;
        }
        return date.hashCode();
    }

    public final Date j() {
        return this.c;
    }

    public final String toString() {
        return "RateLimitExceeded(resetsAt=" + this.c + ")";
    }
}
