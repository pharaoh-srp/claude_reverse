package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k81 extends jh1 {
    public final ArrayList a;

    public k81(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jh1)) {
            return false;
        }
        return this.a.equals(((k81) ((jh1) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
