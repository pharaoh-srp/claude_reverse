package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class q88 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int E = 2;
    public Object F;
    public final Object G;

    public q88(y5g y5gVar, Activity activity) {
        y5gVar.getClass();
        this.F = y5gVar;
        this.G = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 0:
                view.getClass();
                m4a m4aVarA = ink.a(view);
                m4aVarA.getClass();
                c4a c4aVarA = m4aVarA.a();
                c4aVarA.a((k2a) obj);
                this.F = c4aVarA;
                break;
            case 1:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) obj).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((y5g) this.F).c(iBinder, activity);
                }
                break;
            default:
                ((ViewGroup) this.F).addView((b1h) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 0:
                k2a k2aVar = (k2a) obj;
                view.getClass();
                c4a c4aVar = (c4a) this.F;
                if (c4aVar != null) {
                    c4aVar.c(k2aVar);
                }
                this.F = null;
                a4a a4aVar = (a4a) k2aVar.G;
                a4a a4aVar2 = a4a.G;
                if (a4aVar.compareTo(a4aVar2) > 0) {
                    k2aVar.b(a4aVar2);
                }
                break;
            case 1:
                view.getClass();
                break;
            default:
                ((ViewGroup) this.F).addView((b1h) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    public q88(ViewGroup viewGroup, b1h b1hVar) {
        this.F = viewGroup;
        this.G = b1hVar;
    }

    public q88(k2a k2aVar) {
        this.G = k2aVar;
    }
}
