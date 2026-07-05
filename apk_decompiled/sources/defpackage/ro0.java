package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ro0 implements fg9 {
    public final /* synthetic */ int a;

    public /* synthetic */ ro0(int i) {
        this.a = i;
    }

    public static void a(Type type, Class cls) {
        Class<?> clsM = wwk.m(type);
        if (cls.isAssignableFrom(clsM)) {
            StringBuilder sb = new StringBuilder("No JsonAdapter for ");
            sb.append(type);
            String simpleName = cls.getSimpleName();
            String simpleName2 = clsM.getSimpleName();
            sb.append(", you should probably use ");
            sb.append(simpleName);
            sb.append(" instead of ");
            sb.append(simpleName2);
            sb.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.fg9
    public final gg9 create(Type type, Set set, prb prbVar) {
        cg9 cg9Var;
        Class clsM;
        Type typeK = type;
        int i = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                Type typeD = wwk.d(typeK);
                if (typeD != null && set.isEmpty()) {
                    return new so0(wwk.m(typeD), prbVar.b(typeD, spi.a, null)).nullSafe();
                }
                return null;
            case 1:
                if (!(typeK instanceof Class) && !(typeK instanceof ParameterizedType)) {
                    return null;
                }
                Class clsM2 = wwk.m(typeK);
                if (clsM2.isInterface() || clsM2.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (spi.f(clsM2)) {
                    a(typeK, List.class);
                    a(typeK, Set.class);
                    a(typeK, Map.class);
                    a(typeK, Collection.class);
                    String str = "Platform " + clsM2;
                    if (typeK instanceof ParameterizedType) {
                        str = str + " in " + typeK;
                    }
                    sz6.p(str.concat(" requires explicit JsonAdapter to be registered"));
                    return null;
                }
                if (clsM2.isAnonymousClass()) {
                    sz6.p("Cannot serialize anonymous class ".concat(clsM2.getName()));
                    return null;
                }
                if (clsM2.isLocalClass()) {
                    sz6.p("Cannot serialize local class ".concat(clsM2.getName()));
                    return null;
                }
                if (clsM2.getEnclosingClass() != null && !Modifier.isStatic(clsM2.getModifiers())) {
                    sz6.p("Cannot serialize non-static nested class ".concat(clsM2.getName()));
                    return null;
                }
                if (Modifier.isAbstract(clsM2.getModifiers())) {
                    sz6.p("Cannot serialize abstract class ".concat(clsM2.getName()));
                    return null;
                }
                if (spi.e(clsM2)) {
                    sz6.i(clsM2.getName(), ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.", "Cannot serialize Kotlin type ");
                    return null;
                }
                ikk ikkVarL = ikk.l(clsM2);
                TreeMap treeMap = new TreeMap();
                while (typeK != Object.class) {
                    Class clsM3 = wwk.m(typeK);
                    boolean zF = spi.f(clsM3);
                    Field[] declaredFields = clsM3.getDeclaredFields();
                    int length = declaredFields.length;
                    for (int i3 = i2; i3 < length; i3++) {
                        Field field = declaredFields[i3];
                        int modifiers = field.getModifiers();
                        if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && ((Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zF) && ((cg9Var = (cg9) field.getAnnotation(cg9.class)) == null || !cg9Var.ignore()))) {
                            Type typeJ = spi.j(typeK, clsM3, field.getGenericType());
                            Set setG = spi.g(field);
                            String name = field.getName();
                            gg9 gg9VarB = prbVar.b(typeJ, setG, name);
                            field.setAccessible(true);
                            String strH = spi.h(name, cg9Var);
                            hh3 hh3Var = (hh3) treeMap.put(strH, new hh3(strH, field, gg9VarB));
                            if (hh3Var != null) {
                                throw new IllegalArgumentException("Conflicting fields:\n    " + hh3Var.b + "\n    " + field);
                            }
                        }
                    }
                    typeK = wwk.k(typeK);
                    i2 = 0;
                }
                return new ih3(ikkVarL, treeMap).nullSafe();
            case 2:
                Class clsM4 = wwk.m(typeK);
                if (!set.isEmpty()) {
                    return null;
                }
                if (clsM4 == List.class || clsM4 == Collection.class) {
                    return new q44(prbVar.b(wwk.e(typeK), spi.a, null), i2).nullSafe();
                }
                if (clsM4 == Set.class) {
                    return new q44(prbVar.b(wwk.e(typeK), spi.a, null), i).nullSafe();
                }
                return null;
            case 3:
                if (!set.isEmpty() || (clsM = wwk.m(typeK)) != Map.class) {
                    return null;
                }
                Type[] typeArrN = wwk.n(typeK, clsM);
                return new so0(prbVar, typeArrN[0], typeArrN[1]).nullSafe();
            case 4:
                return null;
            default:
                kkg kkgVar = yfd.p;
                kkg kkgVar2 = yfd.o;
                kkg kkgVar3 = yfd.n;
                kkg kkgVar4 = yfd.m;
                kkg kkgVar5 = yfd.l;
                kkg kkgVar6 = yfd.k;
                kkg kkgVar7 = yfd.j;
                kkg kkgVar8 = yfd.i;
                if (!set.isEmpty()) {
                    return null;
                }
                if (typeK == Boolean.TYPE) {
                    return kkgVar8;
                }
                if (typeK == Byte.TYPE) {
                    return kkgVar7;
                }
                if (typeK == Character.TYPE) {
                    return kkgVar6;
                }
                if (typeK == Double.TYPE) {
                    return kkgVar5;
                }
                if (typeK == Float.TYPE) {
                    return kkgVar4;
                }
                if (typeK == Integer.TYPE) {
                    return kkgVar3;
                }
                if (typeK == Long.TYPE) {
                    return kkgVar2;
                }
                if (typeK == Short.TYPE) {
                    return kkgVar;
                }
                if (typeK == Boolean.class) {
                    return kkgVar8.nullSafe();
                }
                if (typeK == Byte.class) {
                    return kkgVar7.nullSafe();
                }
                if (typeK == Character.class) {
                    return kkgVar6.nullSafe();
                }
                if (typeK == Double.class) {
                    return kkgVar5.nullSafe();
                }
                if (typeK == Float.class) {
                    return kkgVar4.nullSafe();
                }
                if (typeK == Integer.class) {
                    return kkgVar3.nullSafe();
                }
                if (typeK == Long.class) {
                    return kkgVar2.nullSafe();
                }
                if (typeK == Short.class) {
                    return kkgVar.nullSafe();
                }
                if (typeK == String.class) {
                    return yfd.q.nullSafe();
                }
                if (typeK == Object.class) {
                    return new mkg(prbVar).nullSafe();
                }
                Class clsM5 = wwk.m(typeK);
                gg9 gg9VarC = spi.c(prbVar, typeK, clsM5);
                if (gg9VarC != null) {
                    return gg9VarC;
                }
                if (clsM5.isEnum()) {
                    return new lkg(clsM5).nullSafe();
                }
                return null;
        }
    }
}
