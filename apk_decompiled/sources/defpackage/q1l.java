package defpackage;

import android.os.Bundle;
import com.google.android.play.core.install.InstallException;

/* JADX INFO: loaded from: classes3.dex */
public final class q1l extends u0l {
    @Override // defpackage.u0l
    public final void H(Bundle bundle) {
        super.H(bundle);
        int i = bundle.getInt("error.code", -2);
        j5h j5hVar = this.k;
        if (i != 0) {
            j5hVar.c(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            j5hVar.d(null);
        }
    }
}
