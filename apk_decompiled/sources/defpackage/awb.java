package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class awb extends cwb implements rm9 {
    public awb(Class cls, String str, String str2) {
        super(g92.NO_RECEIVER, cls, str, str2, 1);
    }

    @Override // defpackage.zy7
    public final Object a() {
        return get();
    }

    @Override // defpackage.wn9, defpackage.kn9
    public final ln9 b() {
        return ((rm9) getReflected()).b();
    }

    @Override // defpackage.zm9
    public final sm9 c() {
        return ((rm9) getReflected()).c();
    }

    @Override // defpackage.g92
    public final ll9 computeReflected() {
        return jce.a.d(this);
    }

    @Override // defpackage.kn9
    public Object get() {
        return b().call(new Object[0]);
    }
}
