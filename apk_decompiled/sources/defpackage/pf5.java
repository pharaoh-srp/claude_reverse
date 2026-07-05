package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class pf5 {
    public static final pf5 b;
    public final HashMap a;

    static {
        pf5 pf5Var = new pf5(new LinkedHashMap());
        rvk.o(pf5Var);
        b = pf5Var;
    }

    public pf5(pf5 pf5Var) {
        pf5Var.getClass();
        this.a = new HashMap(pf5Var.a);
    }

    public final boolean a() {
        Object obj = Boolean.TRUE;
        Object obj2 = this.a.get("retryable");
        if (obj2 instanceof Boolean) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final int b(String str, int i) {
        Object objValueOf = Integer.valueOf(i);
        Object obj = this.a.get(str);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    public final String c(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean d(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L5
            goto L66
        L5:
            r1 = 0
            if (r8 == 0) goto L67
            java.lang.Class<pf5> r2 = defpackage.pf5.class
            java.lang.Class r3 = r8.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L15
            goto L67
        L15:
            pf5 r8 = (defpackage.pf5) r8
            java.util.HashMap r8 = r8.a
            java.util.HashMap r7 = r7.a
            java.util.Set r2 = r7.keySet()
            java.util.Set r3 = r8.keySet()
            boolean r3 = defpackage.x44.r(r2, r3)
            if (r3 != 0) goto L2a
            goto L67
        L2a:
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.get(r3)
            java.lang.Object r3 = r8.get(r3)
            if (r4 == 0) goto L5e
            if (r3 != 0) goto L47
            goto L5e
        L47:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L59
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L59
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = defpackage.mp0.p0(r5, r3)
            goto L63
        L59:
            boolean r3 = r4.equals(r3)
            goto L63
        L5e:
            if (r4 != r3) goto L62
            r3 = r0
            goto L63
        L62:
            r3 = r1
        L63:
            if (r3 != 0) goto L2e
            goto L67
        L66:
            return r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf5.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return ij0.m(new StringBuilder("Data {"), w44.S0(this.a.entrySet(), null, null, null, new qy4(6), 31), "}");
    }

    public pf5(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.a = new HashMap(linkedHashMap);
    }
}
