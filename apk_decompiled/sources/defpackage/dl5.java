package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class dl5 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl5(int i, int i2, int i3) {
        super(0);
        this.F = i3;
        this.G = i;
        this.H = i2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        int i2 = this.H;
        int i3 = this.G;
        switch (i) {
            case 0:
                return String.format(Locale.US, "Read error - datastore entry has invalid number of blocks. Was: %d, expected: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}, 2));
            default:
                return String.format(Locale.US, "DataBlock length exceeds limit of %s bytes, was %s", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}, 2));
        }
    }
}
