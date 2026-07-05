package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class ajg extends f9i {
    public static final jp0 c = new jp0(5);
    public final /* synthetic */ int a;
    public final f9i b;

    public /* synthetic */ ajg(f9i f9iVar, int i) {
        this.a = i;
        this.b = f9iVar;
    }

    @Override // defpackage.f9i
    public final Object a(JsonReader jsonReader) {
        int i = this.a;
        f9i f9iVar = this.b;
        switch (i) {
            case 0:
                Date date = (Date) f9iVar.a(jsonReader);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            case 1:
                return new AtomicLong(((Number) f9iVar.a(jsonReader)).longValue());
            case 2:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) f9iVar.a(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return f9iVar.a(jsonReader);
                }
                jsonReader.nextNull();
                return null;
        }
    }

    @Override // defpackage.f9i
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        int i = this.a;
        f9i f9iVar = this.b;
        switch (i) {
            case 0:
                f9iVar.b(jsonWriter, (Timestamp) obj);
                break;
            case 1:
                f9iVar.b(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 2:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    f9iVar.b(jsonWriter, Long.valueOf(atomicLongArray.get(i2)));
                }
                jsonWriter.endArray();
                break;
            default:
                if (obj == null) {
                    jsonWriter.nullValue();
                } else {
                    f9iVar.b(jsonWriter, obj);
                }
                break;
        }
    }
}
