package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gl1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ pl3 F;
    public final /* synthetic */ View G;
    public final /* synthetic */ m1j H;

    public /* synthetic */ gl1(int i, pl3 pl3Var, m1j m1jVar, View view) {
        this.E = i;
        this.F = pl3Var;
        this.G = view;
        this.H = m1jVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m1j m1jVar = this.H;
        View view = this.G;
        pl3 pl3Var = this.F;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                pl3Var.c(view);
                if (zBooleanValue != m1jVar.a() && (!zBooleanValue || ((Boolean) m1jVar.a.a.getValue()).booleanValue())) {
                    if (!zBooleanValue) {
                        m1jVar.h = (uwc) m1jVar.f.getValue();
                    }
                    gb9.D(m1jVar.d, null, null, new m61(m1jVar, zBooleanValue, (tp4) null, 10), 3);
                }
                break;
            default:
                uwc uwcVar = (uwc) obj;
                uwcVar.getClass();
                pl3Var.c(view);
                m1jVar.getClass();
                if (m1jVar.a() && uwcVar != ((uwc) m1jVar.f.getValue()) && (uwcVar != uwc.G || ((Boolean) m1jVar.a.a.getValue()).booleanValue())) {
                    gb9.D(m1jVar.d, null, null, new k7h(m1jVar, uwcVar, (tp4) null, 7), 3);
                }
                break;
        }
        return ieiVar;
    }
}
