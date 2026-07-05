package defpackage;

import android.os.Build;
import android.window.BackEvent;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rtk {
    public static final ta4 a = new ta4(1400689945, false, new wb4(20));
    public static final ta4 b = new ta4(866821019, false, new xb4(23));
    public static final ta4 c = new ta4(676294340, false, new xb4(24));
    public static final ta4 d;
    public static py8 e;
    public static py8 f;
    public static py8 g;
    public static py8 h;

    static {
        new ta4(2130619619, false, new wb4(21));
        new ta4(1044306277, false, new xb4(25));
        d = new ta4(1373531022, false, new xb4(26));
    }

    public static final void a(int i, int i2, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, wu8 wu8Var, float f2, ld4 ld4Var, int i3) {
        int i4;
        wu8 wu8Var2;
        float f3;
        float f4;
        int i5;
        wu8 wu8VarG;
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1930976446);
        int i6 = i3 | (e18Var.d(i) ? 4 : 2) | (e18Var.d(i2) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 1638400;
        if (e18Var.Q(i6 & 1, (599187 & i6) != 599186)) {
            e18Var.V();
            if ((i3 & 1) == 0 || e18Var.A()) {
                f4 = 24.0f;
                i5 = i6 & (-458753);
                wu8VarG = vz8.G(0L, gm3.a(e18Var).M, gm3.a(e18Var).O, e18Var, 5);
            } else {
                e18Var.T();
                f4 = f2;
                i5 = i6 & (-458753);
                wu8VarG = wu8Var;
            }
            e18Var.q();
            wo1 wo1Var = lja.Q;
            iqb iqbVarK = gb9.K(iqbVar, 16.0f, 4.0f);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            float f5 = f4;
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            wu8 wu8Var3 = wu8VarG;
            tjh.b(d4c.k0(R.string.artifact_sheet_footer_count, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            cxe cxeVarA2 = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            wu8Var2 = wu8Var3;
            ez1.e(zy7Var, null, i > 0, wu8Var2, null, fd9.q0(569325480, new dt0(0, f5), e18Var), e18Var, ((i5 >> 6) & 14) | 1572864, 50);
            kxk.g(e18Var, b.t(fqbVar, 4.0f));
            i4 = i;
            ez1.e(zy7Var2, null, i4 < i2 + (-1), wu8Var2, null, fd9.q0(1428863775, new dt0(1, f5), e18Var), e18Var, ((i5 >> 9) & 14) | 1572864, 50);
            e18Var.p(true);
            e18Var.p(true);
            f3 = f5;
        } else {
            i4 = i;
            e18Var.T();
            wu8Var2 = wu8Var;
            f3 = f2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new et0(i4, i2, zy7Var, zy7Var2, iqbVar, wu8Var2, f3, i3);
        }
    }

    public static final hzb b(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new hzb(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final void c(String str, String str2, iqb iqbVar, boolean z, ld4 ld4Var, int i) {
        String str3;
        String str4;
        boolean z2;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2098126295);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | (e18Var.f(str2) ? 32 : 16) | FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                z = v40.F(e18Var);
            } else {
                e18Var.T();
            }
            int i3 = i2 & (-7169);
            boolean z3 = z;
            e18Var.q();
            iqb iqbVarJ = gb9.J(iqbVar, 12.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
            str3 = str2;
            zlk.a(str, str3, fqb.E, z3, true, null, e18Var, (i3 & 14) | 24960 | (i3 & 112), 32);
            str4 = str;
            e18Var.p(true);
            z2 = z3;
        } else {
            str3 = str2;
            str4 = str;
            e18Var.T();
            z2 = z;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sq(str4, str3, iqbVar, z2, i);
        }
    }

    public static String d(String str) {
        return ij0.k("data:", str, ";charset=utf-8;base64,", "");
    }

    public static py8 e() {
        py8 py8Var = h;
        if (py8Var != null) {
            return py8Var;
        }
        oy8 oy8Var = new oy8("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i = asi.a;
        eeg eegVar = new eeg(d54.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new zuc(7.0f, 10.0f));
        arrayList.add(new gvc(5.0f, 5.0f));
        arrayList.add(new gvc(5.0f, -5.0f));
        arrayList.add(vuc.c);
        oy8Var.c(1.0f, 1.0f, 1.0f, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, 2, eegVar, null, "", arrayList);
        py8 py8VarE = oy8Var.e();
        h = py8VarE;
        return py8VarE;
    }

    public abstract void f(a1g a1gVar, float f2, float f3);
}
