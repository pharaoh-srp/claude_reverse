package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bz4 {
    public final String a;
    public final List b;
    public final boolean c;
    public final String d;

    public bz4(String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = str2;
    }

    public static bz4 a(bz4 bz4Var, String str, List list, boolean z, String str2, int i) {
        if ((i & 1) != 0) {
            str = bz4Var.a;
        }
        if ((i & 2) != 0) {
            list = bz4Var.b;
        }
        if ((i & 4) != 0) {
            z = bz4Var.c;
        }
        if ((i & 8) != 0) {
            str2 = bz4Var.d;
        }
        bz4Var.getClass();
        str.getClass();
        list.getClass();
        return new bz4(str, str2, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz4)) {
            return false;
        }
        bz4 bz4Var = (bz4) obj;
        return x44.r(this.a, bz4Var.a) && x44.r(this.b, bz4Var.b) && this.c == bz4Var.c && x44.r(this.d, bz4Var.d);
    }

    public final int hashCode() {
        int iP = fsh.p(kgh.m(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iP + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ConwaySearchState(query=" + this.a + ", results=" + this.b + ", isLoading=" + this.c + ", error=" + this.d + ")";
    }

    public /* synthetic */ bz4() {
        this("", null, lm6.E, false);
    }
}
