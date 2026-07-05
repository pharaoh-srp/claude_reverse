package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xnf {
    public final Class a;
    public final Class b;

    public xnf(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xnf)) {
            return false;
        }
        xnf xnfVar = (xnf) obj;
        return xnfVar.a.equals(this.a) && xnfVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
    }
}
