package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class wpi implements GenericArrayType {
    public final Type E;

    public wpi(Type type) {
        this.E = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && zni.v(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.E;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return zni.c0(this.E) + "[]";
    }
}
