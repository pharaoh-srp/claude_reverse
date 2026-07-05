package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ph0 extends tw7 {
    public final /* synthetic */ wh0 N;
    public final /* synthetic */ zh0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph0(zh0 zh0Var, zh0 zh0Var2, wh0 wh0Var) {
        super(zh0Var2);
        this.O = zh0Var;
        this.N = wh0Var;
    }

    @Override // defpackage.tw7
    public final l5g b() {
        return this.N;
    }

    @Override // defpackage.tw7
    public final boolean c() {
        zh0 zh0Var = this.O;
        if (zh0Var.getInternalPopup().b()) {
            return true;
        }
        zh0Var.J.n(zh0Var.getTextDirection(), zh0Var.getTextAlignment());
        return true;
    }
}
