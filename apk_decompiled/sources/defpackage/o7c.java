package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.anthropic.claude.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o7c {
    public boolean A;
    public final ArrayList B;
    public final Context a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public f8c m;
    public boolean n;
    public boolean o;
    public boolean p;
    public String q;
    public Bundle r;
    public int s;
    public int t;
    public RemoteViews u;
    public String v;
    public long w;
    public int x;
    public final boolean y;
    public final Notification z;

    public o7c(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.k = true;
        this.n = false;
        this.s = 0;
        this.t = 0;
        this.x = 0;
        Notification notification = new Notification();
        this.z = notification;
        this.a = context;
        this.v = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.B = new ArrayList();
        this.y = true;
    }

    public static CharSequence d(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i, PendingIntent pendingIntent, String str) {
        this.b.add(new k7c(i != 0 ? IconCompat.c(null, "", i) : null, str, pendingIntent, new Bundle(), null, true, 0, true, false, false));
    }

    public final void b(k7c k7cVar) {
        if (k7cVar != null) {
            this.b.add(k7cVar);
        }
    }

    public final Notification c() {
        Bundle bundle;
        c61 c61Var = new c61(this);
        o7c o7cVar = (o7c) c61Var.H;
        f8c f8cVar = o7cVar.m;
        if (f8cVar != null) {
            f8cVar.b(c61Var);
        }
        Notification notificationBuild = ((Notification.Builder) c61Var.G).build();
        if (f8cVar != null) {
            o7cVar.m.getClass();
        }
        if (f8cVar != null && (bundle = notificationBuild.extras) != null) {
            f8cVar.a(bundle);
        }
        return notificationBuild;
    }

    public final void e(boolean z) {
        j(16, z);
    }

    public final void f() {
        this.v = "com.google.android.gms.availability";
    }

    public final void g(PendingIntent pendingIntent) {
        this.g = pendingIntent;
    }

    public final void h(String str) {
        this.f = d(str);
    }

    public final void i(String str) {
        this.e = d(str);
    }

    public final void j(int i, boolean z) {
        Notification notification = this.z;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void k(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void l() {
        this.n = true;
    }

    public final void m(int i) {
        this.j = i;
    }

    public final void n(int i) {
        this.z.icon = i;
    }

    public final void o(f8c f8cVar) {
        if (this.m != f8cVar) {
            this.m = f8cVar;
            if (f8cVar == null || f8cVar.a == this) {
                return;
            }
            f8cVar.a = this;
            o(f8cVar);
        }
    }

    public final void p(String str) {
        this.z.tickerText = d(str);
    }

    public final void q(long j) {
        this.z.when = j;
    }

    public o7c(Context context) {
        this(context, null);
    }
}
