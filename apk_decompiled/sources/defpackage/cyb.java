package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class cyb implements Comparator {
    public static final cyb E = new cyb();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return bse.E;
    }
}
