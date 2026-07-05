package defpackage;

import com.anthropic.claude.mcpapps.transport.McpServerCapabilities;
import com.anthropic.claude.mcpapps.transport.UiResourceMeta;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class twa {
    public final String a;
    public final JsonObject b;
    public final McpServerCapabilities c;
    public final UiResourceMeta d;

    public twa(String str, JsonObject jsonObject, McpServerCapabilities mcpServerCapabilities, UiResourceMeta uiResourceMeta) {
        this.a = str;
        this.b = jsonObject;
        this.c = mcpServerCapabilities;
        this.d = uiResourceMeta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twa)) {
            return false;
        }
        twa twaVar = (twa) obj;
        return this.a.equals(twaVar.a) && x44.r(this.b, twaVar.b) && x44.r(this.c, twaVar.c) && x44.r(this.d, twaVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        JsonObject jsonObject = this.b;
        int iHashCode2 = (iHashCode + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        McpServerCapabilities mcpServerCapabilities = this.c;
        int iHashCode3 = (iHashCode2 + (mcpServerCapabilities == null ? 0 : mcpServerCapabilities.hashCode())) * 31;
        UiResourceMeta uiResourceMeta = this.d;
        return iHashCode3 + (uiResourceMeta != null ? uiResourceMeta.hashCode() : 0);
    }

    public final String toString() {
        return "ServerInitResult(html=" + this.a + ", toolDefinition=" + this.b + ", hostCapabilities=" + this.c + ", uiResourceMeta=" + this.d + ")";
    }
}
