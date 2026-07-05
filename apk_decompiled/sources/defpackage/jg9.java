package defpackage;

import java.util.ArrayList;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class jg9 {
    public final ArrayList a = new ArrayList();

    public final void a(JsonElement jsonElement) {
        jsonElement.getClass();
        this.a.add(jsonElement);
    }

    public final JsonArray b() {
        return new JsonArray(this.a);
    }
}
