package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class qvf extends gb9 {
    public final /* synthetic */ aid c;

    public qvf(aid aidVar) {
        this.c = aidVar;
    }

    @Override // defpackage.gb9
    public final void E(m4e m4eVar) {
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "SessionWatch", "stream closed normally");
                }
            }
        }
        this.c.m(null);
    }

    @Override // defpackage.gb9
    public final void F(m4e m4eVar, String str, String str2) {
        this.c.r(new cpc(str, str2));
    }

    @Override // defpackage.gb9
    public final void G(m4e m4eVar, Exception exc, pqe pqeVar) {
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String str = "stream failure: http=" + (pqeVar != null ? Integer.valueOf(pqeVar.H) : null) + " t=" + (exc != null ? gsk.c(exc) : null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.WARN, "SessionWatch", str);
                }
            }
        }
        this.c.m(exc);
    }
}
