package defpackage;

import com.anthropic.claude.api.mcp.McpAppToolResult;
import com.anthropic.claude.mcpapps.transport.McpServerCapabilities;
import com.anthropic.claude.mcpapps.transport.UiResourceMeta;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.McpServerId;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vya {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final JsonObject g;
    public final String h;
    public final McpAppToolResult i;
    public final String j;
    public final JsonObject k;
    public final UiResourceMeta l;
    public final McpServerCapabilities m;
    public final String n;

    public vya(String str, String str2, String str3, String str4, String str5, String str6, JsonObject jsonObject, String str7, McpAppToolResult mcpAppToolResult, String str8, JsonObject jsonObject2, UiResourceMeta uiResourceMeta, McpServerCapabilities mcpServerCapabilities, String str9) {
        str.getClass();
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = jsonObject;
        this.h = str7;
        this.i = mcpAppToolResult;
        this.j = str8;
        this.k = jsonObject2;
        this.l = uiResourceMeta;
        this.m = mcpServerCapabilities;
        this.n = str9;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L5
            goto Lc2
        L5:
            boolean r1 = r5 instanceof defpackage.vya
            r2 = 0
            if (r1 != 0) goto Lc
            goto Lc1
        Lc:
            vya r5 = (defpackage.vya) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L1a
            goto Lc1
        L1a:
            java.lang.String r1 = r5.b
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L26
            if (r1 != 0) goto L24
            r1 = r0
            goto L2d
        L24:
            r1 = r2
            goto L2d
        L26:
            if (r1 != 0) goto L29
            goto L24
        L29:
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r3, r1)
        L2d:
            if (r1 != 0) goto L31
            goto Lc1
        L31:
            java.lang.String r1 = r5.c
            java.lang.String r3 = r4.c
            if (r3 != 0) goto L3d
            if (r1 != 0) goto L3b
            r1 = r0
            goto L44
        L3b:
            r1 = r2
            goto L44
        L3d:
            if (r1 != 0) goto L40
            goto L3b
        L40:
            boolean r1 = com.anthropic.claude.types.strings.McpServerId.m1032equalsimpl0(r3, r1)
        L44:
            if (r1 != 0) goto L48
            goto Lc1
        L48:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L54
            goto Lc1
        L54:
            java.lang.String r1 = r4.e
            java.lang.String r3 = r5.e
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5f
            goto Lc1
        L5f:
            java.lang.String r1 = r4.f
            java.lang.String r3 = r5.f
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L6a
            goto Lc1
        L6a:
            kotlinx.serialization.json.JsonObject r1 = r4.g
            kotlinx.serialization.json.JsonObject r3 = r5.g
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L75
            goto Lc1
        L75:
            java.lang.String r1 = r4.h
            java.lang.String r3 = r5.h
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L80
            goto Lc1
        L80:
            com.anthropic.claude.api.mcp.McpAppToolResult r1 = r4.i
            com.anthropic.claude.api.mcp.McpAppToolResult r3 = r5.i
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L8b
            goto Lc1
        L8b:
            java.lang.String r1 = r4.j
            java.lang.String r3 = r5.j
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L96
            goto Lc1
        L96:
            kotlinx.serialization.json.JsonObject r1 = r4.k
            kotlinx.serialization.json.JsonObject r3 = r5.k
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto La1
            goto Lc1
        La1:
            com.anthropic.claude.mcpapps.transport.UiResourceMeta r1 = r4.l
            com.anthropic.claude.mcpapps.transport.UiResourceMeta r3 = r5.l
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto Lac
            goto Lc1
        Lac:
            com.anthropic.claude.mcpapps.transport.McpServerCapabilities r1 = r4.m
            com.anthropic.claude.mcpapps.transport.McpServerCapabilities r3 = r5.m
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto Lb7
            goto Lc1
        Lb7:
            java.lang.String r4 = r4.n
            java.lang.String r5 = r5.n
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto Lc2
        Lc1:
            return r2
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vya.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iM982hashCodeimpl = (iHashCode + (str == null ? 0 : ChatId.m982hashCodeimpl(str))) * 31;
        String str2 = this.c;
        int iL = kgh.l(kgh.l(kgh.l((iM982hashCodeimpl + (str2 == null ? 0 : McpServerId.m1033hashCodeimpl(str2))) * 31, 31, this.d), 31, this.e), 31, this.f);
        JsonObject jsonObject = this.g;
        int iHashCode2 = (iL + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        McpAppToolResult mcpAppToolResult = this.i;
        int iHashCode4 = (iHashCode3 + (mcpAppToolResult == null ? 0 : mcpAppToolResult.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        JsonObject jsonObject2 = this.k;
        int iHashCode6 = (iHashCode5 + (jsonObject2 == null ? 0 : jsonObject2.hashCode())) * 31;
        UiResourceMeta uiResourceMeta = this.l;
        int iHashCode7 = (iHashCode6 + (uiResourceMeta == null ? 0 : uiResourceMeta.hashCode())) * 31;
        McpServerCapabilities mcpServerCapabilities = this.m;
        int iHashCode8 = (iHashCode7 + (mcpServerCapabilities == null ? 0 : mcpServerCapabilities.hashCode())) * 31;
        String str5 = this.n;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        String strM983toStringimpl = str == null ? "null" : ChatId.m983toStringimpl(str);
        String str2 = this.c;
        String strM1034toStringimpl = str2 != null ? McpServerId.m1034toStringimpl(str2) : "null";
        StringBuilder sbR = kgh.r("McpAppToolCall(id=", this.a, ", conversationUuid=", strM983toStringimpl, ", serverUuid=");
        kgh.u(sbR, strM1034toStringimpl, ", serverName=", this.d, ", toolName=");
        kgh.u(sbR, this.e, ", sandboxOrigin=", this.f, ", inputArgs=");
        sbR.append(this.g);
        sbR.append(", rawInput=");
        sbR.append(this.h);
        sbR.append(", toolResult=");
        sbR.append(this.i);
        sbR.append(", htmlContent=");
        sbR.append(this.j);
        sbR.append(", toolDefinition=");
        sbR.append(this.k);
        sbR.append(", uiResourceMeta=");
        sbR.append(this.l);
        sbR.append(", serverCapabilities=");
        sbR.append(this.m);
        sbR.append(", connectorUrl=");
        sbR.append(this.n);
        sbR.append(")");
        return sbR.toString();
    }
}
