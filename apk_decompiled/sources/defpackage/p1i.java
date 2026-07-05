package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class p1i implements View.OnClickListener {
    public final /* synthetic */ int E = 1;
    public final Object F;
    public final /* synthetic */ Object G;

    public p1i(r1i r1iVar) {
        this.G = r1iVar;
        Context context = r1iVar.a.getContext();
        CharSequence charSequence = r1iVar.h;
        eb ebVar = new eb();
        ebVar.e = FreeTypeConstants.FT_LOAD_MONOCHROME;
        ebVar.g = FreeTypeConstants.FT_LOAD_MONOCHROME;
        ebVar.l = null;
        ebVar.m = null;
        ebVar.n = false;
        ebVar.o = false;
        ebVar.p = 16;
        ebVar.i = context;
        ebVar.a = charSequence;
        this.F = ebVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.E;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                r1i r1iVar = (r1i) obj;
                Window.Callback callback = r1iVar.k;
                if (callback != null && r1iVar.l) {
                    callback.onMenuItemSelected(0, (eb) obj2);
                    break;
                }
                break;
            default:
                try {
                    ((Context) obj2).startActivity((Intent) obj);
                } catch (ActivityNotFoundException e) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    return;
                }
                break;
        }
    }

    public p1i(Context context, Intent intent) {
        this.F = context;
        this.G = intent;
    }
}
