package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class nn9 extends do9 implements kn9 {
    public final kw9 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn9(im9 im9Var, String str, String str2, Object obj) {
        super(im9Var, str, str2, null, obj);
        str.getClass();
        str2.getClass();
        mn9 mn9Var = new mn9(this, 0);
        w1a w1aVar = w1a.F;
        this.Q = yb5.w(w1aVar, mn9Var);
        yb5.w(w1aVar, new mn9(this, 1));
    }

    @Override // defpackage.zy7
    public final Object a() {
        return get();
    }

    @Override // defpackage.wn9, defpackage.kn9
    public final ln9 b() {
        return (ln9) this.Q.getValue();
    }

    @Override // defpackage.kn9
    public final Object get() {
        return ((ln9) this.Q.getValue()).call(new Object[0]);
    }

    @Override // defpackage.do9
    public final zn9 z() {
        return (ln9) this.Q.getValue();
    }

    @Override // defpackage.wn9, defpackage.kn9
    public final zn9 b() {
        return (ln9) this.Q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn9(im9 im9Var, hrd hrdVar) {
        super(im9Var, hrdVar);
        hrdVar.getClass();
        mn9 mn9Var = new mn9(this, 0);
        w1a w1aVar = w1a.F;
        this.Q = yb5.w(w1aVar, mn9Var);
        yb5.w(w1aVar, new mn9(this, 1));
    }
}
