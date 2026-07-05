package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class jo5 {
    public Parcel a;

    public long a() {
        int i = d54.i;
        long j = this.a.readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    public long b() {
        Parcel parcel = this.a;
        byte b = parcel.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        return dlh.a(j, 0L) ? clh.c : eve.L(parcel.readFloat(), j);
    }

    public void c(byte b) {
        this.a.writeByte(b);
    }

    public void d(float f) {
        this.a.writeFloat(f);
    }

    public void e(long j) {
        long jB = clh.b(j);
        byte b = 0;
        if (!dlh.a(jB, 0L)) {
            if (dlh.a(jB, 4294967296L)) {
                b = 1;
            } else if (dlh.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        c(b);
        if (dlh.a(clh.b(j), 0L)) {
            return;
        }
        d(clh.c(j));
    }
}
