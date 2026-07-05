package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nd0 extends ctk {
    public final Map b;
    public final g11 c = new g11(512, 2);
    public final ive d = new ive(6, this);

    public nd0(LinkedHashMap linkedHashMap) {
        this.b = linkedHashMap;
        ArrayList arrayList = new ArrayList(linkedHashMap.keySet().size());
        for (String str : linkedHashMap.keySet()) {
            if (str.indexOf(42) == -1 && str.indexOf(63) == -1) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.b.remove((String) it.next());
        }
    }

    public final String k(String str) {
        return (String) this.c.j(str, this.d);
    }
}
