package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.networking.cookies.serializer.SerializableCookie;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x4f implements i25, eo3 {
    public final cbf b;
    public final yz8 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [lm6] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public x4f(cbf cbfVar, yz8 yz8Var) {
        ?? arrayList;
        Collection<?> collectionValues;
        boolean z;
        boolean z2;
        this.b = cbfVar;
        this.c = yz8Var;
        Map<String, ?> all = ((SharedPreferences) cbfVar.F).getAll();
        if (all == null || (collectionValues = all.values()) == null) {
            arrayList = lm6.E;
        } else {
            arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                tg9 tg9Var = (tg9) cbfVar.G;
                obj.getClass();
                SerializableCookie serializableCookie = (SerializableCookie) tg9Var.a.b((String) obj, SerializableCookie.Companion.serializer());
                serializableCookie.getClass();
                String domain = serializableCookie.getDomain();
                domain.getClass();
                String strB = tkj.b(domain);
                if (strB == null) {
                    sz6.p("unexpected domain: ".concat(domain));
                    throw null;
                }
                String path = serializableCookie.getPath();
                path.getClass();
                if (!isg.q0(path, "/", false)) {
                    sz6.p("path must start with '/'");
                    throw null;
                }
                String name = serializableCookie.getName();
                name.getClass();
                if (!x44.r(bsg.k1(name).toString(), name)) {
                    sz6.p("name is not trimmed");
                    throw null;
                }
                String value = serializableCookie.getValue();
                value.getClass();
                if (!x44.r(bsg.k1(value).toString(), value)) {
                    sz6.p("value is not trimmed");
                    throw null;
                }
                Long expiresAt = serializableCookie.getExpiresAt();
                if (expiresAt != null) {
                    long jLongValue = expiresAt.longValue();
                    jLongValue = jLongValue <= 0 ? Long.MIN_VALUE : jLongValue;
                    j = jLongValue <= 253402300799999L ? jLongValue : 253402300799999L;
                    z = true;
                } else {
                    z = false;
                }
                boolean secure = serializableCookie.getSecure();
                boolean httpOnly = serializableCookie.getHttpOnly();
                if (serializableCookie.getHostOnly()) {
                    String domain2 = serializableCookie.getDomain();
                    domain2.getClass();
                    strB = tkj.b(domain2);
                    if (strB == null) {
                        sz6.p("unexpected domain: ".concat(domain2));
                        throw null;
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(new g25(name, value, j, strB, path, secure, httpOnly, z, z2, null));
            }
        }
        yz8Var.c((Collection) arrayList);
    }

    @Override // defpackage.i25
    public final void a(vs8 vs8Var, List list) {
        vs8Var.getClass();
        c(list);
    }

    @Override // defpackage.i25
    public final List b(vs8 vs8Var) {
        vs8Var.getClass();
        return this.c.b(vs8Var);
    }

    public final void c(List list) {
        List<g25> list2 = list;
        this.c.c(list2);
        cbf cbfVar = this.b;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) cbfVar.F).edit();
        for (g25 g25Var : list2) {
            String strI = cbf.i(g25Var);
            bg9 bg9Var = ((tg9) cbfVar.G).a;
            String str = g25Var.a;
            String str2 = g25Var.b;
            Long lValueOf = Long.valueOf(g25Var.c);
            if (!g25Var.h) {
                lValueOf = null;
            }
            editorEdit.putString(strI, bg9Var.d(new SerializableCookie(str, str2, lValueOf, g25Var.d, g25Var.e, g25Var.f, g25Var.g, g25Var.i), SerializableCookie.Companion.serializer()));
        }
        editorEdit.apply();
    }

    public final void d() {
        ((SharedPreferences) this.b.F).edit().clear().commit();
        yz8 yz8Var = this.c;
        synchronized (yz8Var.b) {
            yz8Var.b.clear();
        }
    }

    public final void e() {
        List listD = this.c.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listD) {
            if (((g25) obj).a.equals("__Host-ant_trusted_device")) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.b.F).edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove(cbf.i((g25) it.next()));
        }
        editorEdit.apply();
        yz8 yz8Var = this.c;
        synchronized (yz8Var.b) {
            b54.x0(yz8Var.b, new ed8(23));
        }
    }
}
