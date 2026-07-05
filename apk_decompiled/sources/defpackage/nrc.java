package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class nrc extends zh4 {
    public final Method r;
    public final int s;
    public final br4 t;

    public nrc(Method method, int i, br4 br4Var) {
        this.r = method;
        this.s = i;
        this.t = br4Var;
    }

    @Override // defpackage.zh4
    public final void j(zie zieVar, Object obj) {
        int i = this.s;
        Method method = this.r;
        if (obj == null) {
            throw zni.Q(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            zieVar.k = (tie) this.t.h(obj);
        } catch (IOException e) {
            throw zni.R(method, e, i, grc.t(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
        }
    }
}
