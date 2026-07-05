package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class aca extends vxi {
    public static final zba d = new zba();
    public final jgg b = new jgg(0);
    public boolean c = false;

    @Override // defpackage.vxi
    public final void d() {
        jgg jggVar = this.b;
        int i = jggVar.G;
        for (int i2 = 0; i2 < i; i2++) {
            yba ybaVar = (yba) jggVar.d(i2);
            goj gojVar = ybaVar.l;
            gojVar.a();
            gojVar.c = true;
            z5l z5lVar = ybaVar.n;
            if (z5lVar != null) {
                ybaVar.h(z5lVar);
            }
            yba ybaVar2 = gojVar.a;
            if (ybaVar2 == null) {
                sz6.j("No listener register");
                return;
            }
            if (ybaVar2 != ybaVar) {
                sz6.p("Attempting to unregister the wrong listener");
                return;
            }
            gojVar.a = null;
            if (z5lVar != null) {
                boolean z = z5lVar.F;
            }
            gojVar.d = true;
            gojVar.b = false;
            gojVar.c = false;
            gojVar.e = false;
        }
        int i3 = jggVar.G;
        Object[] objArr = jggVar.F;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        jggVar.G = 0;
    }
}
