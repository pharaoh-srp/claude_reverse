package defpackage;

import android.os.Build;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.z;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.conway.protocol.ModelInfo;
import com.anthropic.claude.types.strings.ModelId;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class psk {
    public static final ta4 a = new ta4(-109388990, false, new vb4(26));
    public static final ta4 b = new ta4(531706032, false, new vb4(27));
    public static final ta4 c = new ta4(-191645596, false, new vb4(28));
    public static final ta4 d = new ta4(-2023051929, false, new vb4(29));
    public static final ta4 e = new ta4(2056852069, false, new xb4(0));
    public static final ta4 f = new ta4(225445736, false, new xb4(1));

    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str, boolean z) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(479877226);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(b.g(j8.e0(b.c(fqbVar, 1.0f), z, false, new vue(3), zy7Var, 10), 48.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
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
            if (z) {
                e18Var.a0(1734187877);
                iv1.b(ud0.L, null, null, null, gm3.a(e18Var).M, e18Var, 48, 12);
                e18Var.p(false);
            } else {
                e18Var.a0(1734425120);
                kxk.g(e18Var, b.o(fqbVar, 24.0f));
                e18Var.p(false);
            }
            tjh.b(str, gb9.N(new hw9(1.0f, true), 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 0, 0, 131064);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sw4(str, z, zy7Var, iqbVar2, i);
        }
    }

    public static final void b(ModelInfo modelInfo, bz7 bz7Var, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(58425167);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(modelInfo) : e18Var2.h(modelInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var = e18Var2;
            iuj.f(zy7Var, null, iuj.G(true, null, e18Var2, 6, 2), MTTypesetterKt.kLineSkipLimitMultiplier, false, null, gm3.a(e18Var2).o, 0L, 0L, null, null, null, fd9.q0(1166664493, new xg4((Object) modelInfo, bz7Var, (Object) zy7Var, i3), e18Var2), e18Var, (i2 >> 6) & 14, 3072, 8122);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(modelInfo, i, bz7Var, zy7Var, 19);
        }
    }

    public static final void c(ModelInfo modelInfo, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1605964951);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? e18Var.f(modelInfo) : e18Var.h(modelInfo) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(bz7Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarF = tvk.f(fqbVar);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarF);
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
            tjh.b(d4c.j0(R.string.conway_system_model_sheet_title, e18Var), gb9.K(fqbVar, 16.0f, 8.0f), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).b, e18Var, 48, 0, 131064);
            e18Var = e18Var;
            e18Var.a0(1596802813);
            Iterator<T> it = modelInfo.getAvailable().iterator();
            while (it.hasNext()) {
                String strM1064unboximpl = ((ModelId) it.next()).m1064unboximpl();
                String strM746getCurrenta6HIKFk = modelInfo.m746getCurrenta6HIKFk();
                boolean zM1061equalsimpl0 = strM746getCurrenta6HIKFk == null ? false : ModelId.m1061equalsimpl0(strM1064unboximpl, strM746getCurrenta6HIKFk);
                boolean zF = e18Var.f(strM1064unboximpl) | ((i4 & 112) == 32);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new qn(bz7Var, strM1064unboximpl, i3);
                    e18Var.k0(objN);
                }
                a(0, e18Var, (zy7) objN, null, strM1064unboximpl, zM1061equalsimpl0);
            }
            e18Var.p(false);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(i, 20, iqbVar2, modelInfo, bz7Var);
        }
    }

    public static final void d(fz4 fz4Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        fz4Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-566678675);
        int i2 = i | (e18Var.f(fz4Var) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | 384;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            ud0 ud0Var = ud0.s;
            String strJ0 = d4c.j0(R.string.conway_system_model_title, e18Var);
            String strJ02 = d4c.j0(R.string.conway_system_model_desc, e18Var);
            ta4 ta4VarQ0 = fd9.q0(259933173, new ii(fz4Var, 27, zy7Var), e18Var);
            fqb fqbVar = fqb.E;
            zsk.c(ud0Var, strJ0, strJ02, fqbVar, null, MTTypesetterKt.kLineSkipLimitMultiplier, ta4VarQ0, e18Var, 1575936, 48);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f44(fz4Var, i, zy7Var, iqbVar2, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(java.lang.String r20, defpackage.dlb r21, boolean r22, java.lang.String r23, defpackage.lvh r24, boolean r25, java.lang.String r26, boolean r27, defpackage.iqb r28, defpackage.myh r29, defpackage.ld4 r30, int r31) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psk.e(java.lang.String, dlb, boolean, java.lang.String, lvh, boolean, java.lang.String, boolean, iqb, myh, ld4, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x017d -> B:129:0x018e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.f6i r22, android.widget.RemoteViews r23, defpackage.q68 r24, defpackage.c59 r25) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psk.f(f6i, android.widget.RemoteViews, q68, c59):void");
    }

    public static final void g(RemoteViews remoteViews, km8 km8Var, int i) {
        w46 w46Var = km8Var.a;
        int i2 = Build.VERSION.SDK_INT;
        o46 o46Var = o46.a;
        u46 u46Var = u46.a;
        if (i2 >= 31) {
            if (i2 >= 33 || !x44.X(u46Var, o46Var).contains(w46Var)) {
                in0.b(remoteViews, i, w46Var);
                return;
            }
            return;
        }
        List listX = x44.X(u46Var, p46.a, o46Var);
        Map map = cw9.a;
        if (listX.contains(w46Var)) {
            return;
        }
        e0.d(w46Var, " requires a complex layout before API 31", "Using a height of ");
    }

    public static final void h(RemoteViews remoteViews, gaj gajVar, int i) {
        w46 w46Var = gajVar.a;
        int i2 = Build.VERSION.SDK_INT;
        o46 o46Var = o46.a;
        u46 u46Var = u46.a;
        if (i2 >= 31) {
            if (i2 >= 33 || !x44.X(u46Var, o46Var).contains(w46Var)) {
                in0.c(remoteViews, i, w46Var);
                return;
            }
            return;
        }
        List listX = x44.X(u46Var, p46.a, o46Var);
        Map map = cw9.a;
        if (listX.contains(w46Var)) {
            return;
        }
        e0.d(w46Var, " requires a complex layout before API 31", "Using a width of ");
    }

    public static byte[] i(String str) {
        if (str.length() % 2 != 0) {
            sz6.p("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                sz6.p("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static String j(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i = b2 & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static final boolean k(w46 w46Var) {
        if (w46Var instanceof n46) {
            return true;
        }
        if (!x44.r(w46Var, o46.a) && !x44.r(w46Var, p46.a) && !x44.r(w46Var, u46.a) && w46Var != null) {
            wg6.i();
        }
        return false;
    }

    public static final z l(bqh bqhVar) {
        bqhVar.getClass();
        zph zphVarS = z.s();
        Instant instant = bqhVar.a;
        if (instant != null) {
            long epochMilli = instant.toEpochMilli();
            zphVarS.b();
            z.p((z) zphVarS.F, epochMilli);
        }
        LocalDateTime localDateTime = bqhVar.b;
        if (localDateTime != null) {
            String string = localDateTime.toString();
            zphVarS.b();
            z.q((z) zphVarS.F, string);
        }
        String string2 = bqhVar.c.toString();
        zphVarS.b();
        z.r((z) zphVarS.F, string2);
        return (z) zphVarS.a();
    }

    public static String m(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(n(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(n(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String n(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strQ = kgh.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strQ), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb = new StringBuilder(strQ.length() + 8 + name2.length() + 1);
            kgh.u(sb, "<", strQ, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
