package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hl3 {
    public static final List a = x44.X("Clauding", "Cogitating", "Computing", "Contemplating", "Cooking", "Deliberating", "Generating", "Imagining", "Musing", "Noodling", "Pondering", "Processing", "Scheming", "Synthesizing", "Thinking", "Tinkering", "Working", "Ruminating", "Percolating", "Brewing");

    public static final void a(iqb iqbVar, float f, boolean z, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-547813961);
        int i2 = i | 438;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = vb7.g(0, e18Var);
            }
            isc iscVar = (isc) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new ed3(iscVar, null, 2);
                e18Var.k0(objN2);
            }
            fd9.i(e18Var, (pz7) objN2, true);
            Resources resources = (Resources) e18Var.j(w00.c);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new TypedValue();
                e18Var.k0(objN3);
            }
            TypedValue typedValue = (TypedValue) objN3;
            resources.getValue(R.drawable.cc_spinner_sprite, typedValue, true);
            CharSequence charSequence = typedValue.string;
            charSequence.getClass();
            boolean zF = e18Var.f(charSequence.toString());
            Object objN4 = e18Var.N();
            if (zF || objN4 == lz1Var) {
                Drawable drawable = resources.getDrawable(R.drawable.cc_spinner_sprite, null);
                drawable.getClass();
                objN4 = new r20(((BitmapDrawable) drawable).getBitmap());
                e18Var.k0(objN4);
            }
            r20 r20Var = (r20) objN4;
            int width = r20Var.a.getWidth();
            long j = gm3.a(e18Var).c;
            boolean zE = e18Var.e(j);
            Object objN5 = e18Var.N();
            if (zE || objN5 == lz1Var) {
                objN5 = new hr1(j, 5);
                e18Var.k0(objN5);
            }
            hr1 hr1Var = (hr1) objN5;
            iqbVar = fqb.E;
            iqb iqbVarO = b.o(iqbVar, 16.0f);
            boolean zH = e18Var.h(r20Var) | e18Var.d(width) | e18Var.f(hr1Var);
            Object objN6 = e18Var.N();
            if (zH || objN6 == lz1Var) {
                eb3 eb3Var = new eb3(r20Var, width, hr1Var, iscVar, 1);
                e18Var.k0(eb3Var);
                objN6 = eb3Var;
            }
            v40.a(0, e18Var, (bz7) objN6, iqbVarO);
            f = 16.0f;
            z = true;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new n21(iqbVar, f, z, i);
        }
    }

    public static final void b(int i, ld4 ld4Var, iqb iqbVar, String str, String str2) {
        String strConcat;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1327691835);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(iqbVar) ? 32 : 16) | (e18Var.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var.N();
            List list = a;
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                b79 b79VarH0 = wd6.H0(0, list.size());
                g1e g1eVar = h1e.E;
                b79VarH0.getClass();
                try {
                    objN = vb7.g(wjk.q(b79VarH0), e18Var);
                } catch (IllegalArgumentException e) {
                    pmf.h(e.getMessage());
                    return;
                }
            }
            isc iscVar = (isc) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = vb7.g(0, e18Var);
            }
            isc iscVar2 = (isc) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new gl3(iscVar2, iscVar, null, 0);
                e18Var.k0(objN3);
            }
            fd9.i(e18Var, (pz7) objN3, iei.a);
            boolean z = str2 == null || bsg.I0(str2);
            if (!z) {
                strConcat = str2 == null ? "" : str2;
            } else if (str == null || bsg.I0(str)) {
                strConcat = list.get(iscVar.h()) + "...";
            } else {
                strConcat = bsg.T0(bsg.T0(str, "..."), "…").concat("...");
            }
            iqb iqbVarL = gb9.L(b.c(iqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
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
            a(null, MTTypesetterKt.kLineSkipLimitMultiplier, false, e18Var, 0);
            kxk.g(e18Var, b.t(fqb.E, 8.0f));
            if (z) {
                e18Var.a0(1836374119);
                tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).i;
                long j = gm3.a(e18Var).c;
                if (1.0f <= 0.0d) {
                    z29.a("invalid weight; must be greater than zero");
                }
                tjh.b(strConcat, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar, e18Var, 0, 24960, 110584);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(1836103923);
                tkh tkhVar2 = ((jm3) gm3.c(e18Var).e.E).i;
                long j2 = gm3.a(e18Var).N;
                if (1.0f <= 0.0d) {
                    z29.a("invalid weight; must be greater than zero");
                }
                thk.a(strConcat, new hw9(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false), null, tkhVar2, j2, e18Var, 0);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl3(str, iqbVar, str2, i);
        }
    }
}
