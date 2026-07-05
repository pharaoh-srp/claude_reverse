package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public class ti9 extends z1 {
    public final JsonObject f;
    public final SerialDescriptor g;
    public int h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti9(bg9 bg9Var, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor) {
        super(bg9Var, str);
        bg9Var.getClass();
        jsonObject.getClass();
        this.f = jsonObject;
        this.g = serialDescriptor;
    }

    @Override // defpackage.z1
    public JsonElement F(String str) {
        str.getClass();
        return (JsonElement) sta.f0(str, T());
    }

    @Override // defpackage.z1
    public String R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        bg9 bg9Var = this.c;
        nh9.d(bg9Var, serialDescriptor);
        String strF = serialDescriptor.f(i);
        if (this.e.i && !T().keySet().contains(strF)) {
            efe efeVar = bg9Var.c;
            vc8 vc8Var = new vc8(serialDescriptor, 4, bg9Var);
            efeVar.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) efeVar.F;
            Map map = (Map) concurrentHashMap.get(serialDescriptor);
            Object obj = null;
            a5 a5Var = nh9.a;
            Object objA = map != null ? map.get(a5Var) : null;
            if (objA == null) {
                objA = null;
            }
            if (objA == null) {
                objA = vc8Var.a();
                Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(a5Var, objA);
            }
            Map map2 = (Map) objA;
            Iterator<T> it = T().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strF;
    }

    @Override // defpackage.z1
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public JsonObject T() {
        return this.f;
    }

    @Override // defpackage.z1, defpackage.ud4
    public void b(SerialDescriptor serialDescriptor) {
        Set setP0;
        serialDescriptor.getClass();
        bg9 bg9Var = this.c;
        if (nh9.c(bg9Var, serialDescriptor) || (serialDescriptor.getKind() instanceof u8d)) {
            return;
        }
        nh9.d(bg9Var, serialDescriptor);
        if (this.e.i) {
            Set setQ = yfd.q(serialDescriptor);
            efe efeVar = bg9Var.c;
            efeVar.getClass();
            Map map = (Map) ((ConcurrentHashMap) efeVar.F).get(serialDescriptor);
            Object obj = map != null ? map.get(nh9.a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = um6.E;
            }
            setP0 = dxf.p0(setQ, setKeySet);
        } else {
            setP0 = yfd.q(serialDescriptor);
        }
        for (String str : T().keySet()) {
            if (!setP0.contains(str) && !x44.r(str, this.d)) {
                throw new JsonDecodingException(j8.L(grc.n('\'', "Encountered an unknown key '", str), V(), -1, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", bg9Var.a.k ? j8.V(-1, T().toString()).toString() : null));
            }
        }
    }

    @Override // defpackage.z1, kotlinx.serialization.encoding.Decoder
    public final ud4 c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        SerialDescriptor serialDescriptor2 = this.g;
        if (serialDescriptor != serialDescriptor2) {
            return super.c(serialDescriptor);
        }
        JsonElement jsonElementG = G();
        String strA = serialDescriptor2.a();
        boolean z = jsonElementG instanceof JsonObject;
        bg9 bg9Var = this.c;
        if (z) {
            return new ti9(bg9Var, (JsonObject) jsonElementG, this.d, serialDescriptor2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kce kceVar = jce.a;
        sb.append(kceVar.b(JsonObject.class).f());
        sb.append(", but had ");
        sb.append(kceVar.b(jsonElementG.getClass()).f());
        throw new JsonDecodingException(j8.L(ij0.m(sb, " as the serialized body of ", strA), V(), -1, null, bg9Var.a.k ? j8.V(-1, jsonElementG.toString()).toString() : null));
    }

    @Override // defpackage.z1, kotlinx.serialization.encoding.Decoder
    public final boolean w() {
        return !this.i && super.w();
    }

    @Override // defpackage.ud4
    public int x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        while (this.h < serialDescriptor.e()) {
            int i = this.h;
            this.h = i + 1;
            String strS = S(serialDescriptor, i);
            int i2 = this.h - 1;
            this.i = false;
            if (!T().containsKey((Object) strS)) {
                boolean z = (this.c.a.f || serialDescriptor.i(i2) || !serialDescriptor.h(i2).c()) ? false : true;
                this.i = z;
                if (z) {
                }
            }
            this.e.getClass();
            return i2;
        }
        return -1;
    }

    public /* synthetic */ ti9(bg9 bg9Var, JsonObject jsonObject, String str, int i) {
        this(bg9Var, jsonObject, (i & 4) != 0 ? null : str, (SerialDescriptor) null);
    }
}
