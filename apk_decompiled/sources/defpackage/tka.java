package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class tka implements Iterable, mm9 {
    public final long E;
    public final long F;
    public final long G;

    public tka(long j, long j2, long j3) {
        if (j3 == 0) {
            sz6.p("Step must be non-zero.");
            throw null;
        }
        if (j3 == Long.MIN_VALUE) {
            sz6.p("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.E = j;
        if (j3 > 0) {
            if (j < j2) {
                long j4 = j2 % j3;
                long j5 = j % j3;
                long j6 = ((j4 < 0 ? j4 + j3 : j4) - (j5 < 0 ? j5 + j3 : j5)) % j3;
                j2 -= j6 < 0 ? j6 + j3 : j6;
            }
        } else {
            if (j3 >= 0) {
                sz6.p("Step is zero.");
                throw null;
            }
            if (j > j2) {
                long j7 = -j3;
                long j8 = j % j7;
                long j9 = j2 % j7;
                long j10 = ((j8 < 0 ? j8 + j7 : j8) - (j9 < 0 ? j9 + j7 : j9)) % j7;
                j2 += j10 < 0 ? j10 + j7 : j10;
            }
        }
        this.F = j2;
        this.G = j3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof tka)) {
            return false;
        }
        if (isEmpty() && ((tka) obj).isEmpty()) {
            return true;
        }
        tka tkaVar = (tka) obj;
        return this.E == tkaVar.E && this.F == tkaVar.F && this.G == tkaVar.G;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.G) + vb7.e(Long.hashCode(this.E) * 31, 31, this.F);
    }

    public boolean isEmpty() {
        long j = this.G;
        long j2 = this.F;
        long j3 = this.E;
        return j > 0 ? j3 > j2 : j3 < j2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new uka(this.E, this.F, this.G);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.G;
        long j2 = this.F;
        long j3 = this.E;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append("..");
            sb.append(j2);
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(" downTo ");
            sb.append(j2);
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}
