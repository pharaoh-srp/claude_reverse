package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kr4 {
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.anthropic.claude.conway.ConwayAppScreen.Extension r35, boolean r36, defpackage.bz7 r37, defpackage.iqb r38, defpackage.ld4 r39, int r40) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr4.a(com.anthropic.claude.conway.ConwayAppScreen$Extension, boolean, bz7, iqb, ld4, int):void");
    }

    public static final void b(List list, ConwayAppScreen.Extension extension, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        iqb iqbVar2;
        list.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1617003547);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(extension) : e18Var2.h(extension) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = i2 | 24576;
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            otj.g(iuj.G(true, null, e18Var2, 6, 2), zy7Var, d4c.j0(R.string.conway_app_picker_title, e18Var2), fqbVar, null, false, false, null, fd9.q0(-974139492, new f44(list, extension, bz7Var, 9), e18Var2), e18Var, ((i3 >> 6) & 112) | 100663296 | ((i3 >> 3) & 7168), 240);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk((Object) list, (Object) extension, bz7Var, zy7Var, (Object) iqbVar2, i, 9);
        }
    }

    public static final void c(List list, ConwayAppScreen.Extension extension, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1856791978);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(extension) : e18Var2.h(extension) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 3072;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarK0 = mpk.k0(b.c(fqbVar, 1.0f), mpk.o);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarK0);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            dw1.a(yfd.p(b.q(gb9.N(new ko8(lja.T), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 5), 36.0f, 4.0f), gm3.a(e18Var2).v, xve.b(2.0f)), e18Var2, 0);
            qnc qncVar = new qnc(12.0f, 8.0f, 12.0f, 8.0f);
            iqb iqbVarB = b.c(fqbVar, 1.0f).B(new hw9(1.0f, false));
            boolean z = ((i3 & 14) == 4 || ((i3 & 8) != 0 && e18Var2.h(list))) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && e18Var2.h(extension))) | ((i3 & 896) == 256);
            Object objN = e18Var2.N();
            if (z || objN == jd4.a) {
                objN = new l6(list, extension, bz7Var);
                e18Var2.k0(objN);
            }
            iqbVar2 = fqbVar;
            knk.h(iqbVarB, null, qncVar, false, null, null, null, false, null, (bz7) objN, e18Var2, 384, 506);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd((Object) list, (Object) extension, bz7Var, iqbVar2, i, 23);
        }
    }
}
