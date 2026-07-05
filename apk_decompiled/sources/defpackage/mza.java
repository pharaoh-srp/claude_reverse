package defpackage;

import android.content.MutableContextWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class mza implements v86 {
    public final /* synthetic */ m4a a;
    public final /* synthetic */ pm3 b;
    public final /* synthetic */ vza c;
    public final /* synthetic */ fj0 d;
    public final /* synthetic */ vya e;

    public mza(m4a m4aVar, pm3 pm3Var, vza vzaVar, fj0 fj0Var, vya vyaVar) {
        this.a = m4aVar;
        this.b = pm3Var;
        this.c = vzaVar;
        this.d = fj0Var;
        this.e = vyaVar;
    }

    @Override // defpackage.v86
    public final void a() {
        this.a.a().c(this.b);
        vza vzaVar = this.c;
        aya ayaVar = vzaVar.a;
        boolean zD = vzaVar.d();
        sfa sfaVar = sfa.INFO;
        if (zD) {
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
                    ((n30) ((zfa) it.next())).b(sfaVar, "McpAppViewHost", "onDispose - skipping release (fullscreen owns)");
                }
                return;
            }
            return;
        }
        if (((Boolean) vzaVar.h.getValue()).booleanValue()) {
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
                    ((n30) ((zfa) it2.next())).b(sfaVar, "McpAppViewHost", "onDispose - skipping release (holder destroyed)");
                }
                return;
            }
            return;
        }
        if (ayaVar.a().getParent() != null) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList3 = yfa.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : copyOnWriteArrayList3) {
                    ((n30) ((zfa) obj3)).getClass();
                    arrayList3.add(obj3);
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                zfa.a.getClass();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ((n30) ((zfa) it3.next())).b(sfaVar, "McpAppViewHost", "onDispose - skipping release (re-attached elsewhere)");
                }
                return;
            }
            return;
        }
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList4 = yfa.b;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : copyOnWriteArrayList4) {
                ((n30) ((zfa) obj4)).getClass();
                arrayList4.add(obj4);
            }
            if (!arrayList4.isEmpty()) {
                zfa.a.getClass();
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    ((n30) ((zfa) it4.next())).b(sfaVar, "McpAppViewHost", "onDispose - pausing retained WebView");
                }
            }
        }
        ayaVar.onPause();
        MutableContextWrapper mutableContextWrapper = vzaVar.b;
        mutableContextWrapper.setBaseContext(mutableContextWrapper.getApplicationContext());
        this.d.A(this.e.a);
    }
}
