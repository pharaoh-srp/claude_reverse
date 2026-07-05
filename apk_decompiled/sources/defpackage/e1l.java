package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e1l extends a4 {
    public static final Parcelable.Creator<e1l> CREATOR = new gsc(14);
    public final int E;
    public final String F;
    public final long G;
    public final Long H;
    public final String I;
    public final String J;
    public final Double K;

    public e1l(long j, Object obj, String str, String str2) {
        dgj.s(str);
        this.E = 2;
        this.F = str;
        this.G = j;
        this.J = str2;
        if (obj == null) {
            this.H = null;
            this.K = null;
            this.I = null;
            return;
        }
        if (obj instanceof Long) {
            this.H = (Long) obj;
            this.K = null;
            this.I = null;
        } else if (obj instanceof String) {
            this.H = null;
            this.K = null;
            this.I = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                sz6.p("User attribute given of un-supported type");
                throw null;
            }
            this.H = null;
            this.K = (Double) obj;
            this.I = null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.J0(parcel, 3, 8);
        parcel.writeLong(this.G);
        xn5.D0(parcel, 4, this.H);
        xn5.F0(parcel, 6, this.I);
        xn5.F0(parcel, 7, this.J);
        Double d = this.K;
        if (d != null) {
            xn5.J0(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        xn5.L0(parcel, iK0);
    }

    public final Object zza() {
        Long l = this.H;
        if (l != null) {
            return l;
        }
        Double d = this.K;
        if (d != null) {
            return d;
        }
        String str = this.I;
        if (str != null) {
            return str;
        }
        return null;
    }

    public e1l(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.E = i;
        this.F = str;
        this.G = j;
        this.H = l;
        if (i == 1) {
            this.K = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.K = d;
        }
        this.I = str2;
        this.J = str3;
    }

    public e1l(f1l f1lVar) {
        this(f1lVar.d, f1lVar.e, f1lVar.c, f1lVar.b);
    }
}
