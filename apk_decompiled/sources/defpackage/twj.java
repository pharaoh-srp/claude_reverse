package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class twj {
    public static final ta4 a = new ta4(-800660059, false, new xa4(29));
    public static final Object b;
    public static final Object c;
    public static final Object d;
    public static final Object e;
    public static final Object f;

    static {
        new ta4(-1712038452, false, new bb4(20));
        b = new Object();
        c = new Object();
        d = new Object();
        e = new Object();
        f = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.zy7 r26, defpackage.iqb r27, boolean r28, defpackage.e0g r29, defpackage.nc2 r30, defpackage.rc2 r31, defpackage.qu1 r32, defpackage.ta4 r33, defpackage.ld4 r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twj.a(zy7, iqb, boolean, e0g, nc2, rc2, qu1, ta4, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.iqb r21, defpackage.e0g r22, defpackage.nc2 r23, defpackage.rc2 r24, defpackage.qu1 r25, defpackage.ta4 r26, defpackage.ld4 r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twj.b(iqb, e0g, nc2, rc2, qu1, ta4, ld4, int, int):void");
    }

    public static final void c(int i, ld4 ld4Var, zy7 zy7Var, String str, boolean z) {
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-279820032);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var.N();
            int i3 = 19;
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new oob(i3);
                e18Var.k0(objN);
            }
            zy7 zy7Var2 = (zy7) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new oob(i3);
                e18Var.k0(objN2);
            }
            otj.e(str, false, false, zy7Var2, zy7Var, (zy7) objN2, null, null, null, null, null, fd9.q0(1975522088, new m1d(z, str), e18Var), e18Var, (i2 & 14) | 200112 | ((i2 << 9) & 57344), 48, 1984);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new afd(str, zy7Var, z, i);
        }
    }

    public static final void d(String str, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(757184662);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) e18Var.j(w00.b);
            vo1 vo1Var = lja.T;
            FillElement fillElement = b.c;
            q64 q64VarA = p64.a(ko0.e, vo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fillElement);
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
            bpc bpcVarD = u00.D(uaj.a(str), 0, e18Var);
            long j = gm3.a(e18Var).O;
            fqb fqbVar = fqb.E;
            cv8.b(bpcVarD, null, b.o(fqbVar, 48.0f), j, e18Var, 440, 0);
            tjh.b(uaj.b(context, str), gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 48, 0, 131064);
            tjh.b(d4c.j0(R.string.document_preview_bottom_sheet_unavailable, e18Var), gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 48, 0, 131064);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar2, i, 14);
        }
    }

    public static final Object e(exf exfVar, vp4 vp4Var) throws Throwable {
        try {
            if (exfVar.isDone()) {
                return x41.n(exfVar);
            }
            ua2 ua2Var = new ua2(1, zni.I(vp4Var));
            ua2Var.t();
            exfVar.a(new s2k(exfVar, 7, ua2Var), y46.E);
            ua2Var.w(new u3a(2, exfVar));
            return ua2Var.r();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            cause.getClass();
            throw cause;
        }
    }

    public static ks6 f(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("session_sample_rate").l();
            bh9 bh9VarS = qh9Var.s("session_replay_sample_rate");
            Number numberL2 = bh9VarS != null ? bh9VarS.l() : null;
            bh9 bh9VarS2 = qh9Var.s("profiling_sample_rate");
            Number numberL3 = bh9VarS2 != null ? bh9VarS2.l() : null;
            bh9 bh9VarS3 = qh9Var.s("trace_sample_rate");
            Number numberL4 = bh9VarS3 != null ? bh9VarS3.l() : null;
            numberL.getClass();
            return new ks6(numberL, numberL2, numberL3, numberL4);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Configuration", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Configuration", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Configuration", e4);
            return null;
        }
    }

    public static kwi g(qh9 qh9Var) {
        try {
            long jK = qh9Var.s("duration").k();
            long jK2 = qh9Var.s("timestamp").k();
            bh9 bh9VarS = qh9Var.s("target_selector");
            return new kwi(jK, jK2, bh9VarS != null ? bh9VarS.m() : null);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Fid", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Fid", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Fid", e4);
            return null;
        }
    }
}
