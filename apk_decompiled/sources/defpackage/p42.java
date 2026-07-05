package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p42 implements n42 {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n42
    public final boolean a(h1f h1fVar) {
        switch (this.a) {
            case 0:
                if ((h1fVar instanceof f1f) && ((f1f) h1fVar).a().size() != 0) {
                    break;
                }
                break;
            case 1:
                if (h1fVar.b != null) {
                    break;
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
