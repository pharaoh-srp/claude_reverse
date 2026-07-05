package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xde extends qz8 {
    public final transient aee H;
    public final transient Object[] I;
    public final transient int J;

    public xde(aee aeeVar, Object[] objArr, int i) {
        this.H = aeeVar;
        this.I = objArr;
        this.J = i;
    }

    @Override // defpackage.cz8
    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    @Override // defpackage.cz8, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.H.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cz8
    public final boolean k() {
        return true;
    }

    @Override // defpackage.cz8
    /* JADX INFO: renamed from: l */
    public final efi iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.qz8
    public final nz8 q() {
        return new wde(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.J;
    }
}
