package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ij0;
import defpackage.vmk;

/* JADX INFO: loaded from: classes3.dex */
public enum Transport implements ReflectedParcelable {
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_CLASSIC("bt"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_LOW_ENERGY("ble"),
    /* JADX INFO: Fake field, exist only in values array */
    NFC("nfc"),
    /* JADX INFO: Fake field, exist only in values array */
    USB("usb"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL("internal"),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID("cable"),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator<Transport> CREATOR = new a();
    public final String E;

    public static class UnsupportedTransportException extends Exception {
    }

    Transport(String str) {
        this.E = str;
    }

    public static Transport a(String str) throws UnsupportedTransportException {
        if (str.equals("hybrid")) {
            vmk.a.a();
            throw null;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.E)) {
                return transport;
            }
        }
        throw new UnsupportedTransportException(ij0.j("Transport ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.E);
    }
}
