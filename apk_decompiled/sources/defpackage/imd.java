package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class imd {
    public final cve a;
    public final nyj b = new nyj(new u52(4, this), 26, new v52(3, this));

    public imd(cve cveVar) {
        this.a = cveVar;
    }

    public static String a(kmd kmdVar) {
        switch (kmdVar.ordinal()) {
            case 0:
                return "IS_CREATOR";
            case 1:
                return "IS_SHARED_WITH_ORG";
            case 2:
                return "IS_SHARED_WITH_ME";
            case 3:
                return "STARRED";
            case 4:
                return "ALL";
            case 5:
                return "SEARCH";
            case 6:
                return "ARCHIVED";
            default:
                mr9.b();
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static kmd b(String str) {
        switch (str.hashCode()) {
            case -1853007448:
                if (str.equals("SEARCH")) {
                    return kmd.J;
                }
                break;
            case -1716505264:
                if (str.equals("IS_SHARED_WITH_ORG")) {
                    return kmd.F;
                }
                break;
            case -1345654281:
                if (str.equals("IS_CREATOR")) {
                    return kmd.E;
                }
                break;
            case -1302297204:
                if (str.equals("IS_SHARED_WITH_ME")) {
                    return kmd.G;
                }
                break;
            case -1179204385:
                if (str.equals("STARRED")) {
                    return kmd.H;
                }
                break;
            case -933681182:
                if (str.equals("ARCHIVED")) {
                    return kmd.K;
                }
                break;
            case 64897:
                if (str.equals("ALL")) {
                    return kmd.I;
                }
                break;
        }
        sz6.p("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(defpackage.imd r6, defpackage.kmd r7, java.util.ArrayList r8, defpackage.vp4 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.gmd
            if (r0 == 0) goto L13
            r0 = r9
            gmd r0 = (defpackage.gmd) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            gmd r0 = new gmd
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.G
            int r1 = r0.I
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.sf5.h0(r9)
            return r9
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L31:
            java.util.ArrayList r8 = r0.F
            imd r6 = r0.E
            defpackage.sf5.h0(r9)
            goto L56
        L39:
            defpackage.sf5.h0(r9)
            r0.E = r6
            r0.F = r8
            r0.I = r3
            cve r9 = r6.a
            hmd r1 = new hmd
            r1.<init>(r6, r7, r3)
            r7 = 0
            java.lang.Object r7 = defpackage.u00.G(r0, r9, r7, r3, r1)
            if (r7 != r5) goto L51
            goto L53
        L51:
            iei r7 = defpackage.iei.a
        L53:
            if (r7 != r5) goto L56
            goto L62
        L56:
            r0.E = r4
            r0.F = r4
            r0.I = r2
            java.lang.Object r6 = r6.d(r8, r0)
            if (r6 != r5) goto L63
        L62:
            return r5
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imd.c(imd, kmd, java.util.ArrayList, vp4):java.lang.Object");
    }

    public final Object d(List list, vp4 vp4Var) throws Throwable {
        Object objG = u00.G(vp4Var, this.a, false, true, new vk3(this, 25, list));
        return objG == m45.E ? objG : iei.a;
    }
}
