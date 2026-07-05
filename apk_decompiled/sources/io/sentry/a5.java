package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public abstract class a5 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a5 a5Var) {
        return Long.valueOf(d()).compareTo(Long.valueOf(a5Var.d()));
    }

    public long b(a5 a5Var) {
        return d() - a5Var.d();
    }

    public long c(a5 a5Var) {
        return (a5Var == null || compareTo(a5Var) >= 0) ? d() : a5Var.d();
    }

    public abstract long d();
}
