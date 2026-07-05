package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ow8 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ koc F;

    public /* synthetic */ ow8(koc kocVar, int i) {
        this.E = i;
        this.F = kocVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int iH;
        int iH2;
        int i = this.E;
        koc kocVar = this.F;
        switch (i) {
            case 0:
                iH = ((isc) kocVar.d.G).h();
                break;
            case 1:
                iH = kocVar.l();
                break;
            case 2:
                iH = kocVar.l();
                break;
            case 3:
                iH = ((isc) kocVar.d.G).h();
                break;
            case 4:
                return Integer.valueOf(kocVar.k.a() ? kocVar.r.h() : ((isc) kocVar.d.G).h());
            case 5:
                isc iscVar = kocVar.q;
                boolean zA = kocVar.k.a();
                eoc eocVar = kocVar.d;
                if (!zA) {
                    iH2 = ((isc) eocVar.G).h();
                } else if (iscVar.h() != -1) {
                    iH2 = iscVar.h();
                } else {
                    float fAbs = Math.abs(((hsc) eocVar.H).h());
                    cz5 cz5Var = kocVar.n;
                    loc locVar = moc.a;
                    if (fAbs >= Math.abs(Math.min(cz5Var.q0(56.0f), kocVar.m() / 2.0f) / kocVar.m())) {
                        boolean zBooleanValue = ((Boolean) kocVar.F.getValue()).booleanValue();
                        int i2 = kocVar.e;
                        iH2 = zBooleanValue ? i2 + 1 : i2;
                    } else {
                        iH2 = ((isc) eocVar.G).h();
                    }
                }
                iH = kocVar.j(iH2);
                break;
            default:
                iH = kocVar.l();
                break;
        }
        return Integer.valueOf(iH);
    }
}
