package defpackage;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class wz extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ AndroidComposeView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz(AndroidComposeView androidComposeView, int i) {
        super(0);
        this.F = i;
        this.G = androidComposeView;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int actionMasked;
        int i = this.F;
        AndroidComposeView androidComposeView = this.G;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) androidComposeView.U.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = androidComposeView.getConfiguration().getLocales();
                hea heaVar = new hea(new iea(locales));
                if (locales.isEmpty()) {
                    heaVar = new hea(new iea(LocaleList.getDefault()));
                }
                iea ieaVar = heaVar.a;
                int size = ieaVar.a.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = ieaVar.a.get(i2);
                    locale.getClass();
                    arrayList.add(new eea(locale));
                }
                return new gea(arrayList);
            case 2:
                MotionEvent motionEvent = androidComposeView.a1;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView.b1 = SystemClock.uptimeMillis();
                    androidComposeView.post(androidComposeView.g1);
                }
                return iei.a;
            default:
                androidComposeView.get_viewTreeOwners();
                return null;
        }
    }
}
