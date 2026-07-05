package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o84 {
    public static final LinkedHashSet a;

    static {
        Set<vfd> set = vfd.I;
        ArrayList arrayList = new ArrayList(x44.y(set, 10));
        for (vfd vfdVar : set) {
            vfdVar.getClass();
            arrayList.add(pkg.j.c(vfdVar.E));
        }
        ArrayList arrayListB1 = w44.b1(w44.b1(w44.b1(arrayList, okg.f.g()), okg.h.g()), okg.j.g());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListB1.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(gh3.j((ww7) it.next()));
        }
        a = linkedHashSet;
    }
}
