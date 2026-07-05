package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tbe extends sbe implements cf9 {
    public final Method a;

    public tbe(Method method) {
        method.getClass();
        this.a = method;
    }

    @Override // defpackage.sbe
    public final Member c() {
        return this.a;
    }

    @Override // defpackage.cf9
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new ybe(typeVariable));
        }
        return arrayList;
    }

    public final Method j() {
        return this.a;
    }

    public final xbe k() {
        Type genericReturnType = this.a.getGenericReturnType();
        genericReturnType.getClass();
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new vbe(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) ? new dbe(genericReturnType) : genericReturnType instanceof WildcardType ? new ace((WildcardType) genericReturnType) : new mbe(genericReturnType);
    }

    public final List l() {
        Method method = this.a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        parameterAnnotations.getClass();
        return e(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }
}
