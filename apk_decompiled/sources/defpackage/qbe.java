package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes3.dex */
public final class qbe extends sbe {
    public final Field a;

    public qbe(Field field) {
        field.getClass();
        this.a = field;
    }

    @Override // defpackage.sbe
    public final Member c() {
        return this.a;
    }

    public final Field j() {
        return this.a;
    }

    public final xbe k() {
        Type genericType = this.a.getGenericType();
        genericType.getClass();
        boolean z = genericType instanceof Class;
        if (z) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new vbe(cls);
            }
        }
        return ((genericType instanceof GenericArrayType) || (z && ((Class) genericType).isArray())) ? new dbe(genericType) : genericType instanceof WildcardType ? new ace((WildcardType) genericType) : new mbe(genericType);
    }

    public final boolean l() {
        return this.a.isEnumConstant();
    }
}
