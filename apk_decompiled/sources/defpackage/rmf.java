package defpackage;

import io.sentry.g;
import io.sentry.h1;
import io.sentry.t4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rmf extends rok {
    @Override // defpackage.rok
    public final void n0(k3a k3aVar, String str) {
        int iOrdinal = k3aVar.ordinal();
        if (iOrdinal == 0) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                zfa.a.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "Koin", str);
                }
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList2) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList2.add(obj2);
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                zfa.a.getClass();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((n30) ((zfa) it2.next())).b(sfa.INFO, "Koin", str);
                }
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                ij0.y(str, null, false, 3);
                return;
            } else {
                if (iOrdinal == 4) {
                    return;
                }
                mr9.b();
                return;
            }
        }
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList3 = yfa.b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : copyOnWriteArrayList3) {
                ((n30) ((zfa) obj3)).getClass();
                arrayList3.add(obj3);
            }
            if (!arrayList3.isEmpty()) {
                zfa.a.getClass();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ((n30) ((zfa) it3.next())).b(sfa.WARN, "Koin", str);
                }
            }
        }
        if (isg.q0(str, "(+) override index ", false)) {
            return;
        }
        h1 h1VarG = t4.g();
        h1VarG.getClass();
        g gVar = new g();
        gVar.H = str;
        gVar.K = "Koin";
        h1VarG.m(gVar);
    }
}
