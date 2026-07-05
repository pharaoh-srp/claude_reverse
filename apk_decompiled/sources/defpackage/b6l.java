package defpackage;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b6l extends n4l {
    public final /* synthetic */ g6l J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6l(g6l g6lVar) {
        super(1);
        this.J = g6lVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        g6l g6lVar = this.J;
        ink.b(i, g6lVar.L);
        int i2 = i + i;
        Object[] objArr = g6lVar.K;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.J.L;
    }
}
