package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes3.dex */
public final class ppi implements WildcardType {
    public final Type E;
    public final Type F;

    public ppi(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            mr9.y();
            throw null;
        }
        if (typeArr.length != 1) {
            mr9.y();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            spi.b(typeArr[0]);
            this.F = null;
            this.E = spi.a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        spi.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            mr9.y();
            throw null;
        }
        this.F = spi.a(typeArr2[0]);
        this.E = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && wwk.f(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.F;
        return type != null ? new Type[]{type} : spi.b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.E};
    }

    public final int hashCode() {
        Type type = this.F;
        return (this.E.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.F;
        if (type != null) {
            return "? super " + spi.n(type);
        }
        Type type2 = this.E;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + spi.n(type2);
    }
}
