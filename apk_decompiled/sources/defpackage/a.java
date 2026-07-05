package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements GenericArrayType, Serializable {
    public final Type E;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.E = yb5.j(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && yb5.p(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.E;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return yb5.R(this.E) + "[]";
    }
}
