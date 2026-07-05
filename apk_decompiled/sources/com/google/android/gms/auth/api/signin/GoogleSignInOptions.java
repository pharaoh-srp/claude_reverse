package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.fe0;
import defpackage.t98;
import defpackage.x8e;
import defpackage.xn5;
import defpackage.zmj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GoogleSignInOptions extends a4 implements fe0, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions O;
    public static final Scope P;
    public static final Scope Q;
    public static final Scope R;
    public static final x8e S;
    public final int E;
    public final ArrayList F;
    public final Account G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final String K;
    public final String L;
    public final ArrayList M;
    public final String N;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        P = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        Q = scope3;
        R = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(R)) {
            Scope scope4 = Q;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        O = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(R)) {
            Scope scope5 = Q;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new zmj(1);
        S = new x8e(21);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, HashMap map, String str3) {
        this.E = i;
        this.F = arrayList;
        this.G = account;
        this.H = z;
        this.I = z2;
        this.J = z3;
        this.K = str;
        this.L = str2;
        this.M = new ArrayList(map.values());
        this.N = str3;
    }

    public static GoogleSignInOptions l0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap x0(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t98 t98Var = (t98) it.next();
                map.put(Integer.valueOf(t98Var.F), t98Var);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.K;
        ArrayList arrayList = this.F;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.F;
            String str2 = googleSignInOptions.K;
            if (this.M.isEmpty() && googleSignInOptions.M.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account = this.G;
                Account account2 = googleSignInOptions.G;
                if (account == null) {
                    if (account2 != null) {
                        return false;
                    }
                } else if (!account.equals(account2)) {
                    return false;
                }
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.J == googleSignInOptions.J && this.H == googleSignInOptions.H && this.I == googleSignInOptions.I) {
                    return TextUtils.equals(this.N, googleSignInOptions.N);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).F);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.G;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.K;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.J ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31;
        String str2 = this.N;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.I0(parcel, 2, new ArrayList(this.F));
        xn5.E0(parcel, 3, this.G, i);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.H ? 1 : 0);
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(this.I ? 1 : 0);
        xn5.J0(parcel, 6, 4);
        parcel.writeInt(this.J ? 1 : 0);
        xn5.F0(parcel, 7, this.K);
        xn5.F0(parcel, 8, this.L);
        xn5.I0(parcel, 9, this.M);
        xn5.F0(parcel, 10, this.N);
        xn5.L0(parcel, iK0);
    }
}
