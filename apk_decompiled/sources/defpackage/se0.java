package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class se0 {
    public static /* synthetic */ BoringLayout f(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, metrics, z, truncateAt, i2, true);
    }

    public static /* bridge */ /* synthetic */ AccessibilityManager$AccessibilityServicesStateChangeListener g(Object obj) {
        return (AccessibilityManager$AccessibilityServicesStateChangeListener) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback h(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher k(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
