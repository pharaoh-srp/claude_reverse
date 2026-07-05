package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cyk implements jvd {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6i b;

    public /* synthetic */ cyk(l6i l6iVar, int i) {
        this.a = i;
        this.b = l6iVar;
    }

    @Override // defpackage.jvd
    public final Object get() {
        int i = this.a;
        l6i l6iVar = this.b;
        switch (i) {
            case 0:
                return l6iVar.a("FIREBASE_ML_SDK", new en6("json"), hj6.X);
            case 1:
                return l6iVar.a("FIREBASE_ML_SDK", new en6("proto"), c0l.Y);
            case 2:
                return l6iVar.a("FIREBASE_ML_SDK", new en6("json"), lyk.Z);
            default:
                return l6iVar.a("FIREBASE_ML_SDK", new en6("proto"), tqh.Y);
        }
    }
}
