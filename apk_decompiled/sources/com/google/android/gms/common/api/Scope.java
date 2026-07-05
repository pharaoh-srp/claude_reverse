package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.dgj;
import defpackage.xn5;
import defpackage.zwj;

/* JADX INFO: loaded from: classes3.dex */
public final class Scope extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zwj(11);
    public final int E;
    public final String F;

    public Scope(int i, String str) {
        dgj.t(str, "scopeUri must not be null or empty");
        this.E = i;
        this.F = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.F.equals(((Scope) obj).F);
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return this.F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.L0(parcel, iK0);
    }
}
