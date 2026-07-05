package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bla {
    public final List a;

    public bla(List list) {
        this.a = list;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        List list = this.a;
        ig9 ig9Var = new ig9(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ig9Var.p((String) it.next());
        }
        qh9Var.o("id", ig9Var);
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bla) && this.a.equals(((bla) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ebh.n("Action(id=", ")", this.a);
    }
}
