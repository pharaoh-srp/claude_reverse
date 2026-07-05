package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hfe implements RemoteViewsService.RemoteViewsFactory {
    public static final gfe e = new gfe(new long[0], new RemoteViews[0]);
    public final RemoteViewsCompatService a;
    public final int b;
    public final int c;
    public gfe d = e;

    public hfe(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
        this.a = remoteViewsCompatService;
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        Long lValueOf;
        RemoteViewsCompatService remoteViewsCompatService = this.a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        sharedPreferences.getClass();
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        sb.append(i);
        sb.append(':');
        sb.append(this.c);
        gfe gfeVar = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string == null) {
            Log.w("RemoteViewsCompatServic", "No collection items were stored for widget " + i);
        } else {
            byte[] bArrDecode = Base64.decode(string, 0);
            bArrDecode.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.getClass();
            try {
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
                byte[] bArr = new byte[parcelObtain.readInt()];
                parcelObtain.readByteArray(bArr);
                String string2 = parcelObtain.readString();
                string2.getClass();
                long j = parcelObtain.readLong();
                parcelObtain.recycle();
                if (x44.r(Build.VERSION.INCREMENTAL, string2)) {
                    try {
                        lValueOf = Long.valueOf(rwk.m(remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0)));
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for " + remoteViewsCompatService.getPackageManager(), e2);
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        Log.w("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i);
                    } else if (lValueOf.longValue() != j) {
                        Log.w("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i);
                    } else {
                        try {
                            parcelObtain = Parcel.obtain();
                            parcelObtain.getClass();
                            try {
                                parcelObtain.unmarshall(bArr, 0, bArr.length);
                                parcelObtain.setDataPosition(0);
                                gfe gfeVar2 = new gfe(parcelObtain);
                                parcelObtain.recycle();
                                gfeVar = gfeVar2;
                            } finally {
                            }
                        } catch (Throwable th) {
                            Log.e("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i, th);
                        }
                    }
                } else {
                    Log.w("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i);
                }
            } finally {
            }
        }
        if (gfeVar == null) {
            gfeVar = e;
        }
        this.d = gfeVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.d.c).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return ((long[]) this.d.c)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return ((RemoteViews[]) this.d.d)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.a.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.d.b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.d.a;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
