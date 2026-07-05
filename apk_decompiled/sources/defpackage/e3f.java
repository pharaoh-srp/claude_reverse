package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e3f implements Map.Entry {
    public final Object E;
    public final Object F;
    public e3f G;
    public e3f H;

    public e3f(Object obj, Object obj2) {
        this.E = obj;
        this.F = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e3f)) {
            return false;
        }
        e3f e3fVar = (e3f) obj;
        return this.E.equals(e3fVar.E) && this.F.equals(e3fVar.F);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.E;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.F;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.F.hashCode() ^ this.E.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.E + "=" + this.F;
    }
}
