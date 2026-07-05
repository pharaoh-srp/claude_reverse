package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.os.Trace;
import androidx.compose.foundation.layout.b;
import coil3.compose.AsyncImagePainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vuk {
    public static final ta4 a = new ta4(277537112, false, new cc4(12));
    public static final ta4 b = new ta4(817926249, false, new ic4(0));
    public static final ta4 c = new ta4(2139595006, false, new cc4(13));

    public static final void a(z1i z1iVar, final long j, final long j2, final float f, final float f2, final float f3, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        ta4 ta4Var2;
        iqb iqbVar2;
        r7e r7eVarS;
        g2i g2iVar;
        xo1 xo1Var = lja.G;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(418640965);
        int i2 = i | (e18Var.d(z1iVar.ordinal()) ? 4 : 2) | (e18Var.e(j) ? 32 : 16) | (e18Var.e(j2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.c(f) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.c(f2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.c(f3) ? 131072 : 65536) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        if (!e18Var.Q(i2 & 1, (i2 & 4793491) != 4793490)) {
            ta4Var2 = ta4Var;
            iqbVar2 = iqbVar;
            e18Var.T();
        } else {
            if (f <= MTTypesetterKt.kLineSkipLimitMultiplier) {
                e18Var.a0(-851692191);
                vve vveVarB = xve.b(f3);
                iqb iqbVarT = ez1.t(yfd.p(fqb.E, j, vveVarB), MTTypesetterKt.kLineSkipLimitMultiplier, j2, vveVarB);
                o5b o5bVarD = dw1.d(xo1Var, false);
                int iHashCode = Long.hashCode(e18Var.T);
                hyc hycVarL = e18Var.l();
                iqb iqbVarE = kxk.E(e18Var, iqbVarT);
                dd4.e.getClass();
                re4 re4Var = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, o5bVarD);
                d4c.i0(e18Var, cd4.e, hycVarL);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE);
                ta4Var.invoke(e18Var, 6);
                e18Var.p(true);
                e18Var.p(false);
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    g2iVar = new g2i(z1iVar, j, j2, f, f2, f3, iqbVar, ta4Var, i, 0);
                    r7eVarS.d = g2iVar;
                }
                return;
            }
            ta4Var2 = ta4Var;
            iqbVar2 = iqbVar;
            e18Var.a0(-851265507);
            e18Var.p(false);
            final boolean z = z1iVar == z1i.F;
            final ksg ksgVar = new ksg(1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 30);
            boolean zG = ((i2 & 896) == 256) | e18Var.g(z) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | e18Var.h(ksgVar);
            Object objN = e18Var.N();
            if (zG || objN == jd4.a) {
                bz7 bz7Var = new bz7() { // from class: h2i
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        float f4;
                        float f5;
                        b52 b52Var = (b52) obj;
                        b52Var.getClass();
                        boolean z2 = z;
                        float fIntBitsToFloat = z2 ? MTTypesetterKt.kLineSkipLimitMultiplier : Float.intBitsToFloat((int) (b52Var.E.g() & 4294967295L));
                        float density = b52Var.getDensity() * f2;
                        float density2 = b52Var.getDensity() * f3;
                        c40 c40VarA = f40.a();
                        c40.c(c40VarA, gb9.f(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (b52Var.E.g() >> 32)), Float.intBitsToFloat((int) (b52Var.E.g() & 4294967295L)), (((long) Float.floatToRawIntBits(density2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(density2)))));
                        float f6 = 4.0f * density;
                        float f7 = f6 / 2.0f;
                        float f8 = f;
                        float f9 = f8 - f7;
                        float f10 = f8 + f7;
                        float f11 = f6 * 0.2f;
                        if (z2) {
                            float f12 = fIntBitsToFloat - density;
                            c40VarA.g(f9, fIntBitsToFloat);
                            float f13 = f8 - f11;
                            c40VarA.d(f13, fIntBitsToFloat, f13, f12, f8, f12);
                            f4 = f8;
                            float f14 = f4 + f11;
                            f5 = fIntBitsToFloat;
                            c40VarA.d(f14, f12, f14, f5, f10, fIntBitsToFloat);
                        } else {
                            f4 = f8;
                            float f15 = fIntBitsToFloat + density;
                            c40VarA.g(f9, fIntBitsToFloat);
                            float f16 = f4 - f11;
                            c40VarA.d(f16, fIntBitsToFloat, f16, f15, f8, f15);
                            float f17 = f4 + f11;
                            f5 = fIntBitsToFloat;
                            c40VarA.d(f17, f15, f17, f5, f10, fIntBitsToFloat);
                        }
                        float f18 = f5;
                        c40 c40VarA2 = f40.a();
                        float f19 = (density * 2.1f) / 2.0f;
                        c40VarA2.g(f4 - f19, f18);
                        c40VarA2.f(f4 + f19, f18);
                        c40 c40VarA3 = f40.a();
                        c40VarA3.h(c40VarA, c40VarA2, 0);
                        return b52Var.b(new gu1(c40VarA3, j, j2, ksgVar, 2));
                    }
                };
                e18Var.k0(bz7Var);
                objN = bz7Var;
            }
            iqb iqbVarT2 = zni.t(iqbVar2, (bz7) objN);
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarT2);
            dd4.e.getClass();
            re4 re4Var2 = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var2);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD2);
            d4c.i0(e18Var, cd4.e, hycVarL2);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode2));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE2);
            ta4Var2.invoke(e18Var, 6);
            e18Var.p(true);
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            g2iVar = new g2i(z1iVar, j, j2, f, f2, f3, iqbVar2, ta4Var2, i, 1);
            r7eVarS.d = g2iVar;
        }
    }

    public static final void b(String str, bz7 bz7Var, String str2, bz7 bz7Var2, boolean z, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        str.getClass();
        bz7Var.getClass();
        str2.getClass();
        bz7Var2.getClass();
        i4gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1658529735);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(bz7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.g(z) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(i4gVar) ? 131072 : 65536;
        }
        int i3 = i2;
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 74899) != 74898)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarM = ttj.m(fqbVar, i4gVar);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarM);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            String strJ0 = d4c.j0(R.string.create_project_doc_title_field_label, e18Var);
            jwk.e(strJ0, null, 0L, e18Var, 0);
            kxk.g(e18Var, b.e(fqbVar, 2.0f));
            int i5 = 3;
            int i6 = 126;
            int i7 = i3 & 57344;
            mwa.b(str, bz7Var, strJ0, b.c(fqbVar, 1.0f), z, false, null, null, dkk.a, null, null, null, new mp9(i5, i4, i4, i6), null, true, 0, 0, 0L, null, e18Var, (i3 & 14) | 100666368 | (i3 & 112) | i7, 1597440, 2014944);
            String strP = gid.p(8.0f, R.string.create_project_doc_content_field_label, e18Var, e18Var, fqbVar);
            e18Var = e18Var;
            jwk.e(strP, null, 0L, e18Var, 0);
            kxk.g(e18Var, b.e(fqbVar, 2.0f));
            mp9 mp9Var = new mp9(i5, i4, i4, i6);
            int i8 = i3 >> 6;
            mwa.b(str2, bz7Var2, strP, b.c(fqbVar, 1.0f), z, false, null, null, dkk.b, null, null, null, mp9Var, null, false, 3, 10, 0L, null, e18Var, (i8 & 112) | (i8 & 14) | 100666368 | i7, 113270784, 1687264);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pg1(str, bz7Var, str2, bz7Var2, z, i4gVar, i);
        }
    }

    public static final void c(zy7 zy7Var, c9c c9cVar, b1i b1iVar, ole oleVar, i8c i8cVar, ld4 ld4Var, int i) {
        c9c c9cVar2;
        b1i b1iVar2;
        ole oleVar2;
        i8c i8cVar2;
        int i2;
        i8c i8cVar3;
        c9c c9cVar3;
        b1i b1iVar3;
        ole oleVar3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-919854244);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | 9360;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            e18Var.V();
            int i4 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVar, 22);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                c9c c9cVar4 = (c9c) fd9.r0(kceVar.b(c9c.class), oq5.B(kceVar.b(c9c.class)), (bz7) objN, e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(b1i.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                b1i b1iVar4 = (b1i) objN2;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = m7fVarN2.a(kceVar.b(ole.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                ole oleVar4 = (ole) objN3;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN4 = e18Var.N();
                if (zF3 || objN4 == lz1Var) {
                    objN4 = m7fVarN3.a(kceVar.b(i8c.class), null, null);
                    e18Var.k0(objN4);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i3 & (-65521);
                i8cVar3 = (i8c) objN4;
                c9cVar3 = c9cVar4;
                b1iVar3 = b1iVar4;
                oleVar3 = oleVar4;
            } else {
                e18Var.T();
                i2 = i3 & (-65521);
                c9cVar3 = c9cVar;
                b1iVar3 = b1iVar;
                oleVar3 = oleVar;
                i8cVar3 = i8cVar;
            }
            e18Var.q();
            boolean zF4 = e18Var.f(c9cVar3);
            Object objN5 = e18Var.N();
            if (zF4 || objN5 == lz1Var) {
                objN5 = new jp(c9cVar3, tp4Var, 7);
                e18Var.k0(objN5);
            }
            csg.g((bz7) objN5, e18Var, 0, 1);
            Context context = (Context) e18Var.j(w00.b);
            wxc wxcVarO = oq5.O(e18Var);
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = mpk.P(null);
                e18Var.k0(objN6);
            }
            nwb nwbVar = (nwb) objN6;
            Object objN7 = e18Var.N();
            if (objN7 == lz1Var) {
                objN7 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN7;
            zxc zxcVarE = wxcVarO.e();
            zy7 zy7Var2 = (zy7) nwbVar.getValue();
            boolean zF5 = e18Var.f(wxcVarO);
            Object objN8 = e18Var.N();
            if (zF5 || objN8 == lz1Var) {
                objN8 = new u73(wxcVarO, nwbVar, tp4Var, 27);
                e18Var.k0(objN8);
            }
            fd9.j(zxcVarE, zy7Var2, (pz7) objN8, e18Var);
            boolean zF6 = e18Var.f(wxcVarO) | e18Var.h(context);
            Object objN9 = e18Var.N();
            if (zF6 || objN9 == lz1Var) {
                objN9 = new ra7(wxcVarO, context, nwbVar, 20);
                e18Var.k0(objN9);
            }
            ssj.c(d4c.j0(R.string.notifications_section_title, e18Var), zy7Var, null, null, fd9.q0(-1553471022, new rn(ybgVar, 14), e18Var), 0L, fd9.q0(1736785645, new gn(c9cVar3, ybgVar, b1iVar3, oleVar3, (pz7) objN9, i8cVar3, 9), e18Var), e18Var, ((i2 << 3) & 112) | 1597440, 44);
            c9cVar2 = c9cVar3;
            b1iVar2 = b1iVar3;
            oleVar2 = oleVar3;
            i8cVar2 = i8cVar3;
        } else {
            e18Var.T();
            c9cVar2 = c9cVar;
            b1iVar2 = b1iVar;
            oleVar2 = oleVar;
            i8cVar2 = i8cVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo(zy7Var, c9cVar2, b1iVar2, oleVar2, i8cVar2, i);
        }
    }

    public static final void d(final zy7 zy7Var, final i2i i2iVar, final long j, final long j2, float f, float f2, float f3, final float f4, final ta4 ta4Var, ld4 ld4Var, final int i) {
        int i2;
        final float f5;
        final float f6;
        e18 e18Var;
        final float f7;
        float f8;
        float f9;
        float f10;
        long jA;
        xo1 xo1Var;
        zy7Var.getClass();
        long j3 = i2iVar.a;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-882949775);
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(i2iVar) : e18Var2.h(i2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.e(j) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.e(j2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = i2 | 1794048;
        if ((12582912 & i) == 0) {
            i3 |= e18Var2.c(f4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= e18Var2.h(ta4Var) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (e18Var2.Q(i4 & 1, (38347923 & i4) != 38347922)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                f8 = 8.0f;
                f9 = 4.0f;
                f10 = 24.0f;
            } else {
                e18Var2.T();
                f8 = f;
                f10 = f2;
                f9 = f3;
            }
            e18Var2.q();
            umg umgVar = ve4.h;
            float f11 = f8;
            int iM0 = ((cz5) e18Var2.j(umgVar)).M0(f11 + f9);
            int iOrdinal = i2iVar.b.ordinal();
            if (iOrdinal == 0) {
                xo1 xo1Var2 = lja.N;
                jA = y69.a(0, ((int) (j3 & 4294967295L)) - iM0, 1, j3);
                xo1Var = xo1Var2;
            } else if (iOrdinal != 1) {
                wg6.i();
                return;
            } else {
                xo1 xo1Var3 = lja.H;
                jA = y69.a(0, ((int) (j3 & 4294967295L)) + iM0, 1, j3);
                xo1Var = xo1Var3;
            }
            float fQ0 = ((cz5) e18Var2.j(umgVar)).q0(f4);
            float f12 = i2iVar.c;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new hsc(f12);
                e18Var2.k0(objN);
            }
            hsc hscVar = (hsc) objN;
            boolean zF = e18Var2.f(xo1Var) | e18Var2.e(jA) | e18Var2.c(fQ0) | e18Var2.c(f12);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new a2i(xo1Var, jA, f12, fQ0, new rk1(hscVar, 2));
                e18Var2.k0(objN2);
            }
            a2i a2iVar = (a2i) objN2;
            v9d v9dVar = new v9d(false, 29);
            g2i g2iVar = new g2i(i2iVar, j, j2, f11, f10, f4, hscVar, ta4Var);
            float f13 = f10;
            u40.a(a2iVar, zy7Var, v9dVar, fd9.q0(748457999, g2iVar, e18Var2), e18Var2, ((i4 << 3) & 112) | 3456, 0);
            f5 = f11;
            e18Var = e18Var2;
            f6 = f9;
            f7 = f13;
        } else {
            e18Var2.T();
            f5 = f;
            f6 = f3;
            e18Var = e18Var2;
            f7 = f2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: f2i
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vuk.d(zy7Var, i2iVar, j, j2, f5, f7, f6, f4, ta4Var, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void e(uy8 uy8Var, String str, int i) {
        uy8Var.f(new wy8(str, i, 0));
    }

    public static final void f(uy8 uy8Var, int i, int i2) {
        uy8Var.f(new vy8(i, i2, uy8Var, 1));
    }

    public static final void g(uy8 uy8Var, int i, int i2) {
        uy8Var.f(new ox8(i, i2, 1));
    }

    public static final void h(uy8 uy8Var) {
        uy8Var.f(new ed8(22));
    }

    public static final float i(t8f t8fVar, ge2 ge2Var, oub oubVar, RectF rectF, float f, float f2) {
        t8fVar.getClass();
        ge2Var.getClass();
        oubVar.getClass();
        rectF.getClass();
        if (t8fVar instanceof r8f) {
            return ((r8f) t8fVar).a(ge2Var, oubVar, rectF, f) - f2;
        }
        if (t8fVar instanceof s8f) {
            return ((s8f) t8fVar).a;
        }
        wg6.i();
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public static final void j(dfh dfhVar, int i, int i2) {
        kkh kkhVar = dfhVar.I;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        dfhVar.c(iMin, iMax, "");
        if (kkhVar != null) {
            long jE = bok.e(iMin, iMax, 0, kkhVar.a);
            if (kkh.d(jE)) {
                dfhVar.e(null);
            } else {
                dfhVar.d(kkh.g(jE), kkh.f(jE), null);
            }
        }
    }

    public static final void k(dfh dfhVar, int i, int i2, CharSequence charSequence) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        int i4 = iMin;
        while (i4 < iMax && i3 < charSequence.length() && charSequence.charAt(i3) == dfhVar.F.charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        while (iMax > i4 && length > i3 && charSequence.charAt(length - 1) == dfhVar.F.charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i4 == iMax && i3 == length) {
            dfhVar.e(null);
            dfhVar.K = null;
        } else {
            dfhVar.c(i4, iMax, charSequence.subSequence(i3, length));
        }
        int length2 = charSequence.length() + iMin;
        dfhVar.f(mwa.m(length2, length2));
    }

    public static final AsyncImagePainter l(jx8 jx8Var, yw8 yw8Var, bz7 bz7Var, bz7 bz7Var2, jo4 jo4Var, ld4 ld4Var, int i) {
        if ((i & 4) != 0) {
            bz7Var = AsyncImagePainter.Z;
        }
        if ((i & 8) != 0) {
            bz7Var2 = null;
        }
        if ((i & 16) != 0) {
            jo4Var = ho4.b;
        }
        int i2 = (i & 32) != 0 ? 1 : 3;
        e18 e18Var = (e18) ld4Var;
        p01 p01Var = (p01) e18Var.j(wca.a);
        e18Var.a0(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            jx8 jx8VarC = fqi.c(jx8Var, e18Var);
            fqi.g(jx8VarC);
            q01 q01Var = new q01(yw8Var, jx8VarC, p01Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new AsyncImagePainter(q01Var);
                e18Var.k0(objN);
            }
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            asyncImagePainter.P = (l45) objN2;
            asyncImagePainter.Q = bz7Var;
            asyncImagePainter.R = bz7Var2;
            asyncImagePainter.S = jo4Var;
            asyncImagePainter.T = i2;
            asyncImagePainter.U = fqi.a(e18Var);
            asyncImagePainter.o(q01Var);
            e18Var.p(false);
            return asyncImagePainter;
        } finally {
            Trace.endSection();
        }
    }

    public static final void m(uy8 uy8Var, int i, int i2) {
        uy8Var.f(new vy8(i, i2, uy8Var, 2));
    }

    public static final void n(uy8 uy8Var, String str, int i, ArrayList arrayList) {
        uy8Var.f(new ov0(str, arrayList, i, 3));
    }

    public static final void o(uy8 uy8Var, int i, int i2) {
        uy8Var.f(new vy8(uy8Var, i, i2));
    }
}
