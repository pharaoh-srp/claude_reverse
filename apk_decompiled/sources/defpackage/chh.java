package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class chh implements dhh {
    public final int E;

    public chh(int i, int i2) {
        i = (i2 & 2) != 0 ? Integer.MAX_VALUE : i;
        this.E = i;
        if (1 <= i) {
            return;
        }
        e39.a("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were 1, " + i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && chh.class == obj.getClass() && this.E == ((chh) obj).E;
    }

    public final int hashCode() {
        return 31 + this.E;
    }

    public final String toString() {
        return vb7.r(new StringBuilder("MultiLine(minHeightInLines=1, maxHeightInLines="), this.E, ')');
    }
}
