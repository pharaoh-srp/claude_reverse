package defpackage;

import androidx.health.platform.client.proto.g;

/* JADX INFO: loaded from: classes2.dex */
public final class fe3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ a6i F;

    public /* synthetic */ fe3(a6i a6iVar, int i) {
        this.E = i;
        this.F = a6iVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        a6i a6iVar = this.F;
        switch (i) {
            case 0:
                return a6iVar.d.getValue();
            case 1:
                return a6iVar.f();
            case 2:
                return a6iVar.d.getValue();
            case 3:
                return a6iVar.f();
            case 4:
                return a6iVar.d.getValue();
            case 5:
                return a6iVar.f();
            case 6:
                return a6iVar.d.getValue();
            case 7:
                return a6iVar.f();
            case 8:
                return a6iVar.d.getValue();
            case 9:
                return a6iVar.f();
            case 10:
                return a6iVar.d.getValue();
            case 11:
                return a6iVar.f();
            case 12:
                return a6iVar.d.getValue();
            case 13:
                return a6iVar.f();
            case 14:
                return a6iVar.d.getValue();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return a6iVar.f();
            case 16:
                return a6iVar.d.getValue();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return a6iVar.f();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return a6iVar.d.getValue();
            default:
                return a6iVar.f();
        }
    }
}
