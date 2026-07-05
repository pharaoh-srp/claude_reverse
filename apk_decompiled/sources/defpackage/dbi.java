package defpackage;

import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dbi {
    public final Class a;
    public final Type b;
    public final int c;

    public dbi(Type type) {
        Objects.requireNonNull(type);
        Type typeJ = yb5.j(type);
        this.b = typeJ;
        this.a = yb5.u(typeJ);
        this.c = typeJ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dbi) {
            return yb5.p(this.b, ((dbi) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return yb5.R(this.b);
    }
}
