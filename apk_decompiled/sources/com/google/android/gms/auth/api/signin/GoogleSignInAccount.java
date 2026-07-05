package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.dgj;
import defpackage.s38;
import defpackage.xn5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GoogleSignInAccount extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new s38(28);
    public final int E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final Uri J;
    public String K;
    public final long L;
    public final String M;
    public final List N;
    public final String O;
    public final String P;
    public final HashSet Q = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.E = i;
        this.F = str;
        this.G = str2;
        this.H = str3;
        this.I = str4;
        this.J = uri;
        this.K = str5;
        this.L = j;
        this.M = str6;
        this.N = arrayList;
        this.O = str7;
        this.P = str8;
    }

    public static GoogleSignInAccount l0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        dgj.s(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.K = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.M.equals(this.M)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.N);
        hashSet.addAll(googleSignInAccount.Q);
        HashSet hashSet2 = new HashSet(this.N);
        hashSet2.addAll(this.Q);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.M.hashCode() + 527;
        HashSet hashSet = new HashSet(this.N);
        hashSet.addAll(this.Q);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.F0(parcel, 3, this.G);
        xn5.F0(parcel, 4, this.H);
        xn5.F0(parcel, 5, this.I);
        xn5.E0(parcel, 6, this.J, i);
        xn5.F0(parcel, 7, this.K);
        xn5.J0(parcel, 8, 8);
        parcel.writeLong(this.L);
        xn5.F0(parcel, 9, this.M);
        xn5.I0(parcel, 10, this.N);
        xn5.F0(parcel, 11, this.O);
        xn5.F0(parcel, 12, this.P);
        xn5.L0(parcel, iK0);
    }
}
