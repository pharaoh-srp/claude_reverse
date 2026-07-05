package defpackage;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ctj extends dsj {
    public final /* synthetic */ htj J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctj(htj htjVar) {
        super(0);
        this.J = htjVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        htj htjVar = this.J;
        vpj.b(i, htjVar.L);
        int i2 = i + i;
        Object[] objArr = htjVar.K;
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
