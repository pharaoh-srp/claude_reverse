package defpackage;

import android.content.Context;
import com.anthropic.claude.analytics.events.ProUpsellEvents$PlayBillingCallFailed;
import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewPurchaseError;
import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewPurchaseErrorKind;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m98 implements rvg {
    public final Context a;
    public final q7 b;
    public final koi c;
    public final pxd d;
    public final tl0 e;
    public final rc8 f;
    public final qi3 g;
    public final p98 h;
    public final b98 i;
    public final h86 j;
    public zo1 k;
    public final zy1 l = x44.a();
    public final cd m = new cd(5, this);
    public final amg n = bmg.a(Boolean.FALSE);
    public final efe o = new efe(16, this);

    public m98(Context context, q7 q7Var, koi koiVar, pxd pxdVar, tl0 tl0Var, rc8 rc8Var, qi3 qi3Var, p98 p98Var, b98 b98Var, h86 h86Var) {
        this.a = context;
        this.b = q7Var;
        this.c = koiVar;
        this.d = pxdVar;
        this.e = tl0Var;
        this.f = rc8Var;
        this.g = qi3Var;
        this.h = p98Var;
        this.i = b98Var;
        this.j = h86Var;
    }

    public static pwg d(Integer num) {
        if (num != null && num.intValue() == -1) {
            return new lwg(ovg.F);
        }
        if (num != null && num.intValue() == 2) {
            return new lwg(ovg.G);
        }
        if (num != null && num.intValue() == 3) {
            return new lwg(ovg.H);
        }
        if (num != null && num.intValue() == 12) {
            return new lwg(ovg.I);
        }
        if ((num != null && num.intValue() == -2) || (num != null && num.intValue() == 4)) {
            return new lwg(ovg.O);
        }
        if (num != null && num.intValue() == 5) {
            return new lwg(ovg.P);
        }
        if ((num != null && num.intValue() == 0) || ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 7))) {
            return nwg.a;
        }
        ovg ovgVar = ovg.N;
        return ((num != null && num.intValue() == 8) || (num != null && num.intValue() == 6) || num == null) ? new lwg(ovgVar) : new lwg(ovgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:19:0x0038, B:71:0x00d9, B:73:0x00dd, B:74:0x00df, B:81:0x00e9, B:82:0x00ea, B:20:0x003d, B:51:0x00a4, B:53:0x00a8, B:54:0x00aa, B:61:0x00b4, B:62:0x00b5, B:23:0x0044, B:25:0x0048, B:26:0x0064, B:28:0x0068, B:29:0x006a, B:32:0x006e, B:86:0x00f2, B:88:0x00f8, B:66:0x00bd, B:68:0x00c3, B:46:0x0087, B:48:0x008d, B:40:0x007b, B:42:0x0081, B:36:0x0076, B:55:0x00ab, B:56:0x00ad, B:30:0x006b, B:31:0x006d, B:75:0x00e0, B:76:0x00e2), top: B:95:0x0023, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:19:0x0038, B:71:0x00d9, B:73:0x00dd, B:74:0x00df, B:81:0x00e9, B:82:0x00ea, B:20:0x003d, B:51:0x00a4, B:53:0x00a8, B:54:0x00aa, B:61:0x00b4, B:62:0x00b5, B:23:0x0044, B:25:0x0048, B:26:0x0064, B:28:0x0068, B:29:0x006a, B:32:0x006e, B:86:0x00f2, B:88:0x00f8, B:66:0x00bd, B:68:0x00c3, B:46:0x0087, B:48:0x008d, B:40:0x007b, B:42:0x0081, B:36:0x0076, B:55:0x00ab, B:56:0x00ad, B:30:0x006b, B:31:0x006d, B:75:0x00e0, B:76:0x00e2), top: B:95:0x0023, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r10) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m98.a(vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        if (r1 == r10) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0515 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vp4 r20) {
        /*
            Method dump skipped, instruction units count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m98.b(vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0426, code lost:
    
        if (r0.h(r11, r1) == r15) goto L170;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027c A[Catch: Exception -> 0x01bf, TRY_ENTER, TryCatch #1 {Exception -> 0x01bf, blocks: (B:104:0x027c, B:106:0x0289, B:108:0x028f, B:110:0x0296, B:123:0x02fd, B:113:0x02a2, B:114:0x02ad, B:116:0x02b3, B:117:0x02c3, B:119:0x02c9, B:120:0x02e7, B:122:0x02ed, B:125:0x030f, B:127:0x0313, B:129:0x031c, B:132:0x0347, B:76:0x01ac, B:84:0x01cd, B:85:0x01d8, B:87:0x01de), top: B:193:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0377 A[Catch: Exception -> 0x037f, TryCatch #2 {Exception -> 0x037f, blocks: (B:136:0x036f, B:138:0x0377, B:155:0x03b5, B:157:0x03b9, B:159:0x03c2, B:162:0x03e2, B:164:0x03f0, B:141:0x0382), top: B:194:0x036f }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0382 A[Catch: Exception -> 0x037f, TRY_LEAVE, TryCatch #2 {Exception -> 0x037f, blocks: (B:136:0x036f, B:138:0x0377, B:155:0x03b5, B:157:0x03b9, B:159:0x03c2, B:162:0x03e2, B:164:0x03f0, B:141:0x0382), top: B:194:0x036f }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ac A[Catch: Exception -> 0x042c, TryCatch #3 {Exception -> 0x042c, blocks: (B:149:0x03a8, B:151:0x03ac, B:153:0x03b0, B:160:0x03de, B:166:0x03fe), top: B:196:0x03a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0197 A[Catch: Exception -> 0x0459, TryCatch #5 {Exception -> 0x0459, blocks: (B:69:0x0187, B:89:0x01f0, B:93:0x0227, B:96:0x0235, B:72:0x0197, B:73:0x01a4, B:82:0x01c7), top: B:200:0x0187 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0235 A[Catch: Exception -> 0x0459, TRY_LEAVE, TryCatch #5 {Exception -> 0x0459, blocks: (B:69:0x0187, B:89:0x01f0, B:93:0x0227, B:96:0x0235, B:72:0x0197, B:73:0x01a4, B:82:0x01c7), top: B:200:0x0187 }] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v8, types: [ovg] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14, types: [dae] */
    /* JADX WARN: Type inference failed for: r2v15, types: [dae] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v4, types: [qi3] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:185:0x0448 -> B:200:0x0187). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.android.billingclient.api.Purchase r36, boolean r37, defpackage.hwg r38, int r39, defpackage.vp4 r40) {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m98.c(com.android.billingclient.api.Purchase, boolean, hwg, int, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.vp4 r6) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m98.e(vp4):java.lang.Object");
    }

    public final void f(Integer num, String str) {
        ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKindI = oyk.i(num);
        ozf ozfVarC = oyk.c(num);
        sfa sfaVar = ozfVarC == ozf.G ? sfa.ERROR : sfa.WARN;
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                if (sfaVar.E >= 2) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String strName = proUpsellEvents$StoreViewPurchaseErrorKindI != null ? proUpsellEvents$StoreViewPurchaseErrorKindI.name() : null;
                StringBuilder sb = new StringBuilder("GooglePlaySubscriptionManager: ");
                sb.append(str);
                sb.append(" failed with BillingResponseCode ");
                sb.append(num);
                sb.append(" (");
                String strM = ij0.m(sb, strName, ")");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "GooglePlaySubscriptionManager", strM);
                }
            }
        }
        if (proUpsellEvents$StoreViewPurchaseErrorKindI != null) {
            this.g.e(new ProUpsellEvents$PlayBillingCallFailed(str, num, proUpsellEvents$StoreViewPurchaseErrorKindI), ProUpsellEvents$PlayBillingCallFailed.Companion.serializer());
        }
        if (ozfVarC != null) {
            SilentException.a(new SilentException("GooglePlaySubscriptionManager: " + str + " failed with BillingResponseCode " + num), ozfVarC, false, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0288, code lost:
    
        if (r1 == r10) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01dc, code lost:
    
        if (r1 == r10) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01dc -> B:77:0x01e0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.hwg r18, android.content.Context r19, defpackage.vp4 r20) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m98.g(hwg, android.content.Context, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r7, defpackage.vp4 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.k98
            if (r0 == 0) goto L13
            r0 = r8
            k98 r0 = (defpackage.k98) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            k98 r0 = new k98
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.G
            int r1 = r0.I
            tl0 r6 = r6.e
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            of0 r6 = r0.F
            defpackage.sf5.h0(r8)
            goto L64
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L35:
            java.lang.String r7 = r0.E
            defpackage.sf5.h0(r8)
            goto L49
        L3b:
            defpackage.sf5.h0(r8)
            r0.E = r7
            r0.I = r3
            java.lang.Object r8 = r6.i(r7, r0)
            if (r8 != r5) goto L49
            goto L62
        L49:
            com.anthropic.claude.api.result.ApiResult r8 = (com.anthropic.claude.api.result.ApiResult) r8
            boolean r1 = r8 instanceof defpackage.of0
            if (r1 == 0) goto L66
            r1 = r8
            of0 r1 = (defpackage.of0) r1
            java.lang.Object r3 = r1.b
            com.anthropic.claude.api.account.AppStartResponse r3 = (com.anthropic.claude.api.account.AppStartResponse) r3
            r0.E = r4
            r0.F = r1
            r0.I = r2
            java.lang.Object r6 = r6.g(r7, r3, r0)
            if (r6 != r5) goto L63
        L62:
            return r5
        L63:
            r6 = r8
        L64:
            r8 = r6
            goto L6a
        L66:
            boolean r6 = r8 instanceof defpackage.nf0
            if (r6 == 0) goto L71
        L6a:
            boolean r6 = r8 instanceof defpackage.of0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L71:
            defpackage.mr9.b()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m98.h(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0108, code lost:
    
        if (r1 == r10) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a9 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:14:0x0032, B:61:0x010b, B:63:0x0111, B:65:0x0115, B:67:0x0119, B:69:0x011d, B:72:0x0122, B:74:0x0126, B:56:0x00ee, B:58:0x00f4, B:90:0x017f, B:92:0x0189, B:77:0x0134, B:78:0x013f, B:80:0x0145, B:81:0x0155, B:83:0x015b, B:84:0x0166, B:86:0x016c, B:87:0x0178, B:88:0x017d, B:20:0x0043, B:48:0x00d1, B:51:0x00d7, B:53:0x00dd, B:55:0x00e1, B:97:0x0195, B:99:0x019b, B:101:0x01a4, B:103:0x01a9, B:105:0x01af, B:106:0x01b6, B:43:0x00b9, B:45:0x00c8), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:14:0x0032, B:61:0x010b, B:63:0x0111, B:65:0x0115, B:67:0x0119, B:69:0x011d, B:72:0x0122, B:74:0x0126, B:56:0x00ee, B:58:0x00f4, B:90:0x017f, B:92:0x0189, B:77:0x0134, B:78:0x013f, B:80:0x0145, B:81:0x0155, B:83:0x015b, B:84:0x0166, B:86:0x016c, B:87:0x0178, B:88:0x017d, B:20:0x0043, B:48:0x00d1, B:51:0x00d7, B:53:0x00dd, B:55:0x00e1, B:97:0x0195, B:99:0x019b, B:101:0x01a4, B:103:0x01a9, B:105:0x01af, B:106:0x01b6, B:43:0x00b9, B:45:0x00c8), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:14:0x0032, B:61:0x010b, B:63:0x0111, B:65:0x0115, B:67:0x0119, B:69:0x011d, B:72:0x0122, B:74:0x0126, B:56:0x00ee, B:58:0x00f4, B:90:0x017f, B:92:0x0189, B:77:0x0134, B:78:0x013f, B:80:0x0145, B:81:0x0155, B:83:0x015b, B:84:0x0166, B:86:0x016c, B:87:0x0178, B:88:0x017d, B:20:0x0043, B:48:0x00d1, B:51:0x00d7, B:53:0x00dd, B:55:0x00e1, B:97:0x0195, B:99:0x019b, B:101:0x01a4, B:103:0x01a9, B:105:0x01af, B:106:0x01b6, B:43:0x00b9, B:45:0x00c8), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017f A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:14:0x0032, B:61:0x010b, B:63:0x0111, B:65:0x0115, B:67:0x0119, B:69:0x011d, B:72:0x0122, B:74:0x0126, B:56:0x00ee, B:58:0x00f4, B:90:0x017f, B:92:0x0189, B:77:0x0134, B:78:0x013f, B:80:0x0145, B:81:0x0155, B:83:0x015b, B:84:0x0166, B:86:0x016c, B:87:0x0178, B:88:0x017d, B:20:0x0043, B:48:0x00d1, B:51:0x00d7, B:53:0x00dd, B:55:0x00e1, B:97:0x0195, B:99:0x019b, B:101:0x01a4, B:103:0x01a9, B:105:0x01af, B:106:0x01b6, B:43:0x00b9, B:45:0x00c8), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0195 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:14:0x0032, B:61:0x010b, B:63:0x0111, B:65:0x0115, B:67:0x0119, B:69:0x011d, B:72:0x0122, B:74:0x0126, B:56:0x00ee, B:58:0x00f4, B:90:0x017f, B:92:0x0189, B:77:0x0134, B:78:0x013f, B:80:0x0145, B:81:0x0155, B:83:0x015b, B:84:0x0166, B:86:0x016c, B:87:0x0178, B:88:0x017d, B:20:0x0043, B:48:0x00d1, B:51:0x00d7, B:53:0x00dd, B:55:0x00e1, B:97:0x0195, B:99:0x019b, B:101:0x01a4, B:103:0x01a9, B:105:0x01af, B:106:0x01b6, B:43:0x00b9, B:45:0x00c8), top: B:123:0x0026 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0108 -> B:61:0x010b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m98.i(vp4):java.lang.Object");
    }

    public final void j(hwg hwgVar, Integer num) {
        ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKindI = oyk.i(num);
        if (proUpsellEvents$StoreViewPurchaseErrorKindI == null) {
            return;
        }
        this.g.e(new ProUpsellEvents$StoreViewPurchaseError((String) null, (String) null, proUpsellEvents$StoreViewPurchaseErrorKindI, hwgVar.a().b(), hwgVar.c(), 3, (mq5) null), ProUpsellEvents$StoreViewPurchaseError.Companion.serializer());
    }
}
