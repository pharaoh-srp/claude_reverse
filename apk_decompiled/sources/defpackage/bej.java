package defpackage;

import android.view.View;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class bej {
    public static final ewb a;

    static {
        long[] jArr = u6f.a;
        a = new ewb();
    }

    public static final ge4 a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof ge4) {
            return (ge4) tag;
        }
        return null;
    }
}
