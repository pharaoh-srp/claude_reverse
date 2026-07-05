package defpackage;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class n7c extends f8c {
    public final /* synthetic */ int e;
    public Object f;

    public n7c(int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.f = new ArrayList();
                break;
        }
    }

    @Override // defpackage.f8c
    public final void b(c61 c61Var) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) c61Var.G).setBigContentTitle(this.b).bigText((CharSequence) this.f);
                if (this.d) {
                    bigTextStyleBigText.setSummaryText(this.c);
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) c61Var.G).setBigContentTitle(this.b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.c);
                }
                Iterator it = ((ArrayList) this.f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // defpackage.f8c
    public final String c() {
        switch (this.e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    @Override // defpackage.f8c
    public final void d(Bundle bundle) {
        switch (this.e) {
            case 0:
                super.d(bundle);
                this.f = bundle.getCharSequence("android.bigText");
                break;
            default:
                super.d(bundle);
                ArrayList arrayList = (ArrayList) this.f;
                arrayList.clear();
                if (bundle.containsKey("android.textLines")) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
                }
                break;
        }
    }

    public void e(String str) {
        this.f = o7c.d(str);
    }

    public /* synthetic */ n7c(boolean z) {
        this.e = 0;
    }
}
