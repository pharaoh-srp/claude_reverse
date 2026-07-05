package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wif extends rkk {
    public volatile boolean b;
    public volatile boolean c;

    @Override // defpackage.rkk
    public void j(y6j y6jVar, int i, String str) {
        y6jVar.getClass();
        str.getClass();
        if (i != 1000 && i != 1001) {
            sfa sfaVar = sfa.ERROR;
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
                    String str2 = "WebSocket closed with code " + i + ": " + str;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfaVar, "SelfClosingWebSocketListener", str2);
                    }
                }
            }
        }
        ((p5e) y6jVar).a();
        this.c = true;
    }

    @Override // defpackage.rkk
    public void k(y6j y6jVar, int i, String str) {
        this.b = true;
        ((p5e) y6jVar).c(i, str);
    }

    @Override // defpackage.rkk
    public void l(y6j y6jVar, Exception exc, pqe pqeVar) {
        y6jVar.getClass();
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
            String str = "WebSocket onFailure: " + pqeVar + ": " + gsk.c(exc);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.ERROR, "SelfClosingWebSocketListener", str);
            }
        }
    }
}
