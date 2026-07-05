package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cqk {
    public static final ta4 a = new ta4(357627382, false, new ub4(21));
    public static final ta4 b = new ta4(1253858552, false, new ub4(22));
    public static final ta4 c = new ta4(1701974137, false, new ub4(23));

    /* JADX WARN: Removed duplicated region for block: B:102:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.anthropic.claude.api.mcp.McpServer r29, defpackage.zy7 r30, defpackage.bz7 r31, defpackage.pz7 r32, defpackage.bz7 r33, defpackage.iqb r34, defpackage.bz7 r35, defpackage.zy7 r36, defpackage.qnc r37, defpackage.ld4 r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqk.a(com.anthropic.claude.api.mcp.McpServer, zy7, bz7, pz7, bz7, iqb, bz7, zy7, qnc, ld4, int, int):void");
    }

    public static final void b(zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(174955569);
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = 1;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            r4g r4gVarS = gb9.S(null, null, null, zy7Var3, e18Var2, (i2 << 3) & 7168, 7);
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = mpk.P("pause");
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            e18Var = e18Var2;
            vkc.a(r4gVarS, d4c.j0(R.string.memory_turn_off_title, e18Var2), null, null, false, false, null, null, null, null, fd9.q0(1834858030, new kw(zy7Var, zy7Var2, r4gVarS, nwbVar, 8), e18Var2), null, fd9.q0(486724460, new rs2(i3, nwbVar), e18Var2), e18Var, 8, 3120, 6140);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(zy7Var, i, zy7Var2, zy7Var3, 16);
        }
    }

    public static final long c(int i, int i2, i5i i5iVar) {
        g5i g5iVar;
        if (i == -1) {
            return (((long) i2) << 32) | 4294967295L;
        }
        boolean z = i > i2;
        wz5 wz5Var = i5iVar.d;
        h79 h79VarA = (wz5Var == null || (g5iVar = (g5i) wz5Var.getValue()) == null) ? null : g5iVar.a();
        long jA = h79VarA != null ? h79VarA.a(i, false) : mwa.m(i, i);
        long jF = i5iVar.f(jA);
        int iOrdinal = ((kkh.d(jA) && kkh.d(jF)) ? y09.E : (kkh.d(jA) || kkh.d(jF)) ? (!kkh.d(jA) || kkh.d(jF)) ? y09.H : y09.F : y09.G).ordinal();
        d9j d9jVar = d9j.F;
        d9j d9jVar2 = d9j.E;
        if (iOrdinal == 0) {
            if (z) {
                d9jVar = d9jVar2;
            }
            return kvk.e(i, d9jVar);
        }
        if (iOrdinal == 1) {
            return z ? i == ((int) (jF >> 32)) ? kvk.e(i, d9jVar2) : kvk.e((int) (jF & 4294967295L), d9jVar) : i == ((int) (jF & 4294967295L)) ? kvk.e(i, d9jVar) : kvk.e((int) (jF >> 32), d9jVar2);
        }
        if (iOrdinal == 2) {
            return z ? kvk.e((int) (jF & 4294967295L), d9jVar2) : kvk.e((int) (jF >> 32), d9jVar);
        }
        if (iOrdinal == 3) {
            return (((long) i) << 32) | 4294967295L;
        }
        wg6.i();
        return 0L;
    }

    public static m88 d(Bundle bundle) throws GoogleIdTokenParsingException {
        bundle.getClass();
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            string.getClass();
            string2.getClass();
            return new m88(string, string2, string3, string4, string5, uri, string6);
        } catch (Exception e) {
            throw new GoogleIdTokenParsingException(e);
        }
    }

    public static final void e(qtb qtbVar, fb2 fb2Var, jy1 jy1Var, float f, uzf uzfVar, qeh qehVar, yd6 yd6Var) {
        fb2Var.g();
        ArrayList arrayList = qtbVar.h;
        if (arrayList.size() <= 1 || (jy1Var instanceof eeg)) {
            f(qtbVar, fb2Var, jy1Var, f, uzfVar, qehVar, yd6Var);
        } else {
            if (!(jy1Var instanceof rzf)) {
                wg6.i();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i = 0; i < size; i++) {
                drc drcVar = (drc) arrayList.get(i);
                fB += drcVar.a.b();
                fMax = Math.max(fMax, drcVar.a.d());
            }
            Shader shaderC = ((rzf) jy1Var).c((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderC.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                x30 x30Var = ((drc) arrayList.get(i2)).a;
                x30Var.g(fb2Var, new ky1(shaderC), f, uzfVar, qehVar, yd6Var);
                fb2Var.n(MTTypesetterKt.kLineSkipLimitMultiplier, x30Var.b());
                matrix.setTranslate(MTTypesetterKt.kLineSkipLimitMultiplier, -x30Var.b());
                shaderC.setLocalMatrix(matrix);
            }
        }
        fb2Var.p();
    }

    public static final void f(qtb qtbVar, fb2 fb2Var, jy1 jy1Var, float f, uzf uzfVar, qeh qehVar, yd6 yd6Var) {
        ArrayList arrayList = qtbVar.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            drc drcVar = (drc) arrayList.get(i);
            drcVar.a.g(fb2Var, jy1Var, f, uzfVar, qehVar, yd6Var);
            fb2Var.n(MTTypesetterKt.kLineSkipLimitMultiplier, drcVar.a.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean] */
    public static void g(j0a j0aVar, List list, bz7 bz7Var, pl3 pl3Var, fc4 fc4Var, ic4 ic4Var, String str, pz7 pz7Var, bz7 bz7Var2, boolean z, int i) {
        bz7 fc4Var2 = (i & 8) != 0 ? new fc4(9) : fc4Var;
        ic4 ic4Var2 = (i & 16) != 0 ? new ic4(16) : ic4Var;
        String str2 = (i & 32) != 0 ? null : str;
        bz7 bz7Var3 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : bz7Var2;
        byte b2 = 0;
        ?? r1 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? 0 : z;
        j0aVar.getClass();
        list.getClass();
        bz7Var.getClass();
        pl3Var.getClass();
        int size = list.size() + r1;
        qnc qncVar = qf2.a;
        int i2 = 2;
        rz7 mvVar = new mv(size, i2);
        bz7 fc4Var3 = new fc4(10);
        if ((2048 & 8) != 0) {
            fc4Var2 = new jua(11);
        }
        if ((2048 & 16) != 0) {
            ic4Var2 = new ic4(25);
        }
        ic4 ic4Var3 = ic4Var2;
        if ((2048 & 32) != 0) {
            str2 = null;
        }
        if ((2048 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            mvVar = new ic4(26);
        }
        if ((2048 & 512) != 0) {
            fc4Var3 = new jua(12);
        }
        if ((2048 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            qncVar = new qnc(8.0f, 8.0f, 12.0f, 8.0f);
        }
        if ((2048 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0) {
            bz7Var3 = null;
        }
        j0aVar.getClass();
        list.getClass();
        bz7Var.getClass();
        pl3Var.getClass();
        qncVar.getClass();
        ww9 ww9Var = new ww9(fc4Var2, i2, b2);
        int i3 = 23;
        ?? r4 = r1;
        j0aVar.W(list.size(), new z04(ww9Var, i3, list), new tq(list, i3), new ta4(2039820996, true, new t3b(list, str2, r4, ic4Var3, pz7Var, bz7Var, bz7Var3, mvVar, fc4Var3, pl3Var, qncVar)));
        if (r4 != 0) {
            j0a.V(j0aVar, "mcp-servers-loading", null, new ta4(575285010, true, new ik4(list, size, 0)), 2);
        }
    }

    public static String h(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String strQ = kgh.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strQ), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb = new StringBuilder(name2.length() + strQ.length() + 8 + 1);
                    sb.append("<");
                    sb.append(strQ);
                    sb.append(" threw ");
                    sb.append(name2);
                    sb.append(">");
                    string = sb.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i3, iIndexOf);
            sb2.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
