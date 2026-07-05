package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vm7 {
    public final rp1 a;
    public final vp1 b;
    public sp1 c;
    public final int d;

    public vm7(tp1 tp1Var, vp1 vp1Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = vp1Var;
        this.d = i;
        this.a = new rp1(tp1Var, j, j2, j3, j4, j5);
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int c(xd7 xd7Var, long j, xm7 xm7Var) {
        if (j == xd7Var.getPosition()) {
            return 0;
        }
        xm7Var.a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.xd7 r28, defpackage.xm7 r29) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm7.b(xd7, xm7):int");
    }

    public final void d(long j) {
        sp1 sp1Var = this.c;
        if (sp1Var == null || sp1Var.a != j) {
            rp1 rp1Var = this.a;
            this.c = new sp1(j, rp1Var.a.a(j), rp1Var.c, rp1Var.d, rp1Var.e, rp1Var.f);
        }
    }
}
