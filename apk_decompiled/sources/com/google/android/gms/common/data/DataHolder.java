package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.a4;
import defpackage.xn5;
import defpackage.zmj;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class DataHolder extends a4 implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zmj(2);
    public final int E;
    public final String[] F;
    public Bundle G;
    public final CursorWindow[] H;
    public final int I;
    public final Bundle J;
    public int[] K;
    public int L;
    public boolean M = false;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.E = i;
        this.F = strArr;
        this.H = cursorWindowArr;
        this.I = i2;
        this.J = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.M) {
                    this.M = true;
                    int i = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.H;
                        if (i >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        boolean z;
        try {
            if (this.H.length > 0) {
                synchronized (this) {
                    z = this.M;
                }
                if (!z) {
                    close();
                    Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        String[] strArr = this.F;
        if (strArr != null) {
            int iK02 = xn5.K0(parcel, 1);
            parcel.writeStringArray(strArr);
            xn5.L0(parcel, iK02);
        }
        xn5.H0(parcel, 2, this.H, i);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.I);
        xn5.y0(parcel, 4, this.J);
        xn5.J0(parcel, 1000, 4);
        parcel.writeInt(this.E);
        xn5.L0(parcel, iK0);
        if ((i & 1) != 0) {
            close();
        }
    }
}
