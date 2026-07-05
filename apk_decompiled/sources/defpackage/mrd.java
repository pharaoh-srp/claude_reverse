package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class mrd extends ord implements on9 {
    public mrd(fm9 fm9Var, String str, String str2) {
        super(g92.NO_RECEIVER, ((sg3) fm9Var).a(), str, str2, !(fm9Var instanceof pl9) ? 1 : 0);
    }

    @Override // defpackage.wn9, defpackage.kn9
    public final pn9 b() {
        return ((on9) getReflected()).b();
    }

    @Override // defpackage.g92
    public final ll9 computeReflected() {
        return jce.a.g(this);
    }

    public Object get(Object obj) {
        return b().call(obj);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return get(obj);
    }

    public mrd(Class cls, String str, String str2) {
        super(g92.NO_RECEIVER, cls, str, str2, 0);
    }
}
