package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wm9 extends rn9 implements um9 {
    public final kw9 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm9(im9 im9Var, String str, String str2, Object obj) {
        super(im9Var, str, str2, obj);
        str.getClass();
        str2.getClass();
        this.R = yb5.w(w1a.F, new l4(22, this));
    }

    @Override // defpackage.um9, defpackage.zm9
    public final vm9 c() {
        return (vm9) this.R.getValue();
    }

    @Override // defpackage.um9
    public final void k(Object obj, Object obj2) {
        ((vm9) this.R.getValue()).call(obj, obj2);
    }

    @Override // defpackage.zm9
    public final bo9 c() {
        return (vm9) this.R.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm9(im9 im9Var, hrd hrdVar) {
        super(im9Var, hrdVar);
        hrdVar.getClass();
        this.R = yb5.w(w1a.F, new l4(22, this));
    }
}
