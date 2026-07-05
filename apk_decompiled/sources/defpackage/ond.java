package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ond implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qnd F;

    public /* synthetic */ ond(qnd qndVar, int i) {
        this.E = i;
        this.F = qndVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        qnd qndVar = this.F;
        switch (i) {
            case 0:
                if (bsg.I0(qndVar.O())) {
                    return qndVar.b.r(qnd.i);
                }
                List list = (List) qndVar.d.getValue();
                return list == null ? lm6.E : list;
            default:
                return qndVar.O();
        }
    }
}
