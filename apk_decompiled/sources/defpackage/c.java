package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements WildcardType, Serializable {
    public final Type E;
    public final Type F;

    public c(Type[] typeArr, Type[] typeArr2) {
        ez1.w(typeArr2.length <= 1);
        ez1.w(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            yb5.k(typeArr[0]);
            this.F = null;
            this.E = yb5.j(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        yb5.k(typeArr2[0]);
        ez1.w(typeArr[0] == Object.class);
        this.F = yb5.j(typeArr2[0]);
        this.E = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && yb5.p(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.F;
        return type != null ? new Type[]{type} : yb5.d;
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
            return "? super " + yb5.R(type);
        }
        Type type2 = this.E;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + yb5.R(type2);
    }
}
