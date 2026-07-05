package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends TimerTask {
    public final /* synthetic */ ArrayList E;
    public final /* synthetic */ u F;

    public s(u uVar, ArrayList arrayList) {
        this.F = uVar;
        this.E = arrayList;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        u uVar = this.F;
        if (jCurrentTimeMillis - uVar.i <= 10) {
            return;
        }
        ArrayList arrayList = this.E;
        arrayList.clear();
        uVar.i = jCurrentTimeMillis;
        s3 s3Var = new s3(uVar.g.getDateProvider().c().d());
        Iterator it = uVar.d.iterator();
        while (it.hasNext()) {
            ((d1) it.next()).a(s3Var);
        }
        for (t tVar : uVar.c.values()) {
            ArrayList arrayList2 = tVar.a;
            r1 r1Var = tVar.b;
            arrayList2.add(s3Var);
            if (r1Var != null && tVar.d.g.getDateProvider().c().d() > tVar.c + 30000000000L) {
                arrayList.add(r1Var);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            uVar.f((r1) it2.next());
        }
    }
}
