package defpackage;

import android.graphics.Path;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l59 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int H;

    public /* synthetic */ l59(int i, int i2, c3d c3dVar) {
        this.E = 1;
        this.F = i;
        this.G = c3dVar;
        this.H = i2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        int i3 = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                ((b3d) obj).f((c3d) obj2, i3, i2, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 1:
                ((b3d) obj).f((c3d) obj2, mwa.L((i3 - r8.E) / 2.0f), mwa.L((i2 - r8.F) / 2.0f), MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 2:
                ((b3d) obj).f((c3d) obj2, i3, i2, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            default:
                c40 c40Var = (c40) obj2;
                drc drcVar = (drc) obj;
                x30 x30Var = drcVar.a;
                int iD = drcVar.d(i3);
                int iD2 = drcVar.d(i2);
                CharSequence charSequence = x30Var.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbV = vb7.v("start(", ") or end(", iD, iD2, ") is out of range [0..");
                    sbV.append(charSequence.length());
                    sbV.append("], or start > end!");
                    c39.a(sbV.toString());
                }
                Path path = new Path();
                wjh wjhVar = x30Var.d;
                wjhVar.f.getSelectionPath(iD, iD2, path);
                int i4 = wjhVar.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(MTTypesetterKt.kLineSkipLimitMultiplier, i4);
                }
                c40 c40Var2 = new c40(path);
                c40Var2.l((((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(drcVar.f)) & 4294967295L));
                c40.a(c40Var, c40Var2);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ l59(Object obj, int i, int i2, int i3) {
        this.E = i3;
        this.G = obj;
        this.F = i;
        this.H = i2;
    }
}
