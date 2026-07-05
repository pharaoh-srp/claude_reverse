package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class htj extends rsj {
    public final transient ytj J;
    public final transient Object[] K;
    public final transient int L;

    public htj(ytj ytjVar, Object[] objArr, int i) {
        super(0);
        this.J = ytjVar;
        this.K = objArr;
        this.L = i;
    }

    @Override // defpackage.hrj
    public final int a(Object[] objArr) {
        dsj ctjVar = this.I;
        if (ctjVar == null) {
            ctjVar = new ctj(this);
            this.I = ctjVar;
        }
        return ctjVar.a(objArr);
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
        dsj ctjVar = this.I;
        if (ctjVar == null) {
            ctjVar = new ctj(this);
            this.I = ctjVar;
        }
        return ctjVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.L;
    }
}
