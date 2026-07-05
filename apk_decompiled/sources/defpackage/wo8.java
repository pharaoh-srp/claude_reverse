package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class wo8 implements e0g {
    public static final wo8 b = new wo8(0);
    public static final wo8 c = new wo8(1);
    public final /* synthetic */ int a;

    public /* synthetic */ wo8(int i) {
        this.a = i;
    }

    @Override // defpackage.e0g
    public final knk a(long j, fu9 fu9Var, cz5 cz5Var) {
        switch (this.a) {
            case 0:
                float fM0 = cz5Var.M0(30.0f);
                return new flc(new l9e(MTTypesetterKt.kLineSkipLimitMultiplier, -fM0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fM0));
            case 1:
                float fM02 = cz5Var.M0(30.0f);
                return new flc(new l9e(-fM02, MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (j >> 32)) + fM02, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new flc(d4c.x(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
