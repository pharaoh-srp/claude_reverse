package defpackage;

import androidx.media3.common.ParserException;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class pt9 implements bk6 {
    public final String a;
    public final int b;
    public final ssc c;
    public final dg2 d;
    public y3i e;
    public String f;
    public jw7 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public pt9(String str, int i) {
        this.a = str;
        this.b = i;
        ssc sscVar = new ssc(FreeTypeConstants.FT_LOAD_NO_RECURSE);
        this.c = sscVar;
        byte[] bArr = sscVar.a;
        this.d = new dg2(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.bk6
    public final void c(ssc sscVar) throws ParserException {
        int iG;
        boolean zF;
        this.e.getClass();
        while (sscVar.a() > 0) {
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    ssc sscVar2 = this.c;
                    dg2 dg2Var = this.d;
                    if (i == 2) {
                        int iZ = ((this.k & (-225)) << 8) | sscVar.z();
                        this.j = iZ;
                        if (iZ > sscVar2.a.length) {
                            sscVar2.J(iZ);
                            byte[] bArr = sscVar2.a;
                            dg2Var.getClass();
                            dg2Var.l(bArr, bArr.length);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i != 3) {
                            e0.b();
                            return;
                        }
                        int iMin = Math.min(sscVar.a(), this.j - this.i);
                        sscVar.k(dg2Var.b, this.i, iMin);
                        int i2 = this.i + iMin;
                        this.i = i2;
                        if (i2 == this.j) {
                            dg2Var.m(0);
                            if (dg2Var.f()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int iG2 = dg2Var.g(1);
                                int iG3 = iG2 == 1 ? dg2Var.g(1) : 0;
                                this.n = iG3;
                                if (iG3 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG2 == 1) {
                                    dg2Var.g((dg2Var.g(2) + 1) * 8);
                                }
                                if (!dg2Var.f()) {
                                    throw ParserException.a(null, null);
                                }
                                this.o = dg2Var.g(6);
                                int iG4 = dg2Var.g(4);
                                int iG5 = dg2Var.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG2 == 0) {
                                    int iE = dg2Var.e();
                                    int iB = dg2Var.b();
                                    p pVarR = x41.r(dg2Var, true);
                                    this.v = pVarR.a;
                                    this.s = pVarR.b;
                                    this.u = pVarR.c;
                                    int iB2 = iB - dg2Var.b();
                                    dg2Var.m(iE);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    dg2Var.h(bArr2, iB2);
                                    iw7 iw7Var = new iw7();
                                    iw7Var.a = this.f;
                                    iw7Var.m = gkb.k("video/mp2t");
                                    iw7Var.n = gkb.k("audio/mp4a-latm");
                                    iw7Var.j = this.v;
                                    iw7Var.F = this.u;
                                    iw7Var.G = this.s;
                                    iw7Var.q = Collections.singletonList(bArr2);
                                    iw7Var.d = this.a;
                                    iw7Var.f = this.b;
                                    jw7 jw7Var = new jw7(iw7Var);
                                    if (!jw7Var.equals(this.g)) {
                                        this.g = jw7Var;
                                        this.t = 1024000000 / ((long) jw7Var.H);
                                        this.e.g(jw7Var);
                                    }
                                } else {
                                    int iB3 = dg2Var.b();
                                    p pVarR2 = x41.r(dg2Var, true);
                                    this.v = pVarR2.a;
                                    this.s = pVarR2.b;
                                    this.u = pVarR2.c;
                                    dg2Var.o(dg2Var.g((dg2Var.g(2) + 1) * 8) - (iB3 - dg2Var.b()));
                                }
                                int iG6 = dg2Var.g(3);
                                this.p = iG6;
                                if (iG6 == 0) {
                                    dg2Var.o(8);
                                } else if (iG6 == 1) {
                                    dg2Var.o(9);
                                } else if (iG6 == 3 || iG6 == 4 || iG6 == 5) {
                                    dg2Var.o(6);
                                } else {
                                    if (iG6 != 6 && iG6 != 7) {
                                        e0.b();
                                        return;
                                    }
                                    dg2Var.o(1);
                                }
                                boolean zF2 = dg2Var.f();
                                this.q = zF2;
                                this.r = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.r = dg2Var.g((dg2Var.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = dg2Var.f();
                                            this.r = (this.r << 8) + ((long) dg2Var.g(8));
                                        } while (zF);
                                    }
                                }
                                if (dg2Var.f()) {
                                    dg2Var.o(8);
                                }
                            }
                            if (this.n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i3 = 0;
                            do {
                                iG = dg2Var.g(8);
                                i3 += iG;
                            } while (iG == 255);
                            int iE2 = dg2Var.e();
                            if ((iE2 & 7) == 0) {
                                sscVar2.M(iE2 >> 3);
                            } else {
                                dg2Var.h(sscVar2.a, i3 * 8);
                                sscVar2.M(0);
                            }
                            this.e.e(i3, sscVar2);
                            fd9.M(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i3, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                dg2Var.o((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iZ2 = sscVar.z();
                    if ((iZ2 & 224) == 224) {
                        this.k = iZ2;
                        this.h = 2;
                    } else if (iZ2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (sscVar.z() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.bk6
    public final void d() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.bk6
    public final void e(boolean z) {
    }

    @Override // defpackage.bk6
    public final void f(yd7 yd7Var, t6f t6fVar) {
        t6fVar.d();
        t6fVar.i();
        this.e = yd7Var.n(t6fVar.c, 1);
        t6fVar.i();
        this.f = (String) t6fVar.e;
    }

    @Override // defpackage.bk6
    public final void g(int i, long j) {
        this.l = j;
    }
}
