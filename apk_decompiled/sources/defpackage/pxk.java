package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class pxk implements uxk {
    public final ArrayList a;

    public pxk(Context context, axk axkVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new fyk(context, axkVar));
    }

    @Override // defpackage.uxk
    public final void a(dke dkeVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((uxk) it.next()).a(dkeVar);
        }
    }
}
