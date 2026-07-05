package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class eh1 extends ts9 implements zy7 {
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(long j, long j2, long j3) {
        super(0);
        this.F = j;
        this.G = j2;
        this.H = j3;
    }

    @Override // defpackage.zy7
    public final Object a() {
        return String.format(Locale.US, "Too much disk space used (%d/%d): cleaning up to free %d bytes…", Arrays.copyOf(new Object[]{Long.valueOf(this.F), Long.valueOf(this.G), Long.valueOf(this.H)}, 3));
    }
}
