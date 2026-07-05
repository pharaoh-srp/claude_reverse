package defpackage;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pc8 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qc8 F;

    public /* synthetic */ pc8(qc8 qc8Var, int i) {
        this.E = i;
        this.F = qc8Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        qc8 qc8Var = this.F;
        switch (i) {
            case 0:
                Throwable thA = jre.a(qc8Var.O());
                if (thA != null) {
                }
                break;
            case 1:
                Object objO = qc8Var.O();
                if (!(objO instanceof hre)) {
                    nrk.d(qc8Var.f, cc8.a.d((JsonElement) objO, JsonElement.INSTANCE.serializer()));
                }
                break;
            default:
                lsc lscVar = qc8Var.d;
                rc8 rc8Var = qc8Var.c;
                String str = qc8Var.b;
                rc8Var.j(str);
                qc8Var.e.setValue(Boolean.FALSE);
                pg7 pg7VarN = rc8Var.n(str);
                lscVar.setValue(pg7VarN != null ? pg7VarN.b.getDefaultValue() : null);
                nrk.d(qc8Var.f, cc8.a((JsonElement) lscVar.getValue()));
                break;
        }
        return ieiVar;
    }
}
