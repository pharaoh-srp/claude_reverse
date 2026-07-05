package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class okg {
    public static final ww7 A;
    public static final ww7 B;
    public static final ww7 C;
    public static final ww7 D;
    public static final ww7 E;
    public static final ww7 F;
    public static final ww7 G;
    public static final ww7 H;
    public static final ww7 I;
    public static final ww7 J;
    public static final ww7 K;
    public static final ww7 L;
    public static final ww7 M;
    public static final ww7 N;
    public static final ww7 O;
    public static final xw7 P;
    public static final gh3 Q;
    public static final gh3 R;
    public static final gh3 S;
    public static final gh3 T;
    public static final gh3 U;
    public static final ww7 V;
    public static final ww7 W;
    public static final ww7 X;
    public static final ww7 Y;
    public static final HashSet Z;
    public static final HashSet a0;
    public static final HashMap b0;
    public static final HashMap c0;
    public static final xw7 d;
    public static final xw7 e;
    public static final xw7 f;
    public static final xw7 g;
    public static final xw7 h;
    public static final xw7 i;
    public static final xw7 j;
    public static final ww7 k;
    public static final ww7 l;
    public static final ww7 m;
    public static final ww7 n;
    public static final ww7 o;
    public static final ww7 p;
    public static final ww7 q;
    public static final ww7 r;
    public static final ww7 s;
    public static final ww7 t;
    public static final ww7 u;
    public static final ww7 v;
    public static final ww7 w;
    public static final ww7 x;
    public static final ww7 y;
    public static final ww7 z;
    public static final xw7 a = d("Any");
    public static final xw7 b = d("Nothing");
    public static final xw7 c = d("Cloneable");

    static {
        c("Suppress");
        d = d("Unit");
        e = d("CharSequence");
        f = d("String");
        g = d("Array");
        h = d("Boolean");
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        i = d("Number");
        j = d("Enum");
        d("Function");
        k = c("Throwable");
        l = c("Comparable");
        ww7 ww7Var = pkg.m;
        ww7Var.c(sxb.e("IntRange")).i().getClass();
        ww7Var.c(sxb.e("LongRange")).i().getClass();
        m = c("Deprecated");
        c("DeprecatedSinceKotlin");
        n = c("DeprecationLevel");
        o = c("ReplaceWith");
        p = c("ExtensionFunctionType");
        q = c("ContextFunctionTypeParams");
        ww7 ww7VarC = c("ParameterName");
        r = ww7VarC;
        gh3.j(ww7VarC);
        s = c("Annotation");
        ww7 ww7VarA = a("Target");
        t = ww7VarA;
        gh3.j(ww7VarA);
        u = a("AnnotationTarget");
        v = a("AnnotationRetention");
        ww7 ww7VarA2 = a("Retention");
        w = ww7VarA2;
        gh3.j(ww7VarA2);
        gh3.j(a("Repeatable"));
        x = a("MustBeDocumented");
        y = c("UnsafeVariance");
        c("PublishedApi");
        pkg.n.c(sxb.e("AccessibleLateinitPropertyLiteral"));
        z = b("Iterator");
        A = b("Iterable");
        B = b("Collection");
        C = b("List");
        D = b("ListIterator");
        E = b("Set");
        ww7 ww7VarB = b("Map");
        F = ww7VarB;
        G = ww7VarB.c(sxb.e("Entry"));
        H = b("MutableIterator");
        I = b("MutableIterable");
        J = b("MutableCollection");
        K = b("MutableList");
        L = b("MutableListIterator");
        M = b("MutableSet");
        ww7 ww7VarB2 = b("MutableMap");
        N = ww7VarB2;
        O = ww7VarB2.c(sxb.e("MutableEntry"));
        P = e("KClass");
        e("KCallable");
        e("KProperty0");
        e("KProperty1");
        e("KProperty2");
        e("KMutableProperty0");
        e("KMutableProperty1");
        e("KMutableProperty2");
        xw7 xw7VarE = e("KProperty");
        e("KMutableProperty");
        Q = gh3.j(xw7VarE.g());
        e("KDeclarationContainer");
        ww7 ww7VarC2 = c("UByte");
        ww7 ww7VarC3 = c("UShort");
        ww7 ww7VarC4 = c("UInt");
        ww7 ww7VarC5 = c("ULong");
        R = gh3.j(ww7VarC2);
        S = gh3.j(ww7VarC3);
        T = gh3.j(ww7VarC4);
        U = gh3.j(ww7VarC5);
        V = c("UByteArray");
        W = c("UShortArray");
        X = c("UIntArray");
        Y = c("ULongArray");
        int length = vfd.values().length;
        HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
        for (vfd vfdVar : vfd.values()) {
            hashSet.add(vfdVar.E);
        }
        Z = hashSet;
        int length2 = vfd.values().length;
        HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
        for (vfd vfdVar2 : vfd.values()) {
            hashSet2.add(vfdVar2.F);
        }
        a0 = hashSet2;
        int length3 = vfd.values().length;
        HashMap map = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
        for (vfd vfdVar3 : vfd.values()) {
            String strB = vfdVar3.E.b();
            strB.getClass();
            map.put(d(strB), vfdVar3);
        }
        b0 = map;
        int length4 = vfd.values().length;
        HashMap map2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
        for (vfd vfdVar4 : vfd.values()) {
            String strB2 = vfdVar4.F.b();
            strB2.getClass();
            map2.put(d(strB2), vfdVar4);
        }
        c0 = map2;
    }

    public static ww7 a(String str) {
        return pkg.k.c(sxb.e(str));
    }

    public static ww7 b(String str) {
        return pkg.l.c(sxb.e(str));
    }

    public static ww7 c(String str) {
        return pkg.j.c(sxb.e(str));
    }

    public static xw7 d(String str) {
        xw7 xw7VarI = c(str).i();
        xw7VarI.getClass();
        return xw7VarI;
    }

    public static final xw7 e(String str) {
        xw7 xw7VarI = pkg.h.c(sxb.e(str)).i();
        xw7VarI.getClass();
        return xw7VarI;
    }
}
