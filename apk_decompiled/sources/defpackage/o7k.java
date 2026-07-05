package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o7k extends a4 {
    public static final Parcelable.Creator<o7k> CREATOR = new zwj(16);
    public final Uri E;
    public final HashMap F;
    public final byte[] G;

    public o7k(Uri uri, Bundle bundle, byte[] bArr) {
        this.E = uri;
        HashMap map = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            parcelable.getClass();
            map.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.F = map;
        this.G = bArr;
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.G;
        sb.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        HashMap map = this.F;
        int size = map.size();
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 12);
        sb2.append(", numAssets=");
        sb2.append(size);
        sb.append(sb2.toString());
        sb.append(", uri=".concat(String.valueOf(this.E)));
        if (!zIsLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : map.keySet()) {
            String strValueOf = String.valueOf(map.get(str));
            sb.append(vb7.t(new StringBuilder(String.valueOf(str).length() + 7 + strValueOf.length()), "\n    ", str, ": ", strValueOf));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 2, this.E, i);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.F.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((DataItemAssetParcelable) entry.getValue()));
        }
        xn5.y0(parcel, 4, bundle);
        xn5.z0(parcel, 5, this.G);
        xn5.L0(parcel, iK0);
    }
}
