package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class dj9 {
    public static final ih9 a = u00.c(j06.V);
    public static final ih9 b = u00.c(j06.W);
    public static final Map c;

    static {
        kce kceVar = jce.a;
        c = sta.h0(new cpc(kceVar.b(String.class), srg.a), new cpc(kceVar.b(Character.TYPE), si2.a), new cpc(kceVar.b(char[].class), hi2.c), new cpc(kceVar.b(Double.TYPE), na6.a), new cpc(kceVar.b(double[].class), ia6.c), new cpc(kceVar.b(Float.TYPE), uo7.a), new cpc(kceVar.b(float[].class), qo7.c), new cpc(kceVar.b(Long.TYPE), xka.a), new cpc(kceVar.b(long[].class), fka.c), new cpc(kceVar.b(Integer.TYPE), e79.a), new cpc(kceVar.b(int[].class), q69.c), new cpc(kceVar.b(Short.TYPE), h5g.a), new cpc(kceVar.b(short[].class), f5g.c), new cpc(kceVar.b(Byte.TYPE), t12.a), new cpc(kceVar.b(byte[].class), q12.c), new cpc(kceVar.b(Boolean.TYPE), zt1.a), new cpc(kceVar.b(boolean[].class), vt1.c), new cpc(kceVar.b(iei.class), kei.b), new cpc(kceVar.b(lci.class), pci.a), new cpc(kceVar.b(qci.class), uci.a), new cpc(kceVar.b(eci.class), jci.a), new cpc(kceVar.b(vci.class), zci.a));
    }

    public static final void a(rh9 rh9Var, JsonObject jsonObject) {
        jsonObject.getClass();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            rh9Var.b(entry.getKey(), entry.getValue());
        }
    }

    public static final void b(rh9 rh9Var, String str, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            mpk.U(rh9Var, str, "undefined");
        } else {
            mpk.U(rh9Var, str, charSequence.toString());
        }
    }

    public static final JsonElement c(Object obj) {
        obj.getClass();
        if (obj instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof JsonElement) {
                    str.getClass();
                } else {
                    JsonElement jsonElementC = c(value);
                    str.getClass();
                    jsonElementC.getClass();
                }
            }
            return new JsonObject(linkedHashMap);
        }
        if (obj instanceof Object[]) {
            jg9 jg9Var = new jg9();
            for (Object obj2 : (Object[]) obj) {
                if (obj2 instanceof JsonElement) {
                    jg9Var.a((JsonElement) obj2);
                } else {
                    jg9Var.a(c(obj2));
                }
            }
            return jg9Var.b();
        }
        if (obj instanceof Collection) {
            jg9 jg9Var2 = new jg9();
            for (Object obj3 : (Collection) obj) {
                if (obj3 instanceof JsonElement) {
                    jg9Var2.a((JsonElement) obj3);
                } else {
                    jg9Var2.a(c(obj3));
                }
            }
            return jg9Var2.b();
        }
        if (obj instanceof cpc) {
            cpc cpcVar = (cpc) obj;
            JsonElement jsonElementC2 = c(cpcVar.E);
            JsonElement jsonElementC3 = c(cpcVar.F);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            jsonElementC2.getClass();
            jsonElementC3.getClass();
            return new JsonObject(linkedHashMap2);
        }
        if (obj instanceof r7i) {
            r7i r7iVar = (r7i) obj;
            JsonElement jsonElementC4 = c(r7iVar.E);
            JsonElement jsonElementC5 = c(r7iVar.F);
            JsonElement jsonElementC6 = c(r7iVar.G);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            jsonElementC4.getClass();
            jsonElementC5.getClass();
            jsonElementC6.getClass();
            return new JsonObject(linkedHashMap3);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry2 = (Map.Entry) obj;
            JsonElement jsonElementC7 = c(entry2.getKey());
            JsonElement jsonElementC8 = c(entry2.getValue());
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            jsonElementC7.getClass();
            jsonElementC8.getClass();
            return new JsonObject(linkedHashMap4);
        }
        KSerializer kSerializer = (KSerializer) c.get(jce.a.b(obj.getClass()));
        if (kSerializer == null) {
            kSerializer = null;
        }
        if (kSerializer == null) {
            return JsonNull.INSTANCE;
        }
        ag9 ag9Var = bg9.d;
        ag9Var.getClass();
        return v40.S(ag9Var, obj, kSerializer);
    }
}
