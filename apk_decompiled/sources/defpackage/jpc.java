package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final class jpc extends kpc {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jpc(float f, int i, int i2) {
        super(i, f);
        this.d = i2;
    }

    @Override // defpackage.mpc
    public final String a(lw5 lw5Var) {
        int i = this.d;
        float f = this.a;
        switch (i) {
            case 0:
                return nai.J(lw5Var, R.string.m3_adaptive_default_pane_expansion_end_offset_anchor_description, Integer.valueOf((int) f));
            default:
                return nai.J(lw5Var, R.string.m3_adaptive_default_pane_expansion_start_offset_anchor_description, Integer.valueOf((int) f));
        }
    }

    @Override // defpackage.mpc
    public final int c(int i, cz5 cz5Var) {
        int i2 = this.d;
        float f = this.a;
        switch (i2) {
            case 0:
                return i - cz5Var.M0(f);
            default:
                return cz5Var.M0(f);
        }
    }
}
