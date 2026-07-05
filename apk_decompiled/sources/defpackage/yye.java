package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class yye extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ long G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yye(long j, int i) {
        super(0);
        this.F = i;
        this.G = j;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        long j = this.G;
        switch (i) {
            case 0:
                return String.format(Locale.US, "[Mobile Metric] Gap between views", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
            default:
                return String.format(Locale.US, "[Mobile Metric] Negative gap between views", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        }
    }
}
