package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iv4 {
    public static final void a(ConwayAppScreen.Extension extension, hsf hsfVar, String str, boolean z, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z2;
        e18 e18Var;
        iqb iqbVar2;
        extension.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(372013627);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(extension) : e18Var2.h(extension) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(hsfVar) : e18Var2.h(hsfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= e18Var2.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var2.f(bz7Var) : e18Var2.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (e18Var2.Q(i3 & 1, (599187 & i3) != 599186)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new fr4(8);
                e18Var2.k0(objN);
            }
            isc iscVar = (isc) iuj.I(objArr, (zy7) objN, e18Var2, 48);
            long j = gm3.a(e18Var2).o;
            e18Var = e18Var2;
            iqbVar2 = fqb.E;
            v40.b(iqbVar2, null, fd9.q0(1548004952, new f44(extension, iscVar, zy7Var, 10), e18Var2), null, null, null, 0, j, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(932421445, new hv4(hsfVar, extension, bz7Var, z2, str, iscVar), e18Var2), e18Var, ((i3 >> 18) & 14) | 384, 1914);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new de3(extension, hsfVar, str, z, bz7Var, zy7Var, iqbVar2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01dc A[LOOP:4: B:104:0x01d6->B:106:0x01dc, LOOP_END] */
    /* JADX WARN: Type inference failed for: r3v43, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.anthropic.claude.conway.ConwayAppScreen.Extension r36, defpackage.vs8 r37, boolean r38, defpackage.bz7 r39, final boolean r40, final int r41, defpackage.iqb r42, defpackage.ld4 r43, int r44) {
        /*
            Method dump skipped, instruction units count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv4.b(com.anthropic.claude.conway.ConwayAppScreen$Extension, vs8, boolean, bz7, boolean, int, iqb, ld4, int):void");
    }
}
