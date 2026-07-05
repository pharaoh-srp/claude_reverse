package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ni0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) oi0.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
