package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class w1k extends z1k implements Serializable {
    public static final w1k F = new w1k(0);
    public static final w1k G = new w1k(1);
    public final /* synthetic */ int E;

    public /* synthetic */ w1k(int i) {
        this.E = i;
    }

    @Override // defpackage.z1k
    public final z1k a() {
        switch (this.E) {
            case 0:
                return G;
            default:
                return F;
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.E) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
