package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class kqi implements Comparable, Serializable {
    public static final kqi G = new kqi(0, 0);
    public final long E;
    public final long F;

    public kqi(long j, long j2) {
        this.E = j;
        this.F = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        kqi kqiVar = (kqi) obj;
        kqiVar.getClass();
        long j = kqiVar.E;
        long j2 = this.E;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.F, kqiVar.F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqi)) {
            return false;
        }
        kqi kqiVar = (kqi) obj;
        return this.E == kqiVar.E && this.F == kqiVar.F;
    }

    public final int hashCode() {
        return Long.hashCode(this.E ^ this.F);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        mpk.E(this.E, bArr, 0, 0, 4);
        bArr[8] = 45;
        mpk.E(this.E, bArr, 9, 4, 6);
        bArr[13] = 45;
        mpk.E(this.E, bArr, 14, 6, 8);
        bArr[18] = 45;
        mpk.E(this.F, bArr, 19, 0, 2);
        bArr[23] = 45;
        mpk.E(this.F, bArr, 24, 2, 8);
        return isg.e0(bArr);
    }
}
