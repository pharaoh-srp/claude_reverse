package defpackage;

import com.anthropic.claude.api.errors.ErrorDetails;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class bs6 extends si9 {
    public static final bs6 b = new bs6(ErrorDetails.Companion.serializer());

    @Override // defpackage.si9
    public final JsonElement a(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        return jsonObject != null ? jsonObject : new JsonObject(nm6.E);
    }
}
