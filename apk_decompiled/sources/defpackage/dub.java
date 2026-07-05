package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes3.dex */
public final class dub extends d3 implements Serializable {
    public transient Map H;
    public transient int I;
    public transient cub J;

    @Override // defpackage.d3
    public final Map b() {
        Map map = this.H;
        return map instanceof NavigableMap ? new r2(this, (NavigableMap) map) : map instanceof SortedMap ? new u2(this, (SortedMap) map) : new p2(this, map);
    }

    @Override // defpackage.d3
    public final Set c() {
        Map map = this.H;
        return map instanceof NavigableMap ? new s2(this, (NavigableMap) map) : map instanceof SortedMap ? new v2(this, (SortedMap) map) : new q2(this, map);
    }

    public final void d() {
        Map map = this.H;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.I = 0;
    }
}
