package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class kp0 extends f9i {
    public static final jp0 d = new jp0(0);
    public final /* synthetic */ int a = 0;
    public final fta b;
    public final Object c;

    public kp0(xd8 xd8Var, f9i f9iVar, Class cls) {
        this.b = new fta(xd8Var, f9iVar, cls);
        this.c = cls;
    }

    @Override // defpackage.f9i
    public final Object a(JsonReader jsonReader) {
        int i = this.a;
        fta ftaVar = this.b;
        Object obj = this.c;
        Collection collection = null;
        switch (i) {
            case 0:
                Class cls = (Class) obj;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(ftaVar.c.a(jsonReader));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i2 = 0; i2 < size; i2++) {
                    Array.set(objNewInstance, i2, arrayList.get(i2));
                }
                return objNewInstance;
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    collection = (Collection) ((sac) obj).o0();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        collection.add(ftaVar.c.a(jsonReader));
                    }
                    jsonReader.endArray();
                }
                return collection;
        }
    }

    @Override // defpackage.f9i
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        int i = this.a;
        fta ftaVar = this.b;
        switch (i) {
            case 0:
                if (obj == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.beginArray();
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        ftaVar.b(jsonWriter, Array.get(obj, i2));
                    }
                    jsonWriter.endArray();
                }
                break;
            default:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.beginArray();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ftaVar.b(jsonWriter, it.next());
                    }
                    jsonWriter.endArray();
                }
                break;
        }
    }

    public kp0(xd8 xd8Var, Type type, f9i f9iVar, sac sacVar) {
        this.b = new fta(xd8Var, f9iVar, type);
        this.c = sacVar;
    }
}
