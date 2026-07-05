package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class k25 {
    public static final oqb a;
    public static final oqb b;
    public static final oqb c;

    static {
        a73 a73Var = new a73(22);
        oqb oqbVar = new oqb();
        a73Var.invoke(oqbVar);
        a = oqbVar;
        a73 a73Var2 = new a73(23);
        oqb oqbVar2 = new oqb();
        a73Var2.invoke(oqbVar2);
        b = oqbVar2;
        a73 a73Var3 = new a73(24);
        oqb oqbVar3 = new oqb();
        a73Var3.invoke(oqbVar3);
        c = oqbVar3;
    }

    public static Boolean a(x4f x4fVar, mn5 mn5Var) {
        x4fVar.getClass();
        mn5Var.getClass();
        g25 g25VarC = c(x4fVar);
        if (g25VarC != null) {
            return Boolean.valueOf(g25VarC.c < mn5Var.a());
        }
        return null;
    }

    public static String b(ze0 ze0Var, String str) {
        ze0Var.getClass();
        if (ze0Var.equals(xe0.g)) {
            return str != null ? "user_cookies_".concat(str) : "user_cookies_login";
        }
        String strN0 = isg.n0(ze0Var.a(), "/", "-", false);
        return str != null ? ij0.k("user_cookies___", strN0, "__", str) : "user_cookies_login__".concat(strN0);
    }

    public static g25 c(x4f x4fVar) {
        Object next;
        x4fVar.getClass();
        Iterator it = ((ArrayList) x4fVar.c.d()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((g25) next).a.equals("sessionKey")) {
                break;
            }
        }
        return (g25) next;
    }

    public static x4f d(Context context, String str, tg9 tg9Var, ze0 ze0Var, yz8 yz8Var) {
        for (Map.Entry entry : ((Map) ze0.f.getValue()).entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            kw9 kw9Var = ze0.f;
            String strB = b(ez1.G(str2), str);
            String strB2 = b(ez1.G(str3), str);
            if (!strB.equals(strB2)) {
                Context context2 = x44.d;
                if (context2 == null) {
                    sz6.j("Context not initialized");
                    return null;
                }
                SharedPreferences sharedPreferences = context2.getSharedPreferences(strB, 0);
                sharedPreferences.getClass();
                Context context3 = x44.d;
                if (context3 == null) {
                    sz6.j("Context not initialized");
                    return null;
                }
                SharedPreferences sharedPreferences2 = context3.getSharedPreferences(strB2, 0);
                sharedPreferences2.getClass();
                csg.k(sharedPreferences, sharedPreferences2);
            }
            Context context4 = x44.d;
            if (context4 == null) {
                sz6.j("Context not initialized");
                return null;
            }
            context4.deleteSharedPreferences(strB);
        }
        SharedPreferences sharedPreferences3 = context.getSharedPreferences(b(ze0Var, str), 0);
        sharedPreferences3.getClass();
        return new x4f(new cbf(sharedPreferences3, 4, tg9Var), yz8Var);
    }
}
