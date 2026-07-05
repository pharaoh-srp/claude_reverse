package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class yae {
    public static final List a;
    public static final Map b;
    public static final Map c;
    public static final Map d;

    static {
        kce kceVar = jce.a;
        int i = 0;
        List listX = x44.X(kceVar.b(Boolean.TYPE), kceVar.b(Byte.TYPE), kceVar.b(Character.TYPE), kceVar.b(Double.TYPE), kceVar.b(Float.TYPE), kceVar.b(Integer.TYPE), kceVar.b(Long.TYPE), kceVar.b(Short.TYPE));
        a = listX;
        List<pl9> list = listX;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        for (pl9 pl9Var : list) {
            arrayList.add(new cpc(ez1.J(pl9Var), ez1.K(pl9Var)));
        }
        b = sta.p0(arrayList);
        List<pl9> list2 = a;
        ArrayList arrayList2 = new ArrayList(x44.y(list2, 10));
        for (pl9 pl9Var2 : list2) {
            arrayList2.add(new cpc(ez1.K(pl9Var2), ez1.J(pl9Var2)));
        }
        c = sta.p0(arrayList2);
        List listX2 = x44.X(zy7.class, bz7.class, pz7.class, rz7.class, sz7.class, tz7.class, uz7.class, vz7.class, wz7.class, xz7.class, az7.class, cz7.class, dz7.class, ez7.class, fz7.class, gz7.class, hz7.class, iz7.class, jz7.class, kz7.class, mz7.class, nz7.class, oz7.class);
        ArrayList arrayList3 = new ArrayList(x44.y(listX2, 10));
        for (Object obj : listX2) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            arrayList3.add(new cpc((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = sta.p0(arrayList3);
    }

    public static final gh3 a(Class cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            sz6.p(grc.s(cls, "Can't compute ClassId for primitive type: "));
            return null;
        }
        if (cls.isArray()) {
            sz6.p(grc.s(cls, "Can't compute ClassId for array type: "));
            return null;
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return declaringClass != null ? a(declaringClass).d(sxb.e(cls.getSimpleName())) : gh3.j(new ww7(cls.getName()));
        }
        ww7 ww7Var = new ww7(cls.getName());
        return new gh3(ww7Var.e(), ww7.j(ww7Var.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String strReplace = cls.getName().replace('.', '/');
                strReplace.getClass();
                return strReplace;
            }
            StringBuilder sb = new StringBuilder("L");
            String strReplace2 = cls.getName().replace('.', '/');
            strReplace2.getClass();
            sb.append(strReplace2);
            sb.append(';');
            return sb.toString();
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        sz6.p(grc.s(cls, "Unsupported primitive type: "));
        return null;
    }

    public static final List c(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return lm6.E;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return bnf.e0(new rn7(bnf.Z(p9d.L, type), p9d.M, enf.E));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return mp0.Y0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }
}
