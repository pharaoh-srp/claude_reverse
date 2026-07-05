package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a0k extends fzj {
    public final transient l0k G;
    public final transient Object[] H;
    public final transient int I;

    public a0k(l0k l0kVar, Object[] objArr, int i) {
        this.G = l0kVar;
        this.H = objArr;
        this.I = i;
    }

    @Override // defpackage.hxj
    public final int a(Object[] objArr) {
        return g().a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.G.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // defpackage.fzj
    public final txj l() {
        return new xzj(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.I;
    }
}
