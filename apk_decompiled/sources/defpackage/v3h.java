package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v3h {
    public final List a;

    public v3h(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3h) && this.a.equals(((v3h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ebh.n("TableRow(cells=", ")", this.a);
    }
}
