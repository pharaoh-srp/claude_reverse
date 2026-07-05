package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public class v2 extends q2 implements SortedSet {
    public final /* synthetic */ dub G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(dub dubVar, SortedMap sortedMap) {
        super(dubVar, sortedMap);
        this.G = dubVar;
    }

    public SortedMap a() {
        return (SortedMap) this.E;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new v2(this.G, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new v2(this.G, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new v2(this.G, a().tailMap(obj));
    }
}
