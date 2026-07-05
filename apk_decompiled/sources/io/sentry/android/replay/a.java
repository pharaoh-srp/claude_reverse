package io.sentry.android.replay;

import defpackage.ide;
import defpackage.ts9;
import defpackage.zy7;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ts9 implements zy7 {
    public static final a G;
    public static final a H;
    public static final a I;
    public final /* synthetic */ int F;

    static {
        int i = 0;
        G = new a(i, 0);
        H = new a(i, 1);
        I = new a(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.F) {
            case 0:
                return new ide("_[a-z]");
            case 1:
                return new io.sentry.util.l();
            default:
                return io.sentry.config.a.u();
        }
    }
}
