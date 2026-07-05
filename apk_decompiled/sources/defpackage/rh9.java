package defpackage;

import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class rh9 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final JsonObject a() {
        return new JsonObject(this.a);
    }

    public final JsonElement b(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        return (JsonElement) this.a.put(str, jsonElement);
    }
}
