package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class daa implements View.OnTouchListener {
    public final /* synthetic */ eaa E;

    public daa(eaa eaaVar) {
        this.E = eaaVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        eaa eaaVar = this.E;
        aaa aaaVar = eaaVar.V;
        Handler handler = eaaVar.Z;
        jh0 jh0Var = eaaVar.d0;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && jh0Var != null && jh0Var.isShowing() && x >= 0 && x < jh0Var.getWidth() && y >= 0 && y < jh0Var.getHeight()) {
            handler.postDelayed(aaaVar, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(aaaVar);
        return false;
    }
}
