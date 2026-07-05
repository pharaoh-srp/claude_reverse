package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ryc extends h3 {
    public final /* synthetic */ int E;
    public final nyc F;

    public /* synthetic */ ryc(int i, nyc nycVar) {
        this.E = i;
        this.F = nycVar;
    }

    @Override // defpackage.h3
    public final int a() {
        switch (this.E) {
        }
        return this.F.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.E) {
            case 0:
                this.F.clear();
                break;
            default:
                this.F.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.E) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                nyc nycVar = this.F;
                Object obj2 = nycVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && nycVar.containsKey(entry.getKey());
            default:
                return this.F.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.E) {
            case 0:
                return new syc(this.F);
            default:
                z6i[] z6iVarArr = new z6i[8];
                for (int i = 0; i < 8; i++) {
                    z6iVarArr[i] = new c7i();
                }
                return new uyc(this.F, z6iVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.E) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.F.remove(entry.getKey(), entry.getValue());
            default:
                nyc nycVar = this.F;
                if (!nycVar.containsKey(obj)) {
                    return false;
                }
                nycVar.remove(obj);
                return true;
        }
    }
}
