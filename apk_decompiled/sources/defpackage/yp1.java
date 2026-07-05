package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class yp1 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public yp1(TextView textView, Typeface typeface, int i) {
        this.E = 2;
        this.G = textView;
        this.H = typeface;
        this.F = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        int i2 = this.F;
        Object obj = this.H;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                qq1 qq1Var = ((hq1) obj).z0;
                if (qq1Var.c == null) {
                    qq1Var.c = new nq1();
                }
                qq1Var.c.p(i2, (CharSequence) obj2);
                break;
            case 1:
                ((hq1) obj).N(i2, (CharSequence) obj2);
                break;
            default:
                ((TextView) obj2).setTypeface((Typeface) obj, i2);
                break;
        }
    }

    public /* synthetic */ yp1(hq1 hq1Var, int i, CharSequence charSequence, int i2) {
        this.E = i2;
        this.H = hq1Var;
        this.F = i;
        this.G = charSequence;
    }
}
