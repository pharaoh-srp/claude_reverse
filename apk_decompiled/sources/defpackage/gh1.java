package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class gh1 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ hh1 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh1(hh1 hh1Var, int i) {
        super(0);
        this.F = i;
        this.G = hh1Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        hh1 hh1Var = this.G;
        switch (i) {
            case 0:
                return String.format(Locale.US, "The provided root dir is not writable: %s", Arrays.copyOf(new Object[]{hh1Var.E.getPath()}, 1));
            case 1:
                return String.format(Locale.US, "The provided root file is not a directory: %s", Arrays.copyOf(new Object[]{hh1Var.E.getPath()}, 1));
            default:
                return String.format(Locale.US, "The provided root dir can't be created: %s", Arrays.copyOf(new Object[]{hh1Var.E.getPath()}, 1));
        }
    }
}
