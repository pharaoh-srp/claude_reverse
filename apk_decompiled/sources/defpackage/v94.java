package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v94 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba4 b;

    public /* synthetic */ v94(ba4 ba4Var, int i) {
        this.a = i;
        this.b = ba4Var;
    }

    public final void a(ba4 ba4Var) {
        int i = this.a;
        ba4 ba4Var2 = this.b;
        switch (i) {
            case 0:
                ba4Var.getClass();
                Bundle bundleI = ((q28) ba4Var2.H.G).i("android:support:activity-result");
                if (bundleI != null) {
                    z94 z94Var = ba4Var2.M;
                    LinkedHashMap linkedHashMap = z94Var.b;
                    LinkedHashMap linkedHashMap2 = z94Var.a;
                    Bundle bundle = z94Var.g;
                    ArrayList<Integer> integerArrayList = bundleI.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleI.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleI.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            z94Var.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleI.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    nai.l(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.getClass();
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            z94Var.b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                ex7 ex7Var = (ex7) ((fx7) ba4Var2).Z.F;
                ex7Var.P.b(ex7Var, ex7Var, null);
                break;
        }
    }
}
