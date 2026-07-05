package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class mtj extends rsj {
    public final transient ytj J;
    public final transient rtj K;

    public mtj(ytj ytjVar, rtj rtjVar) {
        super(0);
        this.J = ytjVar;
        this.K = rtjVar;
    }

    @Override // defpackage.hrj
    public final int a(Object[] objArr) {
        return this.K.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.J.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.K.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.J.J;
    }
}
