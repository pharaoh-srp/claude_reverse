package defpackage;

import io.sentry.e0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class spi {
    public static final Set a = Collections.EMPTY_SET;
    public static final Type[] b = new Type[0];
    public static final Class c;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        c = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new npi(a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof opi) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new opi(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof npi ? type : new npi(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof ppi)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new ppi(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            e0.d(type, ". Use the boxed type.", "Unexpected primitive ");
        }
    }

    public static gg9 c(prb prbVar, Type type, Class cls) {
        Class<?> cls2;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        pg9 pg9Var = (pg9) cls.getAnnotation(pg9.class);
        if (pg9Var != null && pg9Var.generateAdapter()) {
            try {
                try {
                    cls2 = Class.forName(cls.getName().replace("$", "_") + "JsonAdapter", true, cls.getClassLoader());
                    try {
                        if (type instanceof ParameterizedType) {
                            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                            try {
                                declaredConstructor = cls2.getDeclaredConstructor(prb.class, Type[].class);
                                objArr = new Object[]{prbVar, actualTypeArguments};
                            } catch (NoSuchMethodException unused) {
                                declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                                objArr = new Object[]{actualTypeArguments};
                            }
                        } else {
                            try {
                                declaredConstructor = cls2.getDeclaredConstructor(prb.class);
                                objArr = new Object[]{prbVar};
                            } catch (NoSuchMethodException unused2) {
                                declaredConstructor = cls2.getDeclaredConstructor(null);
                                objArr = new Object[0];
                            }
                        }
                        declaredConstructor.setAccessible(true);
                        return ((gg9) declaredConstructor.newInstance(objArr)).nullSafe();
                    } catch (NoSuchMethodException e) {
                        e = e;
                        if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                            poc.p("Failed to find the generated JsonAdapter constructor for ", type, e);
                            return null;
                        }
                        StringBuilder sb = new StringBuilder("Failed to find the generated JsonAdapter constructor for '");
                        sb.append(type);
                        String canonicalName = cls2.getCanonicalName();
                        sb.append("'. Suspiciously, the type was not parameterized but the target class '");
                        sb.append(canonicalName);
                        sb.append("' is generic. Consider using Types#newParameterizedType() to define these missing type variables.");
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (NoSuchMethodException e2) {
                    e = e2;
                    cls2 = null;
                }
            } catch (ClassNotFoundException e3) {
                poc.p("Failed to find the generated JsonAdapter class for ", type, e3);
            } catch (IllegalAccessException e4) {
                poc.p("Failed to access the generated JsonAdapter for ", type, e4);
                return null;
            } catch (InstantiationException e5) {
                poc.p("Failed to instantiate the generated JsonAdapter for ", type, e5);
                return null;
            } catch (InvocationTargetException e6) {
                l(e6);
                throw null;
            }
        }
        return null;
    }

    public static Type d(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return d(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean e(Class cls) {
        Class<? extends Annotation> cls2 = c;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static boolean f(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set g(Field field) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : field.getAnnotations()) {
            if (annotation.annotationType().isAnnotationPresent(zh9.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : a;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static String h(String str, cg9 cg9Var) {
        if (cg9Var != null) {
            String strName = cg9Var.name();
            if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strName)) {
                return strName;
            }
        }
        return str;
    }

    public static Type i(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        mr9.y();
        return null;
    }

    public static Type j(Type type, Class cls, Type type2) {
        return k(type, cls, type2, new LinkedHashSet());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type k(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10, java.util.LinkedHashSet r11) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spi.k(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.LinkedHashSet):java.lang.reflect.Type");
    }

    public static void l(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    public static String m(Type type, Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static String n(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
