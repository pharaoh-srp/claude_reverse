package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class fvk extends b88 {
    public final ExecutorService d0;
    public final hz4 e0;
    public final hz4 f0;
    public final hz4 g0;
    public final hz4 h0;
    public final hz4 i0;
    public final hz4 j0;
    public final hz4 k0;
    public final hz4 l0;
    public final hz4 m0;
    public final hz4 n0;
    public final ewk o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvk(rl rlVar, Context context, Looper looper, kmj kmjVar, kmj kmjVar2) {
        super(context, looper, 14, rlVar, kmjVar, kmjVar2, 0);
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new crk()));
        ewk ewkVarA = ewk.a(context);
        this.e0 = new hz4(3);
        this.f0 = new hz4(3);
        this.g0 = new hz4(3);
        this.h0 = new hz4(3);
        this.i0 = new hz4(3);
        this.j0 = new hz4(3);
        this.k0 = new hz4(3);
        this.l0 = new hz4(3);
        this.m0 = new hz4(3);
        this.n0 = new hz4(3);
        new HashMap();
        new HashMap();
        executorServiceUnconfigurableExecutorService.getClass();
        this.d0 = executorServiceUnconfigurableExecutorService;
        this.o0 = ewkVarA;
    }

    @Override // defpackage.fe1
    public final boolean B() {
        return true;
    }

    @Override // defpackage.fe1, defpackage.ge0
    public final void f(ee1 ee1Var) {
        Context context = this.G;
        if (!h()) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", FreeTypeConstants.FT_LOAD_PEDANTIC).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 71);
                    sb.append("The Wear OS app is out of date. Requires API version 8600000 but found ");
                    sb.append(i);
                    Log.w("WearableClient", sb.toString());
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    A(ee1Var, 6, PendingIntent.getActivity(context, 0, intent, dxk.a));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                A(ee1Var, 16, null);
                return;
            }
        }
        super.f(ee1Var);
    }

    @Override // defpackage.fe1, defpackage.ge0
    public final boolean h() {
        return !this.o0.b();
    }

    @Override // defpackage.fe1, defpackage.ge0
    public final int i() {
        return 8600000;
    }

    @Override // defpackage.fe1
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return iInterfaceQueryLocalInterface instanceof hik ? (hik) iInterfaceQueryLocalInterface : new hik(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 5);
    }

    @Override // defpackage.fe1
    public final jf7[] q() {
        return uik.c;
    }

    @Override // defpackage.fe1
    public final String u() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // defpackage.fe1
    public final String v() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // defpackage.fe1
    public final String w() {
        return this.o0.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // defpackage.fe1
    public final void z(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 30);
            sb.append("onPostInitHandler: statusCode ");
            sb.append(i);
            Log.v("WearableClient", sb.toString());
        }
        if (i == 0) {
            this.e0.a(iBinder);
            this.f0.a(iBinder);
            this.g0.a(iBinder);
            this.i0.a(iBinder);
            this.j0.a(iBinder);
            this.k0.a(iBinder);
            this.l0.a(iBinder);
            this.m0.a(iBinder);
            this.n0.a(iBinder);
            this.h0.a(iBinder);
            i = 0;
        }
        super.z(i, iBinder, bundle, i2);
    }
}
