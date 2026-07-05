package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w76 {
    public static final vve a = xve.b(16.0f);
    public static final float b = 56.0f;
    public static final float c = 0.5f;
    public static final float d = 32.0f;
    public static final vve e = xve.b(8.0f);
    public static final float f = 20.0f;
    public static final float g = 14.0f;

    /* JADX WARN: Removed duplicated region for block: B:101:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r40, java.lang.String r41, defpackage.y76 r42, defpackage.x76 r43, defpackage.zy7 r44, defpackage.iqb r45, java.lang.String r46, defpackage.ld4 r47, int r48, int r49) {
        /*
            Method dump skipped, instruction units count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w76.a(java.lang.String, java.lang.String, y76, x76, zy7, iqb, java.lang.String, ld4, int, int):void");
    }

    public static final void b(x76 x76Var, String str, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        ud0 ud0Var;
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1958428013);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.d(x76Var.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            int iOrdinal = x76Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                ud0Var = ud0.w1;
            } else {
                if (iOrdinal != 2) {
                    wg6.i();
                    return;
                }
                ud0Var = ud0.S;
            }
            int iOrdinal2 = x76Var.ordinal();
            if (iOrdinal2 == 0) {
                i3 = R.string.dispatch_task_kind_dispatch;
            } else if (iOrdinal2 == 1) {
                i3 = R.string.dispatch_task_kind_cowork;
            } else {
                if (iOrdinal2 != 2) {
                    wg6.i();
                    return;
                }
                i3 = R.string.dispatch_task_kind_code;
            }
            String strJ0 = d4c.j0(i3, e18Var);
            cxe cxeVarA = axe.a(new ho0(4.0f, true, new sz6(1)), lja.Q, e18Var, 54);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            cv8.b(a.a(ud0Var, e18Var), strJ0, b.o(fqbVar, g), gm3.a(e18Var).O, e18Var, 392, 0);
            tjh.b(str, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, (i4 >> 3) & 14, 24960, 110586);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(x76Var, i, str, iqbVar2, 0);
        }
    }

    public static final void c(eng engVar, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1488350669);
        int i2 = (e18Var2.f(engVar) ? 4 : 2) | i | (e18Var2.f(iqbVar) ? 32 : 16);
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarO = b.o(iqbVar, d);
            long j = engVar.c;
            vve vveVar = e;
            iqb iqbVarP = yfd.p(iqbVarO, j, vveVar);
            qu1 qu1VarA = sf5.a(c, engVar.d);
            iqb iqbVarU = ez1.u(iqbVarP, qu1VarA.a, qu1VarA.b, vveVar);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarU);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            boolean z = engVar.e;
            fqb fqbVar = fqb.E;
            float f2 = f;
            if (z) {
                e18Var2.a0(-26125624);
                e18Var = e18Var2;
                tjd.a(b.o(fqbVar, f2), engVar.b, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 390, 56);
                e18Var.p(false);
            } else {
                e18Var = e18Var2;
                e18Var.a0(-25921799);
                ud0 ud0Var = engVar.a;
                ud0 ud0Var2 = ud0.d;
                cv8.b(a.a(ud0Var, e18Var), null, b.o(fqbVar, f2), engVar.b, e18Var2, 440, 0);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(engVar, iqbVar, i, 9);
        }
    }
}
