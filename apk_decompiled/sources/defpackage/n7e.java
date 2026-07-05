package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n7e implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ q7e F;

    public /* synthetic */ n7e(q7e q7eVar, int i) {
        this.E = i;
        this.F = q7eVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        q7e q7eVar = this.F;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                lsc lscVar = q7eVar.d;
                lscVar.setValue(dxf.q0((Set) lscVar.getValue(), str));
                break;
            case 1:
                q7eVar.b.i(((Integer) obj).intValue());
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                boolean zContains = ((Set) q7eVar.d.getValue()).contains(str2);
                lsc lscVar2 = q7eVar.d;
                lscVar2.setValue(zContains ? dxf.n0((Set) lscVar2.getValue(), str2) : dxf.q0((Set) lscVar2.getValue(), str2));
                break;
        }
        return ieiVar;
    }
}
