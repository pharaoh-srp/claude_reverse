package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sl2 {
    public final nl2 a;
    public final long b;
    public final int c;
    public final Throwable d;

    public sl2(nl2 nl2Var, long j, int i, Throwable th) {
        this.a = nl2Var;
        this.b = j;
        this.c = i;
        this.d = th;
    }

    public static sl2 a(sl2 sl2Var, int i, Throwable th) {
        nl2 nl2Var = sl2Var.a;
        long j = sl2Var.b;
        sl2Var.getClass();
        nl2Var.getClass();
        return new sl2(nl2Var, j, i, th);
    }

    public final int b() {
        return this.c;
    }

    public final nl2 c() {
        return this.a;
    }

    public final Throwable d() {
        return this.d;
    }

    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl2)) {
            return false;
        }
        sl2 sl2Var = (sl2) obj;
        return x44.r(this.a, sl2Var.a) && this.b == sl2Var.b && this.c == sl2Var.c && x44.r(this.d, sl2Var.d);
    }

    public final int hashCode() {
        int iC = vb7.c(this.c, vb7.e(this.a.hashCode() * 31, 31, this.b), 31);
        Throwable th = this.d;
        return iC + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "InProgressSendRetry(context=" + this.a + ", startTime=" + this.b + ", attemptCount=" + this.c + ", lastError=" + this.d + ")";
    }

    public /* synthetic */ sl2(nl2 nl2Var, long j) {
        this(nl2Var, j, 0, null);
    }
}
