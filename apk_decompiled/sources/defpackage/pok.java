package defpackage;

import android.graphics.ColorSpace;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pok {
    public static final ta4 a = new ta4(689074212, false, new tb4(3));

    public static final void a(zza zzaVar, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        zzaVar.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1707920019);
        int i2 = (e18Var.f(zzaVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            String strN = zzaVar.b;
            if (strN == null) {
                strN = vb7.n(e18Var, -633625690, R.string.mcp_auth_required_unknown_server, e18Var, false);
            } else {
                e18Var.a0(-633626310);
                e18Var.p(false);
            }
            mvk.b(null, iqbVar, fd9.q0(262773926, new xg4(strN, zzaVar, zy7Var, 23), e18Var), e18Var, ((i2 >> 3) & 112) | 390);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(zzaVar, i, zy7Var, iqbVar, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r46, final defpackage.bz7 r47, final defpackage.iqb r48, boolean r49, boolean r50, defpackage.tkh r51, defpackage.pz7 r52, defpackage.pz7 r53, defpackage.pz7 r54, defpackage.pz7 r55, defpackage.pzi r56, defpackage.mp9 r57, defpackage.kp9 r58, boolean r59, int r60, int r61, defpackage.e0g r62, defpackage.ffh r63, defpackage.ld4 r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pok.b(java.lang.String, bz7, iqb, boolean, boolean, tkh, pz7, pz7, pz7, pz7, pzi, mp9, kp9, boolean, int, int, e0g, ffh, ld4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.pz7 r38, final defpackage.pz7 r39, defpackage.rz7 r40, final defpackage.pz7 r41, final defpackage.pz7 r42, final defpackage.pz7 r43, final defpackage.pz7 r44, final boolean r45, final defpackage.wgh r46, final defpackage.ogh r47, final defpackage.ogh r48, final defpackage.ogh r49, final defpackage.ta4 r50, defpackage.pz7 r51, defpackage.mnc r52, defpackage.ld4 r53, final int r54, final int r55) {
        /*
            Method dump skipped, instruction units count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pok.c(pz7, pz7, rz7, pz7, pz7, pz7, pz7, boolean, wgh, ogh, ogh, ogh, ta4, pz7, mnc, ld4, int, int):void");
    }

    public static final boolean d(d0h d0hVar) {
        List list = d0hVar.J.Y.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((z7d) list.get(i)).d) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (d(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.d0h r6, defpackage.u7d r7, defpackage.vd1 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.vv7
            if (r0 == 0) goto L13
            r0 = r8
            vv7 r0 = (defpackage.vv7) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            vv7 r0 = new vv7
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.G
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            u7d r6 = r0.F
            d0h r7 = r0.E
            defpackage.sf5.h0(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4b
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            r6 = 0
            return r6
        L33:
            defpackage.sf5.h0(r8)
            boolean r8 = d(r6)
            if (r8 != 0) goto L67
        L3c:
            r0.E = r6
            r0.F = r7
            r0.H = r2
            java.lang.Object r8 = r6.a(r7, r0)
            m45 r1 = defpackage.m45.E
            if (r8 != r1) goto L4b
            return r1
        L4b:
            t7d r8 = (defpackage.t7d) r8
            java.util.List r8 = r8.a
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
        L57:
            if (r3 >= r1) goto L67
            java.lang.Object r4 = r8.get(r3)
            z7d r4 = (defpackage.z7d) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L64
            goto L3c
        L64:
            int r3 = r3 + 1
            goto L57
        L67:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pok.e(d0h, u7d, vd1):java.lang.Object");
    }

    public static final Object f(e8d e8dVar, pz7 pz7Var, tp4 tp4Var) {
        Object objP1 = ((e0h) e8dVar).p1(new f(tp4Var.getContext(), pz7Var, null, 3), tp4Var);
        return objP1 == m45.E ? objP1 : iei.a;
    }

    public static vr g(String str, nr nrVar, String str2, bz7 bz7Var) {
        return new vr(new ur(bz7Var), str, nrVar, str2);
    }

    public static foe h(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("test_execution_id").m();
            strM.getClass();
            return new foe(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type CiTest", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type CiTest", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type CiTest", e3);
            return null;
        }
    }

    public static final ColorSpace i(r54 r54Var) {
        if (x44.r(r54Var, t54.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (x44.r(r54Var, t54.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static String j(int i) {
        if (i == 0) {
            return "THROTTLE_BACKGROUND";
        }
        if (i == 1) {
            return "THROTTLE_ALWAYS";
        }
        if (i == 2) {
            return "THROTTLE_NEVER";
        }
        mr9.y();
        return null;
    }
}
