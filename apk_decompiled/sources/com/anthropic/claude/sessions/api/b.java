package com.anthropic.claude.sessions.api;

import com.anthropic.claude.sessions.types.PermissionUpdate;
import com.anthropic.claude.sessions.types.SdkAssistantMessage;
import com.anthropic.claude.sessions.types.SdkControlRequestEvent;
import com.anthropic.claude.sessions.types.SdkEvent;
import com.anthropic.claude.sessions.types.SdkMessage;
import com.anthropic.claude.sessions.types.SdkMessageContent;
import com.anthropic.claude.sessions.types.SdkMessageEvent;
import com.anthropic.claude.sessions.types.SdkNonAssistantMessage;
import com.anthropic.claude.sessions.types.SdkResultEvent;
import com.anthropic.claude.sessions.types.SdkSystemEvent;
import com.anthropic.claude.sessions.types.SdkTextContent;
import com.anthropic.claude.sessions.types.SdkTextMessageContent;
import com.anthropic.claude.sessions.types.SdkToolUseContent;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.b54;
import defpackage.bg9;
import defpackage.bsg;
import defpackage.dae;
import defpackage.h86;
import defpackage.hdc;
import defpackage.ide;
import defpackage.ij0;
import defpackage.ix1;
import defpackage.jde;
import defpackage.jwf;
import defpackage.kj;
import defpackage.lj;
import defpackage.mj;
import defpackage.mr9;
import defpackage.n30;
import defpackage.nj;
import defpackage.nm6;
import defpackage.oj;
import defpackage.qo;
import defpackage.sfa;
import defpackage.vp4;
import defpackage.w44;
import defpackage.wd6;
import defpackage.x44;
import defpackage.xm;
import defpackage.yfa;
import defpackage.zfa;
import defpackage.zy1;
import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final ide j = new ide("\\.(png|jpe?g|gif|webp|bmp|svg)$", jde.IGNORE_CASE);
    public final jwf a;
    public final hdc b;
    public final String c;
    public final String d;
    public final bg9 e;
    public final h86 f;
    public final ConcurrentHashMap g;
    public final zy1 h;
    public final zy1 i;

    public b(jwf jwfVar, hdc hdcVar, String str, String str2, bg9 bg9Var, h86 h86Var) {
        str2.getClass();
        this.a = jwfVar;
        this.b = hdcVar;
        this.c = str;
        this.d = str2;
        this.e = bg9Var;
        this.f = h86Var;
        this.g = new ConcurrentHashMap();
        this.h = wd6.P(-1, 6, null);
        this.i = wd6.P(-1, 6, null);
    }

    public static final kj a(b bVar, SdkEvent sdkEvent, kj kjVar) {
        boolean z = sdkEvent instanceof SdkResultEvent;
        kj kjVar2 = kj.E;
        if (z) {
            return kjVar2;
        }
        boolean z2 = sdkEvent instanceof SdkSystemEvent;
        kj kjVar3 = kj.G;
        kj kjVar4 = kj.F;
        if (z2) {
            SdkSystemEvent sdkSystemEvent = (SdkSystemEvent) sdkEvent;
            if (x44.r(sdkSystemEvent.getSubtype(), "status")) {
                return x44.r(sdkSystemEvent.getStatus(), "compacting") ? kjVar3 : kjVar4;
            }
            return null;
        }
        if (!(sdkEvent instanceof SdkMessageEvent)) {
            return null;
        }
        SdkMessageEvent sdkMessageEvent = (SdkMessageEvent) sdkEvent;
        Boolean isMeta = sdkMessageEvent.getIsMeta();
        Boolean bool = Boolean.TRUE;
        if (x44.r(isMeta, bool) || x44.r(sdkMessageEvent.getIsSynthetic(), bool) || x44.r(sdkMessageEvent.getIsReplay(), bool) || sdkMessageEvent.getParent_tool_use_id() != null) {
            return null;
        }
        SdkMessage message = sdkMessageEvent.getMessage();
        if (message instanceof SdkNonAssistantMessage) {
            return kjVar4;
        }
        if (!(message instanceof SdkAssistantMessage)) {
            return null;
        }
        List<SdkMessageContent> content = ((SdkAssistantMessage) message).getContent();
        ArrayList<SdkToolUseContent> arrayList = new ArrayList();
        for (Object obj : content) {
            if (obj instanceof SdkToolUseContent) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                for (SdkToolUseContent sdkToolUseContent : arrayList) {
                    if (x44.r(sdkToolUseContent.getName(), "SendUserMessage") || x44.r(sdkToolUseContent.getName(), "SendUserFile")) {
                    }
                }
            }
            if (kjVar == kjVar3) {
                return null;
            }
            return kjVar2;
        }
        return kjVar4;
    }

    public static final qo i(b bVar, SdkControlRequestEvent sdkControlRequestEvent) {
        String message;
        String mcp_server_name;
        String tool_name;
        ControlRequestContent controlRequestContentG = ix1.g(sdkControlRequestEvent);
        if (controlRequestContentG == null) {
            return null;
        }
        String subtype = controlRequestContentG.getSubtype();
        if (!x44.r(subtype, "can_use_tool")) {
            if (!x44.r(subtype, "elicitation") || !ix1.f(controlRequestContentG) || (message = controlRequestContentG.getMessage()) == null || (mcp_server_name = controlRequestContentG.getMcp_server_name()) == null) {
                return null;
            }
            return new qo(sdkControlRequestEvent.getRequest_id(), sdkControlRequestEvent.getRequest_id(), mcp_server_name, message, null, null, nm6.E, ix1.d(controlRequestContentG), 48);
        }
        String tool_use_id = controlRequestContentG.getTool_use_id();
        if (tool_use_id == null || (tool_name = controlRequestContentG.getTool_name()) == null) {
            return null;
        }
        List<PermissionUpdate> permission_suggestions = controlRequestContentG.getPermission_suggestions();
        List<PermissionUpdate> list = permission_suggestions;
        if (list != null && !list.isEmpty()) {
            bVar.g.put(tool_use_id, permission_suggestions);
        }
        return new qo(sdkControlRequestEvent.getRequest_id(), tool_use_id, tool_name, controlRequestContentG.getDisplay_name(), controlRequestContentG.getTitle(), controlRequestContentG.getDescription(), controlRequestContentG.getInput(), !(list == null || list.isEmpty()), FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
    }

    public static String j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SdkMessageContent sdkMessageContent = (SdkMessageContent) it.next();
            String text = sdkMessageContent instanceof SdkTextContent ? ((SdkTextContent) sdkMessageContent).getText() : sdkMessageContent instanceof SdkTextMessageContent ? ((SdkTextMessageContent) sdkMessageContent).getText() : null;
            if (text != null) {
                arrayList.add(text);
            }
        }
        return bsg.k1(w44.S0(arrayList, "\n", null, null, null, 62)).toString();
    }

    public static /* synthetic */ Object m(b bVar, String str, String str2, Set set, Set set2, String str3, boolean z, String str4, vp4 vp4Var, int i) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        return bVar.l(str, str2, set, set2, str3, z, str4, vp4Var);
    }

    public static final boolean n(List list, b bVar, Set set) throws IOException {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            List listK = bVar.k((SdkEvent) it.next(), new LinkedHashSet(), set != null ? new LinkedHashSet() : null);
            if (!(listK instanceof Collection) || !listK.isEmpty()) {
                Iterator it2 = listK.iterator();
                while (it2.hasNext()) {
                    if (((oj) it2.next()) instanceof lj) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void o(List list, dae daeVar, dae daeVar2, b bVar, Set set, Set set2, List list2, List list3, List list4, List list5) {
        b54.t0(list, list5);
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            SdkEvent sdkEvent = (SdkEvent) it.next();
            if (daeVar.E != null && c.a(sdkEvent)) {
                daeVar2.E = daeVar.E;
                daeVar.E = null;
            }
            for (oj ojVar : bVar.k(sdkEvent, set, set2)) {
                if (ojVar instanceof lj) {
                    lj ljVar = (lj) ojVar;
                    list2.add(ljVar.a());
                    if (ljVar.a().d() == xm.E) {
                        daeVar.E = ljVar.a().c();
                    }
                } else if (ojVar instanceof mj) {
                    list3.add(ojVar);
                } else {
                    if (!(ojVar instanceof nj)) {
                        mr9.b();
                        return;
                    }
                    list4.add(ojVar);
                }
            }
        }
    }

    public static Instant p(String str) {
        if (str == null || bsg.I0(str)) {
            return null;
        }
        try {
            return Instant.parse(str);
        } catch (DateTimeParseException e) {
            zfa.a.getClass();
            if (!yfa.b()) {
                return null;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            zfa.a.getClass();
            String strK = ij0.k("parseInstant: bad ISO-8601 '", str, "': ", e.getMessage());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.WARN, "AgentChat", strK);
            }
            return null;
        }
    }

    public static final String q(String str, Map map) {
        String content;
        Object obj = map.get(str);
        JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
        if (jsonPrimitive != null) {
            if (!jsonPrimitive.isString()) {
                jsonPrimitive = null;
            }
            if (jsonPrimitive != null && (content = jsonPrimitive.getContent()) != null) {
                return bsg.k1(content).toString();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06c3 A[PHI: r14
      0x06c3: PHI (r14v3 java.lang.String) = (r14v2 java.lang.String), (r14v6 java.lang.String), (r14v12 java.lang.String) binds: [B:223:0x0699, B:225:0x06a1, B:234:0x06c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0295 A[LOOP:6: B:90:0x028f->B:92:0x0295, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v61, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v62 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k(com.anthropic.claude.sessions.types.SdkEvent r31, java.util.Set r32, java.util.Set r33) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.api.b.k(com.anthropic.claude.sessions.types.SdkEvent, java.util.Set, java.util.Set):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:155:0x070e -> B:16:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0477 -> B:87:0x0481). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r44, java.lang.String r45, java.util.Set r46, java.util.Set r47, java.lang.String r48, boolean r49, java.lang.String r50, defpackage.vp4 r51) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2167
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.api.b.l(java.lang.String, java.lang.String, java.util.Set, java.util.Set, java.lang.String, boolean, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.String r12, java.lang.String r13, defpackage.vp4 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.zj
            if (r0 == 0) goto L14
            r0 = r14
            zj r0 = (defpackage.zj) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.G = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            zj r0 = new zj
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r9.E
            int r0 = r9.G
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L27
            defpackage.sf5.h0(r14)
            goto L4a
        L27:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            r11 = 0
            return r11
        L2e:
            defpackage.sf5.h0(r14)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r9.G = r1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 112(0x70, float:1.57E-43)
            r1 = r11
            r2 = r12
            r3 = r13
            java.lang.Object r14 = m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            m45 r11 = defpackage.m45.E
            if (r14 != r11) goto L4a
            return r11
        L4a:
            pj r14 = (defpackage.pj) r14
            java.util.List r11 = r14.a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.api.b.r(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, java.util.Map r10, boolean r11, boolean r12, defpackage.vp4 r13) {
        /*
            r5 = this;
            boolean r0 = r13 instanceof defpackage.ak
            if (r0 == 0) goto L13
            r0 = r13
            ak r0 = (defpackage.ak) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            ak r0 = new ak
            r0.<init>(r5, r13)
        L18:
            java.lang.Object r13 = r0.G
            int r1 = r0.I
            java.util.concurrent.ConcurrentHashMap r2 = r5.g
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            java.lang.String r8 = r0.F
            java.lang.String r7 = r0.E
            defpackage.sf5.h0(r13)
            goto L5f
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r4
        L32:
            defpackage.sf5.h0(r13)
            if (r12 == 0) goto L3c
            com.anthropic.claude.sessions.types.StdinMessage$ControlResponse r9 = defpackage.ix1.c(r7, r9, r11)
            goto L4a
        L3c:
            if (r11 == 0) goto L45
            java.lang.Object r11 = r2.remove(r8)
            java.util.List r11 = (java.util.List) r11
            goto L46
        L45:
            r11 = r4
        L46:
            com.anthropic.claude.sessions.types.StdinMessage$ControlResponse r9 = defpackage.ix1.b(r7, r8, r11, r10, r9)
        L4a:
            java.util.List r9 = defpackage.x44.W(r9)
            r0.E = r7
            r0.F = r8
            r0.I = r3
            jwf r10 = r5.a
            java.lang.Object r13 = r10.l(r6, r9, r0)
            m45 r6 = defpackage.m45.E
            if (r13 != r6) goto L5f
            return r6
        L5f:
            com.anthropic.claude.api.result.ApiResult r13 = (com.anthropic.claude.api.result.ApiResult) r13
            boolean r6 = r13 instanceof defpackage.of0
            if (r6 == 0) goto L75
            r2.remove(r8)
            zy1 r5 = r5.h
            iei r6 = defpackage.iei.a
            r5.r(r6)
            xlf r5 = new xlf
            r5.<init>(r7)
            return r5
        L75:
            boolean r5 = r13 instanceof defpackage.lf0
            if (r5 == 0) goto L9d
            wlf r5 = new wlf
            java.lang.Exception r6 = new java.lang.Exception
            r7 = r13
            lf0 r7 = (defpackage.lf0) r7
            bj3 r8 = r7.b()
            java.lang.String r8 = r8.getE()
            if (r8 != 0) goto L94
            int r7 = r7.a()
            java.lang.String r8 = "HTTP "
            java.lang.String r8 = defpackage.grc.p(r7, r8)
        L94:
            r6.<init>(r8)
            nf0 r13 = (defpackage.nf0) r13
            r5.<init>(r6, r13)
            return r5
        L9d:
            boolean r5 = r13 instanceof defpackage.mf0
            if (r5 == 0) goto Lad
            wlf r5 = new wlf
            mf0 r13 = (defpackage.mf0) r13
            java.lang.Throwable r6 = r13.a()
            r5.<init>(r6)
            return r5
        Lad:
            defpackage.mr9.b()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.api.b.s(java.lang.String, java.lang.String, java.lang.String, boolean, java.util.Map, boolean, boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r18, java.lang.String r19, java.util.ArrayList r20, defpackage.vp4 r21) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.api.b.t(java.lang.String, java.lang.String, java.util.ArrayList, vp4):java.lang.Object");
    }
}
