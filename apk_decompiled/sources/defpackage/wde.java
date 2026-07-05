package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class wde extends nz8 {
    public final /* synthetic */ xde G;

    public wde(xde xdeVar) {
        this.G = xdeVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xde xdeVar = this.G;
        fd9.G(i, xdeVar.J);
        Object[] objArr = xdeVar.I;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.cz8
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.G.J;
    }
}
