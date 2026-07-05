package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: loaded from: classes.dex */
public final class hl6 implements DefaultLifecycleObserver {
    public final /* synthetic */ c4a E;

    public hl6(EmojiCompatInitializer emojiCompatInitializer, c4a c4aVar) {
        this.E = c4aVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(m4a m4aVar) {
        (Build.VERSION.SDK_INT >= 28 ? cf4.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new kl6(0), 500L);
        this.E.c(this);
    }
}
