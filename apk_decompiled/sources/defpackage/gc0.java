package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: loaded from: classes3.dex */
public final class gc0 implements InvocationHandler {
    public final Class a;
    public final Map b;
    public final u0h c;
    public final u0h d;
    public final List e;

    public gc0(Class cls, Map map, u0h u0hVar, u0h u0hVar2, List list) {
        this.a = cls;
        this.b = map;
        this.c = u0hVar;
        this.d = u0hVar2;
        this.e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zR;
        Class cls = this.a;
        cls.getClass();
        List list = this.e;
        list.getClass();
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.c.getValue();
            }
        }
        boolean zR2 = x44.r(name, "equals");
        Map map = this.b;
        boolean z = false;
        if (!zR2 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(mp0.Y0(objArr));
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
        Object objT0 = mp0.T0(objArr);
        Annotation annotation = objT0 instanceof Annotation ? (Annotation) objT0 : null;
        if (x44.r(annotation != null ? ez1.I(ez1.H(annotation)) : null, cls)) {
            List<Method> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z = true;
            } else {
                for (Method method2 : list2) {
                    Object obj2 = map.get(method2.getName());
                    Object objInvoke = method2.invoke(objT0, null);
                    if (obj2 instanceof boolean[]) {
                        objInvoke.getClass();
                        zR = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        objInvoke.getClass();
                        zR = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        objInvoke.getClass();
                        zR = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        objInvoke.getClass();
                        zR = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        objInvoke.getClass();
                        zR = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        objInvoke.getClass();
                        zR = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        objInvoke.getClass();
                        zR = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        objInvoke.getClass();
                        zR = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        objInvoke.getClass();
                        zR = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zR = x44.r(obj2, objInvoke);
                    }
                    if (!zR) {
                        break;
                    }
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
