package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v8a extends a9a {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j, Object obj, int i) {
        List list = (List) wgi.c.i(j, obj);
        if (list.isEmpty()) {
            List m1aVar = list instanceof s1a ? new m1a(i) : ((list instanceof nfd) && (list instanceof r3)) ? ((r3) list).b(i) : new ArrayList(i);
            wgi.o(j, obj, m1aVar);
            return m1aVar;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            wgi.o(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof hfi) {
            hfi hfiVar = (hfi) list;
            m1a m1aVar2 = new m1a(hfiVar.size() + i);
            m1aVar2.addAll(hfiVar);
            wgi.o(j, obj, m1aVar2);
            return m1aVar2;
        }
        if ((list instanceof nfd) && (list instanceof r3)) {
            r3 r3Var = (r3) list;
            if (!r3Var.E) {
                r3 r3VarB = r3Var.b(list.size() + i);
                wgi.o(j, obj, r3VarB);
                return r3VarB;
            }
        }
        return list;
    }

    @Override // defpackage.a9a
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) wgi.c.i(j, obj);
        if (list instanceof s1a) {
            objUnmodifiableList = ((s1a) list).i();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof nfd) && (list instanceof r3)) {
                r3 r3Var = (r3) list;
                if (r3Var.E) {
                    r3Var.E = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        wgi.o(j, obj, objUnmodifiableList);
    }

    @Override // defpackage.a9a
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) wgi.c.i(j, obj2);
        List listD = d(j, obj, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        wgi.o(j, obj, list);
    }

    @Override // defpackage.a9a
    public final List c(long j, Object obj) {
        return d(j, obj, 10);
    }
}
