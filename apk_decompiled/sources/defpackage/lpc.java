package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public final class lpc extends mpc {
    public final float a;

    public lpc(float f) {
        this.a = f;
    }

    @Override // defpackage.mpc
    public final String a(lw5 lw5Var) {
        return nai.J(lw5Var, R.string.m3_adaptive_default_pane_expansion_proportion_anchor_description, Integer.valueOf((int) (this.a * 100.0f)));
    }

    @Override // defpackage.mpc
    public final int b() {
        return 1;
    }

    @Override // defpackage.mpc
    public final int c(int i, cz5 cz5Var) {
        return wd6.e0(mwa.L(i * this.a), 0, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lpc) {
            return this.a == ((lpc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ebh.o(new StringBuilder("PaneExpansionAnchor(Proportion = "), this.a, ')');
    }
}
