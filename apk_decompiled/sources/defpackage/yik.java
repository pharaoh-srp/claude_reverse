package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class yik extends LinkedHashMap {
    public static final yik F;
    public boolean E = true;

    static {
        yik yikVar = new yik();
        F = yikVar;
        yikVar.E = false;
    }

    public static yik a() {
        return F;
    }

    public static int h(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof isk)) {
                return obj.hashCode();
            }
            mr9.x();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iA = kfk.a(length, 0, length, bArr);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final yik c() {
        if (isEmpty()) {
            return new yik();
        }
        yik yikVar = new yik(this);
        yikVar.E = true;
        return yikVar;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final void d() {
        this.E = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void f(yik yikVar) {
        i();
        if (yikVar.isEmpty()) {
            return;
        }
        putAll(yikVar);
    }

    public final boolean g() {
        return this.E;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iH = 0;
        for (Map.Entry entry : entrySet()) {
            iH += h(entry.getValue()) ^ h(entry.getKey());
        }
        return iH;
    }

    public final void i() {
        if (this.E) {
            return;
        }
        mr9.x();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        i();
        Charset charset = kfk.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            Charset charset = kfk.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }
}
