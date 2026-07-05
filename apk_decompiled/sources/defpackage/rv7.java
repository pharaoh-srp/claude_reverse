package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rv7 implements sv7 {
    public final List a;

    public rv7(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv7) && x44.r(this.a, ((rv7) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ebh.n("Working(loadingMessages=", ")", this.a);
    }
}
