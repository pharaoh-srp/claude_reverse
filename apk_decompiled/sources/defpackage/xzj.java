package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xzj extends txj {
    public final /* synthetic */ a0k G;

    public xzj(a0k a0kVar) {
        this.G = a0kVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        a0k a0kVar = this.G;
        yvj.b(i, a0kVar.I);
        Object[] objArr = a0kVar.H;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.hxj
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.G.I;
    }
}
