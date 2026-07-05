package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class e8c extends f8c {
    public boolean h;
    public IconCompat j;
    public IconCompat k;
    public IconCompat l;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public int g = 0;
    public boolean i = true;

    public static IconCompat e(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            PorterDuff.Mode mode = IconCompat.k;
            return ltk.j((Icon) parcelable);
        }
        if (!(parcelable instanceof Bitmap)) {
            return null;
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = (Bitmap) parcelable;
        return iconCompat;
    }

    @Override // defpackage.f8c
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (Build.VERSION.SDK_INT < 36) {
            ArrayList arrayList = this.e;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    d8c d8cVar = (d8c) arrayList.get(i);
                    if (d8cVar.a > 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("length", d8cVar.a);
                        bundle2.putInt("id", d8cVar.b);
                        bundle2.putInt("colorInt", d8cVar.c);
                        arrayList2.add(bundle2);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressSegments", arrayList2);
            ArrayList arrayList3 = this.f;
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    c8c c8cVar = (c8c) arrayList3.get(i2);
                    if (c8cVar.a >= 0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("position", c8cVar.a);
                        bundle3.putInt("id", c8cVar.b);
                        bundle3.putInt("colorInt", c8cVar.c);
                        arrayList4.add(bundle3);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressPoints", arrayList4);
            bundle.putInt("android.progress", this.g);
            bundle.putBoolean("android.progressIndeterminate", this.h);
            bundle.putInt("android.progressMax", f());
            bundle.putBoolean("android.styledByProgress", this.i);
            o7c o7cVar = this.a;
            Context context = o7cVar != null ? o7cVar.a : null;
            if (context == null) {
                return;
            }
            IconCompat iconCompat = this.j;
            if (iconCompat != null) {
                bundle.putParcelable("android.progressTrackerIcon", iconCompat.f(context));
            } else {
                bundle.remove("android.progressTrackerIcon");
            }
            IconCompat iconCompat2 = this.k;
            if (iconCompat2 != null) {
                bundle.putParcelable("android.progressStartIcon", iconCompat2.f(context));
            } else {
                bundle.remove("android.progressStartIcon");
            }
            IconCompat iconCompat3 = this.l;
            if (iconCompat3 != null) {
                bundle.putParcelable("android.progressEndIcon", iconCompat3.f(context));
            } else {
                bundle.remove("android.progressEndIcon");
            }
        }
    }

    @Override // defpackage.f8c
    public final void b(c61 c61Var) {
        Notification.Builder builder = (Notification.Builder) c61Var.G;
        if (Build.VERSION.SDK_INT < 36) {
            int iF = f();
            builder.setProgress(iF, Math.min(this.g, iF), this.h);
            return;
        }
        Context context = (Context) c61Var.F;
        Notification.ProgressStyle progressStyle = new Notification.ProgressStyle();
        b8c.h(progressStyle, this.i);
        b8c.a(progressStyle, this.g);
        b8c.c(progressStyle, this.h);
        IconCompat iconCompat = this.k;
        b8c.f(progressStyle, iconCompat != null ? iconCompat.f(context) : null);
        IconCompat iconCompat2 = this.l;
        b8c.b(progressStyle, iconCompat2 != null ? iconCompat2.f(context) : null);
        IconCompat iconCompat3 = this.j;
        b8c.g(progressStyle, iconCompat3 != null ? iconCompat3.f(context) : null);
        b8c.d(progressStyle, this.f);
        b8c.e(progressStyle, this.e);
        builder.setStyle(progressStyle);
    }

    @Override // defpackage.f8c
    public final String c() {
        return "androidx.core.app.NotificationCompat$ProgressStyle";
    }

    @Override // defpackage.f8c
    public final void d(Bundle bundle) {
        super.d(bundle);
        ArrayList arrayListC = Build.VERSION.SDK_INT >= 34 ? h02.c("android.progressSegments", bundle) : bundle.getParcelableArrayList("android.progressSegments");
        ArrayList arrayList = new ArrayList();
        if (arrayListC != null && !arrayListC.isEmpty()) {
            for (int i = 0; i < arrayListC.size(); i++) {
                Bundle bundle2 = (Bundle) arrayListC.get(i);
                int i2 = bundle2.getInt("length");
                if (i2 > 0) {
                    int i3 = bundle2.getInt("id");
                    int i4 = bundle2.getInt("colorInt", 0);
                    d8c d8cVar = new d8c();
                    d8cVar.a = i2;
                    d8cVar.b = i3;
                    d8cVar.c = i4;
                    arrayList.add(d8cVar);
                }
            }
        }
        this.e = arrayList;
        this.g = bundle.getInt("android.progress", 0);
        this.h = bundle.getBoolean("android.progressIndeterminate", false);
        this.i = bundle.getBoolean("android.styledByProgress", true);
        ArrayList arrayListC2 = Build.VERSION.SDK_INT >= 34 ? h02.c("android.progressPoints", bundle) : bundle.getParcelableArrayList("android.progressPoints");
        ArrayList arrayList2 = new ArrayList();
        if (arrayListC2 != null && !arrayListC2.isEmpty()) {
            for (int i5 = 0; i5 < arrayListC2.size(); i5++) {
                Bundle bundle3 = (Bundle) arrayListC2.get(i5);
                int i6 = bundle3.getInt("position");
                if (i6 >= 0) {
                    int i7 = bundle3.getInt("id");
                    int i8 = bundle3.getInt("colorInt", 0);
                    c8c c8cVar = new c8c();
                    c8cVar.a = i6;
                    c8cVar.b = i7;
                    c8cVar.c = i8;
                    arrayList2.add(c8cVar);
                }
            }
        }
        this.f = arrayList2;
        this.j = e((Parcelable) yfd.C(bundle, "android.progressTrackerIcon", Icon.class));
        this.k = e((Parcelable) yfd.C(bundle, "android.progressStartIcon", Icon.class));
        this.l = e((Parcelable) yfd.C(bundle, "android.progressEndIcon", Icon.class));
    }

    public final int f() {
        ArrayList arrayList = this.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = 0;
            int iAddExact = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                int i3 = ((d8c) arrayList.get(i2)).a;
                if (i3 > 0) {
                    try {
                        iAddExact = Math.addExact(iAddExact, i3);
                        i++;
                    } catch (ArithmeticException unused) {
                        return 100;
                    }
                }
            }
            if (i != 0) {
                return iAddExact;
            }
        }
        return 100;
    }
}
