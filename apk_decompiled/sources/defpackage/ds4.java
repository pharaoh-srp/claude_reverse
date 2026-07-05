package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ds4 implements pz7 {
    public final /* synthetic */ long E;

    public ds4(long j) {
        this.E = j;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Number) obj2).intValue();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
            iv1.b(ud0.N1, d4c.j0(R.string.conway_attach_remove, e18Var), null, ef2.F, this.E, e18Var, 3072, 4);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
