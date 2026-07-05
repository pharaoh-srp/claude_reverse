package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m9i extends f9i {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public m9i(Class cls) {
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new l9i(cls))) {
                Enum r5 = (Enum) field.get(null);
                String strName = r5.name();
                String string = r5.toString();
                aof aofVar = (aof) field.getAnnotation(aof.class);
                if (aofVar != null) {
                    strName = aofVar.value();
                    for (String str : aofVar.alternate()) {
                        this.a.put(str, r5);
                    }
                }
                this.a.put(strName, r5);
                this.b.put(string, r5);
                this.c.put(r5, strName);
            }
        } catch (IllegalAccessException e) {
            sz6.h(e);
            throw null;
        }
    }

    @Override // defpackage.f9i
    public final Object a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        Enum r0 = (Enum) this.a.get(strNextString);
        return r0 == null ? (Enum) this.b.get(strNextString) : r0;
    }

    @Override // defpackage.f9i
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        Enum r2 = (Enum) obj;
        jsonWriter.value(r2 == null ? null : (String) this.c.get(r2));
    }
}
