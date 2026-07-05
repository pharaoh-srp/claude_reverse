package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class rrc extends zh4 {
    public final /* synthetic */ int r = 1;
    public final Method s;
    public final int t;
    public final br4 u;
    public final Object v;

    public rrc(Method method, int i, br4 br4Var, String str) {
        this.s = method;
        this.t = i;
        this.u = br4Var;
        this.v = str;
    }

    @Override // defpackage.zh4
    public final void j(zie zieVar, Object obj) {
        int i = this.r;
        br4 br4Var = this.u;
        Object obj2 = this.v;
        Method method = this.s;
        int i2 = this.t;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    tie tieVar = (tie) br4Var.h(obj);
                    zieVar.i.a((wg8) obj2, tieVar);
                    return;
                } catch (IOException e) {
                    throw zni.Q(method, i2, grc.t(obj, "Unable to convert ", " to RequestBody"), e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw zni.Q(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw zni.Q(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw zni.Q(method, i2, ij0.j("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", ij0.j("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    wg8 wg8Var = wg8.F;
                    zieVar.i.a(kxk.F(strArr), (tie) br4Var.h(value));
                }
                return;
        }
    }

    public rrc(Method method, int i, wg8 wg8Var, br4 br4Var) {
        this.s = method;
        this.t = i;
        this.v = wg8Var;
        this.u = br4Var;
    }
}
