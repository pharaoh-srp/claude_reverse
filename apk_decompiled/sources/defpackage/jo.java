package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jo implements so {
    public final List a;

    public jo(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jo) && x44.r(this.a, ((jo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ebh.n("HistoryPrepend(messages=", ")", this.a);
    }
}
