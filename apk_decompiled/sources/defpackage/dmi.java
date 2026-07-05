package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: classes.dex */
public final class dmi implements f89 {
    public final fk0 E;
    public sb5 F;
    public Boolean G;

    public dmi(nb5 nb5Var, fk0 fk0Var) {
        this.E = fk0Var;
        hfh hfhVar = new hfh(8, this);
        CronetEngine cronetEngine = nb5Var.f;
        if (cronetEngine != null) {
            hfhVar.invoke(cronetEngine);
        } else {
            nb5Var.g = hfhVar;
        }
    }

    @Override // defpackage.f89
    public final pqe c(v4e v4eVar) throws Exception {
        kie kieVar = v4eVar.e;
        lsc lscVar = this.E.f;
        sb5 sb5Var = x44.r(this.G, Boolean.TRUE) ? null : this.F;
        String str = sb5Var != null ? "Cronet" : "OkHttp";
        if (((Boolean) lscVar.getValue()).booleanValue()) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(this);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String str2 = "Using " + str + " for request: " + kieVar.a;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.DEBUG, strE, str2);
                    }
                }
            }
        }
        try {
            return sb5Var != null ? sb5Var.c(v4eVar) : v4eVar.b(kieVar);
        } catch (Exception e) {
            if (((Boolean) lscVar.getValue()).booleanValue()) {
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE2 = iuj.E(this);
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList2.add(obj2);
                    }
                    if (!arrayList2.isEmpty()) {
                        zfa.a.getClass();
                        String str3 = "Request failed using " + str + ": " + kieVar.a + ": " + gsk.c(e);
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfa.ERROR, strE2, str3);
                        }
                    }
                }
            }
            throw e;
        }
    }
}
