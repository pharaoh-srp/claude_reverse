package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f8c {
    public o7c a;
    public CharSequence b;
    public CharSequence c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.c);
        }
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c());
    }

    public abstract void b(c61 c61Var);

    public abstract String c();

    public void d(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.c = bundle.getCharSequence("android.summaryText");
            this.d = true;
        }
        this.b = bundle.getCharSequence("android.title.big");
    }
}
