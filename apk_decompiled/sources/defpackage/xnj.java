package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class xnj extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnj(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            case 3:
            default:
                Looper.getMainLooper();
                break;
            case 4:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }
}
