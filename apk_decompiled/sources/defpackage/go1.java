package defpackage;

import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class go1 {
    public final bg9 a;
    public final nib b;
    public final nz2 c;
    public final myh d;
    public final h86 e;
    public final tn1 f;
    public final kdg g = new kdg();
    public final mdg h = new mdg();
    public final lsc i = mpk.P(null);
    public final lsc j;
    public final lsc k;
    public final lsc l;
    public rib m;
    public poj n;
    public final LinkedHashMap o;
    public final LinkedHashMap p;
    public final LinkedHashMap q;
    public boolean r;

    public go1(bg9 bg9Var, nib nibVar, nz2 nz2Var, myh myhVar, h86 h86Var, tn1 tn1Var) {
        this.a = bg9Var;
        this.b = nibVar;
        this.c = nz2Var;
        this.d = myhVar;
        this.e = h86Var;
        this.f = tn1Var;
        Boolean bool = Boolean.FALSE;
        this.j = mpk.P(bool);
        this.k = mpk.P(bool);
        this.l = mpk.P(null);
        this.n = new poj(7);
        this.o = new LinkedHashMap();
        this.p = new LinkedHashMap();
        this.q = new LinkedHashMap();
    }

    public static final void a(go1 go1Var, LinkedHashMap linkedHashMap, ParsedContentBlockId parsedContentBlockId, c1j c1jVar) {
        Integer num = (Integer) linkedHashMap.get(parsedContentBlockId);
        kdg kdgVar = go1Var.g;
        if (num != null) {
            kdgVar.set(num.intValue(), c1jVar);
        } else {
            kdgVar.add(c1jVar);
            linkedHashMap.put(parsedContentBlockId, Integer.valueOf(kdgVar.size() - 1));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:8))(0)|7|9|106|(1:(1:(9:13|14|15|69|70|111|71|102|103)(2:20|21))(3:22|23|24))(4:25|(6:28|104|29|(1:31)(1:35)|36|(4:40|(1:42)|43|(12:48|(1:50)(1:51)|52|(1:54)|55|56|109|57|58|113|59|(2:61|67)(1:62))))|102|103)|63|64|107|65|(7:68|69|70|111|71|102|103)|67|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01eb, code lost:
    
        r1 = io.sentry.t4.g();
        r1.getClass();
        r1.D(r0, new io.sentry.n0());
        r3.C(new defpackage.hm1(r14), r12, com.anthropic.claude.analytics.events.VoiceEvents$VoiceErrorKind.UNSPECIFIED, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0205, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x020c, code lost:
    
        r7 = (com.anthropic.claude.api.errors.ClaudeApiError$RateLimitApiError) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0210, code lost:
    
        r7 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0213  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [im2, java.lang.String, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.anthropic.claude.api.errors.ClaudeApiError$RateLimitApiError] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.anthropic.claude.bell.api.BellApiServerMessage.MessageSse r26, defpackage.vp4 r27) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.b(com.anthropic.claude.bell.api.BellApiServerMessage$MessageSse, vp4):java.lang.Object");
    }

    public final void c() {
        this.m = null;
        this.o.clear();
        this.p.clear();
        this.q.clear();
        this.r = false;
    }
}
