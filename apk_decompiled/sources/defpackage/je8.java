package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class je8 implements bk6 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final vff a;
    public final ssc b;
    public final boolean[] c = new boolean[4];
    public final he8 d;
    public final a87 e;
    public ie8 f;
    public long g;
    public String h;
    public y3i i;
    public boolean j;
    public long k;

    public je8(vff vffVar) {
        this.a = vffVar;
        he8 he8Var = new he8();
        he8Var.e = new byte[FreeTypeConstants.FT_LOAD_PEDANTIC];
        this.d = he8Var;
        this.k = -9223372036854775807L;
        this.e = new a87(178);
        this.b = new ssc();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0234  */
    @Override // defpackage.bk6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ssc r20) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je8.c(ssc):void");
    }

    @Override // defpackage.bk6
    public final void d() {
        stj.k(this.c);
        he8 he8Var = this.d;
        he8Var.a = false;
        he8Var.c = 0;
        he8Var.b = 0;
        ie8 ie8Var = this.f;
        if (ie8Var != null) {
            ie8Var.b = false;
            ie8Var.c = false;
            ie8Var.d = false;
            ie8Var.e = -1;
        }
        a87 a87Var = this.e;
        if (a87Var != null) {
            a87Var.d();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.bk6
    public final void e(boolean z) {
        this.f.getClass();
        if (z) {
            this.f.b(0, this.g, this.j);
            ie8 ie8Var = this.f;
            ie8Var.b = false;
            ie8Var.c = false;
            ie8Var.d = false;
            ie8Var.e = -1;
        }
    }

    @Override // defpackage.bk6
    public final void f(yd7 yd7Var, t6f t6fVar) {
        t6fVar.d();
        t6fVar.i();
        this.h = (String) t6fVar.e;
        t6fVar.i();
        y3i y3iVarN = yd7Var.n(t6fVar.c, 2);
        this.i = y3iVarN;
        this.f = new ie8(y3iVarN);
        this.a.b(yd7Var, t6fVar);
    }

    @Override // defpackage.bk6
    public final void g(int i, long j) {
        this.k = j;
    }
}
