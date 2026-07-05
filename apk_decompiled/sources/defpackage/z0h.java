package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z0h implements m9 {
    public final /* synthetic */ int a;
    public final boolean b;

    public /* synthetic */ z0h(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.m9
    public final vlg a(vlg vlgVar) {
        switch (this.a) {
            case 0:
                a1h a1hVar = (a1h) vlgVar;
                a1hVar.getClass();
                return new a1h(a1hVar.a, a1hVar.b, a1hVar.c, a1hVar.d, this.b);
            default:
                a1h a1hVar2 = (a1h) vlgVar;
                a1hVar2.getClass();
                return new a1h(a1hVar2.a, a1hVar2.b, this.b, a1hVar2.d, a1hVar2.e);
        }
    }
}
