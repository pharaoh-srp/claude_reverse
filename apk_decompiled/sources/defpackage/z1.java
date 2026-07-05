package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public abstract class z1 implements zg9, Decoder, ud4 {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final bg9 c;
    public final String d;
    public final rg9 e;

    public z1(bg9 bg9Var, String str) {
        this.c = bg9Var;
        this.d = str;
        this.e = bg9Var.a;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte A() {
        return I(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short B() {
        return P(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float C() {
        return L(U());
    }

    @Override // defpackage.ud4
    public final float D(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return L(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double E() {
        return K(U());
    }

    public abstract JsonElement F(String str);

    public final JsonElement G() {
        JsonElement jsonElementF;
        String str = (String) w44.V0(this.a);
        return (str == null || (jsonElementF = F(str)) == null) ? T() : jsonElementF;
    }

    public final boolean H(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementF = F(str);
        if (!(jsonElementF instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kce kceVar = jce.a;
            sb.append(kceVar.b(JsonPrimitive.class).f());
            sb.append(", but had ");
            sb.append(kceVar.b(jsonElementF.getClass()).f());
            sb.append(" as the serialized body of boolean");
            throw new JsonDecodingException(j8.L(sb.toString(), W(str), -1, null, this.c.a.k ? j8.V(-1, jsonElementF.toString()).toString() : null));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementF;
        try {
            Boolean boolE = ch9.e(jsonPrimitive);
            if (boolE != null) {
                return boolE.booleanValue();
            }
            X(jsonPrimitive, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "boolean", str);
            throw null;
        }
    }

    public final byte I(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementF = F(str);
        if (!(jsonElementF instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kce kceVar = jce.a;
            sb.append(kceVar.b(JsonPrimitive.class).f());
            sb.append(", but had ");
            sb.append(kceVar.b(jsonElementF.getClass()).f());
            sb.append(" as the serialized body of byte");
            throw new JsonDecodingException(j8.L(sb.toString(), W(str), -1, null, this.c.a.k ? j8.V(-1, jsonElementF.toString()).toString() : null));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementF;
        try {
            long jK = ch9.k(jsonPrimitive);
            Byte bValueOf = (-128 > jK || jK > 127) ? null : Byte.valueOf((byte) jK);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            X(jsonPrimitive, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "byte", str);
            throw null;
        }
    }

    public final char J(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementF = F(str);
        if (!(jsonElementF instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kce kceVar = jce.a;
            sb.append(kceVar.b(JsonPrimitive.class).f());
            sb.append(", but had ");
            sb.append(kceVar.b(jsonElementF.getClass()).f());
            sb.append(" as the serialized body of char");
            throw new JsonDecodingException(j8.L(sb.toString(), W(str), -1, null, this.c.a.k ? j8.V(-1, jsonElementF.toString()).toString() : null));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementF;
        try {
            String content = jsonPrimitive.getContent();
            content.getClass();
            int length = content.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return content.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "char", str);
            throw null;
        }
    }

    public final double K(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementF = F(str);
        boolean z = jsonElementF instanceof JsonPrimitive;
        bg9 bg9Var = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            kce kceVar = jce.a;
            sb.append(kceVar.b(JsonPrimitive.class).f());
            sb.append(", but had ");
            sb.append(kceVar.b(jsonElementF.getClass()).f());
            sb.append(" as the serialized body of double");
            throw new JsonDecodingException(j8.L(sb.toString(), W(str), -1, null, bg9Var.a.k ? j8.V(-1, jsonElementF.toString()).toString() : null));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementF;
        try {
            x29 x29Var = ch9.a;
            double d = Double.parseDouble(jsonPrimitive.getContent());
            rg9 rg9Var = bg9Var.a;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            throw new JsonDecodingException(j8.L(j8.W(Double.valueOf(d), str), null, -1, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", bg9Var.a.k ? j8.V(-1, G().toString()).toString() : null));
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "double", str);
            throw null;
        }
    }

    public final float L(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementF = F(str);
        boolean z = jsonElementF instanceof JsonPrimitive;
        bg9 bg9Var = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            kce kceVar = jce.a;
            sb.append(kceVar.b(JsonPrimitive.class).f());
            sb.append(", but had ");
            sb.append(kceVar.b(jsonElementF.getClass()).f());
            sb.append(" as the serialized body of float");
            throw new JsonDecodingException(j8.L(sb.toString(), W(str), -1, null, bg9Var.a.k ? j8.V(-1, jsonElementF.toString()).toString() : null));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementF;
        try {
            x29 x29Var = ch9.a;
            float f = Float.parseFloat(jsonPrimitive.getContent());
            rg9 rg9Var = bg9Var.a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            throw new JsonDecodingException(j8.L(j8.W(Float.valueOf(f), str), null, -1, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", bg9Var.a.k ? j8.V(-1, G().toString()).toString() : null));
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "float", str);
            throw null;
        }
    }

    public final Decoder M(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        if (!uqg.a(serialDescriptor)) {
            this.a.add(str);
            return this;
        }
        JsonElement jsonElementF = F(str);
        String strA = serialDescriptor.a();
        boolean z = jsonElementF instanceof JsonPrimitive;
        bg9 bg9Var = this.c;
        if (z) {
            return new ah9(x44.j(bg9Var, ((JsonPrimitive) jsonElementF).getContent()), bg9Var);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kce kceVar = jce.a;
        sb.append(kceVar.b(JsonPrimitive.class).f());
        sb.append(", but had ");
        sb.append(kceVar.b(jsonElementF.getClass()).f());
        throw new JsonDecodingException(j8.L(ij0.m(sb, " as the serialized body of ", strA), W(str), -1, null, bg9Var.a.k ? j8.V(-1, jsonElementF.toString()).toString() : null));
    }

    public final int N(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementF = F(str);
        if (!(jsonElementF instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kce kceVar = jce.a;
            sb.append(kceVar.b(JsonPrimitive.class).f());
            sb.append(", but had ");
            sb.append(kceVar.b(jsonElementF.getClass()).f());
            sb.append(" as the serialized body of int");
            throw new JsonDecodingException(j8.L(sb.toString(), W(str), -1, null, this.c.a.k ? j8.V(-1, jsonElementF.toString()).toString() : null));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementF;
        try {
            long jK = ch9.k(jsonPrimitive);
            Integer numValueOf = (-2147483648L > jK || jK > 2147483647L) ? null : Integer.valueOf((int) jK);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            X(jsonPrimitive, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "int", str);
            throw null;
        }
    }

    public final long O(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementF = F(str);
        if (jsonElementF instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementF;
            try {
                return ch9.k(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                this.X(jsonPrimitive, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kce kceVar = jce.a;
        sb.append(kceVar.b(JsonPrimitive.class).f());
        sb.append(", but had ");
        sb.append(kceVar.b(jsonElementF.getClass()).f());
        sb.append(" as the serialized body of long");
        throw new JsonDecodingException(j8.L(sb.toString(), W(str), -1, null, this.c.a.k ? j8.V(-1, jsonElementF.toString()).toString() : null));
    }

    public final short P(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementF = F(str);
        if (!(jsonElementF instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kce kceVar = jce.a;
            sb.append(kceVar.b(JsonPrimitive.class).f());
            sb.append(", but had ");
            sb.append(kceVar.b(jsonElementF.getClass()).f());
            sb.append(" as the serialized body of short");
            throw new JsonDecodingException(j8.L(sb.toString(), W(str), -1, null, this.c.a.k ? j8.V(-1, jsonElementF.toString()).toString() : null));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementF;
        try {
            long jK = ch9.k(jsonPrimitive);
            Short shValueOf = (-32768 > jK || jK > 32767) ? null : Short.valueOf((short) jK);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            X(jsonPrimitive, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "short", str);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementF = F(str);
        boolean z = jsonElementF instanceof JsonPrimitive;
        bg9 bg9Var = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            kce kceVar = jce.a;
            sb.append(kceVar.b(JsonPrimitive.class).f());
            sb.append(", but had ");
            sb.append(kceVar.b(jsonElementF.getClass()).f());
            sb.append(" as the serialized body of string");
            throw new JsonDecodingException(j8.L(sb.toString(), W(str), -1, null, bg9Var.a.k ? j8.V(-1, jsonElementF.toString()).toString() : null));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementF;
        if (!(jsonPrimitive instanceof jh9)) {
            throw new JsonDecodingException(j8.L(ij0.j("Expected string value for a non-null key '", str, "', got null literal instead"), W(str), -1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", bg9Var.a.k ? j8.V(-1, G().toString()).toString() : null));
        }
        jh9 jh9Var = (jh9) jsonPrimitive;
        if (jh9Var.E || bg9Var.a.c) {
            return jh9Var.G;
        }
        throw new JsonDecodingException(j8.L(ij0.j("String literal for value of key '", str, "' should be quoted"), W(str), -1, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", bg9Var.a.k ? j8.V(-1, G().toString()).toString() : null));
    }

    public String R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return serialDescriptor.f(i);
    }

    public final String S(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        String strR = R(serialDescriptor, i);
        strR.getClass();
        return strR;
    }

    public abstract JsonElement T();

    public final Object U() {
        ArrayList arrayList = this.a;
        Object objRemove = arrayList.remove(x44.M(arrayList));
        this.b = true;
        return objRemove;
    }

    public final String V() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : w44.S0(arrayList, ".", "$.", null, null, 60);
    }

    public final String W(String str) {
        str.getClass();
        return V() + '.' + str;
    }

    public final void X(JsonPrimitive jsonPrimitive, String str, String str2) {
        throw new JsonDecodingException(j8.L("Failed to parse literal '" + jsonPrimitive + "' as " + (isg.q0(str, "i", false) ? "an " : "a ").concat(str) + " value", W(str2), -1, null, this.c.a.k ? j8.V(-1, G().toString()).toString() : null));
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.ud4
    public final fof a() {
        return this.c.b;
    }

    public void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public ud4 c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        JsonElement jsonElementG = G();
        u00 kind = serialDescriptor.getKind();
        boolean zR = x44.r(kind, vsg.m);
        bg9 bg9Var = this.c;
        if (zR || (kind instanceof u8d)) {
            String strA = serialDescriptor.a();
            if (jsonElementG instanceof JsonArray) {
                return new vi9(bg9Var, (JsonArray) jsonElementG);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            kce kceVar = jce.a;
            sb.append(kceVar.b(JsonArray.class).f());
            sb.append(", but had ");
            sb.append(kceVar.b(jsonElementG.getClass()).f());
            throw new JsonDecodingException(j8.L(ij0.m(sb, " as the serialized body of ", strA), V(), -1, null, bg9Var.a.k ? j8.V(-1, jsonElementG.toString()).toString() : null));
        }
        if (!x44.r(kind, vsg.n)) {
            String strA2 = serialDescriptor.a();
            if (jsonElementG instanceof JsonObject) {
                return new ti9(bg9Var, (JsonObject) jsonElementG, this.d, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            kce kceVar2 = jce.a;
            sb2.append(kceVar2.b(JsonObject.class).f());
            sb2.append(", but had ");
            sb2.append(kceVar2.b(jsonElementG.getClass()).f());
            throw new JsonDecodingException(j8.L(ij0.m(sb2, " as the serialized body of ", strA2), V(), -1, null, bg9Var.a.k ? j8.V(-1, jsonElementG.toString()).toString() : null));
        }
        SerialDescriptor serialDescriptorA = rij.a(serialDescriptor.h(0), bg9Var.b);
        u00 kind2 = serialDescriptorA.getKind();
        if ((kind2 instanceof kfd) || x44.r(kind2, mnf.l)) {
            String strA3 = serialDescriptor.a();
            if (jsonElementG instanceof JsonObject) {
                return new wi9(bg9Var, (JsonObject) jsonElementG);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            kce kceVar3 = jce.a;
            sb3.append(kceVar3.b(JsonObject.class).f());
            sb3.append(", but had ");
            sb3.append(kceVar3.b(jsonElementG.getClass()).f());
            throw new JsonDecodingException(j8.L(ij0.m(sb3, " as the serialized body of ", strA3), V(), -1, null, bg9Var.a.k ? j8.V(-1, jsonElementG.toString()).toString() : null));
        }
        if (!bg9Var.a.d) {
            throw j8.g(serialDescriptorA);
        }
        String strA4 = serialDescriptor.a();
        if (jsonElementG instanceof JsonArray) {
            return new vi9(bg9Var, (JsonArray) jsonElementG);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        kce kceVar4 = jce.a;
        sb4.append(kceVar4.b(JsonArray.class).f());
        sb4.append(", but had ");
        sb4.append(kceVar4.b(jsonElementG.getClass()).f());
        throw new JsonDecodingException(j8.L(ij0.m(sb4, " as the serialized body of ", strA4), V(), -1, null, bg9Var.a.k ? j8.V(-1, jsonElementG.toString()).toString() : null));
    }

    @Override // defpackage.zg9
    public final bg9 d() {
        return this.c;
    }

    @Override // defpackage.ud4
    public final Decoder e(gfd gfdVar, int i) {
        gfdVar.getClass();
        return M(S(gfdVar, i), gfdVar.h(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean f() {
        return H(U());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.s06 r8) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1.g(s06):java.lang.Object");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char h() {
        return J(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        String str = (String) U();
        str.getClass();
        JsonElement jsonElementF = F(str);
        String strA = serialDescriptor.a();
        boolean z = jsonElementF instanceof JsonPrimitive;
        bg9 bg9Var = this.c;
        if (z) {
            return nh9.b(serialDescriptor, bg9Var, ((JsonPrimitive) jsonElementF).getContent(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kce kceVar = jce.a;
        sb.append(kceVar.b(JsonPrimitive.class).f());
        sb.append(", but had ");
        sb.append(kceVar.b(jsonElementF.getClass()).f());
        throw new JsonDecodingException(j8.L(ij0.m(sb, " as the serialized body of ", strA), W(str), -1, null, bg9Var.a.k ? j8.V(-1, jsonElementF.toString()).toString() : null));
    }

    @Override // defpackage.ud4
    public final long j(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return O(S(serialDescriptor, i));
    }

    @Override // defpackage.ud4
    public final char k(gfd gfdVar, int i) {
        gfdVar.getClass();
        return J(S(gfdVar, i));
    }

    @Override // defpackage.ud4
    public final Object l(SerialDescriptor serialDescriptor, int i, s06 s06Var, Object obj) {
        serialDescriptor.getClass();
        s06Var.getClass();
        this.a.add(S(serialDescriptor, i));
        s06Var.getClass();
        Object objG = g(s06Var);
        if (!this.b) {
            U();
        }
        this.b = false;
        return objG;
    }

    @Override // defpackage.ud4
    public final Object m(SerialDescriptor serialDescriptor, int i, s06 s06Var, Object obj) {
        serialDescriptor.getClass();
        s06Var.getClass();
        this.a.add(S(serialDescriptor, i));
        Object objG = (s06Var.getDescriptor().c() || w()) ? g(s06Var) : null;
        if (!this.b) {
            U();
        }
        this.b = false;
        return objG;
    }

    @Override // defpackage.zg9
    public final JsonElement n() {
        return G();
    }

    @Override // defpackage.ud4
    public final byte o(gfd gfdVar, int i) {
        gfdVar.getClass();
        return I(S(gfdVar, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int p() {
        return N(U());
    }

    @Override // defpackage.ud4
    public final short q(gfd gfdVar, int i) {
        gfdVar.getClass();
        return P(S(gfdVar, i));
    }

    @Override // defpackage.ud4
    public final int r(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return N(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String s() {
        return Q(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long t() {
        return O(U());
    }

    @Override // defpackage.ud4
    public final boolean u(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return H(S(serialDescriptor, i));
    }

    @Override // defpackage.ud4
    public final String v(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return Q(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean w() {
        return !(G() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder y(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (w44.V0(this.a) != null) {
            return M(U(), serialDescriptor);
        }
        return new wh9(this.c, T(), this.d).y(serialDescriptor);
    }

    @Override // defpackage.ud4
    public final double z(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return K(S(serialDescriptor, i));
    }
}
