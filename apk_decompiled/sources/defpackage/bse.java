package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class bse implements Comparator {
    public static final bse E = new bse();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return cyb.E;
    }
}
