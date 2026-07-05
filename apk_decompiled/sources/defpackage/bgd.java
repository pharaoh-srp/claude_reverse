package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class bgd {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(agd.E, 0);
        map.put(agd.F, 1);
        map.put(agd.G, 2);
        for (agd agdVar : map.keySet()) {
            a.append(((Integer) b.get(agdVar)).intValue(), agdVar);
        }
    }

    public static int a(agd agdVar) {
        Integer num = (Integer) b.get(agdVar);
        if (num != null) {
            return num.intValue();
        }
        xh6.m("PriorityMapping is missing known Priority value ", agdVar);
        return 0;
    }

    public static agd b(int i) {
        agd agdVar = (agd) a.get(i);
        if (agdVar != null) {
            return agdVar;
        }
        sz6.p(grc.p(i, "Unknown Priority for value "));
        return null;
    }
}
