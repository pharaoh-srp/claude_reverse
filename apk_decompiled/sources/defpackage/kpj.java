package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class kpj extends x5l {
    public final transient wpj J;
    public final transient Object[] K;
    public final transient int L;

    public kpj(wpj wpjVar, Object[] objArr) {
        super(2);
        this.J = wpjVar;
        this.K = objArr;
        this.L = 1;
    }

    @Override // defpackage.hrj
    public final int a(Object[] objArr) {
        return h().a(objArr);
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
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.L;
    }
}
