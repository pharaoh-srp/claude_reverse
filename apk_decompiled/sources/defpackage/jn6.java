package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class jn6 implements SharedPreferences {
    public final SharedPreferences a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final lf c;
    public final y16 d;

    public jn6(SharedPreferences sharedPreferences, lf lfVar, y16 y16Var) {
        this.a = sharedPreferences;
        this.c = lfVar;
        this.d = y16Var;
    }

    public static jn6 a(Context context, String str) {
        xv8 xv8VarH;
        xv8 xv8VarH2;
        int i = z16.a;
        tde.h(b26.b);
        if (!hrh.a()) {
            tde.f(new yf(th.class, new wf[]{new wf(6, y16.class)}, 6), true);
        }
        mf.a();
        Context applicationContext = context.getApplicationContext();
        hi6 hi6Var = new hi6(1);
        hi6Var.J = ysj.l("AES256_SIV");
        if (applicationContext == null) {
            sz6.p("need an Android context");
            return null;
        }
        hi6Var.E = applicationContext;
        hi6Var.F = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        hi6Var.G = "trusted_device";
        String strI = ij0.i("android-keystore://", str);
        if (!strI.startsWith("android-keystore://")) {
            sz6.p("key URI must start with android-keystore://");
            return null;
        }
        hi6Var.H = strI;
        ive iveVarE = hi6Var.e();
        synchronized (iveVarE) {
            xv8VarH = ((ro6) iveVarE.F).H();
        }
        hi6 hi6Var2 = new hi6(1);
        hi6Var2.J = ysj.l("AES256_GCM");
        hi6Var2.E = applicationContext;
        hi6Var2.F = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        hi6Var2.G = "trusted_device";
        String strI2 = ij0.i("android-keystore://", str);
        if (!strI2.startsWith("android-keystore://")) {
            sz6.p("key URI must start with android-keystore://");
            return null;
        }
        hi6Var2.H = strI2;
        ive iveVarE2 = hi6Var2.e();
        synchronized (iveVarE2) {
            xv8VarH2 = ((ro6) iveVarE2.F).H();
        }
        y16 y16Var = (y16) xv8VarH.p(y16.class);
        return new jn6(applicationContext.getSharedPreferences("trusted_device", 0), (lf) xv8VarH2.p(lf.class), y16Var);
    }

    public static boolean d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(jd1.b(this.d.a(str.getBytes(StandardCharsets.UTF_8), "trusted_device".getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            ep5.b("Could not encrypt key. ", e2.getMessage(), e2);
            return null;
        }
    }

    public final Object c(String str) {
        String str2;
        if (d(str)) {
            throw new SecurityException(kgh.o(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strB = b(str);
            String string = this.a.getString(strB, null);
            if (string != null) {
                byte[] bArrA = jd1.a(string);
                lf lfVar = this.c;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(lfVar.b(bArrA, strB.getBytes(charset)));
                byteBufferWrap.position(0);
                int i = byteBufferWrap.getInt();
                int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 6 : 5 : 4 : 3 : 2 : 1;
                if (i2 == 0) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
                }
                int iF = sq6.F(i2);
                if (iF == 0) {
                    int i3 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i3);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else {
                    if (iF != 1) {
                        if (iF == 2) {
                            return Integer.valueOf(byteBufferWrap.getInt());
                        }
                        if (iF == 3) {
                            return Long.valueOf(byteBufferWrap.getLong());
                        }
                        if (iF == 4) {
                            return Float.valueOf(byteBufferWrap.getFloat());
                        }
                        if (iF == 5) {
                            return Boolean.valueOf(byteBufferWrap.get() != 0);
                        }
                        switch (i2) {
                            case 1:
                                str2 = "STRING";
                                break;
                            case 2:
                                str2 = "STRING_SET";
                                break;
                            case 3:
                                str2 = "INT";
                                break;
                            case 4:
                                str2 = "LONG";
                                break;
                            case 5:
                                str2 = "FLOAT";
                                break;
                            case 6:
                                str2 = "BOOLEAN";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                    }
                    ip0 ip0Var = new ip0(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i4 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i4);
                        byteBufferWrap.position(byteBufferWrap.position() + i4);
                        ip0Var.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (ip0Var.G != 1 || !"__NULL__".equals(ip0Var.F[0])) {
                        return ip0Var;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            ep5.b("Could not decrypt value. ", e.getMessage(), e);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (d(str)) {
            throw new SecurityException(kgh.o(str, " is a reserved key for the encryption keyset."));
        }
        return this.a.contains(b(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new in6(this, this.a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (!d(entry.getKey())) {
                try {
                    String str = new String(this.d.b(jd1.a(entry.getKey()), "trusted_device".getBytes()), StandardCharsets.UTF_8);
                    String str2 = str.equals("__NULL__") ? null : str;
                    map.put(str2, c(str2));
                } catch (GeneralSecurityException e) {
                    ep5.b("Could not decrypt key. ", e.getMessage(), e);
                    return null;
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objC = c(str);
        return objC instanceof Boolean ? ((Boolean) objC).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objC = c(str);
        return objC instanceof Float ? ((Float) objC).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objC = c(str);
        return objC instanceof Integer ? ((Integer) objC).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objC = c(str);
        return objC instanceof Long ? ((Long) objC).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objC = c(str);
        return objC instanceof String ? (String) objC : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objC = c(str);
        Set ip0Var = objC instanceof Set ? (Set) objC : new ip0(0);
        return ip0Var.size() > 0 ? ip0Var : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove(onSharedPreferenceChangeListener);
    }
}
