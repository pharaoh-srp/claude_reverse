package defpackage;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class so0 extends gg9 {
    public static final ro0 d = new ro0(0);
    public static final ro0 e = new ro0(3);
    public final /* synthetic */ int a = 0;
    public final gg9 b;
    public final Object c;

    public so0(prb prbVar, Type type, Type type2) {
        Set set = spi.a;
        this.b = prbVar.b(type, set, null);
        this.c = prbVar.b(type2, set, null);
    }

    @Override // defpackage.gg9
    public final Object fromJson(ci9 ci9Var) {
        int i = this.a;
        Object obj = this.c;
        gg9 gg9Var = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ci9Var.beginArray();
                while (ci9Var.hasNext()) {
                    arrayList.add(gg9Var.fromJson(ci9Var));
                }
                ci9Var.endArray();
                Object objNewInstance = Array.newInstance((Class<?>) obj, arrayList.size());
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Array.set(objNewInstance, i2, arrayList.get(i2));
                }
                return objNewInstance;
            default:
                j7a j7aVar = new j7a();
                ci9Var.beginObject();
                while (ci9Var.hasNext()) {
                    ci9Var.x();
                    Object objFromJson = gg9Var.fromJson(ci9Var);
                    Object objFromJson2 = ((gg9) obj).fromJson(ci9Var);
                    Object objPut = j7aVar.put(objFromJson, objFromJson2);
                    if (objPut != null) {
                        StringBuilder sb = new StringBuilder("Map key '");
                        sb.append(objFromJson);
                        String strC = ci9Var.c();
                        sb.append("' has multiple values at path ");
                        sb.append(strC);
                        sb.append(": ");
                        sb.append(objPut);
                        sb.append(" and ");
                        sb.append(objFromJson2);
                        throw new JsonDataException(sb.toString());
                    }
                }
                ci9Var.endObject();
                return j7aVar;
        }
    }

    @Override // defpackage.gg9
    public final void toJson(jj9 jj9Var, Object obj) {
        int i = this.a;
        gg9 gg9Var = this.b;
        switch (i) {
            case 0:
                jj9Var.c();
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    gg9Var.toJson(jj9Var, Array.get(obj, i2));
                }
                jj9Var.f();
                return;
            default:
                jj9Var.d();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new JsonDataException("Map key is null at ".concat(jj9Var.j()));
                    }
                    jj9Var.P();
                    gg9Var.toJson(jj9Var, entry.getKey());
                    ((gg9) this.c).toJson(jj9Var, entry.getValue());
                }
                jj9Var.i();
                return;
        }
    }

    public final String toString() {
        int i = this.a;
        gg9 gg9Var = this.b;
        switch (i) {
            case 0:
                return gg9Var + ".array()";
            default:
                return "JsonAdapter(" + gg9Var + "=" + ((gg9) this.c) + ")";
        }
    }

    public so0(Class cls, gg9 gg9Var) {
        this.c = cls;
        this.b = gg9Var;
    }
}
