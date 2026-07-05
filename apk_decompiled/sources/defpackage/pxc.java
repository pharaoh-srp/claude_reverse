package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pxc implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Context F;
    public final /* synthetic */ wxc G;

    public /* synthetic */ pxc(Context context, wxc wxcVar, int i) {
        this.E = i;
        this.F = context;
        this.G = wxcVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        xxc xxcVar;
        int i = this.E;
        iei ieiVar = iei.a;
        wxc wxcVar = this.G;
        Context context = this.F;
        switch (i) {
            case 0:
                oq5.K(context, wxcVar);
                break;
            case 1:
                zxc zxcVarE = wxcVar.e();
                xxcVar = zxcVarE instanceof xxc ? (xxc) zxcVarE : null;
                if (xxcVar != null && xxcVar.a) {
                    vjk.f(context);
                } else {
                    wxcVar.f();
                }
                break;
            case 2:
                zxc zxcVarE2 = wxcVar.e();
                xxcVar = zxcVarE2 instanceof xxc ? (xxc) zxcVarE2 : null;
                if (xxcVar != null && xxcVar.a) {
                    vjk.f(context);
                } else {
                    wxcVar.f();
                }
                break;
            default:
                oq5.K(context, wxcVar);
                break;
        }
        return ieiVar;
    }
}
