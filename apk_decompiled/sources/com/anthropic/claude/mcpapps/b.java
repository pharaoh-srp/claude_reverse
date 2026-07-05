package com.anthropic.claude.mcpapps;

import com.anthropic.claude.mcpapps.transport.JsonRpcRequest;
import com.anthropic.claude.mcpapps.transport.JsonRpcResponse;
import com.anthropic.claude.mcpapps.transport.McpErrorContent;
import com.anthropic.claude.mcpapps.transport.McpErrorResult;
import com.anthropic.claude.types.strings.McpServerId;
import defpackage.bg9;
import defpackage.bsg;
import defpackage.cpc;
import defpackage.exa;
import defpackage.fj0;
import defpackage.gb9;
import defpackage.h86;
import defpackage.ide;
import defpackage.iei;
import defpackage.ij0;
import defpackage.isg;
import defpackage.j6a;
import defpackage.jie;
import defpackage.jkf;
import defpackage.jxb;
import defpackage.kie;
import defpackage.ky0;
import defpackage.m45;
import defpackage.mk7;
import defpackage.mq5;
import defpackage.n30;
import defpackage.nai;
import defpackage.ny;
import defpackage.p8b;
import defpackage.pp0;
import defpackage.py;
import defpackage.sfa;
import defpackage.sie;
import defpackage.tie;
import defpackage.ul0;
import defpackage.vp4;
import defpackage.x44;
import defpackage.yfa;
import defpackage.ze0;
import defpackage.zfa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final p8b q;
    public final ul0 a;
    public final ze0 b;
    public final String c;
    public final String d;
    public final bg9 e;
    public final mk7 f;
    public final h86 g;
    public fj0 h;
    public final jxb i;
    public final jkf j;
    public final ConcurrentHashMap k;
    public final ConcurrentHashMap l;
    public final ConcurrentHashMap m;
    public final ConcurrentHashMap n;
    public final ConcurrentHashMap o;
    public final AtomicInteger p;

    static {
        ide ideVar = p8b.e;
        q = nai.D("application/json");
    }

    public b(ul0 ul0Var, ze0 ze0Var, String str, String str2, bg9 bg9Var, mk7 mk7Var, h86 h86Var) {
        str.getClass();
        str2.getClass();
        this.a = ul0Var;
        this.b = ze0Var;
        this.c = str;
        this.d = str2;
        this.e = bg9Var;
        this.f = mk7Var;
        this.g = h86Var;
        this.i = new jxb();
        this.j = new jkf(4);
        this.k = new ConcurrentHashMap();
        this.l = new ConcurrentHashMap();
        this.m = new ConcurrentHashMap();
        this.n = new ConcurrentHashMap();
        this.o = new ConcurrentHashMap();
        this.p = new AtomicInteger(0);
    }

    public static final kie a(b bVar, String str, String str2) {
        jie jieVar = new jie();
        jieVar.g(bVar.b.a() + "/v1/toolbox/shttp/mcp/" + str);
        tie.Companion.getClass();
        jieVar.e("POST", sie.b(str2, q));
        jieVar.d("Accept", "text/event-stream");
        jieVar.d("X-Organization-UUID", bVar.c);
        jieVar.d("X-Mcp-Client-Session-Id", bVar.d);
        jieVar.d("X-MCP-Client-Name", "ClaudeAndroid");
        String str3 = (String) bVar.k.get(McpServerId.m1029boximpl(str));
        if (str3 != null) {
            jieVar.d("Mcp-Session-Id", str3);
        }
        return new kie(jieVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.anthropic.claude.mcpapps.b r21, java.lang.String r22, defpackage.vp4 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mcpapps.b.b(com.anthropic.claude.mcpapps.b, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.anthropic.claude.mcpapps.b r23, java.lang.String r24, java.lang.String r25, defpackage.vp4 r26) {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mcpapps.b.c(com.anthropic.claude.mcpapps.b, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public static final JsonRpcResponse d(b bVar, String str, JsonPrimitive jsonPrimitive) {
        bVar.getClass();
        str.getClass();
        Iterator it = new pp0(4, str).iterator();
        int i = 0;
        while (true) {
            j6a j6aVar = (j6a) it;
            if (!j6aVar.hasNext()) {
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String str2 = "Scanned " + i + " SSE data lines, no match for requestId=" + jsonPrimitive;
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfa.DEBUG, "McpAppApi", str2);
                        }
                    }
                }
                return null;
            }
            String str3 = (String) j6aVar.next();
            if (isg.q0(str3, "data: ", false)) {
                i++;
                String strR0 = bsg.R0(str3, "data: ");
                try {
                    JsonRpcResponse jsonRpcResponse = (JsonRpcResponse) bVar.e.b(strR0, JsonRpcResponse.Companion.serializer());
                    if (x44.r(jsonRpcResponse.getId(), jsonPrimitive)) {
                        return jsonRpcResponse;
                    }
                } catch (Exception e) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : copyOnWriteArrayList2) {
                            ((n30) ((zfa) obj2)).getClass();
                            arrayList2.add(obj2);
                        }
                        if (!arrayList2.isEmpty()) {
                            zfa.a.getClass();
                            String strK = ij0.k("Failed to parse SSE data line as JSON: ", strR0, ", error: ", e.getMessage());
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                ((n30) ((zfa) it3.next())).b(sfa.WARN, "McpAppApi", strK);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonElement e(String str) {
        KSerializer kSerializerSerializer = McpErrorResult.Companion.serializer();
        return this.e.c(new McpErrorResult(x44.W(new McpErrorContent((String) null, str, 1, (mq5) (0 == true ? 1 : 0))), false, 2, (mq5) (0 == true ? 1 : 0)), kSerializerSerializer);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0035, B:42:0x00e5, B:44:0x00e9, B:47:0x00f1, B:50:0x0100, B:51:0x010b, B:53:0x0111, B:54:0x0121, B:56:0x0127, B:57:0x0141, B:59:0x0147, B:60:0x0153, B:61:0x016b, B:63:0x0171, B:65:0x0181, B:67:0x0187, B:70:0x018f, B:72:0x0198, B:75:0x01a4, B:76:0x01af, B:78:0x01b5, B:79:0x01c5, B:81:0x01cb, B:82:0x01ed, B:84:0x01f3, B:86:0x0200, B:89:0x020d, B:90:0x0218, B:92:0x021e, B:93:0x022e, B:95:0x0234, B:96:0x024e, B:98:0x0254, B:20:0x0047, B:38:0x00ba, B:35:0x00ad), top: B:114:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0035, B:42:0x00e5, B:44:0x00e9, B:47:0x00f1, B:50:0x0100, B:51:0x010b, B:53:0x0111, B:54:0x0121, B:56:0x0127, B:57:0x0141, B:59:0x0147, B:60:0x0153, B:61:0x016b, B:63:0x0171, B:65:0x0181, B:67:0x0187, B:70:0x018f, B:72:0x0198, B:75:0x01a4, B:76:0x01af, B:78:0x01b5, B:79:0x01c5, B:81:0x01cb, B:82:0x01ed, B:84:0x01f3, B:86:0x0200, B:89:0x020d, B:90:0x0218, B:92:0x021e, B:93:0x022e, B:95:0x0234, B:96:0x024e, B:98:0x0254, B:20:0x0047, B:38:0x00ba, B:35:0x00ad), top: B:114:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0035, B:42:0x00e5, B:44:0x00e9, B:47:0x00f1, B:50:0x0100, B:51:0x010b, B:53:0x0111, B:54:0x0121, B:56:0x0127, B:57:0x0141, B:59:0x0147, B:60:0x0153, B:61:0x016b, B:63:0x0171, B:65:0x0181, B:67:0x0187, B:70:0x018f, B:72:0x0198, B:75:0x01a4, B:76:0x01af, B:78:0x01b5, B:79:0x01c5, B:81:0x01cb, B:82:0x01ed, B:84:0x01f3, B:86:0x0200, B:89:0x020d, B:90:0x0218, B:92:0x021e, B:93:0x022e, B:95:0x0234, B:96:0x024e, B:98:0x0254, B:20:0x0047, B:38:0x00ba, B:35:0x00ad), top: B:114:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r21, java.lang.String r22, defpackage.vp4 r23) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mcpapps.b.f(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public final Object g(String str, vp4 vp4Var) throws McpAppApi$LeaderCancelledException {
        Object objM = m(this.n, McpServerId.m1029boximpl(str), true, new ny(this, str, null, 12), vp4Var);
        return objM == m45.E ? objM : iei.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f4, code lost:
    
        if (r3 == r12) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r22, java.lang.String r23, defpackage.vp4 r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mcpapps.b.h(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable i(java.lang.String r9, defpackage.vp4 r10) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mcpapps.b.i(java.lang.String, vp4):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0213, code lost:
    
        if (r14.invoke(r2, r6) == r9) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0383, code lost:
    
        if (r16.invoke(r2, r6) == r9) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018a, code lost:
    
        if (r4.invoke(r2, r6) == r9) goto L164;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r16v0, types: [pz7] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.anthropic.claude.mcpapps.b] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r18, com.anthropic.claude.mcpapps.transport.JsonRpcRequest r19, defpackage.cm r20, defpackage.vp4 r21) {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mcpapps.b.j(java.lang.String, com.anthropic.claude.mcpapps.transport.JsonRpcRequest, cm, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r5, defpackage.vp4 r6) throws com.anthropic.claude.mcpapps.McpAppApi$LeaderCancelledException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bxa
            if (r0 == 0) goto L13
            r0 = r6
            bxa r0 = (defpackage.bxa) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            bxa r0 = new bxa
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.lang.String r5 = r0.E
            defpackage.sf5.h0(r6)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r6)
            r0.E = r5
            r0.H = r2
            java.lang.Object r6 = r4.g(r5, r0)
            m45 r0 = defpackage.m45.E
            if (r6 != r0) goto L3e
            return r0
        L3e:
            java.util.concurrent.ConcurrentHashMap r4 = r4.m
            com.anthropic.claude.types.strings.McpServerId r5 = com.anthropic.claude.types.strings.McpServerId.m1029boximpl(r5)
            java.lang.Object r4 = r4.get(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mcpapps.b.k(java.lang.String, vp4):java.lang.Object");
    }

    public final Object l(String str, String str2, ky0 ky0Var) {
        return m(this.o, new cpc(McpServerId.m1029boximpl(str), str2), true, new py(this, str, str2, null, 5), ky0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #4 {all -> 0x003e, blocks: (B:16:0x0039, B:54:0x011b, B:56:0x0126), top: B:75:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.util.concurrent.ConcurrentHashMap r11, java.lang.Object r12, boolean r13, defpackage.bz7 r14, defpackage.vp4 r15) throws com.anthropic.claude.mcpapps.McpAppApi$LeaderCancelledException {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mcpapps.b.m(java.util.concurrent.ConcurrentHashMap, java.lang.Object, boolean, bz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r2 == r8) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r17, com.anthropic.claude.mcpapps.transport.JsonRpcRequest r18, defpackage.vp4 r19) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mcpapps.b.n(java.lang.String, com.anthropic.claude.mcpapps.transport.JsonRpcRequest, vp4):java.lang.Object");
    }

    public final Object o(String str, JsonRpcRequest jsonRpcRequest, vp4 vp4Var) {
        return gb9.c0(this.g.b(), new exa(jsonRpcRequest, this, str, null), vp4Var);
    }
}
