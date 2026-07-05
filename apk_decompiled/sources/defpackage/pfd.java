package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class pfd {
    public final Class a;
    public final Class b;

    public pfd(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pfd)) {
            return false;
        }
        pfd pfdVar = (pfd) obj;
        return pfdVar.a.equals(this.a) && pfdVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + " with primitive type: " + this.b.getSimpleName();
    }
}
