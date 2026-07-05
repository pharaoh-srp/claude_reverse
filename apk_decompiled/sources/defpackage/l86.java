package defpackage;

import android.content.Context;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final class l86 implements v0i {
    public final String E;

    public l86(String str) {
        this.E = str;
    }

    @Override // defpackage.v0i
    public final String H(Context context, boolean z, boolean z2) {
        context.getClass();
        String str = this.E;
        if (str != null) {
            return str;
        }
        String string = context.getString(z2 ? R.string.map_display_tool_status_failed : z ? R.string.map_display_tool_status_success : R.string.map_display_tool_status_loading);
        string.getClass();
        return string;
    }
}
