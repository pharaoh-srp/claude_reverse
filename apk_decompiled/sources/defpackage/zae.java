package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zae extends obe {
    public final Annotation a;

    public zae(Annotation annotation) {
        annotation.getClass();
        this.a = annotation;
    }

    public final Annotation b() {
        return this.a;
    }

    public final ArrayList c() throws IllegalAccessException, InvocationTargetException {
        Annotation annotation = this.a;
        Method[] declaredMethods = ez1.I(ez1.H(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            objInvoke.getClass();
            sxb sxbVarE = sxb.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = yae.a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new pbe(sxbVarE, (Enum) objInvoke) : objInvoke instanceof Annotation ? new bbe(sxbVarE, (Annotation) objInvoke) : objInvoke instanceof Object[] ? new cbe(sxbVarE, (Object[]) objInvoke) : objInvoke instanceof Class ? new lbe(sxbVarE, (Class) objInvoke) : new rbe(sxbVarE, objInvoke));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zae) {
            return this.a == ((zae) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        return zae.class.getName() + ": " + this.a;
    }
}
