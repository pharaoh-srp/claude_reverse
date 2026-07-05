package io.sentry.cache.tape;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Iterable, Closeable {
    public void clear() {
        x0(size());
    }

    public abstract void e(Object obj);

    public final List l0() {
        int iMin = Math.min(size(), size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator it = iterator();
        for (int i = 0; i < iMin; i++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public abstract int size();

    public abstract void x0(int i);
}
