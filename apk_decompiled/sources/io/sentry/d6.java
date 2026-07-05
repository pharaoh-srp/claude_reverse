package io.sentry;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class d6 extends a5 {
    public final Date E;
    public final long F;

    public d6() {
        this(p.k(), System.nanoTime());
    }

    @Override // io.sentry.a5, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(a5 a5Var) {
        if (!(a5Var instanceof d6)) {
            return super.compareTo(a5Var);
        }
        d6 d6Var = (d6) a5Var;
        long time = this.E.getTime();
        long time2 = d6Var.E.getTime();
        return time == time2 ? Long.valueOf(this.F).compareTo(Long.valueOf(d6Var.F)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.a5
    public final long b(a5 a5Var) {
        return a5Var instanceof d6 ? this.F - ((d6) a5Var).F : super.b(a5Var);
    }

    @Override // io.sentry.a5
    public final long c(a5 a5Var) {
        if (a5Var == null || !(a5Var instanceof d6)) {
            return super.c(a5Var);
        }
        d6 d6Var = (d6) a5Var;
        long j = d6Var.F;
        int iCompareTo = compareTo(a5Var);
        long j2 = this.F;
        if (iCompareTo < 0) {
            return d() + (j - j2);
        }
        return d6Var.d() + (j2 - j);
    }

    @Override // io.sentry.a5
    public final long d() {
        return this.E.getTime() * 1000000;
    }

    public d6(Date date, long j) {
        this.E = date;
        this.F = j;
    }
}
