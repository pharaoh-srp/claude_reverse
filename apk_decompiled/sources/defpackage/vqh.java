package defpackage;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class vqh extends n7f implements Runnable {
    public final long K;

    public vqh(long j, vp4 vp4Var) {
        super(vp4Var, vp4Var.getContext());
        this.K = j;
    }

    @Override // defpackage.vf9
    public final String e0() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.e0());
        sb.append("(timeMillis=");
        return ebh.p(sb, this.K, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        c45 c45Var = this.I;
        d4c.R(c45Var);
        h45 h45Var = (h45) c45Var.x0(h45.G);
        String str = h45Var != null ? h45Var.F : null;
        String strQ = grc.q(this.K, "Timed out waiting for ", " ms");
        if (str != null) {
            StringBuilder sbX = sq6.x("Coroutine \"", str, "\" ");
            if (strQ.length() > 0) {
                strQ = Character.toLowerCase(strQ.charAt(0)) + strQ.substring(1);
            }
            sbX.append(strQ);
            strQ = sbX.toString();
        }
        y(new TimeoutCancellationException(strQ, this));
    }
}
