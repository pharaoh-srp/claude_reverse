package defpackage;

import androidx.compose.foundation.layout.b;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l10 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(qcc qccVar, iqb iqbVar, long j, ld4 ld4Var, int i, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1776202187);
        int i3 = (e18Var.f(qccVar) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && e18Var.e(j)) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                i3 &= -897;
                j = 9205357640488583168L;
            }
            e18Var.q();
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new v0(7, qccVar);
                e18Var.k0(objN);
            }
            rqk.d(qccVar, lja.H, fd9.q0(-1653527038, new g10(j, tjf.b(iqbVar, false, (bz7) objN)), e18Var), e18Var, i4 | 432);
        } else {
            e18Var.T();
        }
        long j2 = j;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new h10(qccVar, iqbVar, j2, i, i2);
        }
    }

    public static final void b(int i, int i2, ld4 ld4Var, iqb iqbVar) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        }
        if (e18Var.Q(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                iqbVar = fqb.E;
            }
            kxk.g(e18Var, zni.t(b.q(iqbVar, a, 25.0f), new j10(((nkh) e18Var.j(okh.a)).a, 0)));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i10(i, i2, iqbVar);
        }
    }
}
