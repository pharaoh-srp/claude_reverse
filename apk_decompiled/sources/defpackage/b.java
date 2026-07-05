package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {
    public final Type E;
    public final Type F;
    public final Type[] G;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            ez1.w(z);
        }
        this.E = type == null ? null : yb5.j(type);
        this.F = yb5.j(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.G = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.G[i]);
            yb5.k(this.G[i]);
            Type[] typeArr3 = this.G;
            typeArr3[i] = yb5.j(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && yb5.p(this, (ParameterizedType) obj);
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
            return yb5.R(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(yb5.R(type));
        sb.append("<");
        sb.append(yb5.R(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(yb5.R(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
