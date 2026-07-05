package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j3i {
    public static final j3i b = new j3i(Collections.EMPTY_LIST);
    public static final zp3 c = new zp3(23);
    public final List a;

    public j3i(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    public static j3i a(String str) {
        List<i3i> list;
        j3i j3iVar = b;
        try {
            ArrayList arrayList = v40.J(str).e().E;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                LinkedList linkedList = new LinkedList();
                for (int i = 0; i < arrayList.size(); i++) {
                    linkedList.add(i3i.b(jud.a(((bh9) arrayList.get(i)).g())));
                }
                list = linkedList;
            }
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(list.size());
                for (i3i i3iVar : list) {
                    if (i3iVar != null) {
                        arrayList2.add(i3iVar);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    return new j3i(arrayList2);
                }
            }
            return j3iVar;
        } catch (Throwable unused) {
            c.getClass();
            return j3iVar;
        }
    }
}
