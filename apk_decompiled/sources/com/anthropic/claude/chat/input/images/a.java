package com.anthropic.claude.chat.input.images;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bg6;
import defpackage.bj7;
import defpackage.bpc;
import defpackage.bsg;
import defpackage.bz7;
import defpackage.cd4;
import defpackage.cvk;
import defpackage.d4c;
import defpackage.dd4;
import defpackage.dw1;
import defpackage.e18;
import defpackage.ed8;
import defpackage.fqb;
import defpackage.fx8;
import defpackage.gm3;
import defpackage.ho4;
import defpackage.hyc;
import defpackage.iqb;
import defpackage.jd4;
import defpackage.jx8;
import defpackage.kxk;
import defpackage.ld4;
import defpackage.lja;
import defpackage.lz1;
import defpackage.nuk;
import defpackage.o5b;
import defpackage.pk;
import defpackage.puk;
import defpackage.pw2;
import defpackage.qw2;
import defpackage.r7e;
import defpackage.re4;
import defpackage.rw2;
import defpackage.tl8;
import defpackage.ud0;
import defpackage.va6;
import defpackage.vb7;
import defpackage.w00;
import defpackage.wg6;
import defpackage.xo1;
import defpackage.yfd;
import defpackage.zni;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(rw2 rw2Var, iqb iqbVar, zy7 zy7Var, bz7 bz7Var, va6 va6Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        bz7 bz7Var2;
        va6 va6Var2;
        iqb iqbVar2;
        Object objInvoke;
        String file_name;
        rw2Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1621240170);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(rw2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 27648;
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new ed8(19);
                e18Var2.k0(objN);
            }
            bz7 bz7Var3 = (bz7) objN;
            va6 va6Var3 = new va6(96.0f);
            xo1 xo1Var = lja.K;
            iqb iqbVarC = fqb.E;
            iqb iqbVarE = puk.e(iqbVar.B(b.o(iqbVarC, 96.0f)));
            if (zy7Var != null) {
                iqbVar2 = iqbVarE;
                iqbVarC = androidx.compose.foundation.b.c(iqbVarC, false, null, null, null, zy7Var, 15);
            } else {
                iqbVar2 = iqbVarE;
            }
            iqb iqbVarP = yfd.p(iqbVar2.B(iqbVarC), gm3.a(e18Var2).o, zni.b);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarP);
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
            d4c.i0(e18Var2, cd4.d, iqbVarE2);
            boolean z = rw2Var instanceof pw2;
            if (z) {
                objInvoke = ((pw2) rw2Var).i();
            } else {
                if (!(rw2Var instanceof qw2)) {
                    wg6.i();
                    return;
                }
                objInvoke = bz7Var3.invoke(rw2Var);
            }
            if (objInvoke != null) {
                e18Var2.a0(-440006483);
                if (z) {
                    file_name = null;
                } else {
                    if (!(rw2Var instanceof qw2)) {
                        wg6.i();
                        return;
                    }
                    file_name = ((qw2) rw2Var).b.getFile_name();
                }
                e18Var = e18Var2;
                b(objInvoke, null, rw2Var.k(), file_name, e18Var, 0, 2);
                e18Var.p(false);
            } else {
                e18Var = e18Var2;
                e18Var.a0(-439694158);
                e18Var.p(false);
            }
            if (z) {
                e18Var.a0(-439634080);
                pw2 pw2Var = (pw2) rw2Var;
                if (pw2Var.l() != null) {
                    e18Var.a0(-439600259);
                    cvk.b(null, e18Var, 0);
                    e18Var.p(false);
                } else if (pw2Var.e()) {
                    e18Var.a0(-439518109);
                    bj7.a((Float) pw2Var.d.getValue(), e18Var, 0);
                    e18Var.p(false);
                } else {
                    e18Var.a0(-439442190);
                    e18Var.p(false);
                }
                e18Var.p(false);
            } else {
                e18Var.a0(-439432270);
                e18Var.p(false);
            }
            e18Var.p(true);
            bz7Var2 = bz7Var3;
            va6Var2 = va6Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            bz7Var2 = bz7Var;
            va6Var2 = va6Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(rw2Var, iqbVar, zy7Var, bz7Var2, va6Var2, i);
        }
    }

    public static final void b(Object obj, iqb iqbVar, String str, String str2, ld4 ld4Var, int i, int i2) {
        iqb iqbVar2;
        int i3;
        String str3;
        int i4;
        iqb iqbVar3;
        String str4;
        obj.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1246391290);
        int i5 = i | (e18Var.h(obj) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i3 = i5 | (e18Var.f(iqbVar2) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 384;
            str3 = str;
        } else {
            str3 = str;
            i4 = i3 | (e18Var.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        }
        int i8 = i4 | (e18Var.f(str2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i8 & 1, (i8 & 1171) != 1170)) {
            iqb iqbVar4 = i6 != 0 ? fqb.E : iqbVar2;
            str4 = i7 != 0 ? null : str3;
            fx8 fx8Var = new fx8((Context) e18Var.j(w00.b));
            fx8Var.c = obj;
            fx8Var.e = str4;
            fx8Var.e(str4);
            jx8 jx8VarA = fx8Var.a();
            long j = gm3.a(e18Var).q;
            long j2 = gm3.a(e18Var).O;
            bpc bpcVarA = com.anthropic.claude.design.icon.a.a(ud0.B0, e18Var);
            boolean zE = e18Var.e(j) | e18Var.e(j2) | e18Var.c(32.0f) | e18Var.f(bpcVarA);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zE || objN == lz1Var) {
                objN = new ImagePlaceholderPainter(j, bpcVarA, j2);
                e18Var.k0(objN);
            }
            ImagePlaceholderPainter imagePlaceholderPainter = (ImagePlaceholderPainter) objN;
            String strN = (str2 == null || bsg.I0(str2)) ? null : str2;
            if (strN == null) {
                strN = vb7.n(e18Var, 513864910, R.string.chat_input_image_attachment_content_description, e18Var, false);
            } else {
                e18Var.a0(513862988);
                e18Var.p(false);
            }
            iqb iqbVarB = iqbVar4.B(b.c);
            boolean zH = e18Var.h(imagePlaceholderPainter);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new tl8(1, imagePlaceholderPainter);
                e18Var.k0(objN2);
            }
            nuk.e(jx8VarA, strN, iqbVarB, null, (bz7) objN2, null, ho4.a, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, 12582912, 3944);
            iqbVar3 = iqbVar4;
        } else {
            e18Var.T();
            iqbVar3 = iqbVar2;
            str4 = str3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(obj, iqbVar3, str4, str2, i, i2);
        }
    }
}
