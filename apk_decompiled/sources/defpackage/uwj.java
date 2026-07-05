package defpackage;

import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uwj {
    public static final ta4 a = new ta4(-745615398, false, new db4(0));
    public static final ta4 b = new ta4(2019789195, false, new ya4(5));
    public static final float c = 0.38f;

    public static final void a(String str, boolean z, boolean z2, bz7 bz7Var, boolean z3, ld4 ld4Var, int i) {
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1156627369);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        boolean z4 = true;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            int i3 = i2 >> 3;
            ppk.b(u00.g(R.string.verification_flow_agree_to_privacy_policy, new Object[]{str}, e18Var), z, bz7Var, null, e18Var, (i3 & 896) | (i2 & 112) | 24576, 40);
            e18Var = e18Var;
            xrk.a(i3 & 112, 4, e18Var, null, d4c.j0(R.string.verification_flow_privacy_validation_error, e18Var), z2);
            e18Var.p(true);
        } else {
            e18Var.T();
            z4 = z3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jm5(str, z, z2, bz7Var, z4, i);
        }
    }

    public static final iqb b(iqb iqbVar, pz7 pz7Var) {
        return iqbVar.B(new ce(pz7Var));
    }

    public static final Object c(saa saaVar, vp4 vp4Var) {
        try {
            if (saaVar.isDone()) {
                return z3.h(saaVar);
            }
            ua2 ua2Var = new ua2(1, zni.I(vp4Var));
            ua2Var.t();
            saaVar.a(new orh(saaVar, ua2Var, 1), a56.E);
            ua2Var.w(new u3a(3, saaVar));
            return ua2Var.r();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r3.add(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ls6 d(defpackage.qh9 r13) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwj.d(qh9):ls6");
    }

    public static lwi e(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("min").l();
            Number numberL2 = qh9Var.s("max").l();
            Number numberL3 = qh9Var.s("average").l();
            bh9 bh9VarS = qh9Var.s("metric_max");
            Number numberL4 = bh9VarS != null ? bh9VarS.l() : null;
            numberL.getClass();
            numberL2.getClass();
            numberL3.getClass();
            return new lwi(numberL, numberL2, numberL3, numberL4);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type FlutterBuildTime", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type FlutterBuildTime", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type FlutterBuildTime", e3);
            return null;
        }
    }
}
