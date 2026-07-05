package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes3.dex */
public final class lfj extends Binder {
    public final ro6 i;

    public lfj(ro6 ro6Var) {
        this.i = ro6Var;
    }

    public final void a(mfj mfjVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        Intent intent = mfjVar.a;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.i.F;
        j5h j5hVar = new j5h();
        firebaseMessagingService.E.execute(new f60(firebaseMessagingService, intent, j5hVar, 5));
        j5hVar.a.i(new ao0(1), new jke(10, mfjVar));
    }
}
