package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qyc extends h3 {
    public final /* synthetic */ int E;
    public final myc F;

    public /* synthetic */ qyc(int i, myc mycVar) {
        this.E = i;
        this.F = mycVar;
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
                ((Map.Entry) obj).getClass();
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
        int i = this.E;
        myc mycVar = this.F;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                mycVar.getClass();
                Object obj2 = mycVar.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && mycVar.containsKey(entry.getKey());
            default:
                return mycVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.E;
        myc mycVar = this.F;
        switch (i) {
            case 0:
                return new syc(mycVar);
            default:
                mycVar.getClass();
                y6i[] y6iVarArr = new y6i[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    y6iVarArr[i2] = new a7i(1);
                }
                return new tyc(mycVar, y6iVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.E;
        myc mycVar = this.F;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return mycVar.remove(entry.getKey(), entry.getValue());
            default:
                if (!mycVar.containsKey(obj)) {
                    return false;
                }
                mycVar.remove(obj);
                return true;
        }
    }
}
