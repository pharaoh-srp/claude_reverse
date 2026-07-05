package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes2.dex */
public final class c9f {
    public final b9f a;

    public c9f(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new a9f(nestedScrollView);
        } else {
            this.a = new am4(18);
        }
    }
}
