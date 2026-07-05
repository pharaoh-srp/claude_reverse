package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.k2e;
import defpackage.qid;
import defpackage.u29;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements u29 {
    @Override // defpackage.u29
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.u29
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new qid(this, context.getApplicationContext()));
        return new k2e(25);
    }
}
