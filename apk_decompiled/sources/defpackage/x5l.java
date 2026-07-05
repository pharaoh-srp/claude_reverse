package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x5l extends hrj implements Set {
    public transient e5l I;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final e5l h() {
        e5l e5lVar = this.I;
        if (e5lVar != null) {
            return e5lVar;
        }
        h6l h6lVar = new h6l((kpj) this);
        this.I = h6lVar;
        return h6lVar;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
