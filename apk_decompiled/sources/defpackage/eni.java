package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationError;

/* JADX INFO: loaded from: classes3.dex */
public final class eni implements v0i {
    public final boolean E;
    public final UserLocationV0OutputUserLocationError F;

    public eni(boolean z, UserLocationV0OutputUserLocationError userLocationV0OutputUserLocationError) {
        this.E = z;
        this.F = userLocationV0OutputUserLocationError;
    }

    @Override // defpackage.v0i
    public final String H(Context context, boolean z, boolean z2) {
        context.getClass();
        int i = R.string.user_locate_tool_status_check_failed;
        UserLocationV0OutputUserLocationError userLocationV0OutputUserLocationError = this.F;
        if (userLocationV0OutputUserLocationError != null) {
            int i2 = dni.a[userLocationV0OutputUserLocationError.getError_type().ordinal()];
            if (i2 == 1) {
                i = R.string.user_locate_tool_permission_denied_app;
            } else if (i2 == 2 && !this.E) {
                i = R.string.user_locate_tool_permission_denied_system;
            }
        } else if (!z2) {
            i = z ? R.string.user_locate_tool_status_check_success : R.string.user_locate_tool_status_checking;
        }
        String string = context.getString(i);
        string.getClass();
        return string;
    }
}
