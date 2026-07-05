package com.google.mlkit.common.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import defpackage.dgj;
import defpackage.j3f;
import defpackage.ka4;
import defpackage.nyj;
import defpackage.p94;
import defpackage.ra4;
import defpackage.sz6;
import defpackage.tk5;
import defpackage.wkb;
import defpackage.y5h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MlKitInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        dgj.x("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.", !providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"));
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            Log.i("MlKitInitProvider", "No context available. Manually call MlKit.initialize(), otherwise ML Kit will not be functional.");
            return false;
        }
        synchronized (wkb.b) {
            dgj.x("MlKitContext is already initialized", wkb.c == null);
            wkb wkbVar = new wkb();
            wkb.c = wkbVar;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListG = new nyj(context, 14, new tk5(7, MlKitComponentDiscoveryService.class)).G();
            j3f j3fVar = y5h.a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            sz6 sz6Var = ka4.d;
            arrayList.addAll(arrayListG);
            arrayList2.add(p94.c(context, Context.class, new Class[0]));
            arrayList2.add(p94.c(wkbVar, wkb.class, new Class[0]));
            ra4 ra4Var = new ra4(j3fVar, arrayList, arrayList2, sz6Var);
            wkbVar.a = ra4Var;
            ra4Var.l(true);
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
