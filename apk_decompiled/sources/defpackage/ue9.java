package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ue9 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final gh3 e;
    public static final ww7 f;
    public static final gh3 g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final List n;

    static {
        StringBuilder sb = new StringBuilder();
        e08 e08Var = e08.H;
        sb.append(e08Var.E.a.toString());
        sb.append('.');
        sb.append(e08Var.F);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        e08 e08Var2 = e08.J;
        sb2.append(e08Var2.E.a.toString());
        sb2.append('.');
        sb2.append(e08Var2.F);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        e08 e08Var3 = e08.I;
        sb3.append(e08Var3.E.a.toString());
        sb3.append('.');
        sb3.append(e08Var3.F);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        e08 e08Var4 = e08.K;
        sb4.append(e08Var4.E.a.toString());
        sb4.append('.');
        sb4.append(e08Var4.F);
        d = sb4.toString();
        gh3 gh3VarJ = gh3.j(new ww7("kotlin.jvm.functions.FunctionN"));
        e = gh3VarJ;
        f = gh3VarJ.b();
        g = ikg.n;
        d(Class.class);
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        l = new HashMap();
        m = new HashMap();
        gh3 gh3VarJ2 = gh3.j(okg.A);
        ww7 ww7Var = okg.I;
        ww7 ww7VarG = gh3VarJ2.g();
        ww7 ww7VarG2 = gh3VarJ2.g();
        ww7VarG2.getClass();
        ww7 ww7VarP = mwa.P(ww7Var, ww7VarG2);
        te9 te9Var = new te9(d(Iterable.class), gh3VarJ2, new gh3(ww7VarG, ww7VarP, false));
        gh3 gh3VarJ3 = gh3.j(okg.z);
        ww7 ww7Var2 = okg.H;
        ww7 ww7VarG3 = gh3VarJ3.g();
        ww7 ww7VarG4 = gh3VarJ3.g();
        ww7VarG4.getClass();
        te9 te9Var2 = new te9(d(Iterator.class), gh3VarJ3, new gh3(ww7VarG3, mwa.P(ww7Var2, ww7VarG4), false));
        gh3 gh3VarJ4 = gh3.j(okg.B);
        ww7 ww7Var3 = okg.J;
        ww7 ww7VarG5 = gh3VarJ4.g();
        ww7 ww7VarG6 = gh3VarJ4.g();
        ww7VarG6.getClass();
        te9 te9Var3 = new te9(d(Collection.class), gh3VarJ4, new gh3(ww7VarG5, mwa.P(ww7Var3, ww7VarG6), false));
        gh3 gh3VarJ5 = gh3.j(okg.C);
        ww7 ww7Var4 = okg.K;
        ww7 ww7VarG7 = gh3VarJ5.g();
        ww7 ww7VarG8 = gh3VarJ5.g();
        ww7VarG8.getClass();
        te9 te9Var4 = new te9(d(List.class), gh3VarJ5, new gh3(ww7VarG7, mwa.P(ww7Var4, ww7VarG8), false));
        gh3 gh3VarJ6 = gh3.j(okg.E);
        ww7 ww7Var5 = okg.M;
        ww7 ww7VarG9 = gh3VarJ6.g();
        ww7 ww7VarG10 = gh3VarJ6.g();
        ww7VarG10.getClass();
        te9 te9Var5 = new te9(d(Set.class), gh3VarJ6, new gh3(ww7VarG9, mwa.P(ww7Var5, ww7VarG10), false));
        gh3 gh3VarJ7 = gh3.j(okg.D);
        ww7 ww7Var6 = okg.L;
        ww7 ww7VarG11 = gh3VarJ7.g();
        ww7 ww7VarG12 = gh3VarJ7.g();
        ww7VarG12.getClass();
        te9 te9Var6 = new te9(d(ListIterator.class), gh3VarJ7, new gh3(ww7VarG11, mwa.P(ww7Var6, ww7VarG12), false));
        ww7 ww7Var7 = okg.F;
        gh3 gh3VarJ8 = gh3.j(ww7Var7);
        ww7 ww7Var8 = okg.N;
        ww7 ww7VarG13 = gh3VarJ8.g();
        ww7 ww7VarG14 = gh3VarJ8.g();
        ww7VarG14.getClass();
        te9 te9Var7 = new te9(d(Map.class), gh3VarJ8, new gh3(ww7VarG13, mwa.P(ww7Var8, ww7VarG14), false));
        gh3 gh3VarD = gh3.j(ww7Var7).d(okg.G.f());
        ww7 ww7Var9 = okg.O;
        ww7 ww7VarG15 = gh3VarD.g();
        ww7 ww7VarG16 = gh3VarD.g();
        ww7VarG16.getClass();
        List<te9> listX = x44.X(te9Var, te9Var2, te9Var3, te9Var4, te9Var5, te9Var6, te9Var7, new te9(d(Map.Entry.class), gh3VarD, new gh3(ww7VarG15, mwa.P(ww7Var9, ww7VarG16), false)));
        n = listX;
        c(Object.class, okg.a);
        c(String.class, okg.f);
        c(CharSequence.class, okg.e);
        a(d(Throwable.class), gh3.j(okg.k));
        c(Cloneable.class, okg.c);
        c(Number.class, okg.i);
        a(d(Comparable.class), gh3.j(okg.l));
        c(Enum.class, okg.j);
        a(d(Annotation.class), gh3.j(okg.s));
        for (te9 te9Var8 : listX) {
            gh3 gh3Var = te9Var8.a;
            gh3 gh3Var2 = te9Var8.b;
            gh3 gh3Var3 = te9Var8.c;
            a(gh3Var, gh3Var2);
            b(gh3Var3.b(), gh3Var);
            l.put(gh3Var3, gh3Var2);
            m.put(gh3Var2, gh3Var3);
            ww7 ww7VarB = gh3Var2.b();
            ww7 ww7VarB2 = gh3Var3.b();
            HashMap map = j;
            xw7 xw7VarI = gh3Var3.b().i();
            xw7VarI.getClass();
            map.put(xw7VarI, ww7VarB);
            HashMap map2 = k;
            xw7 xw7VarI2 = ww7VarB.i();
            xw7VarI2.getClass();
            map2.put(xw7VarI2, ww7VarB2);
        }
        for (nk9 nk9Var : nk9.values()) {
            gh3 gh3VarJ9 = gh3.j(nk9Var.d());
            vfd vfdVarC = nk9Var.c();
            vfdVarC.getClass();
            a(gh3VarJ9, gh3.j(pkg.j.c(vfdVarC.E)));
        }
        for (gh3 gh3Var4 : o84.a) {
            a(gh3.j(new ww7("kotlin.jvm.internal." + gh3Var4.i().b() + "CompanionObject")), gh3Var4.d(ygg.b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            a(gh3.j(new ww7(grc.p(i2, "kotlin.jvm.functions.Function"))), new gh3(pkg.j, sxb.e("Function" + i2)));
            b(new ww7(ij0.g(i2, b, new StringBuilder())), g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            e08 e08Var5 = e08.K;
            b(new ww7((e08Var5.E.a.toString() + '.' + e08Var5.F) + i3), g);
        }
        b(okg.b.g(), d(Void.class));
    }

    public static void a(gh3 gh3Var, gh3 gh3Var2) {
        xw7 xw7VarI = gh3Var.b().i();
        xw7VarI.getClass();
        h.put(xw7VarI, gh3Var2);
        b(gh3Var2.b(), gh3Var);
    }

    public static void b(ww7 ww7Var, gh3 gh3Var) {
        xw7 xw7VarI = ww7Var.i();
        xw7VarI.getClass();
        i.put(xw7VarI, gh3Var);
    }

    public static void c(Class cls, xw7 xw7Var) {
        a(d(cls), gh3.j(xw7Var.g()));
    }

    public static gh3 d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? gh3.j(new ww7(cls.getCanonicalName())) : d(declaringClass).d(sxb.e(cls.getSimpleName()));
    }

    public static boolean e(xw7 xw7Var, String str) {
        Integer numR0;
        String str2 = xw7Var.a;
        if (str2 != null) {
            String strC1 = bsg.c1(str2, str, "");
            return strC1.length() > 0 && !bsg.a1(strC1, '0') && (numR0 = isg.r0(10, strC1)) != null && numR0.intValue() >= 23;
        }
        xw7.a(4);
        throw null;
    }

    public static gh3 f(ww7 ww7Var) {
        return (gh3) h.get(ww7Var.i());
    }

    public static gh3 g(xw7 xw7Var) {
        return (e(xw7Var, a) || e(xw7Var, c)) ? e : (e(xw7Var, b) || e(xw7Var, d)) ? g : (gh3) i.get(xw7Var);
    }
}
