package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zp1 implements kbc {
    public final /* synthetic */ int E;
    public final /* synthetic */ hq1 F;

    public /* synthetic */ zp1(hq1 hq1Var, int i) {
        this.E = i;
        this.F = hq1Var;
    }

    @Override // defpackage.kbc
    public final void G(Object obj) {
        int i = this.E;
        CharSequence charSequenceM = null;
        hq1 hq1Var = this.F;
        switch (i) {
            case 0:
                lq1 lq1Var = (lq1) obj;
                if (lq1Var != null) {
                    hq1Var.P(lq1Var);
                    qq1 qq1Var = hq1Var.z0;
                    if (qq1Var.p == null) {
                        qq1Var.p = new bvb();
                    }
                    qq1.j(qq1Var.p, null);
                }
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (hq1Var.L()) {
                        hq1Var.Q(charSequence);
                    }
                    hq1Var.z0.f(null);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (hq1Var.K()) {
                        hq1Var.M();
                    } else {
                        qq1 qq1Var2 = hq1Var.z0;
                        String str = qq1Var2.i;
                        if (str != null) {
                            charSequenceM = str;
                        } else {
                            xv8 xv8Var = qq1Var2.d;
                            if (xv8Var != null && (charSequenceM = (CharSequence) xv8Var.H) == null) {
                                charSequenceM = "";
                            }
                        }
                        if (charSequenceM == null) {
                            charSequenceM = hq1Var.m(R.string.default_error_msg);
                        }
                        hq1Var.N(13, charSequenceM);
                        hq1Var.H(2);
                    }
                    hq1Var.z0.i(false);
                }
                break;
        }
    }
}
