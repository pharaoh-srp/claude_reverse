package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class mrj extends a4 {
    public static final Parcelable.Creator<mrj> CREATOR = new gqj(8);
    public static final byte[] F = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] E;

    public mrj(byte[][] bArr) {
        dgj.o(bArr != null);
        dgj.o(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            dgj.o(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            dgj.o(bArr[i2] != null);
            int length = bArr[i2].length;
            dgj.o(length == 32 || length == 64);
            i += 2;
        }
        this.E = bArr;
    }

    public static byte[] B0(byte[] bArr) {
        t tVar;
        int i = rek.a;
        lfk lfkVar = jek.a;
        int i2 = lfkVar.G;
        MessageDigest messageDigest = lfkVar.F;
        if (lfkVar.H) {
            try {
                tVar = new t((MessageDigest) messageDigest.clone(), i2);
            } catch (CloneNotSupportedException unused) {
                try {
                    tVar = new t(MessageDigest.getInstance(messageDigest.getAlgorithm()), i2);
                } catch (NoSuchAlgorithmException e) {
                    sz6.h(e);
                    return null;
                }
            }
        } else {
            tVar = new t(MessageDigest.getInstance(messageDigest.getAlgorithm()), i2);
        }
        MessageDigest messageDigest2 = (MessageDigest) tVar.c;
        byte[] bArr2 = F;
        bArr2.getClass();
        int length = bArr2.length;
        if (tVar.b) {
            sz6.j("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        messageDigest2.update(bArr2, 0, length);
        bArr.getClass();
        int length2 = bArr.length;
        if (tVar.b) {
            sz6.j("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        messageDigest2.update(bArr, 0, length2);
        if (tVar.b) {
            sz6.j("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        tVar.b = true;
        int i3 = tVar.a;
        return (byte[]) (i3 == messageDigest2.getDigestLength() ? new tdk(messageDigest2.digest()) : new tdk(Arrays.copyOf(messageDigest2.digest(), i3))).F.clone();
    }

    public static byte[] D0(JSONObject jSONObject) throws JSONException {
        byte[] bArrP = fd9.P(jSONObject.getString("first"));
        if (bArrP.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrP;
        }
        byte[] bArrP2 = fd9.P(jSONObject.getString("second"));
        if (bArrP2.length == 32) {
            return sqk.j(bArrP, bArrP2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] O0(JSONObject jSONObject) {
        byte[] bArrB0 = B0(fd9.P(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrB0 : sqk.j(bArrB0, B0(fd9.P(jSONObject.getString("second"))));
    }

    public static mrj l0(JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(D0(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(O0(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(fd9.P(next));
                    if (z) {
                        arrayList.add(D0(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(O0(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new mrj((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject x0(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mrj) {
            return Arrays.deepEquals(this.E, ((mrj) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.E) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() {
        byte[][] bArr = this.E;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i = 0; i < bArr.length; i += 2) {
                if (bArr[i] == null) {
                    jSONObject.put("eval", x0(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(fd9.R(bArr[i]), x0(bArr[i + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e) {
            return ij0.j("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        byte[][] bArr = this.E;
        if (bArr != null) {
            int iK02 = xn5.K0(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            xn5.L0(parcel, iK02);
        }
        xn5.L0(parcel, iK0);
    }
}
