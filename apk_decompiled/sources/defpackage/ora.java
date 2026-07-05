package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ora implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ wxc F;
    public final /* synthetic */ wxc G;

    public /* synthetic */ ora(wxc wxcVar, wxc wxcVar2, int i) {
        this.E = i;
        this.F = wxcVar;
        this.G = wxcVar2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        boolean z = true;
        yxc yxcVar = yxc.a;
        wxc wxcVar = this.G;
        wxc wxcVar2 = this.F;
        switch (i) {
            case 0:
                if (!x44.r(wxcVar2.e(), yxcVar) && !x44.r(wxcVar.e(), yxcVar)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (!x44.r(wxcVar2.e(), yxcVar) && !x44.r(wxcVar.e(), yxcVar)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
