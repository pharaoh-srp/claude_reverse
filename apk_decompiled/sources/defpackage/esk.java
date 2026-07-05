package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import com.anthropic.claude.models.organization.configtypes.ConsentConfigAndroid;
import com.anthropic.claude.models.organization.configtypes.HealthConsentConfig;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import com.pvporbit.freetype.FreeTypeConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class esk {
    public static final ta4 a = new ta4(-1332941258, false, new vb4(15));

    public static final void a(kl8 kl8Var, zy7 zy7Var, eyh eyhVar, ld4 ld4Var, int i) {
        zy7 zy7Var2;
        e18 e18Var;
        Object znVar;
        String str;
        kl8 kl8Var2;
        ConsentConfigAndroid consent_config_android;
        _ServerLocalizedString text;
        kl8Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1338666989);
        int i2 = i | (e18Var2.h(kl8Var) ? 4 : 2) | (e18Var2.d(eyhVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        boolean z = true;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            HealthConsentConfig healthConsentConfig = (HealthConsentConfig) kl8Var.d.f("mobile_ha_config", iv1.J(jce.b(HealthConsentConfig.class))).getValue();
            tp4 tp4Var = null;
            String localizedText = (healthConsentConfig == null || (consent_config_android = healthConsentConfig.getConsent_config_android()) == null || (text = consent_config_android.getText()) == null) ? null : text.getLocalizedText();
            boolean zF = e18Var2.f(localizedText);
            if ((i2 & 14) != 4 && !e18Var2.h(kl8Var)) {
                z = false;
            }
            boolean z2 = zF | z;
            Object objN = e18Var2.N();
            if (z2 || objN == jd4.a) {
                String str2 = localizedText;
                zy7Var2 = zy7Var;
                znVar = new zn(str2, kl8Var, zy7Var2, tp4Var, 16);
                str = str2;
                kl8Var2 = kl8Var;
                e18Var2.k0(znVar);
            } else {
                znVar = objN;
                kl8Var2 = kl8Var;
                str = localizedText;
                zy7Var2 = zy7Var;
            }
            fd9.i(e18Var2, (pz7) znVar, str);
            if (str == null) {
                e18Var2.a0(-1456528704);
                e18Var2.p(false);
                e18Var = e18Var2;
            } else {
                e18Var2.a0(-1456528703);
                trk.b(zy7Var, fd9.q0(-465695368, new ok8(kl8Var2, eyhVar, zy7Var2), e18Var2), null, fd9.q0(-865201798, new wh(28, zy7Var2), e18Var2), gmk.b, fd9.q0(683022205, new yi7(str, 9), e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var2, 1772598, 0, 16276);
                zy7Var2 = zy7Var;
                e18Var = e18Var2;
                e18Var.p(false);
            }
        } else {
            zy7Var2 = zy7Var;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ok8(kl8Var, zy7Var2, eyhVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.mc r26, defpackage.v72 r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, defpackage.vp4 r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esk.b(mc, v72, java.lang.String, java.lang.String, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.mc r17, defpackage.v72 r18, java.lang.String r19, java.lang.String r20, defpackage.vp4 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esk.c(mc, v72, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r9v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(android.content.Context r18, defpackage.mc r19, boolean r20, defpackage.vp4 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esk.d(android.content.Context, mc, boolean, vp4):java.lang.Object");
    }

    public static boolean e(d49 d49Var, InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return d49Var.commitContent(inputContentInfo, i, bundle);
    }

    public static final us4 f(Context context, mc mcVar, v72 v72Var, c61 c61Var) {
        tp4 tp4Var = null;
        return new us4(new t74(context, mcVar, tp4Var, 8), new vs4(mcVar, v72Var, tp4Var, 0), new ws4(mcVar, v72Var, null), c61Var);
    }

    public static long g() {
        return akb.i;
    }

    public static nre h() {
        return nre.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.anthropic.claude.core.telemetry.RedactedThrowable i(java.lang.Throwable r4, int r5) {
        /*
            java.lang.Throwable r0 = r4.getCause()
            r1 = 0
            if (r0 == 0) goto L16
            int r5 = r5 + 1
            r2 = 8
            if (r5 >= r2) goto Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L16
            com.anthropic.claude.core.telemetry.RedactedThrowable r5 = i(r0, r5)
            goto L17
        L16:
            r5 = r1
        L17:
            java.lang.Class r0 = r4.getClass()
            kce r2 = defpackage.jce.a
            pl9 r0 = r2.b(r0)
            java.lang.String r0 = r0.f()
            if (r0 != 0) goto L29
            java.lang.String r0 = "Throwable"
        L29:
            java.lang.String r2 = r4.getMessage()
            if (r2 == 0) goto L33
            java.lang.String r1 = defpackage.aph.d(r2)
        L33:
            if (r1 != 0) goto L37
            java.lang.String r1 = ""
        L37:
            com.anthropic.claude.core.telemetry.RedactedThrowable r2 = new com.anthropic.claude.core.telemetry.RedactedThrowable
            java.lang.String r3 = ": "
            java.lang.String r0 = defpackage.ij0.C(r0, r3, r1)
            r2.<init>(r0, r5)
            java.lang.StackTraceElement[] r4 = r4.getStackTrace()
            r2.setStackTrace(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esk.i(java.lang.Throwable, int):com.anthropic.claude.core.telemetry.RedactedThrowable");
    }

    public static final byte[] j(int i) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(44).order(ByteOrder.LITTLE_ENDIAN);
        Charset charset = dj2.a;
        byte[] bytes = "RIFF".getBytes(charset);
        bytes.getClass();
        byteBufferOrder.put(bytes);
        byteBufferOrder.putInt(i + 36);
        byte[] bytes2 = "WAVE".getBytes(charset);
        bytes2.getClass();
        byteBufferOrder.put(bytes2);
        byte[] bytes3 = "fmt ".getBytes(charset);
        bytes3.getClass();
        byteBufferOrder.put(bytes3);
        byteBufferOrder.putInt(16);
        byteBufferOrder.putShort((short) 1);
        byteBufferOrder.putShort((short) 1);
        byteBufferOrder.putInt(16000);
        byteBufferOrder.putInt(32000);
        byteBufferOrder.putShort((short) 2);
        byteBufferOrder.putShort((short) 16);
        byte[] bytes4 = "data".getBytes(charset);
        bytes4.getClass();
        byteBufferOrder.put(bytes4);
        byteBufferOrder.putInt(i);
        byte[] bArrArray = byteBufferOrder.array();
        bArrArray.getClass();
        return bArrArray;
    }

    public static final Throwable k(Throwable th) {
        cpc cpcVarC;
        th.getClass();
        Throwable cause = th;
        for (int i = 0; cause != null && i < 8; i++) {
            String message = cause.getMessage();
            int iIntValue = -1;
            if (message != null && (cpcVarC = aph.c(message)) != null) {
                iIntValue = ((Number) cpcVarC.E).intValue() + ((String) cpcVarC.F).length();
            }
            if (iIntValue >= 0) {
                return i(th, 0);
            }
            cause = cause.getCause();
        }
        return th;
    }

    public static String l(String str, Object... objArr) {
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
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbX = sq6.x("<", str2, " threw ");
                    sbX.append(e.getClass().getName());
                    sbX.append(">");
                    string = sbX.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
