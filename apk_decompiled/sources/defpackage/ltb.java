package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ltb {
    default int a(xa9 xa9Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ur5((h5b) list2.get(i3), ya9.F, eb9.E, 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new mb9(xa9Var, xa9Var.getLayoutDirection()), arrayList2, sl4.b(0, 0, 0, i, 7)).b();
    }

    p5b b(q5b q5bVar, List list, long j);

    default int c(xa9 xa9Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ur5((h5b) list2.get(i3), ya9.E, eb9.E, 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new mb9(xa9Var, xa9Var.getLayoutDirection()), arrayList2, sl4.b(0, 0, 0, i, 7)).b();
    }

    default int d(xa9 xa9Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ur5((h5b) list2.get(i3), ya9.F, eb9.F, 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new mb9(xa9Var, xa9Var.getLayoutDirection()), arrayList2, sl4.b(0, i, 0, 0, 13)).a();
    }

    default int e(xa9 xa9Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ur5((h5b) list2.get(i3), ya9.E, eb9.F, 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new mb9(xa9Var, xa9Var.getLayoutDirection()), arrayList2, sl4.b(0, i, 0, 0, 13)).a();
    }
}
