package defpackage;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class tcc implements wd7 {
    public yd7 a;
    public iqg b;
    public boolean c;

    @Override // defpackage.wd7
    public final void a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    @Override // defpackage.wd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.xd7 r21, defpackage.xm7 r22) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcc.b(xd7, xm7):int");
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) {
        try {
            return g(xd7Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        iqg iqgVar = this.b;
        if (iqgVar != null) {
            vcc vccVar = iqgVar.a;
            wcc wccVar = vccVar.a;
            wccVar.a = 0;
            wccVar.b = 0L;
            wccVar.c = 0;
            wccVar.d = 0;
            wccVar.e = 0;
            vccVar.b.J(0);
            vccVar.c = -1;
            vccVar.e = false;
            if (j == 0) {
                iqgVar.d(!iqgVar.l);
                return;
            }
            if (iqgVar.h != 0) {
                long j3 = (((long) iqgVar.i) * j2) / 1000000;
                iqgVar.e = j3;
                xcc xccVar = iqgVar.d;
                String str = tpi.a;
                xccVar.l(j3);
                iqgVar.h = 2;
            }
        }
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.a = yd7Var;
    }

    public final boolean g(xd7 xd7Var) {
        boolean zM;
        wcc wccVar = new wcc();
        if (wccVar.a(xd7Var, true) && (wccVar.a & 2) == 2) {
            int iMin = Math.min(wccVar.e, 8);
            ssc sscVar = new ssc(iMin);
            xd7Var.p(sscVar.a, 0, iMin);
            sscVar.M(0);
            if (sscVar.a() >= 5 && sscVar.z() == 127 && sscVar.B() == 1179402563) {
                this.b = new ym7();
                return true;
            }
            sscVar.M(0);
            try {
                zM = nkk.m(1, sscVar, true);
            } catch (ParserException unused) {
                zM = false;
            }
            if (zM) {
                this.b = new v5j();
            } else {
                sscVar.M(0);
                if (sjc.e(sscVar, sjc.o)) {
                    this.b = new sjc();
                }
            }
            return true;
        }
        return false;
    }
}
