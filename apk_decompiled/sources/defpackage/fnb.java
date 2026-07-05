package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fnb implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ v4g F;

    public /* synthetic */ fnb(v4g v4gVar, int i) {
        this.E = i;
        this.F = v4gVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        v4g v4gVar = this.F;
        switch (i) {
            case 0:
                return Boolean.valueOf(((b5g) ((wz5) v4gVar.d.G).getValue()) != b5g.E);
            default:
                return (b5g) ((wz5) v4gVar.d.G).getValue();
        }
    }
}
