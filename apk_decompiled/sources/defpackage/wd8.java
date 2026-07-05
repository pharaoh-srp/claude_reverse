package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: loaded from: classes.dex */
public final class wd8 extends f9i {
    public f9i a;

    @Override // defpackage.f9i
    public final Object a(JsonReader jsonReader) {
        f9i f9iVar = this.a;
        if (f9iVar != null) {
            return f9iVar.a(jsonReader);
        }
        sz6.j("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // defpackage.f9i
    public final void b(JsonWriter jsonWriter, Object obj) {
        f9i f9iVar = this.a;
        if (f9iVar != null) {
            f9iVar.b(jsonWriter, obj);
        } else {
            sz6.j("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }
}
