package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class nog {
    public static final ReentrantLock c = new ReentrantLock();
    public static nog d;
    public final ReentrantLock a = new ReentrantLock();
    public final SharedPreferences b;

    public nog(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static nog a(Context context) {
        dgj.v(context);
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = new nog(context.getApplicationContext());
            }
            nog nogVar = d;
            reentrantLock.unlock();
            return nogVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String f(String str, String str2) {
        return ij0.C(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String strD;
        String strD2 = d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strD2) && (strD = d(f("googleSignInAccount", strD2))) != null) {
            try {
                return GoogleSignInAccount.l0(strD);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        dgj.v(googleSignInAccount);
        dgj.v(googleSignInOptions);
        String str = googleSignInAccount.M;
        e("defaultGoogleSignInAccount", str);
        String strF = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.F;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.G;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.H;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.I;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.O;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.P;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.J;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.K;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.L);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.N;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, mt7.K);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.F);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            e(strF, jSONObject.toString());
            String strF2 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.L;
            String str10 = googleSignInOptions.K;
            ArrayList arrayList = googleSignInOptions.F;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.S);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).F);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.G;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.H);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.J);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.I);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                e(strF2, jSONObject2.toString());
            } catch (JSONException e) {
                xh6.h(e);
            }
        } catch (JSONException e2) {
            xh6.h(e2);
        }
    }

    public final String d(String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(String str, String str2) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
