package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t69 {
    public final long a;

    public /* synthetic */ t69(long j) {
        this.a = j;
    }

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t69) {
            return this.a == ((t69) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return vb7.r(sb, (int) (j & 4294967295L), ')');
    }
}
