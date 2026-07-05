package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class uh3 {
    public static final uh3 c = new uh3();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void c(HashMap map, th3 th3Var, y3a y3aVar, Class cls) {
        y3a y3aVar2 = (y3a) map.get(th3Var);
        if (y3aVar2 != null && y3aVar != y3aVar2) {
            xh6.e("Method ", th3Var.b.getName(), " in ", cls.getName(), " already declared with different @OnLifecycleEvent value: previous value ", y3aVar2, ", new value ", y3aVar);
        } else if (y3aVar2 == null) {
            map.put(th3Var, y3aVar);
        }
    }

    public final sh3 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            sh3 sh3VarA = (sh3) map2.get(superclass);
            if (sh3VarA == null) {
                sh3VarA = a(superclass, null);
            }
            map.putAll(sh3VarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            sh3 sh3VarA2 = (sh3) map2.get(cls2);
            if (sh3VarA2 == null) {
                sh3VarA2 = a(cls2, null);
            }
            for (Map.Entry entry : sh3VarA2.b.entrySet()) {
                c(map, (th3) entry.getKey(), (y3a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            fec fecVar = (fec) method.getAnnotation(fec.class);
            if (fecVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!m4a.class.isAssignableFrom(parameterTypes[0])) {
                        sz6.p("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                y3a y3aVarValue = fecVar.value();
                if (parameterTypes.length > 1) {
                    if (!y3a.class.isAssignableFrom(parameterTypes[1])) {
                        sz6.p("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (y3aVarValue != y3a.ON_ANY) {
                        sz6.p("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    sz6.p("cannot have more than 2 params");
                    return null;
                }
                c(map, new th3(i, method), y3aVarValue, cls);
                z = true;
            }
        }
        sh3 sh3Var = new sh3(map);
        map2.put(cls, sh3Var);
        this.b.put(cls, Boolean.valueOf(z));
        return sh3Var;
    }

    public final boolean b(Class cls) {
        HashMap map = this.b;
        Boolean bool = (Boolean) map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((fec) method.getAnnotation(fec.class)) != null) {
                    a(cls, declaredMethods);
                    return true;
                }
            }
            map.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
