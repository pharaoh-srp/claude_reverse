package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v48 {
    public final List a;

    public v48(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v48) && this.a.equals(((v48) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ebh.n("GitDiff(files=", ")", this.a);
    }
}
