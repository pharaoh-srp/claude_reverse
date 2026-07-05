package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class sdb extends eaa implements zcb {
    public static final Method h0;
    public poj g0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                h0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.eaa
    public final dh6 a(Context context, boolean z) {
        rdb rdbVar = new rdb(context, z);
        rdbVar.setHoverListener(this);
        return rdbVar;
    }

    @Override // defpackage.zcb
    public final void d(vcb vcbVar, MenuItem menuItem) {
        poj pojVar = this.g0;
        if (pojVar != null) {
            pojVar.d(vcbVar, menuItem);
        }
    }

    @Override // defpackage.zcb
    public final void t(vcb vcbVar, adb adbVar) {
        poj pojVar = this.g0;
        if (pojVar != null) {
            pojVar.t(vcbVar, adbVar);
        }
    }
}
