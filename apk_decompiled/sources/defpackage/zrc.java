package defpackage;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zrc implements ParameterizedType, Type {
    public final Class E;
    public final Type F;
    public final Type[] G;

    public zrc(Class cls, Type type, ArrayList arrayList) {
        this.E = cls;
        this.F = type;
        this.G = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.E.equals(parameterizedType.getRawType()) && x44.r(this.F, parameterizedType.getOwnerType()) && Arrays.equals(this.G, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.G;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.F;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.E;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() throws IOException {
        StringBuilder sb = new StringBuilder();
        Class cls = this.E;
        Type type = this.F;
        if (type != null) {
            sb.append(ybi.c(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(ybi.c(cls));
        }
        Type[] typeArr = this.G;
        if (typeArr.length != 0) {
            mp0.K0(typeArr, sb, ", ", "<", ">", "...", yrc.E);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.E.hashCode();
        Type type = this.F;
        return Arrays.hashCode(this.G) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
