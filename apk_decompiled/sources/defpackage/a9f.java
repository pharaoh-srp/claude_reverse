package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes2.dex */
public final class a9f implements b9f {
    public final ScrollFeedbackProvider E;

    public a9f(NestedScrollView nestedScrollView) {
        this.E = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.b9f
    public final void i(boolean z, int i, int i2, int i3) {
        this.E.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.b9f
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.E.onScrollProgress(i, i2, i3, i4);
    }
}
