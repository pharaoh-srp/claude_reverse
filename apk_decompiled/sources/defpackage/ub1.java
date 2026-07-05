package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ub1 implements Parcelable {
    public static final Parcelable.Creator<ub1> CREATOR = new dpj(5);
    public final int[] E;
    public final ArrayList F;
    public final int[] G;
    public final int[] H;
    public final int I;
    public final String J;
    public final int K;
    public final int L;
    public final CharSequence M;
    public final int N;
    public final CharSequence O;
    public final ArrayList P;
    public final ArrayList Q;
    public final boolean R;

    public ub1(tb1 tb1Var) {
        int size = tb1Var.a.size();
        this.E = new int[size * 6];
        if (!tb1Var.g) {
            sz6.j("Not on back stack");
            throw null;
        }
        this.F = new ArrayList(size);
        this.G = new int[size];
        this.H = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zx7 zx7Var = (zx7) tb1Var.a.get(i2);
            int i3 = i + 1;
            this.E[i] = zx7Var.a;
            ArrayList arrayList = this.F;
            cx7 cx7Var = zx7Var.b;
            arrayList.add(cx7Var != null ? cx7Var.I : null);
            int[] iArr = this.E;
            iArr[i3] = zx7Var.c ? 1 : 0;
            iArr[i + 2] = zx7Var.d;
            iArr[i + 3] = zx7Var.e;
            int i4 = i + 5;
            iArr[i + 4] = zx7Var.f;
            i += 6;
            iArr[i4] = zx7Var.g;
            this.G[i2] = zx7Var.h.ordinal();
            this.H[i2] = zx7Var.i.ordinal();
        }
        this.I = tb1Var.f;
        this.J = tb1Var.h;
        this.K = tb1Var.s;
        this.L = tb1Var.i;
        this.M = tb1Var.j;
        this.N = tb1Var.k;
        this.O = tb1Var.l;
        this.P = tb1Var.m;
        this.Q = tb1Var.n;
        this.R = tb1Var.o;
    }

    public final tb1 a(rx7 rx7Var) {
        tb1 tb1Var = new tb1(rx7Var);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.E;
            boolean z = true;
            if (i2 >= iArr.length) {
                break;
            }
            zx7 zx7Var = new zx7();
            int i4 = i2 + 1;
            zx7Var.a = iArr[i2];
            if (rx7.J(2)) {
                Log.v("FragmentManager", "Instantiate " + tb1Var + " op #" + i3 + " base fragment #" + iArr[i4]);
            }
            zx7Var.h = a4a.values()[this.G[i3]];
            zx7Var.i = a4a.values()[this.H[i3]];
            int i5 = i2 + 2;
            if (iArr[i4] == 0) {
                z = false;
            }
            zx7Var.c = z;
            int i6 = iArr[i5];
            zx7Var.d = i6;
            int i7 = iArr[i2 + 3];
            zx7Var.e = i7;
            int i8 = i2 + 5;
            int i9 = iArr[i2 + 4];
            zx7Var.f = i9;
            i2 += 6;
            int i10 = iArr[i8];
            zx7Var.g = i10;
            tb1Var.b = i6;
            tb1Var.c = i7;
            tb1Var.d = i9;
            tb1Var.e = i10;
            tb1Var.b(zx7Var);
            i3++;
        }
        tb1Var.f = this.I;
        tb1Var.h = this.J;
        tb1Var.g = true;
        tb1Var.i = this.L;
        tb1Var.j = this.M;
        tb1Var.k = this.N;
        tb1Var.l = this.O;
        tb1Var.m = this.P;
        tb1Var.n = this.Q;
        tb1Var.o = this.R;
        tb1Var.s = this.K;
        while (true) {
            ArrayList arrayList = this.F;
            if (i >= arrayList.size()) {
                tb1Var.c(1);
                return tb1Var;
            }
            String str = (String) arrayList.get(i);
            if (str != null) {
                ((zx7) tb1Var.a.get(i)).b = rx7Var.c.C(str);
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.E);
        parcel.writeStringList(this.F);
        parcel.writeIntArray(this.G);
        parcel.writeIntArray(this.H);
        parcel.writeInt(this.I);
        parcel.writeString(this.J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        TextUtils.writeToParcel(this.M, parcel, 0);
        parcel.writeInt(this.N);
        TextUtils.writeToParcel(this.O, parcel, 0);
        parcel.writeStringList(this.P);
        parcel.writeStringList(this.Q);
        parcel.writeInt(this.R ? 1 : 0);
    }

    public ub1(Parcel parcel) {
        this.E = parcel.createIntArray();
        this.F = parcel.createStringArrayList();
        this.G = parcel.createIntArray();
        this.H = parcel.createIntArray();
        this.I = parcel.readInt();
        this.J = parcel.readString();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.M = (CharSequence) creator.createFromParcel(parcel);
        this.N = parcel.readInt();
        this.O = (CharSequence) creator.createFromParcel(parcel);
        this.P = parcel.createStringArrayList();
        this.Q = parcel.createStringArrayList();
        this.R = parcel.readInt() != 0;
    }
}
