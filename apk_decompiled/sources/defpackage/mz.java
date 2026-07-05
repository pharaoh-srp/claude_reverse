package defpackage;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class mz implements op3 {
    public final nz a;

    public mz(nz nzVar) {
        this.a = nzVar;
    }

    public final mp3 a() {
        ClipData primaryClip = this.a.a().getPrimaryClip();
        if (primaryClip != null) {
            return new mp3(primaryClip);
        }
        return null;
    }

    public final void b(mp3 mp3Var) {
        nz nzVar = this.a;
        if (mp3Var != null) {
            nzVar.a().setPrimaryClip(mp3Var.a());
        } else if (Build.VERSION.SDK_INT >= 28) {
            fsk.c(nzVar.a());
        } else {
            nzVar.a().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
