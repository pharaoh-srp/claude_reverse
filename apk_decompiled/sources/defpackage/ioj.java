package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ioj implements fe0 {
    public static final ioj G;
    public final boolean E;
    public final String F;

    static {
        dke dkeVar = new dke();
        dkeVar.E = Boolean.FALSE;
        G = new ioj(dkeVar);
    }

    public ioj(dke dkeVar) {
        this.E = ((Boolean) dkeVar.E).booleanValue();
        this.F = (String) dkeVar.F;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ioj)) {
            return false;
        }
        ioj iojVar = (ioj) obj;
        return gb9.v(null, null) && this.E == iojVar.E && gb9.v(this.F, iojVar.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.E), this.F});
    }
}
