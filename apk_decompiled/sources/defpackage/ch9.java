package defpackage;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public abstract class ch9 {
    public static final x29 a = x44.c("kotlinx.serialization.json.JsonUnquotedLiteral", srg.a);

    public static final JsonPrimitive a(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new jh9(bool, false, null);
    }

    public static final JsonPrimitive b(Number number) {
        return new jh9(number, false, null);
    }

    public static final JsonPrimitive c(String str) {
        return str == null ? JsonNull.INSTANCE : new jh9(str, true, null);
    }

    public static final void d(String str, JsonElement jsonElement) {
        throw new IllegalArgumentException("Element " + jce.a.b(jsonElement.getClass()) + " is not a " + str);
    }

    public static final Boolean e(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        String content = jsonPrimitive.getContent();
        String[] strArr = jrg.a;
        content.getClass();
        if (content.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (content.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final String f(JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    public static final Integer g(JsonPrimitive jsonPrimitive) {
        Long lValueOf;
        jsonPrimitive.getClass();
        try {
            lValueOf = Long.valueOf(k(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final JsonArray h(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        d("JsonArray", jsonElement);
        throw null;
    }

    public static final JsonObject i(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        d("JsonObject", jsonElement);
        throw null;
    }

    public static final JsonPrimitive j(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        d("JsonPrimitive", jsonElement);
        throw null;
    }

    public static final long k(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        irg irgVarJ = x44.j(bg9.d, jsonPrimitive.getContent());
        String str = irgVarJ.f;
        long jI = irgVarJ.i();
        if (irgVarJ.f() == 10) {
            return jI;
        }
        int i = irgVarJ.b;
        int i2 = i > 0 ? i - 1 : i;
        y1.q(irgVarJ, ij0.j("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}
