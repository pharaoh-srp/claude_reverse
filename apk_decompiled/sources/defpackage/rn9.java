package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class rn9 extends do9 implements on9 {
    public final kw9 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn9(im9 im9Var, String str, String str2, Object obj) {
        super(im9Var, str, str2, null, obj);
        str.getClass();
        str2.getClass();
        qn9 qn9Var = new qn9(this, 0);
        w1a w1aVar = w1a.F;
        this.Q = yb5.w(w1aVar, qn9Var);
        yb5.w(w1aVar, new qn9(this, 1));
    }

    @Override // defpackage.wn9, defpackage.kn9
    public final pn9 b() {
        return (pn9) this.Q.getValue();
    }

    @Override // defpackage.on9
    public final Object get(Object obj) {
        return ((pn9) this.Q.getValue()).call(obj);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // defpackage.do9
    public final zn9 z() {
        return (pn9) this.Q.getValue();
    }

    @Override // defpackage.wn9, defpackage.kn9
    public final zn9 b() {
        return (pn9) this.Q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn9(im9 im9Var, hrd hrdVar) {
        super(im9Var, hrdVar);
        hrdVar.getClass();
        qn9 qn9Var = new qn9(this, 0);
        w1a w1aVar = w1a.F;
        this.Q = yb5.w(w1aVar, qn9Var);
        yb5.w(w1aVar, new qn9(this, 1));
    }
}
