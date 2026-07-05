package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class dbe extends xbe {
    public final Type a;
    public final xbe b;
    public final lm6 c;

    /* JADX WARN: Multi-variable type inference failed */
    public dbe(Type type) {
        xbe vbeVar;
        xbe vbeVar2;
        this.a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    vbeVar = componentType.isPrimitive() ? new vbe(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new dbe(componentType) : componentType instanceof WildcardType ? new ace((WildcardType) componentType) : new mbe(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        genericComponentType.getClass();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                vbeVar2 = new vbe(cls2);
                this.b = vbeVar2;
                this.c = lm6.E;
            }
        }
        vbeVar = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new dbe(genericComponentType) : genericComponentType instanceof WildcardType ? new ace((WildcardType) genericComponentType) : new mbe(genericComponentType);
        vbeVar2 = vbeVar;
        this.b = vbeVar2;
        this.c = lm6.E;
    }

    @Override // defpackage.xbe
    public final Type b() {
        return this.a;
    }

    public final xbe c() {
        return this.b;
    }

    @Override // defpackage.sd9
    public final Collection getAnnotations() {
        return this.c;
    }
}
