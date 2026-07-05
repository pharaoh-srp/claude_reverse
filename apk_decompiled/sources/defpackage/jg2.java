package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class jg2 {
    public static final jg2 c = new jg2(w44.t1(new ArrayList()), null);
    public final Set a;
    public final zh4 b;

    public jg2(Set set, zh4 zh4Var) {
        this.a = set;
        this.b = zh4Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jg2)) {
            return false;
        }
        jg2 jg2Var = (jg2) obj;
        return jg2Var.a.equals(this.a) && x44.r(jg2Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        zh4 zh4Var = this.b;
        return iHashCode + (zh4Var != null ? zh4Var.hashCode() : 0);
    }
}
