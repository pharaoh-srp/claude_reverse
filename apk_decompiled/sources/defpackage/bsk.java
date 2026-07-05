package defpackage;

import android.os.Process;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bsk {
    public static final ta4 a = new ta4(-1063087219, false, new vb4(10));
    public static final ta4 b = new ta4(-293685009, false, new wb4(6));

    static {
        new ta4(801359091, false, new vb4(11));
    }

    public static final void a(vr4 vr4Var, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-448972435);
        int i2 = (e18Var2.f(vr4Var) ? 4 : 2) | i;
        int i3 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            v4g v4gVarG = iuj.G(true, null, e18Var2, 6, 2);
            boolean z = (i2 & 14) == 4;
            Object objN = e18Var2.N();
            if (z || objN == jd4.a) {
                objN = new tr4(vr4Var, i3);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            iuj.f((zy7) objN, null, v4gVarG, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, gm3.a(e18Var2).o, 0L, 0L, null, null, null, fd9.q0(-582869557, new nn(17, vr4Var), e18Var2), e18Var, 0, 3072, 8122);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ur4(vr4Var, i, 0);
        }
    }

    public static final void b(vr4 vr4Var, ld4 ld4Var, int i) {
        vr4 vr4Var2;
        e18 e18Var;
        boolean z;
        String str = vr4Var.b;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1005335922);
        int i2 = i | (e18Var2.f(vr4Var) ? 4 : 2);
        int i3 = 1;
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarN = gb9.N(gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 7);
            vo1 vo1Var = lja.T;
            q64 q64VarA = p64.a(new ho0(24.0f, true, new sz6(i3)), vo1Var, e18Var2, 54);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarN);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            cv8.b(a.a(ud0.E0, e18Var2), null, b.o(gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), 40.0f), gm3.a(e18Var2).a, e18Var2, 440, 0);
            q64 q64VarA2 = p64.a(new ho0(8.0f, true, new sz6(1)), vo1Var, e18Var2, 54);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, fqbVar);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, q64VarA2);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            tjh.b(d4c.j0(R.string.conway_client_permission_title, e18Var2), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).f, e18Var2, 0, 0, 130042);
            tjh.b(str, null, gm3.a(e18Var2).a, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).h, e18Var2, 0, 0, 130042);
            tjh.b(d4c.k0(R.string.conway_client_permission_body, new Object[]{str}, e18Var2), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 130042);
            vr4Var2 = vr4Var;
            e18 e18Var3 = e18Var2;
            String str2 = vr4Var2.c;
            if (str2 == null || bsg.I0(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                e18Var3.a0(-745279340);
                e18Var3.p(false);
                z = false;
            } else {
                e18Var3.a0(-745279339);
                z = false;
                tjh.b(d4c.k0(R.string.conway_client_permission_triggered_by, new Object[]{str2}, e18Var3), gb9.K(yfd.p(xn5.V(fqbVar, xve.b(6.0f)), gm3.a(e18Var3).q, zni.b), 8.0f, 4.0f), gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var3).e.F).i, e18Var3, 0, 0, 131064);
                e18Var3 = e18Var3;
                e18Var3.p(false);
            }
            int i4 = 1;
            e18Var3.p(true);
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            q64 q64VarA3 = p64.a(new ho0(12.0f, true, new sz6(i4)), lja.S, e18Var3, 6);
            int iHashCode3 = Long.hashCode(e18Var3.T);
            hyc hycVarL3 = e18Var3.l();
            iqb iqbVarE3 = kxk.E(e18Var3, iqbVarC);
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, z80Var, q64VarA3);
            d4c.i0(e18Var3, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var3, z80Var3, e18Var3, bxVar);
            d4c.i0(e18Var3, z80Var4, iqbVarE3);
            String strJ0 = d4c.j0(R.string.conway_client_permission_allow, e18Var3);
            iqb iqbVarC2 = b.c(fqbVar, 1.0f);
            int i5 = i2 & 14;
            boolean z2 = i5 == 4 ? true : z;
            Object objN = e18Var3.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                objN = new tr4(vr4Var2, i4);
                e18Var3.k0(objN);
            }
            e18 e18Var4 = e18Var3;
            dtj.a(strJ0, iqbVarC2, false, null, e12.a, null, 0L, (zy7) objN, e18Var4, 24624, 108);
            String strJ02 = d4c.j0(R.string.conway_client_permission_deny, e18Var4);
            iqb iqbVarC3 = b.c(fqbVar, 1.0f);
            boolean z3 = i5 == 4;
            Object objN2 = e18Var4.N();
            if (z3 || objN2 == lz1Var) {
                objN2 = new tr4(vr4Var2, 2);
                e18Var4.k0(objN2);
            }
            dtj.a(strJ02, iqbVarC3, false, null, f12.a, null, 0L, (zy7) objN2, e18Var4, 24624, 108);
            e18Var = e18Var4;
            i3 = 1;
            e18Var.p(true);
            e18Var.p(true);
        } else {
            vr4Var2 = vr4Var;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ur4(vr4Var2, i, i3);
        }
    }

    public static jc0 c(wc0 wc0Var, ww7 ww7Var) {
        Object next;
        ww7Var.getClass();
        Iterator it = wc0Var.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x44.r(((jc0) next).e(), ww7Var)) {
                break;
            }
        }
        return (jc0) next;
    }

    public static boolean d(wc0 wc0Var, ww7 ww7Var) {
        ww7Var.getClass();
        return wc0Var.P(ww7Var) != null;
    }

    public static final fee e(long j, long j2, long j3, long j4, long j5, ha1 ha1Var, float[] fArr) {
        m5c m5cVarU = yfd.U(ha1Var, 2);
        av9 av9VarW = yfd.W(ha1Var);
        boolean zY = av9VarW.Y();
        g5c g5cVar = av9VarW.k0;
        if (!zY) {
            return null;
        }
        if (((m5c) g5cVar.I) == m5cVarU) {
            return new fee(j, j2, j3, j4, j5, ha1Var, fArr);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L);
        long j6 = m5cVarU.G;
        m5c m5cVar = (m5c) g5cVar.I;
        m5cVar.getClass();
        long jA0 = yfd.a0(m5cVar.L(m5cVarU, jFloatToRawIntBits, true));
        return new fee(jA0, (4294967295L & ((long) (((int) (jA0 & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jA0 >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, ha1Var, fArr);
    }

    public static final nwb f(he6 he6Var, np5 np5Var, Object obj, zy7 zy7Var, pz7 pz7Var, ld4 ld4Var) {
        he6Var.getClass();
        np5Var.getClass();
        obj.getClass();
        zy7Var.getClass();
        pz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        ((yne) e18Var.j(aoe.b)).getClass();
        xne xneVarA = yne.a(e18Var);
        boolean zF = e18Var.f(he6Var) | e18Var.f(np5Var) | e18Var.f(obj) | e18Var.f(xneVarA);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = mpk.P(gb9.V(im6.E, new eqe(pz7Var, xneVarA, null, 2)));
            e18Var.k0(objN);
        }
        return (nwb) objN;
    }

    public static final String g(qqb qqbVar, String str) {
        String strD;
        qqbVar.getClass();
        String str2 = ue9.a;
        xw7 xw7VarI = o06.g(qqbVar).i();
        xw7VarI.getClass();
        gh3 gh3VarG = ue9.g(xw7VarI);
        if (gh3VarG != null) {
            strD = zj9.b(gh3VarG).e();
            strD.getClass();
        } else {
            strD = oyk.d(qqbVar, c0l.W);
        }
        return strD + '.' + str;
    }

    public static int h(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int i(Object obj) {
        return h(obj == null ? 0 : obj.hashCode());
    }

    public static Object j(trk... trkVarArr) {
        int length = trkVarArr.length;
        Class[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        if (trkVarArr.length <= 0) {
            return Process.class.getDeclaredMethod("isIsolated", clsArr).invoke(null, objArr);
        }
        trk trkVar = trkVarArr[0];
        throw null;
    }
}
