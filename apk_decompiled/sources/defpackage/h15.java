package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h15 {
    public final String a;
    public final List b;

    public h15(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h15)) {
            return false;
        }
        h15 h15Var = (h15) obj;
        return this.a.equals(h15Var.a) && x44.r(this.b, h15Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return y6a.o("Scalar(type=", this.a, ", enumValues=", this.b, ")");
    }
}
