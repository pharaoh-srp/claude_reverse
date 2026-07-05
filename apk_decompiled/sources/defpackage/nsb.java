package defpackage;

import com.anthropic.claude.api.chat.MoveChatsRequest;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class nsb extends si9 {
    public static final nsb b;

    static {
        MoveChatsRequest.Companion.getClass();
        b = new nsb(lsb.a);
    }

    @Override // defpackage.si9
    public final JsonElement b(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonObject jsonObjectI = ch9.i(jsonElement);
        return jsonObjectI.containsKey((Object) "project_uuid") ? jsonElement : new JsonObject(sta.m0(jsonObjectI, new cpc("project_uuid", JsonNull.INSTANCE)));
    }
}
