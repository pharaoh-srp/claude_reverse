package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mfk implements wxk {
    public static final mfk b = new mfk(0);
    public static final mfk c = new mfk(1);
    public static final mfk d = new mfk(2);
    public final /* synthetic */ int a;

    public /* synthetic */ mfk(int i) {
        this.a = i;
    }

    @Override // defpackage.wxk
    public final boolean d(int i) {
        switch (this.a) {
            case 0:
                if (i == 0 || i == 1 || i == 2) {
                }
                break;
            case 1:
                if (kgh.a(i) != 0) {
                }
                break;
            default:
                if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                }
                break;
        }
        return true;
    }
}
