package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yz8 implements i25 {
    public final LinkedHashSet b = new LinkedHashSet();

    @Override // defpackage.i25
    public final void a(vs8 vs8Var, List list) {
        vs8Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new ag8((g25) it.next()));
        }
        synchronized (this.b) {
            this.b.removeAll(linkedHashSet);
            this.b.addAll(linkedHashSet);
        }
    }

    @Override // defpackage.i25
    public final List b(vs8 vs8Var) {
        vs8Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            try {
                for (ag8 ag8Var : this.b) {
                    if (ag8Var.a.c < System.currentTimeMillis()) {
                        linkedHashSet.add(ag8Var);
                    } else if (ag8Var.a(vs8Var)) {
                        arrayList.add(ag8Var.a);
                    }
                }
                this.b.removeAll(linkedHashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final void c(Collection collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new ag8((g25) it.next()));
        }
        synchronized (this.b) {
            this.b.removeAll(linkedHashSet);
            this.b.addAll(linkedHashSet);
        }
    }

    public final List d() {
        ArrayList arrayList;
        synchronized (this.b) {
            LinkedHashSet linkedHashSet = this.b;
            arrayList = new ArrayList(x44.y(linkedHashSet, 10));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((ag8) it.next()).a);
            }
        }
        return arrayList;
    }
}
