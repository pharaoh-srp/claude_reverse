package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sk8 {
    public static final u0h h = new u0h(new ij8(10));
    public static final u0h i = new u0h(new ij8(11));
    public final String a;
    public final int b;
    public final pl9 c;
    public final z7e d;
    public final String e;
    public final Map f;
    public final boolean g;

    public sk8(String str, int i2, pl9 pl9Var, z7e z7eVar, String str2, Map map, boolean z) {
        pl9Var.getClass();
        this.a = str;
        this.b = i2;
        this.c = pl9Var;
        this.d = z7eVar;
        this.e = str2;
        this.f = map;
        this.g = z;
    }

    public final List a(y7e y7eVar) {
        y7eVar.getClass();
        try {
            uj5.f(this.c, y7eVar);
            return b(y7eVar);
        } catch (Throwable th) {
            zfa.a.getClass();
            if (!yfa.b()) {
                return null;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            zfa.a.getClass();
            String strK = ij0.k("Record object with identifier ", this.a, " could not be cast: ", gsk.c(th));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.ERROR, "HealthDataTypes", strK);
            }
            return null;
        }
    }

    public abstract List b(y7e y7eVar);

    public final int c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final z7e e() {
        return this.d;
    }

    public final pl9 f() {
        return this.c;
    }

    public final boolean g() {
        return this.g;
    }

    public final Map h() {
        return this.f;
    }

    public final String i() {
        return this.e;
    }
}
