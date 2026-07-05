package defpackage;

import com.anthropic.claude.mcpapps.transport.McpServerCapabilities;
import com.anthropic.claude.mcpapps.transport.UiResourceMeta;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.McpServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class txa {
    public final String a;
    public final JsonObject b;
    public final UiResourceMeta c;
    public final McpServerCapabilities d;
    public final rxa e;
    public final String f;
    public final List g;
    public final String h;
    public final String i;
    public final String j;

    public /* synthetic */ txa(String str, JsonObject jsonObject, UiResourceMeta uiResourceMeta, McpServerCapabilities mcpServerCapabilities, rxa rxaVar, String str2, List list, String str3, String str4, String str5, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : jsonObject, (i & 4) != 0 ? null : uiResourceMeta, (i & 8) != 0 ? null : mcpServerCapabilities, (i & 16) != 0 ? null : rxaVar, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : list, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str3, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str4, (i & 512) != 0 ? null : str5);
    }

    public static txa a(txa txaVar) {
        return new txa(txaVar.a, txaVar.b, txaVar.c, txaVar.d, oxa.a, txaVar.f, txaVar.g, txaVar.h, txaVar.i, txaVar.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.txa
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            txa r5 = (defpackage.txa) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            kotlinx.serialization.json.JsonObject r1 = r4.b
            kotlinx.serialization.json.JsonObject r3 = r5.b
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            com.anthropic.claude.mcpapps.transport.UiResourceMeta r1 = r4.c
            com.anthropic.claude.mcpapps.transport.UiResourceMeta r3 = r5.c
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            com.anthropic.claude.mcpapps.transport.McpServerCapabilities r1 = r4.d
            com.anthropic.claude.mcpapps.transport.McpServerCapabilities r3 = r5.d
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            rxa r1 = r4.e
            rxa r3 = r5.e
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.f
            java.lang.String r3 = r5.f
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.util.List r1 = r4.g
            java.util.List r3 = r5.g
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r1 = r5.h
            java.lang.String r3 = r4.h
            if (r3 != 0) goto L65
            if (r1 != 0) goto L63
            r1 = r0
            goto L6c
        L63:
            r1 = r2
            goto L6c
        L65:
            if (r1 != 0) goto L68
            goto L63
        L68:
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r3, r1)
        L6c:
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.String r1 = r5.i
            java.lang.String r3 = r4.i
            if (r3 != 0) goto L7b
            if (r1 != 0) goto L79
            r1 = r0
            goto L82
        L79:
            r1 = r2
            goto L82
        L7b:
            if (r1 != 0) goto L7e
            goto L79
        L7e:
            boolean r1 = com.anthropic.claude.types.strings.McpServerId.m1032equalsimpl0(r3, r1)
        L82:
            if (r1 != 0) goto L85
            return r2
        L85:
            java.lang.String r4 = r4.j
            java.lang.String r5 = r5.j
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L90
            return r2
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JsonObject jsonObject = this.b;
        int iHashCode2 = (iHashCode + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        UiResourceMeta uiResourceMeta = this.c;
        int iHashCode3 = (iHashCode2 + (uiResourceMeta == null ? 0 : uiResourceMeta.hashCode())) * 31;
        McpServerCapabilities mcpServerCapabilities = this.d;
        int iHashCode4 = (iHashCode3 + (mcpServerCapabilities == null ? 0 : mcpServerCapabilities.hashCode())) * 31;
        rxa rxaVar = this.e;
        int iHashCode5 = (iHashCode4 + (rxaVar == null ? 0 : rxaVar.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.h;
        int iM982hashCodeimpl = (iHashCode7 + (str3 == null ? 0 : ChatId.m982hashCodeimpl(str3))) * 31;
        String str4 = this.i;
        int iM1033hashCodeimpl = (iM982hashCodeimpl + (str4 == null ? 0 : McpServerId.m1033hashCodeimpl(str4))) * 31;
        String str5 = this.j;
        return iM1033hashCodeimpl + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.h;
        String strM983toStringimpl = str == null ? "null" : ChatId.m983toStringimpl(str);
        String str2 = this.i;
        String strM1034toStringimpl = str2 != null ? McpServerId.m1034toStringimpl(str2) : "null";
        StringBuilder sb = new StringBuilder("McpAppFetchState(html=");
        sb.append(this.a);
        sb.append(", toolDefinition=");
        sb.append(this.b);
        sb.append(", uiResourceMeta=");
        sb.append(this.c);
        sb.append(", serverCapabilities=");
        sb.append(this.d);
        sb.append(", error=");
        sb.append(this.e);
        sb.append(", sandboxOrigin=");
        sb.append(this.f);
        sb.append(", allowedLinkDomains=");
        ms6.x(", chatId=", strM983toStringimpl, ", serverUuid=", sb, this.g);
        return vb7.t(sb, strM1034toStringimpl, ", connectorUrl=", this.j, ")");
    }

    public txa(String str, JsonObject jsonObject, UiResourceMeta uiResourceMeta, McpServerCapabilities mcpServerCapabilities, rxa rxaVar, String str2, List list, String str3, String str4, String str5) {
        this.a = str;
        this.b = jsonObject;
        this.c = uiResourceMeta;
        this.d = mcpServerCapabilities;
        this.e = rxaVar;
        this.f = str2;
        this.g = list;
        this.h = str3;
        this.i = str4;
        this.j = str5;
    }
}
