package defpackage;

import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class xi9 extends ui9 {
    public String i;
    public boolean j;

    @Override // defpackage.ui9, defpackage.c2
    public final JsonElement K() {
        return new JsonObject((LinkedHashMap) this.h);
    }

    @Override // defpackage.ui9, defpackage.c2
    public final void N(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        if (!this.j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            String str2 = this.i;
            if (str2 == null) {
                x44.o0("tag");
                throw null;
            }
            linkedHashMap.put(str2, jsonElement);
            this.j = true;
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            this.i = ((JsonPrimitive) jsonElement).getContent();
            this.j = false;
        } else {
            if (jsonElement instanceof JsonObject) {
                throw j8.g(uh9.b);
            }
            if (jsonElement instanceof JsonArray) {
                throw j8.g(lg9.b);
            }
            mr9.b();
        }
    }
}
