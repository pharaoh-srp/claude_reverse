package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class pv5 {
    public final String a;
    public final n78 b;

    public pv5(Set set, n78 n78Var) {
        this.a = b(set);
        this.b = n78Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            t81 t81Var = (t81) it.next();
            sb.append(t81Var.a);
            sb.append('/');
            sb.append(t81Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        n78 n78Var = this.b;
        synchronized (((HashSet) n78Var.F)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) n78Var.F);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) n78Var.F)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) n78Var.F);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
