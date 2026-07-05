package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nbj {
    public final int a;
    public long b;
    public long c;

    public nbj(int i) {
        this.a = i;
    }

    public static void b(nbj nbjVar, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (nbjVar) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = nbjVar.b + j;
                nbjVar.b = j3;
                long j4 = nbjVar.c + j2;
                nbjVar.c = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized long a() {
        return this.b - this.c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.a + ", total=" + this.b + ", acknowledged=" + this.c + ", unacknowledged=" + a() + ')';
    }
}
