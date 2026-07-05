package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a54 extends z44 {
    public static void r0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void s0(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
