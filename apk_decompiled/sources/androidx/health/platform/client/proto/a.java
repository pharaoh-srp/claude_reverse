package androidx.health.platform.client.proto;

import defpackage.d7f;
import defpackage.lfd;
import defpackage.mr9;
import defpackage.s89;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    protected int memoizedHashCode;

    public static void a(ArrayList arrayList, List list) {
        Charset charset = s89.a;
        if (arrayList instanceof lfd) {
            list.addAll(arrayList);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        for (Object obj : arrayList) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                for (int size2 = list.size() - 1; size2 >= size; size2--) {
                    list.remove(size2);
                }
                mr9.h(str);
                return;
            }
            list.add(obj);
        }
    }

    public abstract int b(d7f d7fVar);

    public abstract void c(b bVar);
}
