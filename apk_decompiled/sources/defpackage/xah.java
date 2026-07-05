package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xah {
    public static List a = lm6.E;
    public static boolean b;

    public static void a(String str, String str2) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((fch) it.next()).b(str, str2);
        }
    }

    public static void b(vba vbaVar) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((fch) it.next()).f(vbaVar);
        }
    }

    public static void c(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((fch) it.next()).c(str);
        }
    }

    public static void d(String str, String str2, Map map) {
        str2.getClass();
        map.getClass();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((fch) it.next()).e(str, str2, map);
        }
    }

    public static /* synthetic */ void e(int i, String str, String str2, Map map) {
        if ((i & 2) != 0) {
            str2 = "Log";
        }
        if ((i & 4) != 0) {
            map = nm6.E;
        }
        d(str, str2, map);
    }

    public static void f(Throwable th, String str, ozf ozfVar, Map map, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            ozfVar = ozf.G;
        }
        ozf ozfVar2 = ozfVar;
        if ((i & 8) != 0) {
            map = nm6.E;
        }
        th.getClass();
        if (!b) {
            map = t9e.v(map);
        }
        Map map2 = map;
        Throwable thK = b ? th : esk.k(th);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((fch) it.next()).h(th, thK, str2, ozfVar2, map2);
        }
    }

    public static void g(String str, String str2, Long l, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = "ok";
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((fch) it.next()).g(str, str2, l, str3);
        }
    }
}
