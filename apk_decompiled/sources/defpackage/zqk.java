package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zqk extends hmj implements IInterface {
    public final int j;

    public zqk(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        dgj.o(bArr.length == 25);
        this.j = Arrays.hashCode(bArr);
    }

    public static byte[] H(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            sz6.h(e);
            return null;
        }
    }

    @Override // defpackage.hmj
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            lu8 lu8VarG = G();
            parcel2.writeNoException();
            xyj.b(parcel2, lu8VarG);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.j);
        return true;
    }

    public abstract byte[] F();

    public final lu8 G() {
        return new cbc(F());
    }

    public final boolean equals(Object obj) {
        lu8 lu8VarG;
        if (obj instanceof zqk) {
            try {
                zqk zqkVar = (zqk) obj;
                if (zqkVar.j == this.j && (lu8VarG = zqkVar.G()) != null) {
                    return Arrays.equals(F(), (byte[]) cbc.G(lu8VarG));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.j;
    }
}
