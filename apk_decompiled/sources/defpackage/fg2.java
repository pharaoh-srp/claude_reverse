package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fg2 extends axg implements Comparable {
    public long O;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fg2 fg2Var = (fg2) obj;
        if (c(4) != fg2Var.c(4)) {
            return c(4) ? 1 : -1;
        }
        long j = this.K - fg2Var.K;
        if (j == 0) {
            j = this.O - fg2Var.O;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
