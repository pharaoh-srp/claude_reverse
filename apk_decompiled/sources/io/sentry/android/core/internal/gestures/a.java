package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements io.sentry.internal.gestures.a {
    public final io.sentry.util.h a;

    public a(io.sentry.util.h hVar) {
        this.a = hVar;
    }

    @Override // io.sentry.internal.gestures.a
    public final io.sentry.internal.gestures.c a(View view, float f, float f2, io.sentry.internal.gestures.b bVar) {
        if (view != null) {
            if (bVar == io.sentry.internal.gestures.b.CLICKABLE && view.isClickable() && view.getVisibility() == 0) {
                try {
                    return new io.sentry.internal.gestures.c(view, p.j(view), j.b(view), null, "old_view_system");
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            }
            if (bVar == io.sentry.internal.gestures.b.SCROLLABLE) {
                if (((!((Boolean) this.a.a()).booleanValue() ? false : ScrollingView.class.isAssignableFrom(view.getClass())) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0) {
                    try {
                        return new io.sentry.internal.gestures.c(view, p.j(view), j.b(view), null, "old_view_system");
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
            }
        }
        return null;
    }
}
