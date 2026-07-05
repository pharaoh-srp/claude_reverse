package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cri extends dab {
    public static final cri d = new cri("must have no value parameters", 0);
    public static final cri e = new cri("must have a single value parameter", 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cri(String str, int i) {
        super(str, 1);
        this.c = i;
    }

    @Override // defpackage.wd3
    public final boolean a(ge9 ge9Var) {
        switch (this.c) {
            case 0:
                return ge9Var.I().isEmpty();
            default:
                return ge9Var.I().size() == 1;
        }
    }
}
