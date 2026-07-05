package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class t5a {
    public final ArrayList a = new ArrayList();

    public final void a(Collection collection, Collection collection2) {
        Collection collection3 = collection;
        Collection collection4 = collection2;
        Iterator it = collection3.iterator();
        Iterator it2 = collection4.iterator();
        ArrayList arrayList = new ArrayList(Math.min(x44.y(collection3, 10), x44.y(collection4, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new u5a((Number) it.next(), (Number) it2.next()));
        }
        this.a.add(arrayList);
    }
}
