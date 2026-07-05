package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvd {
    public final /* synthetic */ int a;
    public final frh b;
    public final ssc c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public nvd(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new frh(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new ssc();
                break;
            default:
                this.b = new frh(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new ssc();
                break;
        }
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(ssc sscVar) {
        int i = sscVar.b;
        if (sscVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        sscVar.k(bArr, 0, 9);
        sscVar.M(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(xd7 xd7Var) {
        int i = this.a;
        ssc sscVar = this.c;
        switch (i) {
            case 0:
                byte[] bArr = tpi.b;
                sscVar.getClass();
                sscVar.K(bArr, bArr.length);
                this.d = true;
                xd7Var.k();
                break;
            default:
                byte[] bArr2 = tpi.b;
                sscVar.getClass();
                sscVar.K(bArr2, bArr2.length);
                this.d = true;
                xd7Var.k();
                break;
        }
    }
}
