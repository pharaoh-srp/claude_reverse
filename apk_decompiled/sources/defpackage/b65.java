package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$SessionCreationFailed;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b65 {
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e8, code lost:
    
        if (r6 < 500) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04b6, code lost:
    
        if (r1 == r13) goto L167;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b3 A[Catch: Exception -> 0x02c6, CancellationException -> 0x05ee, TryCatch #11 {CancellationException -> 0x05ee, blocks: (B:14:0x0040, B:168:0x04b9, B:170:0x04bf, B:172:0x04cb, B:176:0x0503, B:175:0x04e5, B:178:0x0509, B:180:0x050d, B:182:0x051a, B:183:0x0525, B:186:0x0534, B:188:0x055f, B:192:0x0568, B:194:0x056c, B:196:0x0570, B:198:0x0591, B:202:0x059a, B:204:0x059e, B:205:0x05a3, B:21:0x0066, B:125:0x0318, B:126:0x0339, B:128:0x033f, B:130:0x0349, B:134:0x0358, B:136:0x0364, B:138:0x036e, B:145:0x03a1, B:148:0x03ca, B:149:0x03dd, B:151:0x03e3, B:153:0x0409, B:158:0x043a, B:160:0x0457, B:165:0x049a, B:161:0x0473, B:163:0x0477, B:206:0x05a4, B:207:0x05a9, B:26:0x0093, B:98:0x02a9, B:100:0x02b3, B:102:0x02c1, B:121:0x02f1, B:108:0x02ce, B:110:0x02d2, B:112:0x02de, B:119:0x02ed, B:210:0x05b2, B:211:0x05b7, B:47:0x00e5, B:49:0x00e9, B:50:0x00fa, B:52:0x0100, B:54:0x010a, B:58:0x011e, B:60:0x012a, B:61:0x0153, B:62:0x0169, B:65:0x01a7, B:67:0x01ab, B:73:0x01b6, B:75:0x01eb, B:77:0x020f, B:79:0x0232, B:81:0x0236, B:82:0x0256, B:83:0x025b, B:85:0x025e, B:87:0x0266, B:90:0x0272, B:92:0x027a, B:94:0x0282, B:218:0x05c6), top: B:249:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ce A[Catch: Exception -> 0x02c6, CancellationException -> 0x05ee, TryCatch #11 {CancellationException -> 0x05ee, blocks: (B:14:0x0040, B:168:0x04b9, B:170:0x04bf, B:172:0x04cb, B:176:0x0503, B:175:0x04e5, B:178:0x0509, B:180:0x050d, B:182:0x051a, B:183:0x0525, B:186:0x0534, B:188:0x055f, B:192:0x0568, B:194:0x056c, B:196:0x0570, B:198:0x0591, B:202:0x059a, B:204:0x059e, B:205:0x05a3, B:21:0x0066, B:125:0x0318, B:126:0x0339, B:128:0x033f, B:130:0x0349, B:134:0x0358, B:136:0x0364, B:138:0x036e, B:145:0x03a1, B:148:0x03ca, B:149:0x03dd, B:151:0x03e3, B:153:0x0409, B:158:0x043a, B:160:0x0457, B:165:0x049a, B:161:0x0473, B:163:0x0477, B:206:0x05a4, B:207:0x05a9, B:26:0x0093, B:98:0x02a9, B:100:0x02b3, B:102:0x02c1, B:121:0x02f1, B:108:0x02ce, B:110:0x02d2, B:112:0x02de, B:119:0x02ed, B:210:0x05b2, B:211:0x05b7, B:47:0x00e5, B:49:0x00e9, B:50:0x00fa, B:52:0x0100, B:54:0x010a, B:58:0x011e, B:60:0x012a, B:61:0x0153, B:62:0x0169, B:65:0x01a7, B:67:0x01ab, B:73:0x01b6, B:75:0x01eb, B:77:0x020f, B:79:0x0232, B:81:0x0236, B:82:0x0256, B:83:0x025b, B:85:0x025e, B:87:0x0266, B:90:0x0272, B:92:0x027a, B:94:0x0282, B:218:0x05c6), top: B:249:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0364 A[Catch: Exception -> 0x0398, CancellationException -> 0x05ee, TRY_LEAVE, TryCatch #4 {Exception -> 0x0398, blocks: (B:128:0x033f, B:134:0x0358, B:136:0x0364), top: B:236:0x033f }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e3 A[Catch: Exception -> 0x0436, CancellationException -> 0x05ee, TRY_LEAVE, TryCatch #6 {Exception -> 0x0436, blocks: (B:148:0x03ca, B:149:0x03dd, B:151:0x03e3), top: B:240:0x03ca }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0457 A[Catch: Exception -> 0x042f, CancellationException -> 0x05ee, TryCatch #1 {Exception -> 0x042f, blocks: (B:153:0x0409, B:158:0x043a, B:160:0x0457, B:161:0x0473, B:163:0x0477, B:206:0x05a4, B:207:0x05a9), top: B:232:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0473 A[Catch: Exception -> 0x042f, CancellationException -> 0x05ee, TryCatch #1 {Exception -> 0x042f, blocks: (B:153:0x0409, B:158:0x043a, B:160:0x0457, B:161:0x0473, B:163:0x0477, B:206:0x05a4, B:207:0x05a9), top: B:232:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x033f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.k85 r38, defpackage.jwf r39, defpackage.xhe r40, defpackage.qi3 r41, java.lang.String r42, defpackage.mn5 r43, defpackage.vp4 r44) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b65.a(k85, jwf, xhe, qi3, java.lang.String, mn5, vp4):java.lang.Object");
    }

    public static final String b(String str) {
        String strJ1 = bsg.j1(50, bsg.k1(str).toString());
        return strJ1.length() > 0 ? strJ1.length() < bsg.k1(str).toString().length() ? strJ1.concat("...") : strJ1 : "New Session";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable c(java.lang.String r5, defpackage.jwf r6, defpackage.qi3 r7, java.lang.String r8, defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b65.c(java.lang.String, jwf, qi3, java.lang.String, vp4):java.io.Serializable");
    }

    public static final void d(qi3 qi3Var, String str, String str2, long j) {
        qi3Var.e(new CodeEvents$SessionCreationFailed(str, str2, Long.valueOf(j)), CodeEvents$SessionCreationFailed.Companion.serializer());
    }
}
