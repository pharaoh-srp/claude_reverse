package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Collection F;

    public /* synthetic */ j3(int i, Collection collection) {
        this.E = i;
        this.F = collection;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        boolean zContains;
        int i = this.E;
        Collection<?> collection = this.F;
        switch (i) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            case 2:
                zContains = collection.contains(obj);
                break;
            case 3:
                zContains = ((List) obj).retainAll(collection);
                break;
            default:
                zContains = ((Set) obj).retainAll(w44.t1(collection));
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
