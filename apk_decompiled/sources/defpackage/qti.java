package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public final class qti extends pti {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public qti(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new bp0(0), new bp0(0), new bp0(0));
    }

    @Override // defpackage.pti
    public final qti a() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new qti(parcel, iDataPosition, i, ij0.m(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // defpackage.pti
    public final boolean e(int i) {
        while (true) {
            int i2 = this.j;
            int i3 = this.k;
            if (i2 >= this.g) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i5;
        }
    }

    @Override // defpackage.pti
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public qti(Parcel parcel, int i, int i2, String str, bp0 bp0Var, bp0 bp0Var2, bp0 bp0Var3) {
        super(bp0Var, bp0Var2, bp0Var3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
