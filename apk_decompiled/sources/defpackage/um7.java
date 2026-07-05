package defpackage;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class um7 implements vp1 {
    public final zm7 E;
    public final int F;
    public final xm7 G = new xm7();

    public um7(zm7 zm7Var, int i) {
        this.E = zm7Var;
        this.F = i;
    }

    public final long a(xd7 xd7Var) {
        xm7 xm7Var;
        zm7 zm7Var;
        int iH;
        while (true) {
            long jE = xd7Var.e();
            long length = xd7Var.getLength() - 6;
            xm7Var = this.G;
            zm7Var = this.E;
            if (jE >= length) {
                break;
            }
            long jE2 = xd7Var.e();
            ssc sscVar = new ssc(17);
            int i = 0;
            boolean zE = false;
            xd7Var.p(sscVar.a, 0, 2);
            char cG = sscVar.g(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.F;
            if (cG != i2) {
                xd7Var.k();
                xd7Var.f((int) (jE2 - xd7Var.getPosition()));
            } else {
                byte[] bArr = sscVar.a;
                while (i < 15 && (iH = xd7Var.h(bArr, 2 + i, 15 - i)) != -1) {
                    i += iH;
                }
                sscVar.L(i + 2);
                xd7Var.k();
                xd7Var.f((int) (jE2 - xd7Var.getPosition()));
                zE = gmk.e(sscVar, zm7Var, i2, xm7Var);
            }
            if (zE) {
                break;
            }
            xd7Var.f(1);
        }
        if (xd7Var.e() < xd7Var.getLength() - 6) {
            return xm7Var.a;
        }
        xd7Var.f((int) (xd7Var.getLength() - xd7Var.e()));
        return zm7Var.j;
    }

    @Override // defpackage.vp1
    public final up1 b(xd7 xd7Var, long j) {
        long position = xd7Var.getPosition();
        long jA = a(xd7Var);
        long jE = xd7Var.e();
        xd7Var.f(Math.max(6, this.E.c));
        long jA2 = a(xd7Var);
        return (jA > j || jA2 <= j) ? jA2 <= j ? new up1(jA2, -2, xd7Var.e()) : new up1(jA, -1, position) : new up1(-9223372036854775807L, 0, jE);
    }
}
