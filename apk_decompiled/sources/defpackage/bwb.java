package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class bwb extends cwb implements um9 {
    public bwb(pl9 pl9Var, String str, String str2) {
        super(g92.NO_RECEIVER, ((sg3) pl9Var).a(), str, str2, !Objects.nonNull(pl9Var) ? 1 : 0);
    }

    @Override // defpackage.wn9, defpackage.kn9
    public final pn9 b() {
        return ((um9) getReflected()).b();
    }

    @Override // defpackage.zm9
    public final vm9 c() {
        return ((um9) getReflected()).c();
    }

    @Override // defpackage.g92
    public final ll9 computeReflected() {
        return jce.a.e(this);
    }

    @Override // defpackage.on9
    public Object get(Object obj) {
        return b().call(obj);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // defpackage.um9
    public void k(Object obj, Object obj2) {
        c().call(obj, obj2);
    }

    public bwb(Class cls, String str, String str2, int i) {
        super(g92.NO_RECEIVER, cls, str, str2, i);
    }
}
