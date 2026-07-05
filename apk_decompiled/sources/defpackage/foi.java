package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class foi {
    public static final float a = 44.0f + 24.0f;

    public static final void a(final String str, String str2, final boolean z, final boolean z2, final zy7 zy7Var, final zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, final int i, final int i2) {
        int i3;
        String str3;
        iqb iqbVar2;
        int i4;
        final iqb iqbVar3;
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1106717703);
        if ((i & 6) == 0) {
            i3 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i3 |= e18Var.f(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i3 |= e18Var.h(zy7Var2) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i4 = i3 | 1572864;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i4 = i3 | (e18Var.f(iqbVar2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        }
        if (e18Var.Q(i4 & 1, (599187 & i4) != 599186)) {
            iqb iqbVar4 = i5 != 0 ? fqb.E : iqbVar2;
            wo1 wo1Var = lja.Q;
            iqb iqbVarC = b.c(iqbVar4, 1.0f);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = kt5.I;
                e18Var.k0(objN);
            }
            iqb iqbVarA = a0h.a(iqbVarC, iei.a, (PointerInputEventHandler) objN);
            iqb iqbVar5 = iqbVar4;
            long j = gm3.a(e18Var).p;
            va6 va6Var = new va6(44.0f);
            iqbVarA.getClass();
            iqb iqbVarP = kxk.p(iqbVarA, new bf7(j, va6Var, true));
            WeakHashMap weakHashMap = gdj.x;
            iqb iqbVarK = gb9.K(knk.M(iqbVarP, new a5a(s4i.d(e18Var).m, 32)), 16.0f, 12.0f);
            cxe cxeVarA = axe.a(ko0.g, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e18Var.a0(1424401873);
            String strJ0 = bsg.I0(str3) ? d4c.j0(R.string.user_avatar_default_content_description, e18Var) : str3;
            e18Var.p(false);
            yfd.g(str, z, zy7Var, null, 44.0f, d4c.k0(R.string.user_avatar_settings_content_description, new Object[]{strJ0}, e18Var), e18Var, (i4 & 14) | 24576 | ((i4 >> 3) & 112) | ((i4 >> 6) & 896), 8);
            if (z2) {
                e18Var.a0(1206914902);
                c(zy7Var2, null, e18Var, (i4 >> 15) & 14);
                e18Var.p(false);
            } else {
                e18Var.a0(1206985055);
                e18Var.p(false);
            }
            e18Var.p(true);
            iqbVar3 = iqbVar5;
        } else {
            e18Var.T();
            iqbVar3 = iqbVar2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final String str4 = str3;
            r7eVarS.d = new pz7() { // from class: eoi
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    foi.a(str, str4, z, z2, zy7Var, zy7Var2, iqbVar3, (ld4) obj, x44.p0(i | 1), i2);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-56562067);
        int i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = kt5.J;
                e18Var.k0(objN);
            }
            iqb iqbVarW = zni.w(a0h.a(iqbVarC, iei.a, (PointerInputEventHandler) objN), gm3.a(e18Var).p, new va6(8.0f), 2);
            WeakHashMap weakHashMap = gdj.x;
            kxk.g(e18Var, b.e(knk.M(iqbVarW, new a5a(s4i.d(e18Var).m, 16)), 8.0f));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gu5(i, 3, iqbVar);
        }
    }

    public static final void c(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1538128610);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            vve vveVar = xve.a;
            qnc qncVar = q02.a;
            n02 n02VarA = q02.a(gm3.a(e18Var).M, gm3.a(e18Var).n, 0L, 0L, e18Var, 12);
            qnc qncVar2 = q02.b;
            iqbVar2 = fqb.E;
            csg.a(zy7Var, b.e(iqbVar2, 44.0f), false, vveVar, n02VarA, null, null, qncVar2, null, iv1.b, e18Var, (i3 & 14) | 805306368, 356);
            e18Var = e18Var;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kb2((Object) zy7Var, iqbVar2, i, 16);
        }
    }

    public static final void d(String str, String str2, boolean z, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        String str3;
        boolean z2;
        iqb iqbVar2;
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2131236988);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= e18Var.f(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = i2 | 24576;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            wo1 wo1Var = lja.Q;
            iqbVar2 = fqb.E;
            iqb iqbVarK = gb9.K(androidx.compose.foundation.b.c(b.c(iqbVar2, 1.0f), false, null, new vue(0), null, zy7Var, 11), 16.0f, 12.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            int i4 = i3 & 14;
            int i5 = i3 >> 3;
            yfd.g(str, z2, zy7Var, null, MTTypesetterKt.kLineSkipLimitMultiplier, d4c.j0(R.string.user_avatar_default_content_description, e18Var), e18Var, i4 | (i5 & 112) | (i5 & 896), 24);
            kxk.g(e18Var, b.t(iqbVar2, 12.0f));
            String str4 = str3;
            tjh.b(str4, new hw9(1.0f, true), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, i5 & 14, 384, 126968);
            e18Var = e18Var;
            cv8.b(a.a(ud0.n1, e18Var), d4c.j0(R.string.settings_title, e18Var), b.o(iqbVar2, 20.0f), gm3.a(e18Var).N, e18Var, 392, 0);
            e18Var.p(true);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new k04(str, str2, z, zy7Var, iqbVar2, i);
        }
    }
}
