package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class ymj extends jnj {
    public final /* synthetic */ Intent E;
    public final /* synthetic */ GoogleApiActivity F;

    public ymj(Intent intent, GoogleApiActivity googleApiActivity) {
        this.E = intent;
        this.F = googleApiActivity;
    }

    @Override // defpackage.jnj
    public final void a() {
        Intent intent = this.E;
        if (intent != null) {
            this.F.startActivityForResult(intent, 2);
        }
    }
}
