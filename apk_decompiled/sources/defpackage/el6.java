package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class el6 implements Runnable {
    public final ArrayList E;
    public final int F;

    public el6(List list, int i, Throwable th) {
        knk.q("initCallbacks cannot be null", list);
        this.E = new ArrayList(list);
        this.F = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i = 0;
        if (this.F != 1) {
            while (i < size) {
                ((dl6) arrayList.get(i)).a();
                i++;
            }
        } else {
            while (i < size) {
                ((dl6) arrayList.get(i)).b();
                i++;
            }
        }
    }
}
