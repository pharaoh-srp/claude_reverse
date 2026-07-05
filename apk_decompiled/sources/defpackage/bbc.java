package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bbc extends f9i {
    public static final jp0 b = new jp0(2);
    public final xd8 a;

    public bbc(xd8 xd8Var) {
        this.a = xd8Var;
    }

    public static Serializable d(JsonReader jsonReader, JsonToken jsonToken) {
        int i = abc.a[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new q7a(true);
    }

    @Override // defpackage.f9i
    public final Object a(JsonReader jsonReader) {
        JsonToken jsonTokenPeek = jsonReader.peek();
        Object objD = d(jsonReader, jsonTokenPeek);
        if (objD == null) {
            return c(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = objD instanceof Map ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                Serializable serializableD = d(jsonReader, jsonTokenPeek2);
                boolean z = serializableD != null;
                if (serializableD == null) {
                    serializableD = c(jsonReader, jsonTokenPeek2);
                }
                if (objD instanceof List) {
                    ((List) objD).add(serializableD);
                } else {
                    ((Map) objD).put(strNextName, serializableD);
                }
                if (z) {
                    arrayDeque.addLast(objD);
                    objD = serializableD;
                }
            } else {
                if (objD instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return objD;
                }
                objD = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.f9i
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        f9i f9iVarC = this.a.c(new dbi(obj.getClass()));
        if (!(f9iVarC instanceof bbc)) {
            f9iVarC.b(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    public final Serializable c(JsonReader jsonReader, JsonToken jsonToken) {
        int i = abc.a[jsonToken.ordinal()];
        if (i == 3) {
            return jsonReader.nextString();
        }
        if (i == 4) {
            return Double.valueOf(jsonReader.nextDouble());
        }
        if (i == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i == 6) {
            jsonReader.nextNull();
            return null;
        }
        xh6.m("Unexpected token: ", jsonToken);
        return null;
    }
}
