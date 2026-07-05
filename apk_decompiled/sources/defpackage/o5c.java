package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o5c extends q5c {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public o5c(String str) {
        StringBuilder sbB = xrg.b();
        xrg.a(str, sbB, false);
        this.b = ouk.g(xrg.k(sbB));
    }

    @Override // defpackage.av6
    public final int a() {
        switch (this.a) {
            case 0:
                return 6;
            default:
                return 8;
        }
    }

    @Override // defpackage.q5c
    public final boolean g(c5c c5cVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ouk.g(c5cVar.B()).contains((String) obj);
            default:
                return ((hde) obj).b(c5cVar.B()).B();
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ij0.j(":contains(", (String) obj, ")");
            default:
                return String.format(":matches(%s)", (hde) obj);
        }
    }

    public o5c(hde hdeVar) {
        this.b = hdeVar;
    }
}
