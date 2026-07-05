package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class wcc {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final ssc g = new ssc(255);

    public final boolean a(xd7 xd7Var, boolean z) throws ParserException, EOFException {
        boolean zD;
        boolean zD2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        ssc sscVar = this.g;
        sscVar.J(27);
        try {
            zD = xd7Var.d(sscVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zD = false;
        }
        if (zD && sscVar.B() == 1332176723) {
            if (sscVar.z() == 0) {
                this.a = sscVar.z();
                this.b = sscVar.p();
                sscVar.q();
                sscVar.q();
                sscVar.q();
                int iZ = sscVar.z();
                this.c = iZ;
                this.d = iZ + 27;
                sscVar.J(iZ);
                try {
                    zD2 = xd7Var.d(sscVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zD2 = false;
                }
                if (zD2) {
                    for (int i = 0; i < this.c; i++) {
                        int iZ2 = sscVar.z();
                        this.f[i] = iZ2;
                        this.e += iZ2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.b("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r10 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r9.getPosition() >= r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r9.g(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.xd7 r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.e()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            defpackage.fd9.E(r0)
            ssc r8 = r8.g
            r0 = 4
            r8.J(r0)
        L1a:
            r3 = -1
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 == 0) goto L2b
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L4b
        L2b:
            byte[] r4 = r8.a
            boolean r4 = r9.d(r4, r1, r0, r2)     // Catch: java.io.EOFException -> L32
            goto L33
        L32:
            r4 = r1
        L33:
            if (r4 == 0) goto L4b
            r8.M(r1)
            long r3 = r8.B()
            r5 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L47
            r9.k()
            return r2
        L47:
            r9.l(r2)
            goto L1a
        L4b:
            if (r3 == 0) goto L55
            long r4 = r9.getPosition()
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto L5d
        L55:
            int r8 = r9.g(r2)
            r0 = -1
            if (r8 == r0) goto L5d
            goto L4b
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcc.b(xd7, long):boolean");
    }
}
