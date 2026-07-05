package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class bc8 implements tz7 {
    public final /* synthetic */ boolean E;

    public bc8(boolean z) {
        this.E = z;
    }

    @Override // defpackage.tz7
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        float f = ((va6) obj).E;
        long j = ((d54) obj2).a;
        long j2 = ((d54) obj3).a;
        ld4 ld4Var = (ld4) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 6) == 0) {
            i = (((e18) ld4Var).c(f) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((e18) ld4Var).e(j) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ((e18) ld4Var).e(j2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 1171) != 1170)) {
            xo1 xo1Var = lja.K;
            fqb fqbVar = fqb.E;
            iqb iqbVarP = yfd.p(xn5.V(b.o(fqbVar, f), xve.a), j, zni.b);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP);
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
            if (this.E) {
                e18Var.a0(-610787141);
                cv8.b(a.a(ud0.L, e18Var), null, b.o(fqbVar, f), j2, e18Var, 56 | ((i << 3) & 7168), 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-610501569);
                cv8.b(a.a(ud0.M1, e18Var), null, b.o(fqbVar, f), j2, e18Var, 56 | ((i << 3) & 7168), 0);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
