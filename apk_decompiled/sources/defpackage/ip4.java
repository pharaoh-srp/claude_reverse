package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ip4 {
    public static final v9d a = new v9d(true, 30);
    public static final yo4 b;

    static {
        long j = d54.d;
        long j2 = d54.b;
        b = new yo4(j, j2, j2, d54.b(0.38f, j2), d54.b(0.38f, j2));
    }

    public static final void a(yo4 yo4Var, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-527864079);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(yo4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            wo1 wo1Var = dp4.a;
            iqb iqbVarB0 = mpk.b0(gb9.L(rkj.k(yfd.p(xn5.t0(iqbVar, 3.0f, xve.b(4.0f), 0L, 0L, 28), yo4Var.a, zni.b), za9.F), MTTypesetterKt.kLineSkipLimitMultiplier, dp4.d, 1), mpk.Y(e18Var), true);
            int i3 = (i2 << 3) & 7168;
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB0);
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
            ta4Var.invoke(s64.a, e18Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(yo4Var, i, iqbVar, ta4Var, 18);
        }
    }

    public static final void b(iqb iqbVar, yo4 yo4Var, bz7 bz7Var, ld4 ld4Var, int i, int i2) {
        int i3;
        int i4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (e18Var.f(yo4Var) ? 32 : 16);
        }
        int i7 = i4 | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                iqbVar = fqb.E;
            }
            if (i6 != 0) {
                yo4Var = b;
            }
            a(yo4Var, iqbVar, fd9.q0(-250345048, new ii(bz7Var, 24, yo4Var), e18Var), e18Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            e18Var.T();
        }
        iqb iqbVar2 = iqbVar;
        yo4 yo4Var2 = yo4Var;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(iqbVar2, yo4Var2, bz7Var, i, i2);
        }
    }

    public static final void c(String str, boolean z, yo4 yo4Var, iqb iqbVar, rz7 rz7Var, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-2001167027);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(yo4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(rz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (e18Var2.Q(i3 & 1, (74899 & i3) != 74898)) {
            wo1 wo1Var = dp4.a;
            float f = dp4.c;
            ho0 ho0Var = new ho0(f, true, new sz6(1));
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object objN = e18Var2.N();
            if (z2 || objN == jd4.a) {
                objN = new sp(z, zy7Var, 2);
                e18Var2.k0(objN);
            }
            iqb iqbVarL = gb9.L(b.r(b.c(androidx.compose.foundation.b.c(iqbVar, z, str, null, null, (zy7) objN, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var2, 54);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            if (rz7Var == null) {
                e18Var2.a0(-1597947094);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-1597947093);
                float f2 = dp4.e;
                iqb iqbVarL2 = b.l(fqb.E, f2, MTTypesetterKt.kLineSkipLimitMultiplier, f2, f2, 2);
                o5b o5bVarD = dw1.d(lja.G, false);
                int iHashCode2 = Long.hashCode(e18Var2.T);
                hyc hycVarL2 = e18Var2.l();
                iqb iqbVarE2 = kxk.E(e18Var2, iqbVarL2);
                e18Var2.e0();
                if (e18Var2.S) {
                    e18Var2.k(re4Var);
                } else {
                    e18Var2.n0();
                }
                d4c.i0(e18Var2, z80Var, o5bVarD);
                d4c.i0(e18Var2, z80Var2, hycVarL2);
                ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
                d4c.i0(e18Var2, z80Var4, iqbVarE2);
                rz7Var.invoke(new d54(z ? yo4Var.c : yo4Var.e), e18Var2, 0);
                e18Var2.p(true);
                e18Var2.p(false);
            }
            long j = z ? yo4Var.b : yo4Var.d;
            mpk.b(str, new hw9(1.0f, true), new tkh(j, dp4.h, dp4.i, null, null, dp4.k, 0L, dp4.b, 0, dp4.j, null, 16613240), null, 0, false, 1, 0, e18Var2, (i3 & 14) | 1572864, 952);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pg1(str, z, yo4Var, iqbVar, rz7Var, zy7Var, i, 7);
        }
    }

    public static final void d(u9d u9dVar, zy7 zy7Var, yo4 yo4Var, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        u9d u9dVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-305401220);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(u9dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(fqb.E) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(yo4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            zy7Var2 = zy7Var;
            u40.a(u9dVar, zy7Var2, a, fd9.q0(-1271367778, new t04(yo4Var, bz7Var), e18Var), e18Var, (i2 & 14) | 3456 | (i2 & 112), 0);
            u9dVar2 = u9dVar;
        } else {
            zy7Var2 = zy7Var;
            u9dVar2 = u9dVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(u9dVar2, zy7Var2, yo4Var, bz7Var, i);
        }
    }

    public static final void e(u9d u9dVar, zy7 zy7Var, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(307841774);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(u9dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(fqb.E) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) e18Var.j(w00.b);
            boolean zF = e18Var.f((Configuration) e18Var.j(w00.a)) | e18Var.f(context);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                yo4 yo4Var = b;
                long jM = yo4Var.a;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int iN0 = d4c.n0(jM);
                int color = typedArrayObtainStyledAttributes.getColor(0, iN0);
                typedArrayObtainStyledAttributes.recycle();
                if (color != iN0) {
                    jM = d4c.m(color);
                }
                long j = jM;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                typedArrayObtainStyledAttributes2.recycle();
                long jM2 = yo4Var.b;
                int iN02 = d4c.n0(jM2);
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iN02)) : null;
                if (numValueOf != null && numValueOf.intValue() != iN02) {
                    jM2 = d4c.m(numValueOf.intValue());
                }
                long j2 = jM2;
                long jM3 = yo4Var.d;
                int iN03 = d4c.n0(jM3);
                Integer numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iN03)) : null;
                if (numValueOf2 != null && numValueOf2.intValue() != iN03) {
                    jM3 = d4c.m(numValueOf2.intValue());
                }
                long j3 = jM3;
                yo4 yo4Var2 = new yo4(j, j2, j2, j3, j3);
                e18Var.k0(yo4Var2);
                objN = yo4Var2;
            }
            d(u9dVar, zy7Var, (yo4) objN, bz7Var, e18Var, (i2 & 1022) | ((i2 << 3) & 57344));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(u9dVar, zy7Var, bz7Var, i);
        }
    }
}
