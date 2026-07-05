package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class jpj extends j5l {
    public final transient wpj J;
    public final transient qpj K;

    public jpj(wpj wpjVar, qpj qpjVar) {
        super(1);
        this.J = wpjVar;
        this.K = qpjVar;
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
        this.J.getClass();
        return 1;
    }
}
