package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class kta extends FrameLayout {
    public final x7b E;

    public kta(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.E = new x7b(this, context, googleMapOptions);
        setClickable(true);
    }

    public final void a() {
        lrb lrbVar = (lrb) this.E.a;
        if (lrbVar != null) {
            try {
                exk exkVar = (exk) lrbVar.G;
                exkVar.L(exkVar.H(), 6);
            } catch (RemoteException e) {
                poc.q(e);
            }
        }
    }
}
