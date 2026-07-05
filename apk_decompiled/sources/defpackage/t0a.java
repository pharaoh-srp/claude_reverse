package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t0a {
    public final /* synthetic */ z9e a;
    public final /* synthetic */ j0a b;
    public final /* synthetic */ mnc c;
    public final /* synthetic */ rz7 d;
    public final /* synthetic */ sz7 e;

    public t0a(z9e z9eVar, j0a j0aVar, mnc mncVar, rz7 rz7Var, sz7 sz7Var) {
        this.a = z9eVar;
        this.b = j0aVar;
        this.c = mncVar;
        this.d = rz7Var;
        this.e = sz7Var;
    }

    public static void a(t0a t0aVar, boolean z, String str, pz7 pz7Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        j0a j0aVar = t0aVar.b;
        z9e z9eVar = t0aVar.a;
        mnc mncVar = t0aVar.c;
        if (z) {
            if (z9eVar.E) {
                j0a.V(j0aVar, null, null, new ta4(-822076856, true, new sz2(t0aVar.d, mncVar, 1)), 3);
            }
            z9eVar.E = true;
            if (str != null) {
                j0a.V(j0aVar, null, null, new ta4(400525769, true, new xg4(t0aVar.e, str, mncVar, 19)), 3);
            }
            pz7Var.invoke(j0aVar, mncVar);
        }
    }
}
