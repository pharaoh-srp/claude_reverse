package defpackage;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yok {
    public static final ta4 a = new ta4(967827454, false, new sb4(24));

    public static final void a(boolean z, zy7 zy7Var, mnc mncVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1375799808);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(mncVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarI = gb9.I(fqbVar, mncVar);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            dtj.a(gid.p(16.0f, R.string.mcp_prompt_template_add_prompt, e18Var, e18Var, fqbVar), b.c(fqbVar, 1.0f), z, null, null, null, 0L, zy7Var, e18Var, ((i2 << 6) & 896) | 48 | ((i2 << 18) & 29360128), 120);
            grc.z(fqbVar, 16.0f, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds0(z, zy7Var, mncVar, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.hw2 r18, defpackage.f03 r19, defpackage.t4g r20, java.lang.String r21, com.anthropic.claude.api.mcp.McpPrompt r22, defpackage.mnc r23, defpackage.ld4 r24, int r25) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yok.b(hw2, f03, t4g, java.lang.String, com.anthropic.claude.api.mcp.McpPrompt, mnc, ld4, int):void");
    }

    public static final void d(cp4 cp4Var, hp4 hp4Var, pz7 pz7Var, sih sihVar, ieh iehVar, boolean z) {
        if (z) {
            cp4.b(cp4Var, new u74(0, iehVar), null, new x04(hp4Var, pz7Var, sihVar, iehVar, 2), 14);
        }
    }

    public static Object e(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        sz6.p(grc.p(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r3.add(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ioe f(defpackage.qh9 r13) {
        /*
            java.lang.String r0 = "Unable to parse json into type Connectivity"
            r1 = 0
            java.lang.String r2 = "status"
            bh9 r2 = r13.s(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.lang.String r2 = r2.m()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r2.getClass()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r3 = 3
            int[] r3 = defpackage.sq6.H(r3)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            int r4 = r3.length     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r5 = 0
            r6 = r5
        L18:
            java.lang.String r7 = "Array contains no element matching the predicate."
            if (r6 >= r4) goto Laa
            r8 = r3[r6]     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.lang.String r9 = defpackage.grc.k(r8)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            boolean r9 = r9.equals(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r9 == 0) goto La6
            java.lang.String r2 = "interfaces"
            bh9 r2 = r13.s(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r2 == 0) goto L7b
            ig9 r2 = r2.e()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.util.ArrayList r2 = r2.E     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            int r4 = r2.size()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r3.<init>(r4)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
        L43:
            boolean r4 = r2.hasNext()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            bh9 r4 = (defpackage.bh9) r4     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.lang.String r4 = r4.m()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r4.getClass()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            voe[] r6 = defpackage.voe.values()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            int r9 = r6.length     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r10 = r5
        L5c:
            if (r10 >= r9) goto L75
            r11 = r6[r10]     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.lang.String r12 = r11.E     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            boolean r12 = r12.equals(r4)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r12 == 0) goto L72
            r3.add(r11)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            goto L43
        L6c:
            r13 = move-exception
            goto Lb0
        L6e:
            r13 = move-exception
            goto Lb4
        L70:
            r13 = move-exception
            goto Lb8
        L72:
            int r10 = r10 + 1
            goto L5c
        L75:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r13.<init>(r7)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            throw r13     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
        L7b:
            r3 = r1
        L7c:
            java.lang.String r2 = "effective_type"
            bh9 r2 = r13.s(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r2 == 0) goto L8e
            java.lang.String r2 = r2.m()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r2 == 0) goto L8e
            int r5 = defpackage.qpk.c(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
        L8e:
            java.lang.String r2 = "cellular"
            bh9 r13 = r13.s(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r13 == 0) goto L9f
            qh9 r13 = r13.g()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            eoe r13 = defpackage.mok.g(r13)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            goto La0
        L9f:
            r13 = r1
        La0:
            ioe r2 = new ioe     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r2.<init>(r8, r3, r5, r13)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            return r2
        La6:
            int r6 = r6 + 1
            goto L18
        Laa:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r13.<init>(r7)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            throw r13     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
        Lb0:
            defpackage.pmf.j(r0, r13)
            return r1
        Lb4:
            defpackage.pmf.j(r0, r13)
            return r1
        Lb8:
            defpackage.pmf.j(r0, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yok.f(qh9):ioe");
    }

    public static int g(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static WindowInsets h(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, hx7 hx7Var, WindowInsets windowInsets) {
        onApplyWindowInsetsListener.getClass();
        WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(hx7Var, windowInsets);
        windowInsetsOnApplyWindowInsets.getClass();
        return windowInsetsOnApplyWindowInsets;
    }

    public static int i(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int i4 = bsk.i(obj);
        int i5 = i4 & i;
        int iJ = j(i5, obj3);
        if (iJ != 0) {
            int i6 = ~i;
            int i7 = i4 & i6;
            int i8 = -1;
            while (true) {
                i2 = iJ - 1;
                i3 = iArr[i2];
                if ((i3 & i6) == i7 && cvk.l(obj, objArr[i2]) && (objArr2 == null || cvk.l(obj2, objArr2[i2]))) {
                    break;
                }
                int i9 = i3 & i;
                if (i9 == 0) {
                    break;
                }
                i8 = i2;
                iJ = i9;
            }
            int i10 = i3 & i;
            if (i8 == -1) {
                k(i5, obj3, i10);
                return i2;
            }
            iArr[i8] = g(iArr[i8], i10, i);
            return i2;
        }
        return -1;
    }

    public static int j(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void k(int i, Object obj, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public abstract int c(c3d c3dVar);
}
