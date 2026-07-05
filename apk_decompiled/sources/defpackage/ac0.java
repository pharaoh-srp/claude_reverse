package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ac0 {
    public static final zb0 a = new zb0("");

    public static final List a(zb0 zb0Var, int i, int i2, b8 b8Var) {
        List list;
        if (i == i2 || (list = zb0Var.E) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= zb0Var.F.length()) {
            if (b8Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) b8Var.invoke(((yb0) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            yb0 yb0Var = (yb0) list.get(i3);
            if (b8Var != null ? ((Boolean) b8Var.invoke(yb0Var.a)).booleanValue() : true) {
                int i4 = yb0Var.b;
                int i5 = yb0Var.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new yb0(wd6.e0(yb0Var.b, i, i2) - i, wd6.e0(i5, i, i2) - i, (vb0) yb0Var.a, yb0Var.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
