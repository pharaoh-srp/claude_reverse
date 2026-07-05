package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zdi {
    public final int a;
    public final kdg b;
    public final kdg c;

    public zdi(List list, List list2, int i) {
        this.a = i;
        if (!(i >= 0)) {
            e39.a("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i)) {
            e39.a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        kdg kdgVar = new kdg();
        kdgVar.addAll(list);
        this.b = kdgVar;
        kdg kdgVar2 = new kdg();
        kdgVar2.addAll(list2);
        this.c = kdgVar2;
    }
}
