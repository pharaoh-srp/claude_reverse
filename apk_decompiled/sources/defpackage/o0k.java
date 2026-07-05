package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o0k extends tzj implements NavigableMap {
    public static final o0k J;
    public final transient o2k G;
    public final transient pzj H;
    public final transient o0k I;

    static {
        o2k o2kVarU = r0k.u(w1k.F);
        fyj fyjVar = pzj.H;
        J = new o0k(o2kVarU, e2k.K, null);
    }

    public o0k(o2k o2kVar, pzj pzjVar, o0k o0kVar) {
        this.G = o2kVar;
        this.H = pzjVar;
        this.I = o0kVar;
    }

    public static o0k c(TreeMap treeMap) {
        w1k w1kVar = w1k.F;
        Comparator comparator = treeMap.comparator();
        int i = 1;
        int i2 = 0;
        boolean z = comparator == null || w1kVar == comparator;
        Collection collectionEntrySet = treeMap.entrySet();
        if (!(collectionEntrySet instanceof Collection)) {
            Iterator it = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) collectionEntrySet.toArray(tzj.F);
        int length = entryArr.length;
        if (length == 0) {
            return d(w1kVar);
        }
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i3 = 0; i3 < 1; i3++) {
                if (objArr[i3] == null) {
                    mr9.h(grc.p(i3, "at index "));
                    return null;
                }
            }
            o2k o2kVar = new o2k(pzj.q(1, objArr), w1kVar);
            Object[] objArr2 = {value};
            while (i2 < 1) {
                if (objArr2[i2] == null) {
                    mr9.h(grc.p(i2, "at index "));
                    return null;
                }
                i2++;
            }
            return new o0k(o2kVar, pzj.q(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (z) {
            while (i2 < length) {
                Map.Entry entry2 = entryArr[i2];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                fpk.i(key2, value2);
                objArr3[i2] = key2;
                objArr4[i2] = value2;
                i2++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new x8e(22));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            fpk.i(objArr3[0], value3);
            while (i < length) {
                Map.Entry entry4 = entryArr[i - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                fpk.i(key4, value4);
                objArr3[i] = key4;
                objArr4[i] = value4;
                if (w1kVar.compare(key3, key4) == 0) {
                    sz6.p(ij0.k("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                    return null;
                }
                i++;
                key3 = key4;
            }
        }
        return new o0k(new o2k(pzj.q(length, objArr3), w1kVar), pzj.q(length, objArr4), null);
    }

    public static o0k d(Comparator comparator) {
        if (w1k.F == comparator) {
            return J;
        }
        o2k o2kVarU = r0k.u(comparator);
        fyj fyjVar = pzj.H;
        return new o0k(o2kVarU, e2k.K, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.G.J;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.G.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        o0k o0kVar = this.I;
        if (o0kVar != null) {
            return o0kVar;
        }
        boolean zIsEmpty = isEmpty();
        o2k o2kVar = this.G;
        if (!zIsEmpty) {
            return new o0k((o2k) o2kVar.descendingSet(), this.H.o(), this);
        }
        Comparator comparator = o2kVar.J;
        return d((comparator instanceof z1k ? (z1k) comparator : new pxj(comparator)).a());
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final o0k headMap(Object obj, boolean z) {
        obj.getClass();
        return h(0, this.G.v(obj, z));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final o0k subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.G.J.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        sz6.p(dpk.j("expected fromKey <= toKey but %s > %s", obj, obj2));
        return null;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().q().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.G.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final o0k tailMap(Object obj, boolean z) {
        obj.getClass();
        return h(this.G.w(obj, z), this.H.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // defpackage.tzj, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            o2k r0 = r3.G
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            pzj r2 = r0.L     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.J     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r3 = 0
            return r3
        L16:
            pzj r3 = r3.H
            java.lang.Object r3 = r3.get(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0k.get(java.lang.Object):java.lang.Object");
    }

    public final o0k h(int i, int i2) {
        pzj pzjVar = this.H;
        if (i == 0) {
            if (i2 == pzjVar.size()) {
                return this;
            }
            i = 0;
        }
        o2k o2kVar = this.G;
        return i == i2 ? d(o2kVar.J) : new o0k(o2kVar.y(i, i2), pzjVar.subList(i, i2), null);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.G;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().q().get(this.H.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.G.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.G;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.H.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.H;
    }
}
