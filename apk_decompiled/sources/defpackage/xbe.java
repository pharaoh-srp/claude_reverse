package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xbe implements sd9 {
    @Override // defpackage.sd9
    public zae a(ww7 ww7Var) {
        Object next;
        ww7Var.getClass();
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (yae.a(ez1.I(ez1.H(((zae) next).a))).b().equals(ww7Var)) {
                break;
            }
        }
        return (zae) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof xbe) && x44.r(b(), ((xbe) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
