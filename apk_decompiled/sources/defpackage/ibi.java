package defpackage;

import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class ibi extends k20 {
    public final int d;
    public final dv7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibi(Typeface typeface) {
        super(1, new v60(typeface, 1), new bv7(new yu7[0]));
        typeface.getClass();
        this.d = typeface.isItalic() ? 1 : 0;
        this.e = Build.VERSION.SDK_INT >= 28 ? new dv7(typeface.getWeight()) : typeface.isBold() ? dv7.M : dv7.J;
    }

    @Override // defpackage.k20
    public final int a() {
        return this.d;
    }

    @Override // defpackage.k20
    public final dv7 b() {
        return this.e;
    }
}
