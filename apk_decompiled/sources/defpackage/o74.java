package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o74 extends m08 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ View F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o74(View view, int i) {
        super(0, gb9.class, "performHaptics", "OverlayPillDemo$performHaptics(Landroid/view/View;)V", 0);
        this.E = i;
        switch (i) {
            case 1:
                this.F = view;
                super(0, gb9.class, "performHaptics", "TextButtons$performHaptics(Landroid/view/View;)V", 0);
                break;
            case 2:
                this.F = view;
                super(0, gb9.class, "performHaptics", "TextButtons$performHaptics(Landroid/view/View;)V", 0);
                break;
            case 3:
                this.F = view;
                super(0, gb9.class, "performHaptics", "TextButtons$performHaptics(Landroid/view/View;)V", 0);
                break;
            case 4:
                this.F = view;
                super(0, gb9.class, "performHaptics", "TextButtons$performHaptics(Landroid/view/View;)V", 0);
                break;
            case 5:
                this.F = view;
                super(0, gb9.class, "performHaptics", "TextButtons$performHaptics(Landroid/view/View;)V", 0);
                break;
            default:
                this.F = view;
                break;
        }
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        View view = this.F;
        switch (i) {
            case 0:
                view.performHapticFeedback(3);
                break;
            case 1:
                view.performHapticFeedback(3);
                break;
            case 2:
                view.performHapticFeedback(3);
                break;
            case 3:
                view.performHapticFeedback(3);
                break;
            case 4:
                view.performHapticFeedback(3);
                break;
            default:
                view.performHapticFeedback(3);
                break;
        }
        return ieiVar;
    }
}
