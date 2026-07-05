package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xpi implements ParameterizedType {
    public final Type E;
    public final Type F;
    public final Type[] G;

    public xpi(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                mr9.y();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            zni.l(type3);
        }
        this.E = type;
        this.F = type2;
        this.G = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && zni.v(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.G.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.E;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.F;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.G) ^ this.F.hashCode();
        Type type = this.E;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.G;
        int length = typeArr.length;
        Type type = this.F;
        if (length == 0) {
            return zni.c0(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(zni.c0(type));
        sb.append("<");
        sb.append(zni.c0(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(zni.c0(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
