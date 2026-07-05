package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t84 implements gbd {
    public final Object a;
    public final pac b;

    public t84(Object obj, pac pacVar) {
        this.a = obj;
        this.b = pacVar;
    }

    @Override // defpackage.gbd
    public final boolean test(Object obj) {
        return x44.r(this.b.invoke(obj), this.a);
    }
}
