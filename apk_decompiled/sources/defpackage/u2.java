package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public class u2 extends p2 implements SortedMap {
    public SortedSet I;
    public final /* synthetic */ dub J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(dub dubVar, SortedMap sortedMap) {
        super(dubVar, sortedMap);
        this.J = dubVar;
    }

    public SortedSet c() {
        return new v2(this.J, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // defpackage.p2, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.I;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetC = c();
        this.I = sortedSetC;
        return sortedSetC;
    }

    public SortedMap e() {
        return (SortedMap) this.G;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new u2(this.J, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new u2(this.J, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new u2(this.J, e().tailMap(obj));
    }
}
