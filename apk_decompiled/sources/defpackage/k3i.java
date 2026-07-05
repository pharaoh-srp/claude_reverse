package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class k3i implements kje {
    public static final byte[] b;
    public final h99 a;

    static {
        byte[] bytes = "\n".getBytes(dj2.a);
        bytes.getClass();
        b = bytes;
    }

    public k3i(h99 h99Var) {
        h99Var.getClass();
        this.a = h99Var;
    }

    @Override // defpackage.kje
    public final lie a(lj5 lj5Var, fje fjeVar, List list) {
        lj5Var.getClass();
        list.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        String strO = kgh.o(lj5Var.a.F, "/api/v2/spans");
        Map mapH0 = sta.h0(new cpc("DD-API-KEY", lj5Var.b), new cpc("DD-EVP-ORIGIN", lj5Var.h), new cpc("DD-EVP-ORIGIN-VERSION", lj5Var.i), new cpc("DD-REQUEST-ID", string));
        List list2 = list;
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((x1e) it.next()).a);
        }
        return new lie(string, "Traces Request", strO, mapH0, nai.Q(arrayList, b, this.a), "text/plain;charset=UTF-8");
    }
}
