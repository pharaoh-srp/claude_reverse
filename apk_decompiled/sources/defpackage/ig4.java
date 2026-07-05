package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ig4 implements gbd {
    public final ArrayList a;

    public ig4(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.gbd
    public final boolean test(Object obj) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((gbd) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
