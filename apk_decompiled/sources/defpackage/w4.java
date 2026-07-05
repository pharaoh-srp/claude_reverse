package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class w4 implements bk6 {
    public final /* synthetic */ int a;
    public final dg2 b;
    public final ssc c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public y3i h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public jw7 m;
    public int n;
    public long o;

    public w4(int i, int i2, String str, String str2) {
        this.a = i2;
        switch (i2) {
            case 1:
                dg2 dg2Var = new dg2(new byte[16], 16);
                this.b = dg2Var;
                this.c = new ssc(dg2Var.b);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                dg2 dg2Var2 = new dg2(new byte[FreeTypeConstants.FT_LOAD_PEDANTIC], FreeTypeConstants.FT_LOAD_PEDANTIC);
                this.b = dg2Var2;
                this.c = new ssc(dg2Var2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    private final void a(boolean z) {
    }

    private final void b(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x041e  */
    @Override // defpackage.bk6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ssc r31) {
        /*
            Method dump skipped, instruction units count: 1334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4.c(ssc):void");
    }

    @Override // defpackage.bk6
    public final void d() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.bk6
    public final void e(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.bk6
    public final void f(yd7 yd7Var, t6f t6fVar) {
        switch (this.a) {
            case 0:
                t6fVar.d();
                t6fVar.i();
                this.g = (String) t6fVar.e;
                t6fVar.i();
                this.h = yd7Var.n(t6fVar.c, 1);
                break;
            default:
                t6fVar.d();
                t6fVar.i();
                this.g = (String) t6fVar.e;
                t6fVar.i();
                this.h = yd7Var.n(t6fVar.c, 1);
                break;
        }
    }

    @Override // defpackage.bk6
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w4(String str) {
        this(0, 0, null, str);
        this.a = 0;
    }
}
