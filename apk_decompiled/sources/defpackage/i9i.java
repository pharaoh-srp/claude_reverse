package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: loaded from: classes3.dex */
public final class i9i extends f9i {
    public final /* synthetic */ Class a;
    public final /* synthetic */ h9i b;

    public i9i(h9i h9iVar, Class cls) {
        this.b = h9iVar;
        this.a = cls;
    }

    @Override // defpackage.f9i
    public final Object a(JsonReader jsonReader) {
        Object objA = this.b.G.a(jsonReader);
        if (objA != null) {
            Class cls = this.a;
            if (!cls.isInstance(objA)) {
                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + objA.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
            }
        }
        return objA;
    }

    @Override // defpackage.f9i
    public final void b(JsonWriter jsonWriter, Object obj) {
        this.b.G.b(jsonWriter, obj);
    }
}
