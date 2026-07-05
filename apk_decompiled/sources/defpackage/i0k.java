package defpackage;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i0k extends pzj {
    public final /* synthetic */ n0k I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0k(n0k n0kVar) {
        super(1);
        this.I = n0kVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        o0k o0kVar = this.I.J;
        return new AbstractMap.SimpleImmutableEntry(o0kVar.G.L.get(i), o0kVar.H.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.I.J.H.size();
    }
}
