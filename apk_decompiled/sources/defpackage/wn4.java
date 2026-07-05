package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class wn4 extends hqb implements oe4, s5b {
    public ukc S;
    public final raf T;
    public boolean U;
    public xx1 V;
    public final u9f W;
    public boolean Y;
    public boolean a0;
    public final gmf X = new gmf(5);
    public long Z = -1;

    public wn4(ukc ukcVar, raf rafVar, boolean z, xx1 xx1Var, u9f u9fVar) {
        this.S = ukcVar;
        this.T = rafVar;
        this.U = z;
        this.V = xx1Var;
        this.W = u9fVar;
    }

    public static final float p1(wn4 wn4Var, xx1 xx1Var, long j) {
        float f;
        l9e l9eVar;
        int iCompare;
        long j2 = wn4Var.Z;
        wwb wwbVar = (wwb) wn4Var.X.F;
        int i = wwbVar.G - 1;
        Object[] objArr = wwbVar.E;
        if (i < objArr.length) {
            l9eVar = null;
            while (true) {
                if (i < 0) {
                    f = MTTypesetterKt.kLineSkipLimitMultiplier;
                    break;
                }
                l9e l9eVar2 = (l9e) ((tn4) objArr[i]).a.a();
                if (l9eVar2 != null) {
                    long jG = l9eVar2.g();
                    long jT = csg.T(wn4Var.q1());
                    f = MTTypesetterKt.kLineSkipLimitMultiplier;
                    int iOrdinal = wn4Var.S.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jG & 4294967295L)), Float.intBitsToFloat((int) (jT & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            mr9.b();
                            return MTTypesetterKt.kLineSkipLimitMultiplier;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jG >> 32)), Float.intBitsToFloat((int) (jT >> 32)));
                    }
                    if (iCompare <= 0) {
                        l9eVar = l9eVar2;
                    } else if (l9eVar == null) {
                        l9eVar = l9eVar2;
                    }
                }
                i--;
            }
        } else {
            f = MTTypesetterKt.kLineSkipLimitMultiplier;
            l9eVar = null;
        }
        if (l9eVar == null) {
            l9e l9eVar3 = wn4Var.Y ? (l9e) wn4Var.W.a() : null;
            if (l9eVar3 == null) {
                return f;
            }
            l9eVar = l9eVar3;
        }
        long jT2 = csg.T(j2);
        int iOrdinal2 = wn4Var.S.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = l9eVar.b;
            return xx1Var.a(f2 - ((int) (j & 4294967295L)), l9eVar.d - f2, Float.intBitsToFloat((int) (jT2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = l9eVar.a;
            return xx1Var.a(f3 - ((int) (j >> 32)), l9eVar.c - f3, Float.intBitsToFloat((int) (jT2 >> 32)));
        }
        mr9.b();
        return f;
    }

    public static boolean r1(wn4 wn4Var, l9e l9eVar, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = wn4Var.q1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jT1 = wn4Var.t1(l9eVar, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jT1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jT1 & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.s5b
    public final void c(long j) {
        int iZ;
        long jQ1 = q1();
        this.Z = j;
        int iOrdinal = this.S.ordinal();
        if (iOrdinal == 0) {
            iZ = x44.z((int) (j & 4294967295L), (int) (jQ1 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                mr9.b();
                return;
            }
            iZ = x44.z((int) (j >> 32), (int) (jQ1 >> 32));
        }
        if (iZ >= 0) {
            return;
        }
        long j2 = !this.U ? this.S == ukc.E ? ((long) (((int) (jQ1 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jQ1 >> 32)) - ((int) (j >> 32)))) << 32 : 0L;
        l9e l9eVar = (l9e) this.W.a();
        if (l9eVar == null || this.a0 || this.Y || !r1(this, l9eVar, jQ1, 0L, 2) || r1(this, l9eVar, 0L, j2, 1)) {
            return;
        }
        this.Y = true;
        s1(j2);
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    public final long q1() {
        long j = this.Z;
        if (g79.b(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void s1(long j) {
        xx1 xx1Var = this.V;
        if (xx1Var == null) {
            xx1Var = (xx1) yb5.o(this, zx1.a);
        }
        xx1 xx1Var2 = xx1Var;
        if (this.a0) {
            e39.c("launchAnimation called when previous animation was running");
        }
        xx1 xx1Var3 = this.V;
        if (xx1Var3 == null) {
            xx1Var3 = (xx1) yb5.o(this, zx1.a);
        }
        xx1Var3.getClass();
        xx1.a.getClass();
        hhi hhiVar = new hhi(wx1.b);
        gb9.D(d1(), null, o45.H, new vn4(this, hhiVar, xx1Var2, j, (tp4) null), 1);
    }

    public final long t1(l9e l9eVar, long j, long j2) {
        long jT = csg.T(j);
        int iOrdinal = this.S.ordinal();
        if (iOrdinal == 0) {
            xx1 xx1Var = this.V;
            if (xx1Var == null) {
                xx1Var = (xx1) yb5.o(this, zx1.a);
            }
            float f = l9eVar.b;
            return (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(xx1Var.a(f - ((int) (j2 & 4294967295L)), l9eVar.d - f, Float.intBitsToFloat((int) (jT & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            mr9.b();
            return 0L;
        }
        xx1 xx1Var2 = this.V;
        if (xx1Var2 == null) {
            xx1Var2 = (xx1) yb5.o(this, zx1.a);
        }
        float f2 = l9eVar.a;
        return (((long) Float.floatToRawIntBits(xx1Var2.a(f2 - ((int) (j2 >> 32)), l9eVar.c - f2, Float.intBitsToFloat((int) (jT >> 32))))) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L);
    }
}
