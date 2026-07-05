package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class sce extends f9i {
    public final LinkedHashMap a;

    public sce(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    @Override // defpackage.f9i
    public final Object a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Object objC = c();
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                rce rceVar = (rce) this.a.get(jsonReader.nextName());
                if (rceVar == null || !rceVar.e) {
                    jsonReader.skipValue();
                } else {
                    e(objC, jsonReader, rceVar);
                }
            }
            jsonReader.endObject();
            return d(objC);
        } catch (IllegalAccessException e) {
            nai naiVar = oce.a;
            xh6.f("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // defpackage.f9i
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        try {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((rce) it.next()).a(jsonWriter, obj);
            }
            jsonWriter.endObject();
        } catch (IllegalAccessException e) {
            nai naiVar = oce.a;
            xh6.f("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, JsonReader jsonReader, rce rceVar);
}
