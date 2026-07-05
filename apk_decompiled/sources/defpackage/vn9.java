package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class vn9 extends do9 implements sn9 {
    public final kw9 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn9(im9 im9Var, String str, String str2) {
        super(im9Var, str, str2, null, g92.NO_RECEIVER);
        str.getClass();
        str2.getClass();
        un9 un9Var = new un9(this, 0);
        w1a w1aVar = w1a.F;
        this.Q = yb5.w(w1aVar, un9Var);
        yb5.w(w1aVar, new un9(this, 1));
    }

    @Override // defpackage.wn9, defpackage.kn9
    public final tn9 b() {
        return (tn9) this.Q.getValue();
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((tn9) this.Q.getValue()).call(obj, obj2);
    }

    @Override // defpackage.do9
    public final zn9 z() {
        return (tn9) this.Q.getValue();
    }

    @Override // defpackage.wn9, defpackage.kn9
    public final zn9 b() {
        return (tn9) this.Q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn9(im9 im9Var, hrd hrdVar) {
        super(im9Var, hrdVar);
        hrdVar.getClass();
        un9 un9Var = new un9(this, 0);
        w1a w1aVar = w1a.F;
        this.Q = yb5.w(w1aVar, un9Var);
        yb5.w(w1aVar, new un9(this, 1));
    }
}
