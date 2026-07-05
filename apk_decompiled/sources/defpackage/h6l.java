package defpackage;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h6l extends e5l {
    public final /* synthetic */ kpj J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6l(kpj kpjVar) {
        super(2);
        this.J = kpjVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        kpj kpjVar = this.J;
        qzi.a(i, kpjVar.L);
        int i2 = i + i;
        Object[] objArr = kpjVar.K;
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
