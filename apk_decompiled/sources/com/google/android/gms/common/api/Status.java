package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.gb9;
import defpackage.gsc;
import defpackage.hh4;
import defpackage.kre;
import defpackage.okk;
import defpackage.q28;
import defpackage.xn5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends a4 implements kre, ReflectedParcelable {
    public final int E;
    public final String F;
    public final PendingIntent G;
    public final hh4 H;
    public static final Status I = new Status(0, null, null, null);
    public static final Status J = new Status(14, null, null, null);
    public static final Status K = new Status(8, null, null, null);
    public static final Status L = new Status(15, null, null, null);
    public static final Status M = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new gsc(12);

    public Status(int i, String str, PendingIntent pendingIntent, hh4 hh4Var) {
        this.E = i;
        this.F = str;
        this.G = pendingIntent;
        this.H = hh4Var;
    }

    @Override // defpackage.kre
    public final Status e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.E == status.E && gb9.v(this.F, status.F) && gb9.v(this.G, status.G) && gb9.v(this.H, status.H);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.E), this.F, this.G, this.H});
    }

    public final boolean l0() {
        return this.E <= 0;
    }

    public final String toString() {
        q28 q28Var = new q28(this);
        String strR = this.F;
        if (strR == null) {
            strR = okk.r(this.E);
        }
        q28Var.c("statusCode", strR);
        q28Var.c("resolution", this.G);
        return q28Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.E0(parcel, 3, this.G, i);
        xn5.E0(parcel, 4, this.H, i);
        xn5.L0(parcel, iK0);
    }
}
