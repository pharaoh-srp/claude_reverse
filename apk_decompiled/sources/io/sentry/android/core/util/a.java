package io.sentry.android.core.util;

import android.content.Context;
import io.sentry.e0;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public volatile Object a = null;
    public final e0 b;

    public a(e0 e0Var) {
        this.b = e0Var;
    }

    public final Object a(Context context) {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = this.b.a(context);
                    }
                } finally {
                }
            }
        }
        return this.a;
    }
}
