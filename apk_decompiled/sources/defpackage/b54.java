package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class b54 extends a54 {
    public static Object A0(AbstractList abstractList) {
        abstractList.getClass();
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }

    public static void t0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void u0(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        collection.addAll(listAsList);
    }

    public static final boolean v0(Iterable iterable, bz7 bz7Var, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) bz7Var.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean w0(bz7 bz7Var, List list) {
        int i;
        list.getClass();
        bz7Var.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof mm9) && !(list instanceof nm9)) {
                nai.b0("kotlin.collections.MutableIterable", list);
                throw null;
            }
            try {
                return v0(list, bz7Var, true);
            } catch (ClassCastException e) {
                x44.k0(e, nai.class.getName());
                throw e;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) bz7Var.invoke(obj)).booleanValue()) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int size2 = list.size() - 1;
        if (i <= size2) {
            while (true) {
                list.remove(size2);
                if (size2 == i) {
                    break;
                }
                size2--;
            }
        }
        return true;
    }

    public static boolean x0(Iterable iterable, bz7 bz7Var) {
        iterable.getClass();
        return v0(iterable, bz7Var, true);
    }

    public static Object y0(ArrayList arrayList) {
        arrayList.getClass();
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.remove(0);
    }

    public static Object z0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        pmf.h("List is empty.");
        return null;
    }
}
