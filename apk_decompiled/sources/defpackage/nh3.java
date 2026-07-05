package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nh3 implements pl9, sg3 {
    public static final Map F;
    public final Class E;

    static {
        List listX = x44.X(zy7.class, bz7.class, pz7.class, rz7.class, sz7.class, tz7.class, uz7.class, vz7.class, wz7.class, xz7.class, az7.class, cz7.class, dz7.class, ez7.class, fz7.class, gz7.class, hz7.class, iz7.class, jz7.class, kz7.class, mz7.class, nz7.class, oz7.class);
        ArrayList arrayList = new ArrayList(x44.y(listX, 10));
        int i = 0;
        for (Object obj : listX) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            arrayList.add(new cpc((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        F = sta.p0(arrayList);
    }

    public nh3(Class cls) {
        cls.getClass();
        this.E = cls;
    }

    @Override // defpackage.sg3
    public final Class a() {
        return this.E;
    }

    @Override // defpackage.pl9
    public final String d() {
        String strD;
        Class cls = this.E;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strD2 = kkk.d(cls.getName());
            return strD2 == null ? cls.getCanonicalName() : strD2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strD = kkk.d(componentType.getName())) != null) {
            strConcat = strD.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nh3) && ez1.J(this).equals(ez1.J((pl9) obj));
    }

    @Override // defpackage.pl9
    public final String f() {
        String strH;
        Class cls = this.E;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strH2 = kkk.h(cls.getName());
                return strH2 == null ? cls.getSimpleName() : strH2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strH = kkk.h(componentType.getName())) != null) {
                strConcat = strH.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return bsg.c1(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iF0 = bsg.F0(simpleName, '$', 0, 6);
            return iF0 == -1 ? simpleName : simpleName.substring(iF0 + 1, simpleName.length());
        }
        return bsg.c1(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // defpackage.pl9
    public final int hashCode() {
        return ez1.J(this).hashCode();
    }

    @Override // defpackage.pl9
    public final boolean n(Object obj) {
        Class clsJ = this.E;
        clsJ.getClass();
        Map map = F;
        map.getClass();
        Integer num = (Integer) map.get(clsJ);
        if (num != null) {
            return nai.N(num.intValue(), obj);
        }
        if (clsJ.isPrimitive()) {
            clsJ = ez1.J(jce.a.b(clsJ));
        }
        return clsJ.isInstance(obj);
    }

    public final String toString() {
        return this.E.toString() + " (Kotlin reflection is not available)";
    }
}
