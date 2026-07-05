package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class auj {
    public static final ta4 a = new ta4(-856762410, false, new p6(18));
    public static final ta4 b = new ta4(1927484092, false, new p6(19));
    public static final ta4 c = new ta4(-983657423, false, new p6(20));
    public static final ta4 d = new ta4(581949204, false, new p6(21));
    public static final int[] e = {13, 15, 14};

    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        iqb iqbVar2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1807241240);
        int i2 = i | (e18Var.f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            wo1 wo1Var = lja.Q;
            vve vveVar = xve.a;
            fqb fqbVar = fqb.E;
            iqb iqbVarI = gb9.i(gb9.L(b.c(xn5.V(fqbVar, vveVar), false, d4c.j0(R.string.ccr_select_model, e18Var), new vue(0), null, zy7Var, 9), 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), null, 3);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.b(str == null ? "" : str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, (tkh) gm3.c(e18Var).f.H, e18Var, 0, 24960, 110590);
            e18Var = e18Var;
            iv1.b(ud0.B, null, null, ef2.F, 0L, e18Var, 3120, 20);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bk1(str, zy7Var, iqbVar2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.r4g r24, final java.lang.String r25, defpackage.iqb r26, defpackage.z3g r27, boolean r28, defpackage.z4g r29, defpackage.a5g r30, defpackage.pz7 r31, defpackage.pz7 r32, final defpackage.pz7 r33, defpackage.pz7 r34, defpackage.rz7 r35, final defpackage.ta4 r36, defpackage.ld4 r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auj.b(r4g, java.lang.String, iqb, z3g, boolean, z4g, a5g, pz7, pz7, pz7, pz7, rz7, ta4, ld4, int, int, int):void");
    }

    public static final String c(u9i u9iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("type: " + u9iVar);
        sb.append('\n');
        sb.append("hashCode: " + u9iVar.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + u9iVar.getClass().getCanonicalName());
        sb.append('\n');
        for (bo5 bo5VarA = u9iVar.a(); bo5VarA != null; bo5VarA = bo5VarA.h()) {
            sb.append("fqName: ".concat(g06.c.x(bo5VarA)));
            sb.append('\n');
            sb.append("javaClass: " + bo5VarA.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    public static zs9 d() {
        ys9 ys9Var = (ys9) wkb.c().a(ys9.class);
        ffk ffkVar = ys9Var.b;
        ffkVar.e = vs9.a;
        zxk zxkVar = ys9Var.a;
        zs9 zs9Var = new zs9(ffkVar, zxkVar, (Executor) ys9Var.c.a.get());
        smk smkVar = new smk();
        smkVar.c = zs9Var.J;
        uvj uvjVar = new uvj(5);
        uvjVar.G = zs9.i();
        smkVar.d = new vrk(uvjVar);
        s20 s20Var = new s20(smkVar, 1);
        r5l r5lVar = zxkVar.e;
        qjk.E.execute(new me2(zxkVar, s20Var, xmk.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, r5lVar.g() ? (String) r5lVar.e() : n3a.c.a(zxkVar.g), 4, false));
        ((ffk) zs9Var.H.get()).b.incrementAndGet();
        return zs9Var;
    }

    public static final void e(u1d u1dVar) {
        Logger logger = u1d.h;
        synchronized (u1d.class) {
            u1d.y = u1dVar;
        }
    }

    public static void f(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void g(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
