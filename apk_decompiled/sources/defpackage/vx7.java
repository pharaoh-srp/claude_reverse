package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class vx7 implements Parcelable {
    public static final Parcelable.Creator<vx7> CREATOR = new dpj(29);
    public final String E;
    public final String F;
    public final boolean G;
    public final boolean H;
    public final int I;
    public final int J;
    public final String K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final int P;
    public final String Q;
    public final int R;
    public final boolean S;

    public vx7(Parcel parcel) {
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.G = parcel.readInt() != 0;
        this.H = parcel.readInt() != 0;
        this.I = parcel.readInt();
        this.J = parcel.readInt();
        this.K = parcel.readString();
        this.L = parcel.readInt() != 0;
        this.M = parcel.readInt() != 0;
        this.N = parcel.readInt() != 0;
        this.O = parcel.readInt() != 0;
        this.P = parcel.readInt();
        this.Q = parcel.readString();
        this.R = parcel.readInt();
        this.S = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(FreeTypeConstants.FT_LOAD_PEDANTIC);
        sb.append("FragmentState{");
        sb.append(this.E);
        sb.append(" (");
        sb.append(this.F);
        sb.append(")}:");
        if (this.G) {
            sb.append(" fromLayout");
        }
        if (this.H) {
            sb.append(" dynamicContainer");
        }
        int i = this.J;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.K;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.L) {
            sb.append(" retainInstance");
        }
        if (this.M) {
            sb.append(" removing");
        }
        if (this.N) {
            sb.append(" detached");
        }
        if (this.O) {
            sb.append(" hidden");
        }
        String str2 = this.Q;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.R);
        }
        if (this.S) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        parcel.writeString(this.K);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeInt(this.M ? 1 : 0);
        parcel.writeInt(this.N ? 1 : 0);
        parcel.writeInt(this.O ? 1 : 0);
        parcel.writeInt(this.P);
        parcel.writeString(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S ? 1 : 0);
    }

    public vx7(cx7 cx7Var) {
        this.E = cx7Var.getClass().getName();
        this.F = cx7Var.I;
        this.G = cx7Var.R;
        this.H = cx7Var.T;
        this.I = cx7Var.b0;
        this.J = cx7Var.c0;
        this.K = cx7Var.d0;
        this.L = cx7Var.g0;
        this.M = cx7Var.P;
        this.N = cx7Var.f0;
        this.O = cx7Var.e0;
        this.P = cx7Var.q0.ordinal();
        this.Q = cx7Var.L;
        this.R = cx7Var.M;
        this.S = cx7Var.l0;
    }
}
