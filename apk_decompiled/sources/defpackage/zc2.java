package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zc2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ dui F;

    public /* synthetic */ zc2(dui duiVar, int i) {
        this.E = i;
        this.F = duiVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        dui duiVar = this.F;
        switch (i) {
            case 0:
                ((w86) obj).getClass();
                return new o10(6, duiVar);
            default:
                float fFloatValue = ((Float) obj).floatValue();
                hsc hscVar = duiVar.e;
                float fH = hscVar.h();
                duiVar.b(hscVar.h() + fFloatValue);
                float fH2 = hscVar.h() - fH;
                if (fH + fFloatValue != hscVar.h()) {
                    duiVar.l.f(Float.valueOf(fH2 - fFloatValue));
                    fFloatValue = fH2;
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
