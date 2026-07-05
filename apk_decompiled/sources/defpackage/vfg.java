package defpackage;

import android.os.Build;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class vfg extends ts9 implements pz7 {
    public static final vfg G;
    public static final vfg H;
    public static final vfg I;
    public static final vfg J;
    public static final vfg K;
    public final /* synthetic */ int F;

    static {
        int i = 2;
        G = new vfg(i, 0);
        H = new vfg(i, 1);
        I = new vfg(i, 2);
        J = new vfg(i, 3);
        K = new vfg(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vfg(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        qeh qehVar = qeh.b;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                mwb mwbVar = (mwb) obj;
                mwbVar.getClass();
                ((SuperscriptSpan) obj2).getClass();
                mwbVar.h = new ue1(0.5f);
                break;
            case 1:
                mwb mwbVar2 = (mwb) obj;
                TextAppearanceSpan textAppearanceSpan = (TextAppearanceSpan) obj2;
                mwbVar2.getClass();
                textAppearanceSpan.getClass();
                egg eggVar = mwbVar2.m;
                mwbVar2.m = eggVar != null ? eggVar.d(pmk.l(textAppearanceSpan)) : pmk.l(textAppearanceSpan);
                if (textAppearanceSpan.getLinkTextColor() != null) {
                    mwbVar2.a = d4c.m(textAppearanceSpan.getLinkTextColor().getDefaultColor());
                }
                break;
            case 2:
                mwb mwbVar3 = (mwb) obj;
                TypefaceSpan typefaceSpan = (TypefaceSpan) obj2;
                mwbVar3.getClass();
                typefaceSpan.getClass();
                mwbVar3.f = typefaceSpan.getFamily() != null ? fok.f(typefaceSpan.getFamily()) : Build.VERSION.SDK_INT >= 28 ? fok.e(typefaceSpan.getTypeface()) : null;
                break;
            case 3:
                mwb mwbVar4 = (mwb) obj;
                mwbVar4.getClass();
                ((UnderlineSpan) obj2).getClass();
                qeh qehVar2 = mwbVar4.j;
                if (qehVar2 != null) {
                    qehVar = qehVar2;
                }
                mwbVar4.j = new qeh(qehVar.a | 1);
                break;
            default:
                mwb mwbVar5 = (mwb) obj;
                mwbVar5.getClass();
                ((URLSpan) obj2).getClass();
                qeh qehVar3 = mwbVar5.j;
                if (qehVar3 != null) {
                    qehVar = qehVar3;
                }
                mwbVar5.j = new qeh(qehVar.a | 1);
                break;
        }
        return ieiVar;
    }
}
