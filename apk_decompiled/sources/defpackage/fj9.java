package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class fj9 implements uac, vqi {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final tac e;
    public final boolean f;

    public fj9(Writer writer, Map map, Map map2, tac tacVar, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = tacVar;
        this.f = z;
    }

    @Override // defpackage.uac
    public final uac a(mh7 mh7Var, Object obj) throws IOException {
        g(mh7Var.a, obj);
        return this;
    }

    @Override // defpackage.vqi
    public final vqi b(String str) throws IOException {
        h();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.vqi
    public final vqi c(boolean z) throws IOException {
        h();
        this.b.value(z);
        return this;
    }

    @Override // defpackage.uac
    public final uac d(mh7 mh7Var, int i) throws IOException {
        String str = mh7Var.a;
        h();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.uac
    public final uac e(mh7 mh7Var, long j) throws IOException {
        String str = mh7Var.a;
        h();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j);
        return this;
    }

    public final fj9 f(Object obj) throws IOException {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            tac tacVar = (tac) this.c.get(obj.getClass());
            if (tacVar != null) {
                jsonWriter.beginObject();
                tacVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            uqi uqiVar = (uqi) this.d.get(obj.getClass());
            if (uqiVar != null) {
                uqiVar.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                h();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                h();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                f(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                f(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final fj9 g(String str, Object obj) throws IOException {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            h();
            jsonWriter.name(str);
            f(obj);
            return this;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        f(obj);
        return this;
    }

    public final void h() {
        if (this.a) {
            return;
        }
        sz6.j("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
