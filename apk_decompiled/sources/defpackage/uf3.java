package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class uf3 implements vef {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public uf3(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.vef
    public final boolean b() {
        return true;
    }

    @Override // defpackage.vef
    public final uef e(long j) {
        long[] jArr = this.e;
        int iD = tpi.d(jArr, j, true);
        long j2 = jArr[iD];
        long[] jArr2 = this.c;
        xef xefVar = new xef(j2, jArr2[iD]);
        if (j2 >= j || iD == this.a - 1) {
            return new uef(xefVar, xefVar);
        }
        int i = iD + 1;
        return new uef(xefVar, new xef(jArr[i], jArr2[i]));
    }

    @Override // defpackage.vef
    public final long g() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
