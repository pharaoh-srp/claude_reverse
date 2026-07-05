package defpackage;

import android.view.Choreographer;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rw5 implements ViewTreeObserver.OnPreDrawListener {
    public static final /* synthetic */ int E = 0;

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        declaredField.getClass();
        declaredField.setAccessible(true);
    }
}
