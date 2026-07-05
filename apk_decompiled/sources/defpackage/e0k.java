package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class e0k extends fzj {
    public final transient l0k G;
    public final transient h0k H;

    public e0k(l0k l0kVar, h0k h0kVar) {
        this.G = l0kVar;
        this.H = h0kVar;
    }

    @Override // defpackage.hxj
    public final int a(Object[] objArr) {
        return this.H.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.G.get(obj) != null;
    }

    @Override // defpackage.fzj, defpackage.hxj
    public final txj g() {
        return this.H;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.H.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.G.J;
    }
}
