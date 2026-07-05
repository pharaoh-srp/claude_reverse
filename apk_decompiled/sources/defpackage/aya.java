package defpackage;

import android.view.View;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public interface aya {
    View a();

    void b();

    void c();

    void d(String str, JsonObject jsonObject);

    void destroy();

    kxa getCallbacks();

    void onPause();

    void onResume();

    boolean post(Runnable runnable);

    void setCallbacks(kxa kxaVar);

    void setFullscreen(boolean z);

    void stopLoading();
}
