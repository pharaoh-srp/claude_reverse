package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class alk extends xlk {
    public final wik E;

    public alk(wik wikVar) {
        this.E = wikVar;
    }

    @Override // defpackage.xlk
    public final int a() {
        return xlk.d((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xlk xlkVar = (xlk) obj;
        int iA = xlkVar.a();
        int iD = xlk.d((byte) 64);
        if (iD != iA) {
            return iD - xlkVar.a();
        }
        wik wikVar = ((alk) xlkVar).E;
        wik wikVar2 = this.E;
        byte[] bArr = wikVar2.F;
        int length = bArr.length;
        byte[] bArr2 = wikVar.F;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return ehk.a.compare(wikVar2.o(), wikVar.o());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && alk.class == obj.getClass()) {
            return this.E.equals(((alk) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(xlk.d((byte) 64)), this.E});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        rfk rfkVar;
        int i;
        boolean z;
        vfk vfkVar = egk.d;
        egk vfkVar2 = vfkVar.c;
        if (vfkVar2 == null) {
            rfk rfkVar2 = vfkVar.a;
            char[] cArr = rfkVar2.b;
            int i2 = 0;
            while (true) {
                if (i2 >= cArr.length) {
                    rfkVar = rfkVar2;
                    break;
                }
                char c = cArr[i2];
                if (c < 'a' || c > 'z') {
                    i2++;
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= cArr.length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (z) {
                        sz6.j("Cannot call upperCase() on a mixed-case alphabet");
                        return null;
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i4 = 0; i4 < cArr.length; i4++) {
                        char c3 = cArr[i4];
                        if (c3 >= 97 && c3 <= 122) {
                            c3 ^= 32;
                        }
                        cArr2[i4] = (char) c3;
                    }
                    rfkVar = new rfk(rfkVar2.a.concat(".upperCase()"), cArr2);
                    byte[] bArr = rfkVar.g;
                    if (rfkVar2.h && !rfkVar.h) {
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i = 65; i <= 90; i++) {
                            int i5 = i | 32;
                            byte b = bArr[i];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                bArrCopyOf[i] = b2;
                            } else {
                                char c4 = (char) i;
                                char c5 = (char) i5;
                                if (b2 != -1) {
                                    sz6.j(dpk.j("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                bArrCopyOf[i5] = b;
                            }
                        }
                        rfkVar = new rfk(rfkVar.a.concat(".ignoreCase()"), rfkVar.b, bArrCopyOf, true);
                    }
                }
            }
            vfkVar2 = rfkVar == rfkVar2 ? vfkVar : new vfk(rfkVar);
            vfkVar.c = vfkVar2;
        }
        byte[] bArrO = this.E.o();
        return ij0.j("h'", vfkVar2.c(bArrO, bArrO.length), "'");
    }
}
