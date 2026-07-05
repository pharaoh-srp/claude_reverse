package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class prc extends zh4 {
    public final /* synthetic */ int r;
    public final Method s;
    public final int t;
    public final boolean u;

    public /* synthetic */ prc(int i, int i2, Method method, boolean z) {
        this.r = i2;
        this.s = method;
        this.t = i;
        this.u = z;
    }

    @Override // defpackage.zh4
    public final void j(zie zieVar, Object obj) {
        int i = this.r;
        boolean z = this.u;
        Method method = this.s;
        int i2 = this.t;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw zni.Q(method, i2, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw zni.Q(method, i2, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw zni.Q(method, i2, ij0.j("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw zni.Q(method, i2, "Field map value '" + value + "' converted to null by " + lz1.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    epk epkVar = zieVar.j;
                    if (z) {
                        epkVar.h(str, string);
                    } else {
                        epkVar.g(str, string);
                    }
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw zni.Q(method, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw zni.Q(method, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw zni.Q(method, i2, ij0.j("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    zieVar.a(str2, value2.toString(), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw zni.Q(method, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw zni.Q(method, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw zni.Q(method, i2, ij0.j("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw zni.Q(method, i2, "Query map value '" + value3 + "' converted to null by " + lz1.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    zieVar.b(str3, string2, z);
                }
                return;
        }
    }
}
