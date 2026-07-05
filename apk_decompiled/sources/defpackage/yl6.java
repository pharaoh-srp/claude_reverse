package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class yl6 extends dl6 implements Runnable {
    public final WeakReference E;

    public yl6(EditText editText) {
        this.E = new WeakReference(editText);
    }

    @Override // defpackage.dl6
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.E.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zl6.a((EditText) this.E.get(), 1);
    }
}
