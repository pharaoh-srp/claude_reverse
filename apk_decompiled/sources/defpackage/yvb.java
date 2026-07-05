package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class yvb {
    public final LinkedHashMap a;
    public final gmf b;

    public yvb(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new gmf(z);
    }

    public final Map a() {
        cpc cpcVar;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iD0 = tta.d0(x44.y(setEntrySet, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                cpcVar = new cpc(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                cpcVar = new cpc(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(cpcVar.E, cpcVar.F);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.F).get()) {
            sz6.j("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(xbd xbdVar) {
        xbdVar.getClass();
        Object obj = this.a.get(xbdVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d(xbd xbdVar, Object obj) {
        xbdVar.getClass();
        e(xbdVar, obj);
    }

    public final void e(xbd xbdVar, Object obj) {
        xbdVar.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(xbdVar);
        } else if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(w44.t1((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(xbdVar, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(xbdVar, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(xbdVar, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.yvb
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            yvb r6 = (defpackage.yvb) r6
            java.util.LinkedHashMap r6 = r6.a
            java.util.LinkedHashMap r5 = r5.a
            r0 = 1
            if (r6 != r5) goto L10
            goto L61
        L10:
            int r2 = r6.size()
            int r3 = r5.size()
            if (r2 == r3) goto L1b
            goto L60
        L1b:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L22
            goto L61
        L22:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r5.get(r3)
            if (r3 == 0) goto L5d
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L58
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L5d
            byte[] r2 = (byte[]) r2
            byte[] r3 = (byte[]) r3
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L5d
            r2 = r0
            goto L5e
        L58:
            boolean r2 = defpackage.x44.r(r2, r3)
            goto L5e
        L5d:
            r2 = r1
        L5e:
            if (r2 != 0) goto L2a
        L60:
            return r1
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return w44.S0(this.a.entrySet(), ",\n", "{\n", "\n}", new jua(22), 24);
    }

    public /* synthetic */ yvb(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
