package defpackage;

import io.sentry.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class b0d implements r8i {
    public final bk6 a;
    public final dg2 b = new dg2(new byte[10], 10);
    public int c = 0;
    public int d;
    public frh e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public b0d(bk6 bk6Var) {
        this.a = bk6Var;
    }

    @Override // defpackage.r8i
    public final void a(frh frhVar, yd7 yd7Var, t6f t6fVar) {
        this.e = frhVar;
        this.a.f(yd7Var, t6fVar);
    }

    @Override // defpackage.r8i
    public final void b(int i, ssc sscVar) {
        int i2;
        int i3;
        this.e.getClass();
        int i4 = i & 1;
        int i5 = -1;
        int i6 = 2;
        bk6 bk6Var = this.a;
        if (i4 != 0) {
            int i7 = this.c;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    ysj.u("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i7 != 3) {
                        e0.b();
                        return;
                    }
                    if (this.j != -1) {
                        ysj.u("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    bk6Var.e(sscVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i8 = i;
        while (sscVar.a() > 0) {
            int i9 = this.c;
            if (i9 != 0) {
                dg2 dg2Var = this.b;
                if (i9 != 1) {
                    if (i9 == i6) {
                        if (c(sscVar, dg2Var.b, Math.min(10, this.i)) && c(sscVar, null, this.i)) {
                            dg2Var.m(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                dg2Var.o(4);
                                long jG = ((long) dg2Var.g(3)) << 30;
                                dg2Var.o(1);
                                long jG2 = ((long) (dg2Var.g(15) << 15)) | jG;
                                dg2Var.o(1);
                                long jG3 = jG2 | ((long) dg2Var.g(15));
                                dg2Var.o(1);
                                if (!this.h && this.g) {
                                    dg2Var.o(4);
                                    long jG4 = ((long) dg2Var.g(3)) << 30;
                                    dg2Var.o(1);
                                    long jG5 = jG4 | ((long) (dg2Var.g(15) << 15));
                                    dg2Var.o(1);
                                    long jG6 = jG5 | ((long) dg2Var.g(15));
                                    dg2Var.o(1);
                                    this.e.b(jG6);
                                    this.h = true;
                                }
                                this.l = this.e.b(jG3);
                            }
                            i8 |= this.k ? 4 : 0;
                            bk6Var.g(i8, this.l);
                            this.c = 3;
                            this.d = 0;
                            i5 = -1;
                            i6 = 2;
                        }
                    } else {
                        if (i9 != 3) {
                            e0.b();
                            return;
                        }
                        int iA = sscVar.a();
                        int i10 = this.j;
                        int i11 = i10 == i5 ? 0 : iA - i10;
                        if (i11 > 0) {
                            iA -= i11;
                            sscVar.L(sscVar.b + iA);
                        }
                        bk6Var.c(sscVar);
                        int i12 = this.j;
                        if (i12 != i5) {
                            int i13 = i12 - iA;
                            this.j = i13;
                            if (i13 == 0) {
                                bk6Var.e(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                    i2 = i6;
                } else if (c(sscVar, dg2Var.b, 9)) {
                    dg2Var.m(0);
                    int iG = dg2Var.g(24);
                    if (iG != 1) {
                        ebh.z("Unexpected start code prefix: ", iG, "PesReader");
                        i5 = -1;
                        this.j = -1;
                        i3 = 0;
                        i2 = 2;
                    } else {
                        dg2Var.o(8);
                        int iG2 = dg2Var.g(16);
                        dg2Var.o(5);
                        this.k = dg2Var.f();
                        i2 = 2;
                        dg2Var.o(2);
                        this.f = dg2Var.f();
                        this.g = dg2Var.f();
                        dg2Var.o(6);
                        int iG3 = dg2Var.g(8);
                        this.i = iG3;
                        if (iG2 == 0) {
                            this.j = -1;
                            i5 = -1;
                        } else {
                            int i14 = (iG2 - 3) - iG3;
                            this.j = i14;
                            if (i14 < 0) {
                                ysj.u("PesReader", "Found negative packet payload size: " + this.j);
                                i5 = -1;
                                this.j = -1;
                            } else {
                                i5 = -1;
                            }
                        }
                        i3 = 2;
                    }
                    this.c = i3;
                    this.d = 0;
                } else {
                    i5 = -1;
                    i2 = 2;
                }
            } else {
                i2 = i6;
                sscVar.N(sscVar.a());
            }
            i6 = i2;
        }
    }

    public final boolean c(ssc sscVar, byte[] bArr, int i) {
        int iMin = Math.min(sscVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            sscVar.N(iMin);
        } else {
            sscVar.k(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.r8i
    public final void d() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.d();
    }
}
