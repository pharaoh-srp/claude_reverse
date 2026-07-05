package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import android.widget.Toast;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class b93 implements lo3 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ nwb b;
    public final /* synthetic */ nwb c;

    public b93(Context context, nwb nwbVar, nwb nwbVar2) {
        this.a = context;
        this.b = nwbVar;
        this.c = nwbVar2;
    }

    @Override // defpackage.lo3
    public final void a(String str, bz7 bz7Var) {
        bz7Var.getClass();
        Uri uri = Uri.parse(str);
        String encodedPath = x44.r(uri.getScheme(), "computer") ? uri.getEncodedPath() : null;
        if (encodedPath != null) {
            ((m83) this.b.getValue()).a.invoke(encodedPath);
        } else if (URLUtil.isValidUrl(str)) {
            this.c.setValue(str);
        } else {
            Context context = this.a;
            Toast.makeText(context, context.getString(R.string.unsupported_url_error_toast_message, str), 0).show();
        }
    }
}
