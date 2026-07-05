package defpackage;

import com.google.gson.stream.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dgg {
    public static final dgg b = new dgg(Collections.EMPTY_LIST);
    public static final zp3 c = new zp3(23);
    public final List a;

    public dgg(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    public static List a(JsonReader jsonReader) {
        ArrayList arrayList = v40.I(jsonReader).e().E;
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < arrayList.size(); i++) {
            linkedList.add(cgg.b(h2f.a(((bh9) arrayList.get(i)).g())));
        }
        return linkedList;
    }

    public static dgg b(List list) {
        dgg dggVar = b;
        if (list == null || list.isEmpty()) {
            return dggVar;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cgg cggVar = (cgg) it.next();
            if (cggVar != null) {
                arrayList.add(cggVar);
            }
        }
        return arrayList.isEmpty() ? dggVar : new dgg(arrayList);
    }
}
