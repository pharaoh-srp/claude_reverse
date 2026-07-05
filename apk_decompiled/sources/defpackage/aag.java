package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class aag {
    public static final aag a = new aag();
    public static final float b;
    public static final float c;
    public static final c40 d;

    static {
        float f = bwj.r;
        b = f;
        c = f;
        d = f40.a();
    }

    public static v9g d(ld4 ld4Var) {
        return f(((gwa) ((e18) ld4Var).j(jwa.a)).a);
    }

    public static void e(xd6 xd6Var, ukc ukcVar, long j, long j2, long j3, float f, float f2) {
        sve sveVarE;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (ukcVar == ukc.E) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            sveVarE = gb9.e(d4c.x(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
            sveVarE = gb9.e(d4c.x(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32)), jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        c40 c40Var = d;
        c40.c(c40Var, sveVarE);
        xd6.c1(xd6Var, c40Var, j3, MTTypesetterKt.kLineSkipLimitMultiplier, null, 60);
        c40Var.j();
    }

    public static v9g f(n54 n54Var) {
        v9g v9gVar = n54Var.l0;
        if (v9gVar != null) {
            return v9gVar;
        }
        long jC = p54.c(n54Var, bwj.l);
        o54 o54Var = bwj.e;
        long jC2 = p54.c(n54Var, o54Var);
        o54 o54Var2 = bwj.p;
        long jC3 = p54.c(n54Var, o54Var2);
        long jC4 = p54.c(n54Var, o54Var2);
        long jC5 = p54.c(n54Var, o54Var);
        long jI = d4c.I(d54.b(bwj.i, p54.c(n54Var, bwj.h)), n54Var.p);
        o54 o54Var3 = bwj.f;
        long jC6 = p54.c(n54Var, o54Var3);
        float f = bwj.g;
        long jB = d54.b(f, jC6);
        o54 o54Var4 = bwj.j;
        long jC7 = p54.c(n54Var, o54Var4);
        float f2 = bwj.k;
        v9g v9gVar2 = new v9g(jC, jC2, jC3, jC4, jC5, jI, jB, d54.b(f2, jC7), d54.b(f2, p54.c(n54Var, o54Var4)), d54.b(f, p54.c(n54Var, o54Var3)));
        n54Var.l0 = v9gVar2;
        return v9gVar2;
    }

    public final void a(zub zubVar, iqb iqbVar, v9g v9gVar, boolean z, long j, ld4 ld4Var, int i) {
        iqb iqbVar2;
        long j2;
        long j3;
        iqb iqbVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-290277409);
        int i2 = i | (e18Var.f(zubVar) ? 4 : 2) | 48 | (e18Var.f(v9gVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                j3 = lag.c;
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                j3 = j;
            }
            e18Var.q();
            lag.e(zubVar, iqbVar3, v9gVar, z, j3, e18Var, (i2 & 7168) | (i2 & 14) | 196656 | (i2 & 896) | 24576);
            iqbVar2 = iqbVar3;
            j2 = j3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            j2 = j;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new d05(this, zubVar, iqbVar2, v9gVar, z, j2, i);
        }
    }

    public final void b(final mag magVar, iqb iqbVar, final boolean z, final v9g v9gVar, pz7 pz7Var, rz7 rz7Var, float f, float f2, ld4 ld4Var, final int i) {
        int i2;
        final iqb iqbVar2;
        final pz7 pz7Var2;
        final rz7 rz7Var2;
        final float f3;
        e18 e18Var;
        final float f4;
        int i3;
        pz7 pz7Var3;
        float f5;
        rz7 rz7Var3;
        iqb iqbVar3;
        float f6;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(49984771);
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(magVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= e18Var2.g(z) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i4 |= e18Var2.f(v9gVar) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i4 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            i5 |= e18Var2.f(this) ? 67108864 : 33554432;
        }
        if (e18Var2.Q(i5 & 1, (38347923 & i5) != 38347922)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                boolean z2 = ((((i5 & 7168) ^ 3072) > 2048 && e18Var2.f(v9gVar)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object objN = e18Var2.N();
                lz1 lz1Var = jd4.a;
                if (z2 || objN == lz1Var) {
                    objN = new xb2(v9gVar, z, 11);
                    e18Var2.k0(objN);
                }
                pz7 pz7Var4 = (pz7) objN;
                i3 = i5 & (-57345);
                Object objN2 = e18Var2.N();
                if (objN2 == lz1Var) {
                    objN2 = b12.K;
                    e18Var2.k0(objN2);
                }
                float f7 = lag.d;
                pz7Var3 = pz7Var4;
                f5 = lag.e;
                rz7Var3 = (rz7) objN2;
                iqbVar3 = fqb.E;
                f6 = f7;
            } else {
                e18Var2.T();
                i3 = i5 & (-57345);
                iqbVar3 = iqbVar;
                pz7Var3 = pz7Var;
                rz7Var3 = rz7Var;
                f6 = f;
                f5 = f2;
            }
            e18Var2.q();
            int i6 = i3 << 3;
            c(magVar, iqbVar3, z, v9gVar, pz7Var3, rz7Var3, f6, f5, e18Var2, 805306416 | (i3 & 14) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024), ((i3 >> 21) & 112) | 6);
            iqbVar2 = iqbVar3;
            e18Var = e18Var2;
            f4 = f5;
            f3 = f6;
            rz7Var2 = rz7Var3;
            pz7Var2 = pz7Var3;
        } else {
            e18Var2.T();
            iqbVar2 = iqbVar;
            pz7Var2 = pz7Var;
            rz7Var2 = rz7Var;
            f3 = f;
            e18Var = e18Var2;
            f4 = f2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: x9g
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.E.b(magVar, iqbVar2, z, v9gVar, pz7Var2, rz7Var2, f3, f4, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    public final void c(final mag magVar, final iqb iqbVar, final boolean z, final v9g v9gVar, final pz7 pz7Var, final rz7 rz7Var, final float f, final float f2, ld4 ld4Var, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        e18 e18Var;
        long j;
        long j2;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(133396521);
        if ((i & 6) == 0) {
            i3 = (e18Var2.h(magVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.c(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var2.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var2.f(v9gVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i3 |= e18Var2.h(pz7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= e18Var2.h(rz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            f3 = f;
            i3 |= e18Var2.c(f3) ? 8388608 : 4194304;
        } else {
            f3 = f;
        }
        if ((i & 100663296) == 0) {
            i3 |= e18Var2.c(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= e18Var2.g(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var2.g(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (e18Var2.Q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            final long jA = v9gVar.a(z, false);
            final long jA2 = v9gVar.a(z, true);
            long j3 = z ? v9gVar.e : v9gVar.j;
            if (z) {
                j = j3;
                j2 = v9gVar.c;
            } else {
                j = j3;
                j2 = v9gVar.h;
            }
            final long j4 = j2;
            iqb iqbVarB = magVar.m == ukc.E ? b.t(iqbVar, lag.a).B(b.b) : b.e(b.c(iqbVar, 1.0f), lag.a);
            int i5 = i3 & 112;
            boolean zH = (i5 == 32) | e18Var2.h(magVar);
            Object objN = e18Var2.N();
            int i6 = i3;
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new lca(16, magVar);
                e18Var2.k0(objN);
            }
            iqb iqbVarB2 = iqbVarB.B(fd9.h0(fqb.E, (rz7) objN));
            boolean zH2 = ((i6 & 29360128) == 8388608) | (i5 == 32) | e18Var2.h(magVar) | e18Var2.e(jA) | e18Var2.e(jA2) | e18Var2.e(j) | e18Var2.e(j4) | ((i6 & 234881024) == 67108864) | ((i6 & 458752) == 131072) | ((i6 & 3670016) == 1048576) | ((i6 & 1879048192) == 536870912) | ((i4 & 14) == 4);
            Object objN2 = e18Var2.N();
            if (zH2 || objN2 == lz1Var) {
                e18Var = e18Var2;
                iqbVar2 = iqbVarB2;
                final float f4 = f3;
                final long j5 = j;
                bz7 bz7Var = new bz7() { // from class: y9g
                    /* JADX WARN: Removed duplicated region for block: B:100:0x0250  */
                    /* JADX WARN: Removed duplicated region for block: B:135:0x0327  */
                    @Override // defpackage.bz7
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r30) {
                        /*
                            Method dump skipped, instruction units count: 956
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9g.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                e18Var.k0(bz7Var);
                objN2 = bz7Var;
            } else {
                e18Var = e18Var2;
                iqbVar2 = iqbVarB2;
            }
            v40.a(0, e18Var, (bz7) objN2, iqbVar2);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: z9g
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.E.c(magVar, iqbVar, z, v9gVar, pz7Var, rz7Var, f, f2, (ld4) obj, x44.p0(i | 1), x44.p0(i2));
                    return iei.a;
                }
            };
        }
    }
}
