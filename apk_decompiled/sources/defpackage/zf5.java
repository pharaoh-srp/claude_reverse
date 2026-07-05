package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zf5 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf5(int i, e92 e92Var) {
        super(0);
        this.F = 2;
        this.H = e92Var;
        this.G = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        int i2 = this.G;
        Object obj = this.H;
        switch (i) {
            case 0:
                return vb7.k(i2, "Unexpected status code ", " on upload request: ", ((lie) obj).b);
            case 1:
                return String.format(Locale.US, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Long.valueOf(((ki7) obj).c.c)}, 2));
            default:
                Object obj2 = ((e92) obj).I().get(i2);
                obj2.getClass();
                return (lrc) obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zf5(int i, Object obj, int i2) {
        super(0);
        this.F = i2;
        this.G = i;
        this.H = obj;
    }
}
