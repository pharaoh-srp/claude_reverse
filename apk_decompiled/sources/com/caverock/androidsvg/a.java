package com.caverock.androidsvg;

import defpackage.bi0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends bi0 {
    public a(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int T(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public final String U() {
        int iT;
        if (q()) {
            return null;
        }
        char cCharAt = ((String) this.d).charAt(this.b);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.b++;
        int iIntValue = B().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = B().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = B().intValue();
                    } else {
                        int iT2 = T(iIntValue);
                        if (iT2 != -1) {
                            for (int i = 1; i <= 5 && (iT = T((iIntValue = B().intValue()))) != -1; i++) {
                                iT2 = (iT2 * 16) + iT;
                            }
                            sb.append((char) iT2);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = B().intValue();
        }
        return sb.toString();
    }

    public final String V() {
        int i;
        String str = (String) this.d;
        boolean zQ = q();
        int i2 = this.b;
        if (!zQ) {
            int iCharAt = str.charAt(i2);
            if (iCharAt == 45) {
                iCharAt = h();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i2;
            } else {
                int iH = h();
                while (true) {
                    if ((iH < 65 || iH > 90) && ((iH < 97 || iH > 122) && !((iH >= 48 && iH <= 57) || iH == 45 || iH == 95))) {
                        break;
                    }
                    iH = h();
                }
                i = this.b;
            }
            this.b = i2;
            i2 = i;
        }
        int i3 = this.b;
        if (i2 == i3) {
            return null;
        }
        String strSubstring = str.substring(i3, i2);
        this.b = i2;
        return strSubstring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0468 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r11v10, types: [w42] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [w42] */
    /* JADX WARN: Type inference failed for: r11v13, types: [w42] */
    /* JADX WARN: Type inference failed for: r11v14, types: [w42] */
    /* JADX WARN: Type inference failed for: r11v15, types: [w42] */
    /* JADX WARN: Type inference failed for: r11v16, types: [w42] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [w42] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v18, types: [l42] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList W() throws com.caverock.androidsvg.CSSParseException {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.a.W():java.util.ArrayList");
    }
}
