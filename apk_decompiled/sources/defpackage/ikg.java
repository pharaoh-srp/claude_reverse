package defpackage;

import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ikg {
    public static final ww7 a;
    public static final ww7 b;
    public static final ww7 c;
    public static final ww7 d;
    public static final ww7 e;
    public static final ww7 f;
    public static final ww7 g;
    public static final gh3 h;
    public static final gh3 i;
    public static final gh3 j;
    public static final gh3 k;
    public static final gh3 l;
    public static final gh3 m;
    public static final gh3 n;
    public static final Set o;
    public static final Set p;
    public static final gh3 q;
    public static final gh3 r;
    public static final gh3 s;
    public static final gh3 t;

    static {
        ww7 ww7Var = new ww7("kotlin");
        a = ww7Var;
        ww7 ww7VarC = ww7Var.c(sxb.e("reflect"));
        b = ww7VarC;
        ww7 ww7VarC2 = ww7Var.c(sxb.e("collections"));
        c = ww7VarC2;
        ww7 ww7VarC3 = ww7Var.c(sxb.e("ranges"));
        d = ww7VarC3;
        ww7Var.c(sxb.e(DebugImage.JVM)).c(sxb.e("internal"));
        ww7 ww7VarC4 = ww7Var.c(sxb.e("annotation"));
        e = ww7VarC4;
        ww7 ww7VarC5 = ww7Var.c(sxb.e("internal"));
        ww7VarC5.c(sxb.e("ir"));
        ww7 ww7VarC6 = ww7Var.c(sxb.e("coroutines"));
        f = ww7VarC6;
        g = ww7Var.c(sxb.e("enums"));
        mp0.Z0(new ww7[]{ww7Var, ww7VarC2, ww7VarC3, ww7VarC4, ww7VarC, ww7VarC5, ww7VarC6});
        jkg.a("Nothing");
        jkg.a("Unit");
        jkg.a("Any");
        jkg.a("Enum");
        jkg.a("Annotation");
        h = jkg.a("Array");
        gh3 gh3VarA = jkg.a("Boolean");
        gh3 gh3VarA2 = jkg.a("Char");
        gh3 gh3VarA3 = jkg.a("Byte");
        gh3 gh3VarA4 = jkg.a("Short");
        gh3 gh3VarA5 = jkg.a("Int");
        gh3 gh3VarA6 = jkg.a("Long");
        gh3 gh3VarA7 = jkg.a("Float");
        gh3 gh3VarA8 = jkg.a("Double");
        i = jkg.f(gh3VarA3);
        j = jkg.f(gh3VarA4);
        k = jkg.f(gh3VarA5);
        l = jkg.f(gh3VarA6);
        jkg.a("CharSequence");
        m = jkg.a("String");
        jkg.a("Throwable");
        jkg.a("Cloneable");
        jkg.e("KProperty");
        jkg.e("KMutableProperty");
        jkg.e("KProperty0");
        jkg.e("KMutableProperty0");
        jkg.e("KProperty1");
        jkg.e("KMutableProperty1");
        jkg.e("KProperty2");
        jkg.e("KMutableProperty2");
        n = jkg.e("KFunction");
        jkg.e("KClass");
        jkg.e("KCallable");
        jkg.a("Comparable");
        jkg.a("Number");
        jkg.a("Function");
        Set setZ0 = mp0.Z0(new gh3[]{gh3VarA, gh3VarA2, gh3VarA3, gh3VarA4, gh3VarA5, gh3VarA6, gh3VarA7, gh3VarA8});
        o = setZ0;
        Set set = setZ0;
        int iD0 = tta.d0(x44.y(set, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Object obj : set) {
            sxb sxbVarI = ((gh3) obj).i();
            sxbVarI.getClass();
            linkedHashMap.put(obj, jkg.d(sxbVarI));
        }
        jkg.c(linkedHashMap);
        Set setZ02 = mp0.Z0(new gh3[]{i, j, k, l});
        p = setZ02;
        Set set2 = setZ02;
        int iD02 = tta.d0(x44.y(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
        for (Object obj2 : set2) {
            sxb sxbVarI2 = ((gh3) obj2).i();
            sxbVarI2.getClass();
            linkedHashMap2.put(obj2, jkg.d(sxbVarI2));
        }
        jkg.c(linkedHashMap2);
        dxf.q0(dxf.p0(o, p), m);
        ww7 ww7Var2 = f;
        sxb sxbVarE = sxb.e("Continuation");
        if (ww7Var2 == null) {
            gh3.a(3);
            throw null;
        }
        ww7.j(sxbVarE);
        jkg.b("Iterator");
        jkg.b("Iterable");
        jkg.b("Collection");
        jkg.b("List");
        jkg.b("ListIterator");
        jkg.b("Set");
        gh3 gh3VarB = jkg.b("Map");
        jkg.b("MutableIterator");
        jkg.b("CharIterator");
        jkg.b("MutableIterable");
        jkg.b("MutableCollection");
        q = jkg.b("MutableList");
        jkg.b("MutableListIterator");
        r = jkg.b("MutableSet");
        gh3 gh3VarB2 = jkg.b("MutableMap");
        s = gh3VarB2;
        gh3VarB.d(sxb.e("Entry"));
        gh3VarB2.d(sxb.e("MutableEntry"));
        jkg.a("Result");
        ww7 ww7Var3 = d;
        sxb sxbVarE2 = sxb.e("IntRange");
        if (ww7Var3 == null) {
            gh3.a(3);
            throw null;
        }
        ww7.j(sxbVarE2);
        ww7.j(sxb.e("LongRange"));
        ww7.j(sxb.e("CharRange"));
        ww7 ww7Var4 = e;
        sxb sxbVarE3 = sxb.e("AnnotationRetention");
        if (ww7Var4 == null) {
            gh3.a(3);
            throw null;
        }
        ww7.j(sxbVarE3);
        ww7.j(sxb.e("AnnotationTarget"));
        t = new gh3(g, sxb.e("EnumEntries"));
    }
}
