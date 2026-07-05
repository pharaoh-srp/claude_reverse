package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bsc {
    public final List a = new ArrayList();
    public int b;

    public final Object a(pl9 pl9Var) {
        Object next;
        pl9Var.getClass();
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        Object obj = list.get(this.b);
        if (!pl9Var.n(obj)) {
            obj = null;
        }
        if (obj == null) {
            obj = null;
        }
        if (obj != null && this.b < x44.M(list)) {
            this.b++;
        }
        if (obj != null) {
            return obj;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (pl9Var.n(next)) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        return next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bsc) {
            return x44.r(this.a, ((bsc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + w44.p1(this.a);
    }
}
