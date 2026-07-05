package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bf3 {
    public final ie3 a;
    public final List b;
    public final r48 c;

    public bf3(ie3 ie3Var, List list) {
        ie3Var.getClass();
        this.a = ie3Var;
        this.b = list;
        this.c = new r48(list.size() + 1, new a2(10, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf3)) {
            return false;
        }
        bf3 bf3Var = (bf3) obj;
        return x44.r(this.a, bf3Var.a) && this.b.equals(bf3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChildStack(active=" + this.a + ", backStack=" + this.b + ')';
    }
}
