package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lri implements iff {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public lri(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = i;
    }

    @Override // defpackage.iff
    public final long a() {
        return this.d;
    }

    @Override // defpackage.vef
    public final boolean b() {
        return true;
    }

    @Override // defpackage.iff
    public final long c(long j) {
        return this.a[tpi.d(this.b, j, true)];
    }

    @Override // defpackage.vef
    public final uef e(long j) {
        long[] jArr = this.a;
        int iD = tpi.d(jArr, j, true);
        long j2 = jArr[iD];
        long[] jArr2 = this.b;
        xef xefVar = new xef(j2, jArr2[iD]);
        if (j2 >= j || iD == jArr.length - 1) {
            return new uef(xefVar, xefVar);
        }
        int i = iD + 1;
        return new uef(xefVar, new xef(jArr[i], jArr2[i]));
    }

    @Override // defpackage.iff
    public final int f() {
        return this.e;
    }

    @Override // defpackage.vef
    public final long g() {
        return this.c;
    }
}
