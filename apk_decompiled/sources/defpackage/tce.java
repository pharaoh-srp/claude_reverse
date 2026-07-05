package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tce extends sce {
    public final sac b;

    public tce(sac sacVar, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.b = sacVar;
    }

    @Override // defpackage.sce
    public final Object c() {
        return this.b.o0();
    }

    @Override // defpackage.sce
    public final Object d(Object obj) {
        return obj;
    }

    @Override // defpackage.sce
    public final void e(Object obj, JsonReader jsonReader, rce rceVar) throws IllegalAccessException {
        Field field = rceVar.b;
        Object objA = rceVar.h.a(jsonReader);
        if (objA == null && rceVar.k) {
            return;
        }
        if (rceVar.l) {
            throw new JsonIOException("Cannot set value of 'static final' ".concat(oce.d(field, false)));
        }
        field.set(obj, objA);
    }
}
