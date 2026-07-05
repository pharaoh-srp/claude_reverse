package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n0k extends b0k {
    public final /* synthetic */ o0k J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0k(o0k o0kVar) {
        super(1);
        this.J = o0kVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.J.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b0k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return tpk.l(this.J.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return q().listIterator(0);
    }

    @Override // defpackage.upj
    public final efi k() {
        return q().listIterator(0);
    }

    @Override // defpackage.b0k
    public final pzj r() {
        return new i0k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.J.H.size();
    }
}
