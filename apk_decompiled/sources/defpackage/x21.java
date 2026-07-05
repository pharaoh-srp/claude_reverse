package defpackage;

import android.net.Uri;
import androidx.compose.foundation.b;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x21 {
    public static final vve a;

    static {
        qnc qncVar = qf2.a;
        a = xve.b(16.0f);
    }

    public static final void a(c21 c21Var, iqb iqbVar, ld4 ld4Var, int i) {
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-943457668);
        int i2 = (e18Var.f(c21Var) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            if (c21Var.c) {
                e18Var.a0(-424714365);
                j = gm3.a(e18Var).M;
            } else {
                e18Var.a0(-424713341);
                j = gm3.a(e18Var).O;
            }
            e18Var.p(false);
            vo1 vo1Var = lja.T;
            ho0 ho0Var = new ho0(8.0f, false, new do0(0, lja.Q));
            iqb iqbVarV = xn5.V(iqbVar, a);
            qnc qncVar = qf2.a;
            long j2 = gm3.a(e18Var).n;
            wo8 wo8Var = zni.b;
            iqb iqbVarJ = gb9.J(b.c(yfd.p(iqbVarV, j2, wo8Var), c21Var.c, null, new vue(0), null, c21Var.d, 10), 8.0f);
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 54);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            xo1 xo1Var = lja.K;
            vve vveVar = xve.a;
            fqb fqbVar = fqb.E;
            long j3 = j;
            iqb iqbVarJ2 = gb9.J(yfd.p(xn5.V(fqbVar, vveVar), d54.b(0.1f, gm3.a(e18Var).M), wo8Var), 10.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarJ2);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            cv8.b(c21Var.a, null, androidx.compose.foundation.layout.b.o(fqbVar, csg.A(24, e18Var)), j3, e18Var, 56, 0);
            e18Var.p(true);
            tjh.b(c21Var.b, null, j3, 0L, null, null, null, 0L, null, new fdh(3), 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 109562);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kn(c21Var, iqbVar, i, 9);
        }
    }

    public static final void b(List list, qnc qncVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        list.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1729012059);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(qncVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            boolean z = list.size() > 3;
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if ((((c31) it.next()) instanceof b31) && (i4 = i4 + 1) < 0) {
                        x44.m0();
                        throw null;
                    }
                }
            }
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new hmc();
                e18Var.k0(objN);
            }
            j8.c(imc.a.a((hmc) objN), fd9.q0(-1121922203, new ds0(z, qncVar, list, i4), e18Var), e18Var, 56);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        iqb iqbVar2 = iqbVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(i, 6, iqbVar2, list, qncVar);
        }
    }

    public static final void c(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(789810648);
        int i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            String strJ0 = d4c.j0(R.string.upload_recent_photo_loading, e18Var);
            iqb iqbVarV = xn5.V(iqbVar, a);
            qnc qncVar = qf2.a;
            iqb iqbVarP = yfd.p(iqbVarV, gm3.a(e18Var).n, zni.b);
            boolean zF = e18Var.f(strJ0);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new o8(strJ0, 13);
                e18Var.k0(objN);
            }
            dw1.a(tjf.b(iqbVarP, false, (bz7) objN), e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 3, iqbVar);
        }
    }

    public static final void d(z21 z21Var, int i, iqb iqbVar, ld4 ld4Var, int i2) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-781446763);
        int i3 = i2 | (e18Var2.f(z21Var) ? 4 : 2) | (e18Var2.d(i) ? 32 : 16) | (e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            Uri uri = z21Var.b;
            String strK0 = d4c.k0(R.string.upload_recent_photo, new Object[]{Integer.valueOf(z21Var.a + 1), Integer.valueOf(i)}, e18Var2);
            float f = z21Var.c ? 1.0f : 0.4f;
            iqb iqbVarV = xn5.V(iqbVar, a);
            qnc qncVar = qf2.a;
            e18Var = e18Var2;
            nuk.e(uri, strK0, b.c(yfd.p(iqbVarV, gm3.a(e18Var2).n, zni.b), z21Var.c, null, new vue(0), null, z21Var.d, 10), null, null, null, ho4.a, f, 0, false, e18Var, 12582912, 3704);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(i, i2, 4, z21Var, iqbVar);
        }
    }
}
