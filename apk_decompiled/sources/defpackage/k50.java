package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k50 implements pp9 {
    public final /* synthetic */ int a;

    public /* synthetic */ k50(int i) {
        this.a = i;
    }

    @Override // defpackage.pp9
    public final String a(Object obj, qjc qjcVar) {
        switch (this.a) {
            case 0:
                dli dliVar = (dli) obj;
                if (!x44.r(dliVar.c, "android.resource")) {
                    return null;
                }
                return dliVar + ":" + jqi.b(qjcVar.b().getResources().getConfiguration());
            default:
                return ((dli) obj).a;
        }
    }
}
