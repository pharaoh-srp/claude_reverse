package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class fp1 {
    public boolean a;
    public String b;
    public String c;
    public ep1 d;
    public txj e;
    public ArrayList f;
    public boolean g;

    public static cp1 a() {
        cp1 cp1Var = new cp1();
        t tVarF = ep1.f();
        tVarF.b = true;
        cp1Var.e = tVarF;
        return cp1Var;
    }

    public final int b() {
        return this.d.c;
    }

    public final hp1 c() {
        cid cidVar;
        if (this.e.isEmpty()) {
            return y3k.g;
        }
        dp1 dp1Var = (dp1) this.e.get(0);
        for (int i = 1; i < this.e.size(); i++) {
            dp1 dp1Var2 = (dp1) this.e.get(i);
            if (!dp1Var2.a.d.equals(dp1Var.a.d) && !dp1Var2.a.d.equals("play_pass_subs")) {
                return y3k.a(5, "All products should have same ProductType.");
            }
        }
        fid fidVar = dp1Var.a;
        String strE = fidVar.e();
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        txj txjVar = this.e;
        int size = txjVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            dp1 dp1Var3 = (dp1) txjVar.get(i2);
            dp1Var3.getClass();
            fid fidVar2 = dp1Var3.a;
            ArrayList arrayList = fidVar2.h;
            String str = fidVar2.c;
            if (arrayList != null && dp1Var3.b == null) {
                return y3k.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str);
            }
            if (map.containsKey(str)) {
                return y3k.a(5, "ProductId can not be duplicated. Invalid product id: " + str + ".");
            }
            map.put(str, dp1Var3);
            if (!fidVar.d.equals("play_pass_subs") && !fidVar2.d.equals("play_pass_subs") && !strE.equals(fidVar2.e())) {
                return y3k.a(5, "All products must have the same package name.");
            }
        }
        for (String str2 : hashSet) {
            if (map.containsKey(str2)) {
                ((dp1) map.get(str2)).getClass();
                return y3k.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str2 + ".");
            }
        }
        ArrayList arrayList2 = fidVar.i;
        String str3 = dp1Var.b;
        if (str3 != null && arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cidVar = null;
                    break;
                }
                cidVar = (cid) it.next();
                if (str3.equals(cidVar.a)) {
                    break;
                }
            }
            if (cidVar != null && cidVar.d != null) {
                return y3k.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return y3k.g;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final String f() {
        return this.d.b;
    }

    public final String g() {
        this.d.getClass();
        return null;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f);
        return arrayList;
    }

    public final txj i() {
        return this.e;
    }

    public final boolean j() {
        return this.g;
    }

    public final boolean k() {
        if (this.b != null || this.c != null) {
            return true;
        }
        ep1 ep1Var = this.d;
        ep1Var.getClass();
        if (ep1Var.c != 0 || this.a || this.g) {
            return true;
        }
        txj txjVar = this.e;
        if (txjVar != null) {
            int size = txjVar.size();
            for (int i = 0; i < size; i++) {
                ((dp1) txjVar.get(i)).getClass();
            }
        }
        return false;
    }
}
