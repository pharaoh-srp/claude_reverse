package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w09 implements vef {
    public final yja a;
    public final yja b;
    public long c;

    public w09(long j, long[] jArr, long[] jArr2) {
        fd9.E(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new yja(length);
            this.b = new yja(length);
        } else {
            int i = length + 1;
            yja yjaVar = new yja(i);
            this.a = yjaVar;
            yja yjaVar2 = new yja(i);
            this.b = yjaVar2;
            yjaVar.a(0L);
            yjaVar2.a(0L);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.vef
    public final boolean b() {
        return this.b.b > 0;
    }

    @Override // defpackage.vef
    public final uef e(long j) {
        yja yjaVar = this.b;
        if (yjaVar.b == 0) {
            xef xefVar = xef.c;
            return new uef(xefVar, xefVar);
        }
        int iB = tpi.b(yjaVar, j);
        long jE = yjaVar.e(iB);
        yja yjaVar2 = this.a;
        xef xefVar2 = new xef(jE, yjaVar2.e(iB));
        if (jE == j || iB == yjaVar.b - 1) {
            return new uef(xefVar2, xefVar2);
        }
        int i = iB + 1;
        return new uef(xefVar2, new xef(yjaVar.e(i), yjaVar2.e(i)));
    }

    @Override // defpackage.vef
    public final long g() {
        return this.c;
    }
}
