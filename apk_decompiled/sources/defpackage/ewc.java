package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ewc {
    public final String a;
    public final byte[] b;
    public final boolean c;

    public ewc(String str, boolean z, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.a = str;
        this.b = bArr;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ewc)) {
            return false;
        }
        ewc ewcVar = (ewc) obj;
        return x44.r(this.a, ewcVar.a) && this.c == ewcVar.c && Arrays.equals(this.b, ewcVar.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return sq6.v(")", kgh.r("PendingExtensionInstall(fileName=", this.a, ", bytes=", Arrays.toString(this.b), ", force="), this.c);
    }
}
