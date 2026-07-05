package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class yf9 implements wd7 {
    public yd7 b;
    public int c;
    public int d;
    public int e;
    public xrb g;
    public xd7 h;
    public xg8 i;
    public zsb j;
    public final ssc a = new ssc(2);
    public long f = -1;

    @Override // defpackage.wd7
    public final void a() {
        zsb zsbVar = this.j;
        if (zsbVar != null) {
            zsbVar.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0189  */
    @Override // defpackage.wd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.xd7 r26, defpackage.xm7 r27) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yf9.b(xd7, xm7):int");
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) throws EOFException, InterruptedIOException {
        String strU;
        fr5 fr5Var = (fr5) xd7Var;
        ssc sscVar = this.a;
        sscVar.J(2);
        fr5Var.d(sscVar.a, 0, 2, false);
        if (sscVar.G() == 65496) {
            while (true) {
                sscVar.J(2);
                fr5Var.d(sscVar.a, 0, 2, false);
                int iG = sscVar.G();
                this.d = iG;
                if (iG == 65498) {
                    break;
                }
                sscVar.J(2);
                fr5Var.p(sscVar.a, 0, 2);
                int iG2 = sscVar.G() - 2;
                if (iG2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    fr5Var.j(iG2, false);
                } else {
                    sscVar.J(iG2);
                    fr5Var.d(sscVar.a, 0, iG2, false);
                    if (Objects.equals(sscVar.u(), "http://ns.adobe.com/xap/1.0/") && (strU = sscVar.u()) != null) {
                        String[] strArr = gik.b;
                        for (int i = 0; i < 4; i++) {
                            if (strU.contains(strArr[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            zsb zsbVar = this.j;
            zsbVar.getClass();
            zsbVar.d(j, j2);
        }
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.b = yd7Var;
    }

    public final void g() {
        yd7 yd7Var = this.b;
        yd7Var.getClass();
        yd7Var.j();
        this.b.q(new z91(-9223372036854775807L));
        this.c = 6;
    }
}
