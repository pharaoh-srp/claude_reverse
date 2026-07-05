package com.anthropic.claude.mcpapps;

import com.anthropic.claude.api.chat.tool.ToolResultContent;
import com.anthropic.claude.api.mcp.McpAppToolResult;
import com.anthropic.claude.mcpapps.transport.ToolResultParams;
import defpackage.bg9;
import defpackage.x44;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.anthropic.claude.api.chat.tool.ToolResultContent r16, defpackage.bg9 r17, defpackage.pz7 r18, defpackage.vp4 r19) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mcpapps.c.a(com.anthropic.claude.api.chat.tool.ToolResultContent, bg9, pz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0084 -> B:21:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.anthropic.claude.api.mcp.McpAppToolResult r6, defpackage.bg9 r7, defpackage.m33 r8, defpackage.vp4 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.zya
            if (r0 == 0) goto L13
            r0 = r9
            zya r0 = (defpackage.zya) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            zya r0 = new zya
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.K
            int r1 = r0.L
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 != r2) goto L39
            java.util.Collection r6 = r0.J
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r7 = r0.I
            java.util.Collection r8 = r0.H
            java.util.Collection r8 = (java.util.Collection) r8
            pz7 r1 = r0.G
            bg9 r3 = r0.F
            com.anthropic.claude.api.mcp.McpAppToolResult r4 = r0.E
            defpackage.sf5.h0(r9)
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r5
            goto L8a
        L39:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            r6 = 0
            return r6
        L40:
            defpackage.sf5.h0(r9)
            java.util.List r9 = r6.getContent()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.x44.y(r9, r3)
            r1.<init>(r3)
            java.util.Iterator r9 = r9.iterator()
            r5 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r8
            r8 = r5
        L5e:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L95
            java.lang.Object r3 = r9.next()
            com.anthropic.claude.api.chat.tool.ToolResultContent r3 = (com.anthropic.claude.api.chat.tool.ToolResultContent) r3
            r1.E = r7
            r1.F = r8
            r1.G = r0
            r4 = r6
            java.util.Collection r4 = (java.util.Collection) r4
            r1.H = r4
            r1.I = r9
            r1.J = r4
            r1.L = r2
            java.lang.Object r3 = a(r3, r8, r0, r1)
            m45 r4 = defpackage.m45.E
            if (r3 != r4) goto L84
            return r4
        L84:
            r4 = r1
            r1 = r0
            r0 = r9
            r9 = r3
            r3 = r8
            r8 = r6
        L8a:
            kotlinx.serialization.json.JsonElement r9 = (kotlinx.serialization.json.JsonElement) r9
            r6.add(r9)
            r6 = r8
            r9 = r0
            r0 = r1
            r8 = r3
            r1 = r4
            goto L5e
        L95:
            java.util.List r6 = (java.util.List) r6
            com.anthropic.claude.mcpapps.transport.ToolResultParams r8 = new com.anthropic.claude.mcpapps.transport.ToolResultParams
            boolean r9 = r7.isError()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            kotlinx.serialization.json.JsonObject r0 = r7.getStructuredContent()
            kotlinx.serialization.json.JsonObject r7 = r7.getMeta()
            r8.<init>(r6, r9, r0, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mcpapps.c.b(com.anthropic.claude.api.mcp.McpAppToolResult, bg9, m33, vp4):java.lang.Object");
    }

    public static final ToolResultParams c(McpAppToolResult mcpAppToolResult, bg9 bg9Var) {
        mcpAppToolResult.getClass();
        bg9Var.getClass();
        List<ToolResultContent> content = mcpAppToolResult.getContent();
        ArrayList arrayList = new ArrayList(x44.y(content, 10));
        Iterator<T> it = content.iterator();
        while (it.hasNext()) {
            arrayList.add(bg9Var.c((ToolResultContent) it.next(), ToolResultContent.Companion.serializer()));
        }
        return new ToolResultParams(arrayList, Boolean.valueOf(mcpAppToolResult.isError()), mcpAppToolResult.getStructuredContent(), mcpAppToolResult.getMeta());
    }
}
