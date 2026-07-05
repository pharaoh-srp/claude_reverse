package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wsk {
    public static final ta4 a = new ta4(2048681104, false, new xb4(4));

    public static final void a(int i, ld4 ld4Var, iqb iqbVar, boolean z) {
        iqbVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1331423897);
        int i2 = (e18Var.g(z) ? 32 : 16) | i;
        if (!e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.T();
        } else if (z) {
            e18Var.a0(426427210);
            cv8.b(a.a(ud0.L, e18Var), null, b.o(gb9.J(ez1.t(iqbVar, 1.0f, gm3.a(e18Var).M, xve.b(2.0f)), 1.0f), 10.0f), gm3.a(e18Var).M, e18Var, 56, 0);
            e18Var.p(false);
        } else {
            e18Var.a0(426878818);
            dw1.a(b.o(gb9.J(ez1.t(iqbVar, 1.0f, gm3.a(e18Var).M, xve.b(2.0f)), 1.0f), 10.0f), e18Var, 0);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lid(i, iqbVar, z);
        }
    }

    public static final void b(cte cteVar, ld4 ld4Var, int i) {
        int i2;
        cteVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1642175075);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(cteVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            long jB = d54.b(0.2f, bte.d(cteVar, e18Var));
            e18Var.a0(1877252904);
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            clh clhVar = pte.c(pte.b(cteVar, e18Var)).a;
            clhVar.getClass();
            float fD = cz5Var.D(clhVar.a);
            e18Var.p(false);
            dw1.a(yfd.p(b.e(b.c(gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, fD, MTTypesetterKt.kLineSkipLimitMultiplier, fD, 5), 1.0f), 1.0f), jB, zni.b), e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ay3(cteVar, i, i3);
        }
    }

    public static final void c(ta4 ta4Var, ta4 ta4Var2, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1295388793);
        if (e18Var.Q(i & 1, (i & 19) != 18)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            Object obj = jd4.a;
            if (objN == obj) {
                objN = new ulb(24);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
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
            boolean zF = e18Var.f(nwbVar);
            Object objN2 = e18Var.N();
            if (zF || objN2 == obj) {
                objN2 = new d29(18, nwbVar);
                e18Var.k0(objN2);
            }
            ta4Var2.invoke((zy7) objN2, e18Var, 48);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(8.0f)) & 4294967295L);
            iqb iqbVarA = nw1.a.a(fqbVar, lja.N);
            boolean zF2 = e18Var.f(nwbVar);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == obj) {
                objN3 = new d29(19, nwbVar);
                e18Var.k0(objN3);
            }
            j8.b(zBooleanValue, (zy7) objN3, iqbVarA, jFloatToRawIntBits, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-1642462608, new nw7(ta4Var, 17, nwbVar), e18Var), e18Var, 3072, 2032);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ym6(ta4Var, ta4Var2, i);
        }
    }

    public static final void d(List list, ld4 ld4Var, int i) {
        List list2 = list;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1453646438);
        int i2 = i | (e18Var.f(list2) ? 4 : 2);
        boolean z = true;
        boolean z2 = false;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            String strJ0 = d4c.j0(R.string.todo_state_completed, e18Var);
            String strJ02 = d4c.j0(R.string.todo_state_pending, e18Var);
            fqb fqbVar = fqb.E;
            float f = 8.0f;
            iqb iqbVarJ = gb9.J(fqbVar, 8.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e18Var.a0(313614164);
            int size = list2.size();
            int i3 = 0;
            while (i3 < size) {
                cpc cpcVar = (cpc) list2.get(i3);
                boolean zBooleanValue = ((Boolean) cpcVar.E).booleanValue();
                String str = (String) cpcVar.F;
                boolean z3 = (zBooleanValue || !(i3 == 0 || ((Boolean) ((cpc) list2.get(i3 + (-1))).E).booleanValue())) ? z2 : z;
                if (i3 > 0) {
                    sq6.A(10.0f, 1132235252, e18Var, e18Var, fqbVar);
                    e18Var.p(z2);
                } else {
                    e18Var.a0(1132294834);
                    e18Var.p(z2);
                }
                iqb iqbVarS = xn5.S(fqbVar, !z3 ? 0.5f : 1.0f);
                boolean zG = e18Var.g(zBooleanValue) | e18Var.f(strJ0) | e18Var.f(strJ02);
                Object objN = e18Var.N();
                if (zG || objN == jd4.a) {
                    objN = new jl1(zBooleanValue, strJ0, strJ02, 8);
                    e18Var.k0(objN);
                }
                iqb iqbVarB = tjf.b(iqbVarS, z, (bz7) objN);
                cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
                int iHashCode2 = Long.hashCode(e18Var.T);
                hyc hycVarL2 = e18Var.l();
                iqb iqbVarE2 = kxk.E(e18Var, iqbVarB);
                dd4.e.getClass();
                re4 re4Var2 = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var2);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, cxeVarA);
                d4c.i0(e18Var, cd4.e, hycVarL2);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode2));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE2);
                fqb fqbVar2 = fqbVar;
                float f2 = f;
                a(6, e18Var, gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f, MTTypesetterKt.kLineSkipLimitMultiplier, 11), zBooleanValue);
                e18 e18Var2 = e18Var;
                tjh.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkh.b(((jm3) gm3.c(e18Var).e.E).i, gm3.a(e18Var).M, 0L, null, null, null, 0L, zBooleanValue ? qeh.d : qeh.b, 0, 0L, null, 0, 16773118), e18Var2, 0, 0, 131070);
                e18Var = e18Var2;
                e18Var.p(true);
                i3++;
                z = true;
                z2 = false;
                fqbVar = fqbVar2;
                f = f2;
                size = size;
                strJ02 = strJ02;
                strJ0 = strJ0;
                list2 = list;
            }
            e18Var.p(z2);
            e18Var.p(z);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss2(i, 3, list);
        }
    }

    public static final fz4 e(fz4 fz4Var, bz7 bz7Var) {
        if (fz4Var instanceof dz4) {
            return new dz4(bz7Var.invoke(((dz4) fz4Var).a));
        }
        if ((fz4Var instanceof ez4) || (fz4Var instanceof cz4)) {
            return fz4Var;
        }
        wg6.i();
        return null;
    }

    public static boolean f(Object[] objArr, jf7 jf7Var) {
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!gb9.v(objArr[i], jf7Var)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    public static final String g(String str) {
        return ij0.j("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", str, "')");
    }
}
