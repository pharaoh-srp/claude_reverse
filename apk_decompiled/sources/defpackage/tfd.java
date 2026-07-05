package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class tfd implements Comparable {
    public final byte[] E;

    public tfd(byte[] bArr) {
        this.E = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        tfd tfdVar = (tfd) obj;
        byte[] bArr = this.E;
        int length = bArr.length;
        byte[] bArr2 = tfdVar.E;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = tfdVar.E[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tfd) {
            return Arrays.equals(this.E, ((tfd) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.E);
    }

    public final String toString() {
        return psk.j(this.E);
    }
}
