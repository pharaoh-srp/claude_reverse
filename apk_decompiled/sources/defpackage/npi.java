package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class npi implements GenericArrayType {
    public final Type E;

    public npi(Type type) {
        this.E = spi.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && wwk.f(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.E;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return spi.n(this.E) + "[]";
    }
}
