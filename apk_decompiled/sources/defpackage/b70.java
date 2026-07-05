package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class b70 implements eli {
    public final Context a;

    public b70(Context context) {
        this.a = context;
    }

    @Override // defpackage.eli
    public final void a(String str) {
        try {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(grc.n('.', "Can't open ", str), e);
        }
    }
}
