package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dtb implements bk6 {
    public String e;
    public y3i f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final ssc a = new ssc(new byte[15], 2);
    public final dg2 b = new dg2();
    public final ssc c = new ssc();
    public final s11 p = new s11();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x041b  */
    @Override // defpackage.bk6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ssc r24) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtb.c(ssc):void");
    }

    @Override // defpackage.bk6
    public final void d() {
        this.d = 0;
        this.l = 0;
        this.a.J(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.bk6
    public final void e(boolean z) {
    }

    @Override // defpackage.bk6
    public final void f(yd7 yd7Var, t6f t6fVar) {
        t6fVar.d();
        t6fVar.i();
        this.e = (String) t6fVar.e;
        t6fVar.i();
        this.f = yd7Var.n(t6fVar.c, 1);
    }

    @Override // defpackage.bk6
    public final void g(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }
}
