package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class ts7 implements rs7 {
    public final AndroidComposeView a;
    public final AndroidComposeView b;
    public final ns7 d;
    public fvb f;
    public jt7 h;
    public final jt7 c = new jt7(2, 14, null);
    public final ss7 e = new ss7(this);
    public final qvb g = new qvb(1);

    public ts7(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.a = androidComposeView;
        this.b = androidComposeView2;
        this.d = new ns7(this, androidComposeView2);
    }

    @Override // defpackage.ps7
    public final boolean a(int i) {
        return i(i, true);
    }

    @Override // defpackage.ps7
    public final void b(boolean z) {
        d(8, z, true);
    }

    public final boolean c(boolean z) {
        g5c g5cVar;
        if (h() != null) {
            jt7 jt7VarH = h();
            k(null);
            if (jt7VarH != null) {
                ft7 ft7Var = ft7.E;
                ft7 ft7Var2 = ft7.G;
                jt7VarH.q1(ft7Var, ft7Var2);
                if (!jt7VarH.E.R) {
                    b39.c("visitAncestors called on an unattached node");
                }
                hqb hqbVar = jt7VarH.E.I;
                av9 av9VarW = yfd.W(jt7VarH);
                while (av9VarW != null) {
                    if ((((hqb) av9VarW.k0.K).H & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                        while (hqbVar != null) {
                            if ((hqbVar.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                hqb hqbVarJ = hqbVar;
                                wwb wwbVar = null;
                                while (hqbVarJ != null) {
                                    if (hqbVarJ instanceof jt7) {
                                        ((jt7) hqbVarJ).q1(ft7.F, ft7Var2);
                                    } else if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 && (hqbVarJ instanceof qw5)) {
                                        int i = 0;
                                        for (hqb hqbVar2 = ((qw5) hqbVarJ).T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
                                            if ((hqbVar2.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    hqbVarJ = hqbVar2;
                                                } else {
                                                    if (wwbVar == null) {
                                                        wwbVar = new wwb(0, new hqb[16]);
                                                    }
                                                    if (hqbVarJ != null) {
                                                        wwbVar.b(hqbVarJ);
                                                        hqbVarJ = null;
                                                    }
                                                    wwbVar.b(hqbVar2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    hqbVarJ = yfd.j(wwbVar);
                                }
                            }
                            hqbVar = hqbVar.I;
                        }
                    }
                    av9VarW = av9VarW.G();
                    hqbVar = (av9VarW == null || (g5cVar = av9VarW.k0) == null) ? null : (j4h) g5cVar.J;
                }
            }
        }
        return true;
    }

    public final boolean d(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = sf5.P(this.c, i).ordinal()) == 0) {
            c(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                mr9.b();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            e();
        }
        return z3;
    }

    public final void e() {
        AndroidComposeView androidComposeView = this.a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114 A[Catch: all -> 0x031f, TryCatch #0 {all -> 0x031f, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0029, B:12:0x002d, B:13:0x0035, B:26:0x0055, B:29:0x0060, B:31:0x0066, B:32:0x006b, B:34:0x0073, B:36:0x0078, B:38:0x007e, B:42:0x0084, B:140:0x01a0, B:142:0x01a6, B:143:0x01a9, B:145:0x01b4, B:148:0x01c2, B:152:0x01cc, B:155:0x01d2, B:156:0x01d7, B:159:0x01df, B:161:0x01e5, B:163:0x01e9, B:165:0x01f1, B:167:0x01f7, B:171:0x01ff, B:173:0x0208, B:174:0x020c, B:175:0x020f, B:178:0x0215, B:179:0x021a, B:180:0x021d, B:182:0x0223, B:184:0x0227, B:187:0x0230, B:189:0x0238, B:196:0x024f, B:198:0x0254, B:200:0x0258, B:223:0x029a, B:204:0x0264, B:206:0x026a, B:208:0x026e, B:210:0x0276, B:212:0x027c, B:216:0x0284, B:218:0x028d, B:219:0x0291, B:220:0x0294, B:224:0x029f, B:228:0x02af, B:230:0x02b4, B:232:0x02b8, B:255:0x02fa, B:236:0x02c4, B:238:0x02ca, B:240:0x02ce, B:242:0x02d6, B:244:0x02dc, B:248:0x02e4, B:250:0x02ed, B:251:0x02f1, B:252:0x02f4, B:257:0x0301, B:259:0x0308, B:46:0x008c, B:48:0x0092, B:49:0x0095, B:51:0x009d, B:54:0x00ab, B:58:0x00b5, B:89:0x010a, B:91:0x010e, B:61:0x00ba, B:63:0x00c0, B:65:0x00c4, B:67:0x00cc, B:69:0x00d2, B:73:0x00da, B:75:0x00e3, B:76:0x00e7, B:77:0x00ea, B:80:0x00f0, B:81:0x00f5, B:82:0x00f8, B:84:0x00fe, B:86:0x0102, B:92:0x0114, B:94:0x011a, B:95:0x011d, B:97:0x0127, B:100:0x0135, B:104:0x013f, B:135:0x0194, B:137:0x0198, B:107:0x0144, B:109:0x014a, B:111:0x014e, B:113:0x0156, B:115:0x015c, B:119:0x0164, B:121:0x016d, B:122:0x0171, B:123:0x0174, B:126:0x017a, B:127:0x017f, B:128:0x0182, B:130:0x0188, B:132:0x018c, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d), top: B:269:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [wwb] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [wwb] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [hqb] */
    /* JADX WARN: Type inference failed for: r12v25, types: [hqb] */
    /* JADX WARN: Type inference failed for: r12v29, types: [hqb] */
    /* JADX WARN: Type inference failed for: r12v30, types: [hqb] */
    /* JADX WARN: Type inference failed for: r12v34, types: [hqb] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [hqb] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [wwb] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.view.KeyEvent r13, defpackage.zy7 r14) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts7.f(android.view.KeyEvent, zy7):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0080, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean g(int r12, defpackage.l9e r13, defpackage.bz7 r14) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts7.g(int, l9e, bz7):java.lang.Boolean");
    }

    public final jt7 h() {
        jt7 jt7Var = this.h;
        if (jt7Var == null || !jt7Var.R) {
            return null;
        }
        return jt7Var;
    }

    public final boolean i(int i, boolean z) {
        jt7 jt7VarH = h();
        AndroidComposeView androidComposeView = this.a;
        if (jt7VarH == null || !jt7VarH.S || !androidComposeView.w(i)) {
            dae daeVar = new dae();
            daeVar.E = Boolean.FALSE;
            jt7 jt7VarH2 = h();
            Boolean boolG = g(i, androidComposeView.getEmbeddedViewFocusRect(), new rma(daeVar, i, 2));
            if (!x44.r(boolG, Boolean.TRUE) || jt7VarH2 == h()) {
                if (boolG != null && daeVar.E != null) {
                    if (!boolG.booleanValue() || !((Boolean) daeVar.E).booleanValue()) {
                        if (aok.f(i) && z && d(i, false, false)) {
                            Boolean boolG2 = g(i, null, new c00(i, 3));
                            if (boolG2 != null ? boolG2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean j(int i) {
        if (!d(i, false, false)) {
            return false;
        }
        Boolean boolG = g(i, null, new c00(i, 2));
        boolean zBooleanValue = boolG != null ? boolG.booleanValue() : false;
        if (!zBooleanValue) {
            e();
        }
        return zBooleanValue;
    }

    public final void k(jt7 jt7Var) {
        jt7 jt7Var2 = this.h;
        this.h = jt7Var;
        qvb qvbVar = this.g;
        Object[] objArr = qvbVar.a;
        int i = qvbVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((os7) objArr[i2]).a(jt7Var2, jt7Var);
        }
    }
}
