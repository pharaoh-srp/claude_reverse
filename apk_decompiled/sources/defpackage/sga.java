package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sga implements fch {
    @Override // defpackage.fch
    public final void e(String str, String str2, Map map) {
        str2.getClass();
        map.getClass();
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
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
            if (!map.isEmpty()) {
                str = str + ": " + map;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.INFO, strE, str);
            }
        }
    }

    @Override // defpackage.fch
    public final void h(Throwable th, Throwable th2, String str, ozf ozfVar, Map map) {
        th.getClass();
        sfa sfaVarF = yhk.f(ozfVar);
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                if (sfaVarF.E >= 2) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            zfa.a.getClass();
            if (str == null) {
                str = th.getMessage();
            }
            String strC = ij0.C(str, ": ", gsk.c(th));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfaVarF, strE, strC);
            }
        }
    }
}
