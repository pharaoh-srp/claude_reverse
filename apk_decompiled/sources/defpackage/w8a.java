package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w8a extends z8a {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j, Object obj, int i) {
        List list = (List) vgi.c.i(j, obj);
        if (list.isEmpty()) {
            List o1aVar = list instanceof r1a ? new o1a(i) : ((list instanceof mfd) && (list instanceof p89)) ? ((p89) list).j(i) : new ArrayList(i);
            vgi.p(j, obj, o1aVar);
            return o1aVar;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            vgi.p(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof jfi) {
            jfi jfiVar = (jfi) list;
            o1a o1aVar2 = new o1a(jfiVar.E.size() + i);
            o1aVar2.addAll(jfiVar);
            vgi.p(j, obj, o1aVar2);
            return o1aVar2;
        }
        if ((list instanceof mfd) && (list instanceof p89)) {
            p89 p89Var = (p89) list;
            if (!((q3) p89Var).E) {
                p89 p89VarJ = p89Var.j(list.size() + i);
                vgi.p(j, obj, p89VarJ);
                return p89VarJ;
            }
        }
        return list;
    }

    @Override // defpackage.z8a
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) vgi.c.i(j, obj);
        if (list instanceof r1a) {
            objUnmodifiableList = ((r1a) list).i();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof mfd) && (list instanceof p89)) {
                q3 q3Var = (q3) ((p89) list);
                if (q3Var.E) {
                    q3Var.E = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        vgi.p(j, obj, objUnmodifiableList);
    }

    @Override // defpackage.z8a
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) vgi.c.i(j, obj2);
        List listD = d(j, obj, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        vgi.p(j, obj, list);
    }

    @Override // defpackage.z8a
    public final List c(long j, Object obj) {
        return d(j, obj, 10);
    }
}
