package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class xl6 extends ovj {
    public final wl6 d;

    public xl6(TextView textView) {
        this.d = new wl6(textView);
    }

    @Override // defpackage.ovj
    public final InputFilter[] f(InputFilter[] inputFilterArr) {
        return !gl6.d() ? inputFilterArr : this.d.f(inputFilterArr);
    }

    @Override // defpackage.ovj
    public final void i(boolean z) {
        if (gl6.d()) {
            this.d.i(z);
        }
    }

    @Override // defpackage.ovj
    public final void j(boolean z) {
        boolean zD = gl6.d();
        wl6 wl6Var = this.d;
        if (zD) {
            wl6Var.j(z);
        } else {
            wl6Var.f = z;
        }
    }
}
