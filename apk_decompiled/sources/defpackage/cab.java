package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cab extends dab {
    public static final cab d = new cab("must be a member function", 0);
    public static final cab e = new cab("must be a member or an extension function", 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cab(String str, int i) {
        super(str, 0);
        this.c = i;
    }

    @Override // defpackage.wd3
    public final boolean a(ge9 ge9Var) {
        switch (this.c) {
            case 0:
                if (ge9Var.N == null) {
                    break;
                }
                break;
            default:
                if (ge9Var.N == null && ge9Var.M == null) {
                    break;
                }
                break;
        }
        return false;
    }
}
