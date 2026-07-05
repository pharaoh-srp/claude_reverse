package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vc extends ez1 {
    public final /* synthetic */ int p;

    public /* synthetic */ vc(int i) {
        this.p = i;
    }

    public static Map Z(Intent intent, int i) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                return sta.p0(w44.v1(mp0.C0(stringArrayExtra), arrayList));
            }
        }
        return nm6.E;
    }

    @Override // defpackage.ez1
    public g6 L(Context context, Object obj) {
        switch (this.p) {
            case 0:
                return Y(context, (String[]) obj);
            case 1:
                String str = (String) obj;
                str.getClass();
                if (x44.x(context, str) == 0) {
                    return new g6(Boolean.TRUE);
                }
                return null;
            case 2:
            case 3:
            default:
                return super.L(context, obj);
            case 4:
                ((Uri) obj).getClass();
                return null;
        }
    }

    @Override // defpackage.ez1
    public final Object O(Intent intent, int i) {
        switch (this.p) {
            case 0:
                return Z(intent, i);
            case 1:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (intArrayExtra[i2] == 0) {
                                z = true;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                return new pc(intent, i);
            case 3:
                return new pc(intent, i);
            case 4:
                return Boolean.valueOf(i == -1);
            default:
                return new pc(intent, i);
        }
    }

    public g6 Y(Context context, String[] strArr) {
        strArr.getClass();
        if (strArr.length == 0) {
            return new g6(nm6.E);
        }
        for (String str : strArr) {
            if (x44.x(context, str) != 0) {
                return null;
            }
        }
        int iD0 = tta.d0(strArr.length);
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (String str2 : strArr) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new g6(linkedHashMap);
    }

    @Override // defpackage.ez1
    public final Intent y(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.p) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 1:
                String str = (String) obj;
                str.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                intentPutExtra2.getClass();
                return intentPutExtra2;
            case 2:
                Intent intent = (Intent) obj;
                intent.getClass();
                return intent;
            case 3:
                u79 u79Var = (u79) obj;
                u79Var.getClass();
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", u79Var);
                intentPutExtra3.getClass();
                return intentPutExtra3;
            case 4:
                Uri uri = (Uri) obj;
                uri.getClass();
                Intent intentAddFlags = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri).addFlags(1).addFlags(2);
                intentAddFlags.getClass();
                return intentAddFlags;
            default:
                u79 u79VarO = (u79) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intentA = u79VarO.a();
                if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        ucc uccVar = new ucc(u79VarO.d());
                        uccVar.p(u79VarO.c(), u79VarO.b());
                        u79VarO = uccVar.o();
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", u79VarO);
                if (rx7.J(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }
}
