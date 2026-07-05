package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class jbe extends obe implements sd9, vd9 {
    public final Class a;

    public jbe(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.sd9
    public final zae a(ww7 ww7Var) {
        Annotation[] declaredAnnotations;
        ww7Var.getClass();
        Class cls = this.a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return rkk.d(declaredAnnotations, ww7Var);
    }

    public final Class b() {
        return this.a;
    }

    public final Collection c() {
        Field[] declaredFields = this.a.getDeclaredFields();
        declaredFields.getClass();
        return bnf.e0(bnf.b0(new bl7(mp0.m0(declaredFields), false, gbe.E), hbe.E));
    }

    public final ww7 d() {
        return yae.a(this.a).b();
    }

    public final Collection e() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        declaredMethods.getClass();
        return bnf.e0(bnf.b0(bnf.V(mp0.m0(declaredMethods), new h4(25, this)), ibe.E));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jbe) {
            return x44.r(this.a, ((jbe) obj).a);
        }
        return false;
    }

    public final sxb f() {
        return sxb.e(this.a.getSimpleName());
    }

    public final jbe g() {
        Class<?> declaringClass = this.a.getDeclaringClass();
        if (declaringClass != null) {
            return new jbe(declaringClass);
        }
        return null;
    }

    @Override // defpackage.sd9
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? lm6.E : rkk.g(declaredAnnotations);
    }

    @Override // defpackage.cf9
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ybe(typeVariable));
        }
        return arrayList;
    }

    public final ArrayList h() {
        Class cls = this.a;
        cls.getClass();
        c61 c61Var = wwk.j;
        if (c61Var == null) {
            try {
                c61Var = new c61(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 14);
            } catch (NoSuchMethodException unused) {
                c61Var = new c61(objArr, objArr, objArr, objArr, 14);
            }
            wwk.j = c61Var;
        }
        Method method = (Method) c61Var.I;
        objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new wbe(obj));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        return this.a.isAnnotation();
    }

    public final boolean j() throws IllegalAccessException, InvocationTargetException {
        Class cls = this.a;
        cls.getClass();
        c61 c61Var = wwk.j;
        Boolean bool = null;
        if (c61Var == null) {
            try {
                c61Var = new c61(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 14);
            } catch (NoSuchMethodException unused) {
                c61Var = new c61(bool, bool, bool, bool, 14);
            }
            wwk.j = c61Var;
        }
        Method method = (Method) c61Var.H;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            objInvoke.getClass();
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean k() throws IllegalAccessException, InvocationTargetException {
        Class cls = this.a;
        cls.getClass();
        c61 c61Var = wwk.j;
        Boolean bool = null;
        if (c61Var == null) {
            try {
                c61Var = new c61(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 14);
            } catch (NoSuchMethodException unused) {
                c61Var = new c61(bool, bool, bool, bool, 14);
            }
            wwk.j = c61Var;
        }
        Method method = (Method) c61Var.F;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            objInvoke.getClass();
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final String toString() {
        return jbe.class.getName() + ": " + this.a;
    }
}
