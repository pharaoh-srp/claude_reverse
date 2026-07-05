package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f5e extends zna {
    public final /* synthetic */ qb5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5e(int i, qb5 qb5Var) {
        super(i);
        this.g = qb5Var;
    }

    @Override // defpackage.zna
    public final void b(Object obj, Object obj2, Object obj3) {
        d5e d5eVar = (d5e) obj2;
        ((at) this.g.E).p((nab) obj, d5eVar.a, d5eVar.b, d5eVar.c);
    }

    @Override // defpackage.zna
    public final int g(Object obj, Object obj2) {
        return ((d5e) obj2).c;
    }
}
