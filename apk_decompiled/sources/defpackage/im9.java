package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: loaded from: classes.dex */
public abstract class im9 implements sg3 {
    public static final ide E = new ide("<v#(\\d+)>");

    public static Method t(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Method methodT;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodW = w(cls, str, clsArr, cls2);
        if (methodW != null) {
            return methodW;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodT = t(superclass, str, clsArr, cls2, z)) != null) {
            return methodT;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        int length = interfaces.length;
        int i = 0;
        while (true) {
            Class<?> cls3 = null;
            if (i >= length) {
                return null;
            }
            Class<?> cls4 = interfaces[i];
            cls4.getClass();
            Method methodT2 = t(cls4, str, clsArr, cls2, z);
            if (methodT2 != null) {
                return methodT2;
            }
            if (z) {
                try {
                    cls3 = Class.forName(cls4.getName().concat("$DefaultImpls"), false, yae.d(cls4));
                } catch (ClassNotFoundException unused) {
                }
                if (cls3 != null) {
                    clsArr[0] = cls4;
                    Method methodW2 = w(cls3, str, clsArr, cls2);
                    if (methodW2 != null) {
                        return methodW2;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public static Constructor v(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method w(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (x44.r(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (x44.r(method.getName(), str) && x44.r(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void i(ArrayList arrayList, String str, boolean z) {
        ArrayList arrayListS = s(str);
        arrayList.addAll(arrayListS);
        int size = (arrayListS.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            cls.getClass();
            arrayList.add(cls);
        }
        if (!z) {
            arrayList.add(Object.class);
        } else {
            arrayList.remove(mq5.class);
            arrayList.add(mq5.class);
        }
    }

    public final Method j(String str, String str2) throws ClassNotFoundException {
        Method methodT;
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) s(str2).toArray(new Class[0]);
        Class clsU = u(bsg.F0(str2, ')', 0, 6) + 1, str2.length(), str2);
        Method methodT2 = t(q(), str, clsArr, clsU, false);
        if (methodT2 != null) {
            return methodT2;
        }
        if (!q().isInterface() || (methodT = t(Object.class, str, clsArr, clsU, false)) == null) {
            return null;
        }
        return methodT;
    }

    public abstract Collection l();

    public abstract Collection m(sxb sxbVar);

    public abstract hrd o(int i);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection p(defpackage.fab r7, int r8) {
        /*
            r6 = this;
            r7.getClass()
            defpackage.sq6.a(r8)
            hm9 r0 = new hm9
            r0.<init>(r6)
            r6 = 3
            r1 = 0
            java.util.Collection r6 = defpackage.cok.p(r7, r1, r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r6.next()
            bo5 r2 = (defpackage.bo5) r2
            boolean r3 = r2 instanceof defpackage.e92
            if (r3 == 0) goto L4a
            r3 = r2
            e92 r3 = (defpackage.e92) r3
            ow5 r4 = r3.getVisibility()
            p06 r5 = defpackage.q06.h
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L4a
            boolean r3 = defpackage.ms6.a(r8, r3)
            if (r3 == 0) goto L4a
            iei r3 = defpackage.iei.a
            java.lang.Object r2 = r2.E(r0, r3)
            ol9 r2 = (defpackage.ol9) r2
            goto L4b
        L4a:
            r2 = r1
        L4b:
            if (r2 == 0) goto L1c
            r7.add(r2)
            goto L1c
        L51:
            java.util.List r6 = defpackage.w44.p1(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im9.p(fab, int):java.util.Collection");
    }

    public Class q() {
        Class clsA = a();
        List list = yae.a;
        clsA.getClass();
        Class cls = (Class) yae.c.get(clsA);
        return cls == null ? a() : cls;
    }

    public abstract Collection r(sxb sxbVar);

    public final ArrayList s(String str) {
        int iF0;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (bsg.v0("VZCBSIFJD", cCharAt)) {
                iF0 = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
                }
                iF0 = bsg.F0(str, ';', i, 4) + 1;
            }
            arrayList.add(u(i, iF0, str));
            i = iF0;
        }
        return arrayList;
    }

    public final Class u(int i, int i2, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = yae.d(a());
            String strReplace = str.substring(i + 1, i2 - 1).replace('/', '.');
            strReplace.getClass();
            Class<?> clsLoadClass = classLoaderD.loadClass(strReplace);
            clsLoadClass.getClass();
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            Class clsU = u(i + 1, i2, str);
            ww7 ww7Var = vpi.a;
            clsU.getClass();
            return Array.newInstance((Class<?>) clsU, 0).getClass();
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
    }
}
