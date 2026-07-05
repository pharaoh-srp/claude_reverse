package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final class xcb implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, vdb {
    public xug E;
    public bt F;
    public w9a G;

    @Override // defpackage.vdb
    public final void a(vcb vcbVar, boolean z) {
        bt btVar;
        if ((z || vcbVar == this.E) && (btVar = this.F) != null) {
            btVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        xug xugVar = this.E;
        w9a w9aVar = this.G;
        if (w9aVar.J == null) {
            w9aVar.J = new v9a(w9aVar);
        }
        xugVar.q(w9aVar.J.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.G.a(this.E, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        xug xugVar = this.E;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.F.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.F.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                xugVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return xugVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.vdb
    public final boolean s(vcb vcbVar) {
        return false;
    }
}
