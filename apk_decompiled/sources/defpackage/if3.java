package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class if3 implements y59 {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.y59
    public final void onDestroy() {
        ArrayList arrayList = this.a;
        Iterator it = w44.p1(arrayList).iterator();
        while (it.hasNext()) {
            kd4 kd4VarB = ((qe3) it.next()).b();
            if (kd4VarB != null) {
                kd4VarB.a();
            }
        }
        arrayList.clear();
    }
}
