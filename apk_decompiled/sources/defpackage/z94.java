package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z94 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ ba4 h;

    public z94(ba4 ba4Var) {
        this.h = ba4Var;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        yc ycVar = (yc) this.e.get(str);
        if ((ycVar != null ? ycVar.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                ycVar.a.e(ycVar.b.O(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new pc(intent, i2));
        return true;
    }

    public final void b(int i, ez1 ez1Var, Object obj) {
        Bundle bundleExtra;
        int i2;
        ez1Var.getClass();
        ba4 ba4Var = this.h;
        g6 g6VarL = ez1Var.L(ba4Var, obj);
        int i3 = 0;
        if (g6VarL != null) {
            new Handler(Looper.getMainLooper()).post(new y94(this, i, g6VarL, i3));
            return;
        }
        Intent intentY = ez1Var.y(ba4Var, obj);
        if (intentY.getExtras() != null) {
            Bundle extras = intentY.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentY.setExtrasClassLoader(ba4Var.getClassLoader());
            }
        }
        if (intentY.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentY.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentY.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentY.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentY.getAction())) {
                ba4Var.startActivityForResult(intentY, i, bundle);
                return;
            }
            u79 u79Var = (u79) intentY.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                u79Var.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                ba4Var.startIntentSenderForResult(u79Var.d(), i2, u79Var.a(), u79Var.b(), u79Var.c(), 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new y94(this, i2, e, 1));
                return;
            }
        }
        String[] stringArrayExtra = intentY.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
            if (TextUtils.isEmpty(stringArrayExtra[i4])) {
                sz6.p(ij0.m(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i4], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i5 = 0;
            while (i3 < stringArrayExtra.length) {
                if (!hashSet.contains(Integer.valueOf(i3))) {
                    strArr[i5] = stringArrayExtra[i3];
                    i5++;
                }
                i3++;
            }
        }
        ba4Var.requestPermissions(stringArrayExtra, i);
    }

    public final ad c(String str, ez1 ez1Var, qc qcVar) {
        str.getClass();
        ez1Var.getClass();
        d(str);
        this.e.put(str, new yc(qcVar, ez1Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            qcVar.e(obj);
        }
        Bundle bundle = this.g;
        pc pcVar = (pc) yfd.C(bundle, str, pc.class);
        if (pcVar != null) {
            bundle.remove(str);
            qcVar.e(ez1Var.O(pcVar.F, pcVar.E));
        }
        return new ad(this, str, ez1Var, 1);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (kl4) bnf.Y(new j7(4))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        pmf.h("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbX = sq6.x("Dropping pending result for request ", str, ": ");
            sbX.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbX.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((pc) yfd.C(bundle, str, pc.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        zc zcVar = (zc) linkedHashMap2.get(str);
        if (zcVar != null) {
            ArrayList arrayList = zcVar.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zcVar.a.c((i4a) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
