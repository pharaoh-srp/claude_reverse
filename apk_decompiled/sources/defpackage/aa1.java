package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aa1 implements wd7 {
    public final ssc a;
    public final z4 b;
    public final boolean c;
    public final bm4 d;
    public int e;
    public yd7 f;
    public ba1 g;
    public long h;
    public wf3[] i;
    public long j;
    public wf3 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public aa1(int i, bm4 bm4Var) {
        this.d = bm4Var;
        this.c = (i & 1) == 0;
        this.a = new ssc(12);
        this.b = new z4();
        this.f = new zl4(14);
        this.i = new wf3[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.wd7
    public final void a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    @Override // defpackage.wd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.xd7 r23, defpackage.xm7 r24) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa1.b(xd7, xm7):int");
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) {
        ssc sscVar = this.a;
        xd7Var.p(sscVar.a, 0, 12);
        sscVar.M(0);
        if (sscVar.o() != 1179011410) {
            return false;
        }
        sscVar.N(4);
        return sscVar.o() == 541677121;
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (wf3 wf3Var : this.i) {
            if (wf3Var.k == 0) {
                wf3Var.i = 0;
            } else {
                wf3Var.i = wf3Var.n[tpi.d(wf3Var.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.e = 0;
        if (this.c) {
            yd7Var = new s31(yd7Var, this.d);
        }
        this.f = yd7Var;
        this.j = -1L;
    }
}
