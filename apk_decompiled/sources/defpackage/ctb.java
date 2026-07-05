package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class ctb implements bk6 {
    public final ssc a;
    public final om8 b;
    public final String c;
    public final int d;
    public final String e;
    public y3i f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public ctb(String str, int i, String str2) {
        ssc sscVar = new ssc(4);
        this.a = sscVar;
        sscVar.a[0] = -1;
        this.b = new om8();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.bk6
    public final void c(ssc sscVar) {
        this.f.getClass();
        while (sscVar.a() > 0) {
            int i = this.h;
            ssc sscVar2 = this.a;
            if (i == 0) {
                byte[] bArr = sscVar.a;
                int i2 = sscVar.b;
                int i3 = sscVar.c;
                while (true) {
                    if (i2 >= i3) {
                        sscVar.M(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        sscVar.M(i2 + 1);
                        this.k = false;
                        sscVar2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(sscVar.a(), 4 - this.i);
                sscVar.k(sscVar2.a, this.i, iMin);
                int i4 = this.i + iMin;
                this.i = i4;
                if (i4 >= 4) {
                    sscVar2.M(0);
                    int iM = sscVar2.m();
                    om8 om8Var = this.b;
                    if (om8Var.a(iM)) {
                        this.m = om8Var.b;
                        if (!this.j) {
                            this.l = (((long) om8Var.f) * 1000000) / ((long) om8Var.c);
                            iw7 iw7Var = new iw7();
                            iw7Var.a = this.g;
                            iw7Var.m = gkb.k(this.e);
                            iw7Var.n = gkb.k((String) om8Var.g);
                            iw7Var.o = FreeTypeConstants.FT_LOAD_MONOCHROME;
                            iw7Var.F = om8Var.d;
                            iw7Var.G = om8Var.c;
                            iw7Var.d = this.c;
                            iw7Var.f = this.d;
                            this.f.g(new jw7(iw7Var));
                            this.j = true;
                        }
                        sscVar2.M(0);
                        this.f.e(4, sscVar2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    e0.b();
                    return;
                }
                int iMin2 = Math.min(sscVar.a(), this.m - this.i);
                this.f.e(iMin2, sscVar);
                int i5 = this.i + iMin2;
                this.i = i5;
                if (i5 >= this.m) {
                    fd9.M(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.bk6
    public final void d() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.bk6
    public final void e(boolean z) {
    }

    @Override // defpackage.bk6
    public final void f(yd7 yd7Var, t6f t6fVar) {
        t6fVar.d();
        t6fVar.i();
        this.g = (String) t6fVar.e;
        t6fVar.i();
        this.f = yd7Var.n(t6fVar.c, 1);
    }

    @Override // defpackage.bk6
    public final void g(int i, long j) {
        this.n = j;
    }
}
