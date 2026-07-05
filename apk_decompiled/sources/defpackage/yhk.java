package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yhk {
    public static final ta4 a;
    public static final ta4 b;
    public static final ta4 c;
    public static final nyj d;

    static {
        new ta4(-1252109125, false, new ya4(8));
        a = new ta4(1271629997, false, new gb4(15));
        b = new ta4(1551772442, false, new db4(11));
        new ta4(1813718281, false, new db4(12));
        c = new ta4(1127882695, false, new db4(13));
        d = new nyj("Wearable.API", new z89(8), new lz1(13));
    }

    public static final void a(iqb iqbVar, rz7 rz7Var, ld4 ld4Var, int i) {
        rz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1462038459);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= e18Var.h(rz7Var) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            qnc qncVar = qf2.a;
            ho0 ho0Var = new ho0(2.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarI = gb9.i(xn5.V(gb9.L(b.c(fqbVar, 1.0f), 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.b(e18Var).h), null, 3);
            int i3 = ((i2 << 6) & 7168) | 48;
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
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
            rz7Var.invoke(s64.a, e18Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            e18Var.p(true);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new rf2(iqbVar, rz7Var, i);
        }
    }

    public static final void b(int i, int i2, ld4 ld4Var, iqb iqbVar, String str) {
        int i3;
        iqb iqbVar2;
        int i4;
        e18 e18Var;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1969949138);
        if ((i & 6) == 0) {
            i3 = i | (e18Var2.f(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i4 = i3 | (e18Var2.f(iqbVar2) ? 32 : 16);
        }
        if (e18Var2.Q(i4 & 1, (i4 & 19) != 18)) {
            iqb iqbVar3 = i5 != 0 ? fqb.E : iqbVar2;
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).g;
            long j = gm3.a(e18Var2).N;
            qnc qncVar = qf2.a;
            e18Var = e18Var2;
            tjh.b(str, gb9.N(gb9.L(iqbVar3, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, i4 & 14, 0, 131064);
            iqbVar2 = iqbVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sf2(str, iqbVar2, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.bpc r22, java.lang.String r23, defpackage.zy7 r24, defpackage.iqb r25, defpackage.pz7 r26, java.lang.String r27, defpackage.nxf r28, defpackage.mnc r29, long r30, defpackage.ld4 r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhk.c(bpc, java.lang.String, zy7, iqb, pz7, java.lang.String, nxf, mnc, long, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.bpc r37, java.lang.String r38, boolean r39, defpackage.bz7 r40, defpackage.iqb r41, defpackage.zb0 r42, boolean r43, defpackage.ld4 r44, int r45, int r46) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhk.d(bpc, java.lang.String, boolean, bz7, iqb, zb0, boolean, ld4, int, int):void");
    }

    public static final void e(pmd pmdVar, t4g t4gVar, boolean z, boolean z2, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, ld4 ld4Var, int i) {
        e18 e18Var;
        pmdVar.getClass();
        t4gVar.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1381185099);
        int i2 = (e18Var2.h(zy7Var4) ? 8388608 : 4194304) | i | (e18Var2.f(pmdVar) ? 4 : 2) | (e18Var2.f(t4gVar) ? 32 : 16) | (e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.h(zy7Var2) ? 131072 : 65536) | (e18Var2.h(zy7Var3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        if (e18Var2.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            e18Var = e18Var2;
            qwe.a(t4gVar, null, null, false, pmdVar.f, new m04(z, z2, zy7Var, zy7Var2, zy7Var3, zy7Var4, pmdVar, t4gVar), e18Var, (i2 >> 3) & 14, 14);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new er0(pmdVar, t4gVar, z, z2, zy7Var, zy7Var2, zy7Var3, zy7Var4, i);
        }
    }

    public static final sfa f(ozf ozfVar) {
        int iOrdinal = ozfVar.ordinal();
        if (iOrdinal == 0) {
            return sfa.INFO;
        }
        if (iOrdinal == 1) {
            return sfa.WARN;
        }
        sfa sfaVar = sfa.ERROR;
        if (iOrdinal == 2 || iOrdinal == 3) {
            return sfaVar;
        }
        wg6.i();
        return null;
    }

    public static xs6 g(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("referrer");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            String strM3 = qh9Var.s("url").m();
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM4 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("in_foreground");
            Boolean boolValueOf = bh9VarS3 != null ? Boolean.valueOf(bh9VarS3.a()) : null;
            strM.getClass();
            strM3.getClass();
            return new xs6(strM, strM2, strM3, strM4, boolValueOf);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type ErrorEventView", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type ErrorEventView", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type ErrorEventView", e3);
            return null;
        }
    }

    public static axi h(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("x").l();
            Number numberL2 = qh9Var.s("y").l();
            Number numberL3 = qh9Var.s("width").l();
            Number numberL4 = qh9Var.s("height").l();
            numberL.getClass();
            numberL2.getClass();
            numberL3.getClass();
            numberL4.getClass();
            return new axi(numberL, numberL2, numberL3, numberL4);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type PreviousRect", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type PreviousRect", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type PreviousRect", e3);
            return null;
        }
    }

    public static final yb0 i(yb0 yb0Var) {
        Object obj = yb0Var.a;
        obj.getClass();
        return new yb0(yb0Var.b, yb0Var.c, ((erg) obj).a, yb0Var.d);
    }
}
