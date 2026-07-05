package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface o5b {
    default int a(xa9 xa9Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new ur5((h5b) list.get(i3), ya9.F, eb9.E, i2));
        }
        return b(new mb9(xa9Var, xa9Var.getLayoutDirection()), arrayList, sl4.b(0, 0, 0, i, 7)).b();
    }

    p5b b(q5b q5bVar, List list, long j);

    default int c(xa9 xa9Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new ur5((h5b) list.get(i3), ya9.E, eb9.E, i2));
        }
        return b(new mb9(xa9Var, xa9Var.getLayoutDirection()), arrayList, sl4.b(0, 0, 0, i, 7)).b();
    }

    default int d(xa9 xa9Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new ur5((h5b) list.get(i3), ya9.F, eb9.F, i2));
        }
        return b(new mb9(xa9Var, xa9Var.getLayoutDirection()), arrayList, sl4.b(0, i, 0, 0, 13)).a();
    }

    default int e(xa9 xa9Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new ur5((h5b) list.get(i3), ya9.E, eb9.F, i2));
        }
        return b(new mb9(xa9Var, xa9Var.getLayoutDirection()), arrayList, sl4.b(0, i, 0, 0, 13)).a();
    }
}
