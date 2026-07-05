package defpackage;

import com.anthropic.claude.sessions.types.SdkUnknownToolResult;
import com.anthropic.claude.sessions.types.TextToolResult;
import com.anthropic.claude.sessions.types.ToolResult;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class czh extends sg9 {
    public static final czh c = new czh(jce.a.b(ToolResult.class));

    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) "type");
        return x44.r(jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null, "text") ? TextToolResult.Companion.serializer() : SdkUnknownToolResult.Companion.serializer();
    }
}
