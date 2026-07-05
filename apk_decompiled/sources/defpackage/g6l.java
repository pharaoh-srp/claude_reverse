package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g6l extends j5l {
    public final transient wpj J;
    public final transient Object[] K;
    public final transient int L;

    public g6l(wpj wpjVar, Object[] objArr) {
        super(1);
        this.J = wpjVar;
        this.K = objArr;
        this.L = 1;
    }

    @Override // defpackage.hrj
    public final int a(Object[] objArr) {
        n4l b6lVar = this.I;
        if (b6lVar == null) {
            b6lVar = new b6l(this);
            this.I = b6lVar;
        }
        return b6lVar.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.J.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        n4l b6lVar = this.I;
        if (b6lVar == null) {
            b6lVar = new b6l(this);
            this.I = b6lVar;
        }
        return b6lVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.L;
    }
}
