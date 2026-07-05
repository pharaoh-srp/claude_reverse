package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.project.menu.f;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jik {
    public static final ta4 a = new ta4(-1036025537, false, new gb4(25));
    public static final jf7 b;
    public static final jf7[] c;

    static {
        new ta4(-1764809262, false, new gb4(26));
        jf7 jf7Var = new jf7("moduleinstall", 7L);
        b = jf7Var;
        c = new jf7[]{jf7Var};
    }

    public static final void a(Project project, zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var, zy7 zy7Var3, Date date, iqb iqbVar, pl3 pl3Var, ld4 ld4Var, int i) {
        pl3 pl3Var2;
        int i2;
        pl3 pl3Var3;
        project.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        bz7Var.getClass();
        zy7Var3.getClass();
        date.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-638044121);
        int i3 = 16;
        int i4 = i | (e18Var.f(project) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(date) ? 131072 : 65536) | 4194304;
        if (e18Var.Q(i4 & 1, (4793491 & i4) != 4793490)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(pl3.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i4 & (-29360129);
                pl3Var3 = (pl3) objN;
            } else {
                e18Var.T();
                i2 = i4 & (-29360129);
                pl3Var3 = pl3Var;
            }
            e18Var.q();
            Object[] objArr = new Object[0];
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new mgd(26);
                e18Var.k0(objN2);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN2, e18Var, 48);
            boolean zF2 = e18Var.f(nwbVar);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = new k3c(i3, nwbVar);
                e18Var.k0(objN3);
            }
            zy7 zy7Var4 = (zy7) objN3;
            gf8 gf8Var = (gf8) e18Var.j(ve4.l);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
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
            qnc qncVar = e84.d;
            iqb iqbVarV = xn5.V(gb9.L(iqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.b(e18Var).e);
            String strJ0 = d4c.j0(R.string.project_list_item_click_label, e18Var);
            vue vueVar = new vue(0);
            boolean zF3 = e18Var.f(nwbVar) | e18Var.h(pl3Var3) | e18Var.h(gf8Var);
            Object objN4 = e18Var.N();
            int i6 = 3;
            if (zF3 || objN4 == lz1Var) {
                objN4 = new hy2(pl3Var3, gf8Var, nwbVar, i6);
                e18Var.k0(objN4);
            }
            kwj.e(null, b.e(iqbVarV, strJ0, vueVar, null, (zy7) objN4, zy7Var, 233), MTTypesetterKt.kLineSkipLimitMultiplier, qncVar, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1760964946, new lpa(project, 25, date), e18Var), e18Var, 12582918, 116);
            int i7 = i2 << 3;
            f.a(project, ((Boolean) nwbVar.getValue()).booleanValue(), zy7Var4, zy7Var2, bz7Var, zy7Var3, null, e18Var, (i7 & 57344) | (i7 & 7168) | (i2 & 14) | 196608);
            e18Var.p(true);
            pl3Var2 = pl3Var3;
        } else {
            e18Var.T();
            pl3Var2 = pl3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mq0(project, zy7Var, zy7Var2, bz7Var, zy7Var3, date, iqbVar, pl3Var2, i);
        }
    }

    public static final StringBuilder b(int i, StringBuilder sb) {
        return sb.appendCodePoint(i);
    }

    public static final Object c(e8d e8dVar, zeh zehVar, tp4 tp4Var) {
        Object objN = fd9.N(new zn(e8dVar, zehVar, (tp4) null, 19), tp4Var);
        return objN == m45.E ? objN : iei.a;
    }

    public static ft6 d(qh9 qh9Var) {
        try {
            String strM = qh9Var.s(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR).m();
            strM.getClass();
            for (int i : sq6.H(9)) {
                if (ms6.r(i).equals(strM)) {
                    long jK = qh9Var.s("status_code").k();
                    String strM2 = qh9Var.s("url").m();
                    bh9 bh9VarS = qh9Var.s("provider");
                    et6 et6VarB = bh9VarS != null ? iik.b(bh9VarS.g()) : null;
                    strM2.getClass();
                    return new ft6(i, jK, strM2, et6VarB);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Resource", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Resource", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Resource", e3);
            return null;
        }
    }

    public static lxi e(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("width").l();
            Number numberL2 = qh9Var.s("height").l();
            numberL.getClass();
            numberL2.getClass();
            return new lxi(numberL, numberL2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Viewport", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Viewport", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Viewport", e3);
            return null;
        }
    }

    public static double f(double d, double d2) {
        double d3 = (d - d2) / 9.0d;
        double dAbs = Math.abs(d3);
        double dFloor = Math.floor(Math.log10(dAbs));
        double dPow = dAbs / Math.pow(10.0d, dFloor);
        return Math.signum(d3) * Math.pow(10.0d, dFloor) * (dPow < 1.5d ? 1.0d : dPow < 3.0d ? 2.0d : dPow < 7.0d ? 5.0d : 10.0d);
    }
}
