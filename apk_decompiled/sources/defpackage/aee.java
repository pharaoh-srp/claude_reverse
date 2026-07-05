package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes3.dex */
public final class aee implements Map, Serializable {
    public static final aee K = new aee(0, null, new Object[0]);
    public transient xde E;
    public transient yde F;
    public transient zde G;
    public final transient Object H;
    public final transient Object[] I;
    public final transient int J;

    public aee(int i, Object obj, Object[] objArr) {
        this.H = obj;
        this.I = objArr;
        this.J = i;
    }

    public static aee a(Map map) {
        if ((map instanceof aee) && !(map instanceof SortedMap)) {
            return (aee) map;
        }
        Set setEntrySet = map.entrySet();
        s20 s20Var = new s20(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        s20Var.m(setEntrySet);
        return s20Var.d(true);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final qz8 entrySet() {
        xde xdeVar = this.E;
        if (xdeVar != null) {
            return xdeVar;
        }
        xde xdeVar2 = new xde(this, this.I, this.J);
        this.E = xdeVar2;
        return xdeVar2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final qz8 keySet() {
        yde ydeVar = this.F;
        if (ydeVar != null) {
            return ydeVar;
        }
        yde ydeVar2 = new yde(this, new zde(this.I, 0, this.J));
        this.F = ydeVar2;
        return ydeVar2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final cz8 values() {
        zde zdeVar = this.G;
        if (zdeVar != null) {
            return zdeVar;
        }
        zde zdeVar2 = new zde(this.I, 1, this.J);
        this.G = zdeVar2;
        return zdeVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return dlk.k(obj, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0037->B:22:0x004d], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0062->B:32:0x0079], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0088->B:43:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L6
        L3:
            r7 = r0
            goto L9c
        L6:
            java.lang.Object[] r1 = r7.I
            int r2 = r7.J
            r3 = 1
            if (r2 != r3) goto L20
            r7 = 0
            r7 = r1[r7]
            java.util.Objects.requireNonNull(r7)
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L3
            r7 = r1[r3]
            java.util.Objects.requireNonNull(r7)
            goto L9c
        L20:
            java.lang.Object r7 = r7.H
            if (r7 != 0) goto L25
            goto L3
        L25:
            boolean r2 = r7 instanceof byte[]
            if (r2 == 0) goto L50
            r2 = r7
            byte[] r2 = (byte[]) r2
            int r7 = r2.length
            int r4 = r7 + (-1)
            int r7 = r8.hashCode()
            int r7 = defpackage.bsk.h(r7)
        L37:
            r7 = r7 & r4
            r5 = r2[r7]
            r6 = 255(0xff, float:3.57E-43)
            r5 = r5 & r6
            if (r5 != r6) goto L40
            goto L3
        L40:
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L4d
            r7 = r5 ^ 1
            r7 = r1[r7]
            goto L9c
        L4d:
            int r7 = r7 + 1
            goto L37
        L50:
            boolean r2 = r7 instanceof short[]
            if (r2 == 0) goto L7c
            r2 = r7
            short[] r2 = (short[]) r2
            int r7 = r2.length
            int r4 = r7 + (-1)
            int r7 = r8.hashCode()
            int r7 = defpackage.bsk.h(r7)
        L62:
            r7 = r7 & r4
            short r5 = r2[r7]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            if (r5 != r6) goto L6c
            goto L3
        L6c:
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L79
            r7 = r5 ^ 1
            r7 = r1[r7]
            goto L9c
        L79:
            int r7 = r7 + 1
            goto L62
        L7c:
            int[] r7 = (int[]) r7
            int r2 = r7.length
            int r2 = r2 - r3
            int r4 = r8.hashCode()
            int r4 = defpackage.bsk.h(r4)
        L88:
            r4 = r4 & r2
            r5 = r7[r4]
            r6 = -1
            if (r5 != r6) goto L90
            goto L3
        L90:
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto La0
            r7 = r5 ^ 1
            r7 = r1[r7]
        L9c:
            if (r7 != 0) goto L9f
            return r0
        L9f:
            return r7
        La0:
            int r4 = r4 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aee.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return uj5.k(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.J;
    }

    public final String toString() {
        int i = this.J;
        fok.c(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        efi it = ((xde) entrySet()).iterator();
        boolean z = true;
        while (true) {
            iz8 iz8Var = (iz8) it;
            if (!iz8Var.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) iz8Var.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }
}
