package defpackage;

import com.anthropic.claude.sessions.types.SdkAssistantMessage;
import com.anthropic.claude.sessions.types.SdkMessage;
import com.anthropic.claude.sessions.types.SdkNonAssistantMessage;
import com.anthropic.claude.sessions.types.SdkUnknownMessage;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class pbf extends sg9 {
    public static final pbf c = new pbf(jce.a.b(SdkMessage.class));

    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) "role");
        String content = jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null;
        return x44.r(content, "assistant") ? SdkAssistantMessage.Companion.serializer() : x44.r(content, "user") ? SdkNonAssistantMessage.Companion.serializer() : SdkUnknownMessage.Companion.serializer();
    }
}
