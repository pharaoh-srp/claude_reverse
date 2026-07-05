package defpackage;

import android.content.Context;
import android.webkit.URLUtil;
import android.widget.Toast;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public final class kk3 implements lo3 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ nwb b;

    public kk3(Context context, nwb nwbVar) {
        this.a = context;
        this.b = nwbVar;
    }

    @Override // defpackage.lo3
    public final void a(String str, bz7 bz7Var) {
        bz7Var.getClass();
        if (URLUtil.isValidUrl(str)) {
            this.b.setValue(str);
        } else {
            Context context = this.a;
            Toast.makeText(context, context.getString(R.string.unsupported_url_error_toast_message, str), 0).show();
        }
    }
}
