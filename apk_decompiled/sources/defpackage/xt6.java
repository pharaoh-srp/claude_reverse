package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xt6 implements yt6 {
    @Override // defpackage.yt6
    public final int a() {
        return R.string.button_open_permission_settings;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xt6);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.button_open_permission_settings);
    }

    public final String toString() {
        return grc.u("OpenAppSettings(labelResId=", R.string.button_open_permission_settings, ")");
    }
}
