package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class ace extends xbe {
    public final WildcardType a;

    public ace(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    @Override // defpackage.xbe
    public final Type b() {
        return this.a;
    }

    public final xbe c() {
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            poc.t("Wildcard types with many bounds are not yet supported: ", wildcardType);
            return null;
        }
        if (lowerBounds.length == 1) {
            Object objT0 = mp0.T0(lowerBounds);
            objT0.getClass();
            Type type = (Type) objT0;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new vbe(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new dbe(type) : type instanceof WildcardType ? new ace((WildcardType) type) : new mbe(type);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) mp0.T0(upperBounds);
            if (!x44.r(type2, Object.class)) {
                type2.getClass();
                boolean z2 = type2 instanceof Class;
                if (z2) {
                    Class cls2 = (Class) type2;
                    if (cls2.isPrimitive()) {
                        return new vbe(cls2);
                    }
                }
                return ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) ? new dbe(type2) : type2 instanceof WildcardType ? new ace((WildcardType) type2) : new mbe(type2);
            }
        }
        return null;
    }

    public final boolean d() {
        this.a.getUpperBounds().getClass();
        return !x44.r(mp0.E0(r1), Object.class);
    }

    @Override // defpackage.sd9
    public final Collection getAnnotations() {
        return lm6.E;
    }
}
