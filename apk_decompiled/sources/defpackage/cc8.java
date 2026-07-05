package defpackage;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cc8 {
    public static final ih9 a = u00.c(new hz6(20));

    public static final String a(JsonElement jsonElement) {
        Object hreVar;
        if (jsonElement == null) {
            return "";
        }
        try {
            hreVar = a.d(jsonElement, JsonElement.INSTANCE.serializer());
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        Object string = jsonElement.toString();
        if (hreVar instanceof hre) {
            hreVar = string;
        }
        return (String) hreVar;
    }
}
