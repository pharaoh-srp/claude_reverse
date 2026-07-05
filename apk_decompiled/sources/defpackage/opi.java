package defpackage;

import io.sentry.e0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class opi implements ParameterizedType {
    public final Type E;
    public final Type F;
    public final Type[] G;

    public opi(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || wwk.m(type) != enclosingClass) {
                    pmf.i("unexpected owner type for ", type2, ": ", type);
                    throw null;
                }
            } else if (enclosingClass != null) {
                e0.d(type2, ": null", "unexpected owner type for ");
                throw null;
            }
        }
        this.E = type != null ? spi.a(type) : null;
        this.F = spi.a(type2);
        this.G = (Type[]) typeArr.clone();
        int i = 0;
        while (true) {
            Type[] typeArr2 = this.G;
            if (i >= typeArr2.length) {
                return;
            }
            typeArr2[i].getClass();
            spi.b(this.G[i]);
            Type[] typeArr3 = this.G;
            typeArr3[i] = spi.a(typeArr3[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && wwk.f(this, (ParameterizedType) obj);
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
        Set set = spi.a;
        Type type = this.E;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.G;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(spi.n(this.F));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(spi.n(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(spi.n(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
