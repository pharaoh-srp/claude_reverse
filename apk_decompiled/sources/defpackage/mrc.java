package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class mrc extends zh4 {
    public final /* synthetic */ int r;
    public final /* synthetic */ zh4 s;

    public /* synthetic */ mrc(zh4 zh4Var, int i) {
        this.r = i;
        this.s = zh4Var;
    }

    @Override // defpackage.zh4
    public final void j(zie zieVar, Object obj) {
        int i = this.r;
        zh4 zh4Var = this.s;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        zh4Var.j(zieVar, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        zh4Var.j(zieVar, Array.get(obj, i2));
                    }
                    break;
                }
                break;
        }
    }
}
