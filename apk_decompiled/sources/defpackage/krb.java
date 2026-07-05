package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.types.strings.ModelId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class krb {
    public static final void a(t53 t53Var, t4g t4gVar, zy7 zy7Var, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        r93 r93Var = t53Var.g0;
        t4gVar.getClass();
        zy7Var.getClass();
        i4gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-496772473);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(t53Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(t4gVar) : e18Var.h(t4gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(i4gVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        boolean z = false;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            List list = (List) r93Var.p.getValue();
            String strE = r93Var.e();
            boolean z2 = (i2 & 14) == 4;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && e18Var.h(t4gVar))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objN = e18Var.N();
            if (z3 || objN == jd4.a) {
                objN = new z04(t53Var, 26, t4gVar);
                e18Var.k0(objN);
            }
            b(list, strE, (bz7) objN, zy7Var, i4gVar, e18Var, (i2 << 3) & 64512);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jrb(t53Var, t4gVar, zy7Var, i4gVar, i, 0);
        }
    }

    public static final void b(List list, String str, bz7 bz7Var, zy7 zy7Var, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        bz7 bz7Var2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1550613920);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str != null ? ModelId.m1058boximpl(str) : null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            bz7Var2 = bz7Var;
            i2 |= e18Var2.h(bz7Var2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            bz7Var2 = bz7Var;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(i4gVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            qnc qncVarQ0 = xn5.q0(i4gVar.a, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1));
            mnc mncVar = i4gVar.a;
            iqb iqbVarN = gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7);
            boolean zF = ((i2 & 14) == 4 || ((i2 & 8) != 0 && e18Var2.h(list))) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | e18Var2.f(qncVarQ0);
            Object objN = e18Var2.N();
            if (zF || objN == jd4.a) {
                w20 w20Var = new w20(list, (Object) str, bz7Var2, (qz7) zy7Var, (Object) qncVarQ0, 6);
                e18Var2.k0(w20Var);
                objN = w20Var;
            }
            e18Var = e18Var2;
            qwj.a(iqbVarN, mncVar, null, null, null, null, null, (bz7) objN, e18Var, 0, 124);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk((Object) list, (Object) str, bz7Var, zy7Var, (Object) i4gVar, i, 21);
        }
    }
}
