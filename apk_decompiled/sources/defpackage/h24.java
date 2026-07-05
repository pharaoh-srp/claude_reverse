package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h24 extends lrd {
    public final /* synthetic */ int F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h24(hfa hfaVar) {
        super(hfaVar, xn5.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        this.F = 3;
    }

    @Override // defpackage.kn9
    public final Object get() {
        switch (this.F) {
            case 0:
                return ((koi) this.receiver).f();
            case 1:
                return ((wlg) this.receiver).getValue();
            case 2:
                return ((wlg) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h24(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.F = i2;
    }
}
