package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class x28 implements GenericArrayType, Type {
    public final Type E;

    public x28(Type type) {
        type.getClass();
        this.E = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return x44.r(this.E, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.E;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return ybi.c(this.E) + "[]";
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
