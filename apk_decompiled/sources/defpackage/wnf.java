package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class wnf {
    public final Class a;
    public final n22 b;

    public wnf(Class cls, n22 n22Var) {
        this.a = cls;
        this.b = n22Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wnf)) {
            return false;
        }
        wnf wnfVar = (wnf) obj;
        return wnfVar.a.equals(this.a) && wnfVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + ", object identifier: " + this.b;
    }
}
